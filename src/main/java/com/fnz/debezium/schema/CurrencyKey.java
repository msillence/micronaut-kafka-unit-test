/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fnz.debezium.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CurrencyKey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2901542399105992655L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CurrencyKey\",\"namespace\":\"com.fnz.debezium.schema\",\"fields\":[{\"name\":\"CURRENCY_CODE\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"connect.name\":\"com.fnz.debezium.schema.CurrencyKey\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CurrencyKey> ENCODER =
      new BinaryMessageEncoder<CurrencyKey>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CurrencyKey> DECODER =
      new BinaryMessageDecoder<CurrencyKey>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CurrencyKey> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CurrencyKey> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CurrencyKey> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CurrencyKey>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CurrencyKey to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CurrencyKey from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CurrencyKey instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CurrencyKey fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String CURRENCY_CODE;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CurrencyKey() {}

  /**
   * All-args constructor.
   * @param CURRENCY_CODE The new value for CURRENCY_CODE
   */
  public CurrencyKey(java.lang.String CURRENCY_CODE) {
    this.CURRENCY_CODE = CURRENCY_CODE;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return CURRENCY_CODE;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CURRENCY_CODE = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'CURRENCY_CODE' field.
   * @return The value of the 'CURRENCY_CODE' field.
   */
  public java.lang.String getCURRENCYCODE() {
    return CURRENCY_CODE;
  }


  /**
   * Sets the value of the 'CURRENCY_CODE' field.
   * @param value the value to set.
   */
  public void setCURRENCYCODE(java.lang.String value) {
    this.CURRENCY_CODE = value;
  }

  /**
   * Creates a new CurrencyKey RecordBuilder.
   * @return A new CurrencyKey RecordBuilder
   */
  public static com.fnz.debezium.schema.CurrencyKey.Builder newBuilder() {
    return new com.fnz.debezium.schema.CurrencyKey.Builder();
  }

  /**
   * Creates a new CurrencyKey RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CurrencyKey RecordBuilder
   */
  public static com.fnz.debezium.schema.CurrencyKey.Builder newBuilder(com.fnz.debezium.schema.CurrencyKey.Builder other) {
    if (other == null) {
      return new com.fnz.debezium.schema.CurrencyKey.Builder();
    } else {
      return new com.fnz.debezium.schema.CurrencyKey.Builder(other);
    }
  }

  /**
   * Creates a new CurrencyKey RecordBuilder by copying an existing CurrencyKey instance.
   * @param other The existing instance to copy.
   * @return A new CurrencyKey RecordBuilder
   */
  public static com.fnz.debezium.schema.CurrencyKey.Builder newBuilder(com.fnz.debezium.schema.CurrencyKey other) {
    if (other == null) {
      return new com.fnz.debezium.schema.CurrencyKey.Builder();
    } else {
      return new com.fnz.debezium.schema.CurrencyKey.Builder(other);
    }
  }

  /**
   * RecordBuilder for CurrencyKey instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CurrencyKey>
    implements org.apache.avro.data.RecordBuilder<CurrencyKey> {

    private java.lang.String CURRENCY_CODE;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fnz.debezium.schema.CurrencyKey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CURRENCY_CODE)) {
        this.CURRENCY_CODE = data().deepCopy(fields()[0].schema(), other.CURRENCY_CODE);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing CurrencyKey instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fnz.debezium.schema.CurrencyKey other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.CURRENCY_CODE)) {
        this.CURRENCY_CODE = data().deepCopy(fields()[0].schema(), other.CURRENCY_CODE);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'CURRENCY_CODE' field.
      * @return The value.
      */
    public java.lang.String getCURRENCYCODE() {
      return CURRENCY_CODE;
    }


    /**
      * Sets the value of the 'CURRENCY_CODE' field.
      * @param value The value of 'CURRENCY_CODE'.
      * @return This builder.
      */
    public com.fnz.debezium.schema.CurrencyKey.Builder setCURRENCYCODE(java.lang.String value) {
      validate(fields()[0], value);
      this.CURRENCY_CODE = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'CURRENCY_CODE' field has been set.
      * @return True if the 'CURRENCY_CODE' field has been set, false otherwise.
      */
    public boolean hasCURRENCYCODE() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'CURRENCY_CODE' field.
      * @return This builder.
      */
    public com.fnz.debezium.schema.CurrencyKey.Builder clearCURRENCYCODE() {
      CURRENCY_CODE = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CurrencyKey build() {
      try {
        CurrencyKey record = new CurrencyKey();
        record.CURRENCY_CODE = fieldSetFlags()[0] ? this.CURRENCY_CODE : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CurrencyKey>
    WRITER$ = (org.apache.avro.io.DatumWriter<CurrencyKey>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CurrencyKey>
    READER$ = (org.apache.avro.io.DatumReader<CurrencyKey>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.CURRENCY_CODE);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.CURRENCY_CODE = in.readString();

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.CURRENCY_CODE = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










