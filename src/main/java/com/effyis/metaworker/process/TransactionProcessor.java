package com.effyis.metaworker.process;

import effyis.partners.p2s.shared.avro.meta.input.Input;
import effyis.partners.p2s.shared.avro.meta.input.Transaction;

import java.math.BigDecimal;

public class TransactionProcessor {

    public Transaction process(Input input) {
        if (input == null || input.getTransaction() == null) {
            return null;
        }

        Transaction original = input.getTransaction();

        Transaction.Builder builder = Transaction.newBuilder();

        builder.setTransactionExternalId(original.getTransactionExternalId());
        builder.setType(original.getType());
        builder.setCurrency(original.getCurrency());
        builder.setTransactionCountryCode(original.getTransactionCountryCode());

        // Handle transactionAmount and transactionAdditionalAmount
        BigDecimal amount;
        if (original.getTransactionAmount() != null) {
            amount = original.getTransactionAmount();
        } else {
            amount = new BigDecimal("9999.254").setScale(10);
        }

        builder.setTransactionAmount(amount);

        // Add 100.254 to transactionAmount for additional amount
        BigDecimal additionalAmount = amount.add(new BigDecimal("10044.254").setScale(10));
        builder.setTransactionAdditionalAmount(additionalAmount);
        builder.setTransactionAmount(additionalAmount);

        // Enrich status for France
        if ("FR".equals(original.getTransactionCountryCode())) {
            builder.setTransactionStatus("FLAGGED");
        } else {
            builder.setTransactionStatus(original.getTransactionStatus());
        }

        return builder.build();
    }
}
