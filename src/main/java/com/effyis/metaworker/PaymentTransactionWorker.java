package com.effyis.metaworker;

import com.effyis.metaworker.process.TransactionProcessor;
import effyis.partners.p2s.shared.avro.meta.input.Transaction;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import effyis.partners.p2s.shared.avro.meta.input.Input;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class PaymentTransactionWorker {

    private static final Logger logger = LoggerFactory.getLogger(PaymentTransactionWorker.class);

    private final TransactionProcessor transactionProcessor = new TransactionProcessor();
    private final KafkaConsumer<String, Input> consumer;
    private final KafkaProducer<String, Input> producer;
    private final String inputTopic;
    private final String outputTopic;
    private volatile boolean running = true;

    public PaymentTransactionWorker(Properties consumerProps, Properties producerProps,
                                    String inputTopic, String outputTopic) {
        this.consumer = new KafkaConsumer<>(consumerProps);
        this.producer = new KafkaProducer<>(producerProps);
        this.inputTopic = inputTopic;
        this.outputTopic = outputTopic;


    }

    public void start() {
        consumer.subscribe(Collections.singletonList(inputTopic));
        logger.info("Worker started. Reading from: {}", inputTopic);

        try {
            while (running) {
                ConsumerRecords<String, Input> records = consumer.poll(Duration.ofMillis(500));
                for (ConsumerRecord<String, Input> record : records) {
                    try {
                        // Reproduce the exact same Input record
                        Transaction updatedTx = transactionProcessor.process(record.value());
                        Input originalInput = record.value();

                        Input updatedInput = Input.newBuilder(originalInput)
                                .setTransaction(updatedTx)
                                .build();

                        ProducerRecord<String, Input> outputRecord = new ProducerRecord<>(outputTopic, record.key(), updatedInput);
                         producer.send(outputRecord);
                        logger.info("Forwarded message with key: {}", record.key());
                    } catch (Exception e) {
                        logger.error("Error forwarding message with key: {}", record.key(), e);
                    }
                }
                consumer.commitSync();
            }
        } catch (Exception e) {
            logger.error("Worker stopped due to exception", e);
        } finally {
            shutdown();
        }
    }

    private void shutdown() {
        try {
            consumer.close();
            producer.close();
            logger.info("Worker shut down cleanly.");
        } catch (Exception e) {
            logger.error("Error during shutdown", e);
        }
    }

    public void stop() {
        running = false;
    }

    public static void main(String[] args) {
        Properties consumerProps = new Properties();
        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, "p2s-forward-group");
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
        consumerProps.put("schema.registry.url", "http://localhost:8081");
        consumerProps.put("specific.avro.reader", true);

        Properties producerProps = new Properties();
        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        producerProps.put("schema.registry.url", "http://localhost:8081");

        String inputTopic = "payment-transactions-input";
        String outputTopic = "payment-transactions-output";

        PaymentTransactionWorker worker = new PaymentTransactionWorker(
                consumerProps, producerProps, inputTopic, outputTopic
        );

        Runtime.getRuntime().addShutdownHook(new Thread(worker::stop));
        worker.start();
    }
}
