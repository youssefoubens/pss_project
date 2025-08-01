/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package effyis.partners.p2s.shared.avro.meta.input;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Information about the acquiring institution */
@org.apache.avro.specific.AvroGenerated
public class Acquirer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2998823557795647222L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Acquirer\",\"namespace\":\"effyis.partners.p2s.shared.avro.meta.input\",\"doc\":\"Information about the acquiring institution\",\"fields\":[{\"name\":\"acquiringInstitutionId\",\"type\":\"string\",\"doc\":\"Bank ID of acquirer (P2S-00012)\"},{\"name\":\"acquirerBin\",\"type\":\"string\",\"doc\":\"Bank Identification Number (P2S-00013)\"},{\"name\":\"country\",\"type\":\"string\",\"doc\":\"Acquirer Country (P2S-00014)\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Acquirer> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Acquirer> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Acquirer> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Acquirer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Acquirer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Acquirer to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Acquirer from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Acquirer instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Acquirer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Bank ID of acquirer (P2S-00012) */
  private java.lang.CharSequence acquiringInstitutionId;
  /** Bank Identification Number (P2S-00013) */
  private java.lang.CharSequence acquirerBin;
  /** Acquirer Country (P2S-00014) */
  private java.lang.CharSequence country;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Acquirer() {}

  /**
   * All-args constructor.
   * @param acquiringInstitutionId Bank ID of acquirer (P2S-00012)
   * @param acquirerBin Bank Identification Number (P2S-00013)
   * @param country Acquirer Country (P2S-00014)
   */
  public Acquirer(java.lang.CharSequence acquiringInstitutionId, java.lang.CharSequence acquirerBin, java.lang.CharSequence country) {
    this.acquiringInstitutionId = acquiringInstitutionId;
    this.acquirerBin = acquirerBin;
    this.country = country;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return acquiringInstitutionId;
    case 1: return acquirerBin;
    case 2: return country;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: acquiringInstitutionId = (java.lang.CharSequence)value$; break;
    case 1: acquirerBin = (java.lang.CharSequence)value$; break;
    case 2: country = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'acquiringInstitutionId' field.
   * @return Bank ID of acquirer (P2S-00012)
   */
  public java.lang.CharSequence getAcquiringInstitutionId() {
    return acquiringInstitutionId;
  }


  /**
   * Sets the value of the 'acquiringInstitutionId' field.
   * Bank ID of acquirer (P2S-00012)
   * @param value the value to set.
   */
  public void setAcquiringInstitutionId(java.lang.CharSequence value) {
    this.acquiringInstitutionId = value;
  }

  /**
   * Gets the value of the 'acquirerBin' field.
   * @return Bank Identification Number (P2S-00013)
   */
  public java.lang.CharSequence getAcquirerBin() {
    return acquirerBin;
  }


  /**
   * Sets the value of the 'acquirerBin' field.
   * Bank Identification Number (P2S-00013)
   * @param value the value to set.
   */
  public void setAcquirerBin(java.lang.CharSequence value) {
    this.acquirerBin = value;
  }

  /**
   * Gets the value of the 'country' field.
   * @return Acquirer Country (P2S-00014)
   */
  public java.lang.CharSequence getCountry() {
    return country;
  }


  /**
   * Sets the value of the 'country' field.
   * Acquirer Country (P2S-00014)
   * @param value the value to set.
   */
  public void setCountry(java.lang.CharSequence value) {
    this.country = value;
  }

  /**
   * Creates a new Acquirer RecordBuilder.
   * @return A new Acquirer RecordBuilder
   */
  public static effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder newBuilder() {
    return new effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder();
  }

  /**
   * Creates a new Acquirer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Acquirer RecordBuilder
   */
  public static effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder newBuilder(effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder other) {
    if (other == null) {
      return new effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder();
    } else {
      return new effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder(other);
    }
  }

  /**
   * Creates a new Acquirer RecordBuilder by copying an existing Acquirer instance.
   * @param other The existing instance to copy.
   * @return A new Acquirer RecordBuilder
   */
  public static effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder newBuilder(effyis.partners.p2s.shared.avro.meta.input.Acquirer other) {
    if (other == null) {
      return new effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder();
    } else {
      return new effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder(other);
    }
  }

  /**
   * RecordBuilder for Acquirer instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Acquirer>
    implements org.apache.avro.data.RecordBuilder<Acquirer> {

    /** Bank ID of acquirer (P2S-00012) */
    private java.lang.CharSequence acquiringInstitutionId;
    /** Bank Identification Number (P2S-00013) */
    private java.lang.CharSequence acquirerBin;
    /** Acquirer Country (P2S-00014) */
    private java.lang.CharSequence country;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.acquiringInstitutionId)) {
        this.acquiringInstitutionId = data().deepCopy(fields()[0].schema(), other.acquiringInstitutionId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.acquirerBin)) {
        this.acquirerBin = data().deepCopy(fields()[1].schema(), other.acquirerBin);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.country)) {
        this.country = data().deepCopy(fields()[2].schema(), other.country);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Acquirer instance
     * @param other The existing instance to copy.
     */
    private Builder(effyis.partners.p2s.shared.avro.meta.input.Acquirer other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.acquiringInstitutionId)) {
        this.acquiringInstitutionId = data().deepCopy(fields()[0].schema(), other.acquiringInstitutionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.acquirerBin)) {
        this.acquirerBin = data().deepCopy(fields()[1].schema(), other.acquirerBin);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.country)) {
        this.country = data().deepCopy(fields()[2].schema(), other.country);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'acquiringInstitutionId' field.
      * Bank ID of acquirer (P2S-00012)
      * @return The value.
      */
    public java.lang.CharSequence getAcquiringInstitutionId() {
      return acquiringInstitutionId;
    }


    /**
      * Sets the value of the 'acquiringInstitutionId' field.
      * Bank ID of acquirer (P2S-00012)
      * @param value The value of 'acquiringInstitutionId'.
      * @return This builder.
      */
    public effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder setAcquiringInstitutionId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.acquiringInstitutionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'acquiringInstitutionId' field has been set.
      * Bank ID of acquirer (P2S-00012)
      * @return True if the 'acquiringInstitutionId' field has been set, false otherwise.
      */
    public boolean hasAcquiringInstitutionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'acquiringInstitutionId' field.
      * Bank ID of acquirer (P2S-00012)
      * @return This builder.
      */
    public effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder clearAcquiringInstitutionId() {
      acquiringInstitutionId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'acquirerBin' field.
      * Bank Identification Number (P2S-00013)
      * @return The value.
      */
    public java.lang.CharSequence getAcquirerBin() {
      return acquirerBin;
    }


    /**
      * Sets the value of the 'acquirerBin' field.
      * Bank Identification Number (P2S-00013)
      * @param value The value of 'acquirerBin'.
      * @return This builder.
      */
    public effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder setAcquirerBin(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.acquirerBin = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'acquirerBin' field has been set.
      * Bank Identification Number (P2S-00013)
      * @return True if the 'acquirerBin' field has been set, false otherwise.
      */
    public boolean hasAcquirerBin() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'acquirerBin' field.
      * Bank Identification Number (P2S-00013)
      * @return This builder.
      */
    public effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder clearAcquirerBin() {
      acquirerBin = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'country' field.
      * Acquirer Country (P2S-00014)
      * @return The value.
      */
    public java.lang.CharSequence getCountry() {
      return country;
    }


    /**
      * Sets the value of the 'country' field.
      * Acquirer Country (P2S-00014)
      * @param value The value of 'country'.
      * @return This builder.
      */
    public effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder setCountry(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.country = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * Acquirer Country (P2S-00014)
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'country' field.
      * Acquirer Country (P2S-00014)
      * @return This builder.
      */
    public effyis.partners.p2s.shared.avro.meta.input.Acquirer.Builder clearCountry() {
      country = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Acquirer build() {
      try {
        Acquirer record = new Acquirer();
        record.acquiringInstitutionId = fieldSetFlags()[0] ? this.acquiringInstitutionId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.acquirerBin = fieldSetFlags()[1] ? this.acquirerBin : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.country = fieldSetFlags()[2] ? this.country : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Acquirer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Acquirer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Acquirer>
    READER$ = (org.apache.avro.io.DatumReader<Acquirer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.acquiringInstitutionId);

    out.writeString(this.acquirerBin);

    out.writeString(this.country);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.acquiringInstitutionId = in.readString(this.acquiringInstitutionId instanceof Utf8 ? (Utf8)this.acquiringInstitutionId : null);

      this.acquirerBin = in.readString(this.acquirerBin instanceof Utf8 ? (Utf8)this.acquirerBin : null);

      this.country = in.readString(this.country instanceof Utf8 ? (Utf8)this.country : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.acquiringInstitutionId = in.readString(this.acquiringInstitutionId instanceof Utf8 ? (Utf8)this.acquiringInstitutionId : null);
          break;

        case 1:
          this.acquirerBin = in.readString(this.acquirerBin instanceof Utf8 ? (Utf8)this.acquirerBin : null);
          break;

        case 2:
          this.country = in.readString(this.country instanceof Utf8 ? (Utf8)this.country : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










