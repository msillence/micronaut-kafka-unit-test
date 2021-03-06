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
public class CurrencyValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1596530985828602145L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CurrencyValue\",\"namespace\":\"com.fnz.debezium.schema\",\"fields\":[{\"name\":\"CURRENCY_CODE\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"CURRENCY_DESCRIPTION\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"EXCHANGE_RATE\",\"type\":{\"type\":\"bytes\",\"connect.name\":\"org.apache.kafka.connect.data.Decimal\",\"connect.parameters\":{\"connect.decimal.precision\":\"16\",\"scale\":\"6\"},\"connect.version\":1,\"logicalType\":\"decimal\",\"precision\":16,\"scale\":6}}],\"connect.name\":\"com.fnz.debezium.schema.CurrencyValue\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<CurrencyValue> ENCODER =
      new BinaryMessageEncoder<CurrencyValue>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CurrencyValue> DECODER =
      new BinaryMessageDecoder<CurrencyValue>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CurrencyValue> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CurrencyValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CurrencyValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CurrencyValue>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CurrencyValue to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CurrencyValue from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CurrencyValue instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CurrencyValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String CURRENCY_CODE;
   private java.lang.String CURRENCY_DESCRIPTION;
   private java.math.BigDecimal EXCHANGE_RATE;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CurrencyValue() {}

  /**
   * All-args constructor.
   * @param CURRENCY_CODE The new value for CURRENCY_CODE
   * @param CURRENCY_DESCRIPTION The new value for CURRENCY_DESCRIPTION
   * @param EXCHANGE_RATE The new value for EXCHANGE_RATE
   */
  public CurrencyValue(java.lang.String CURRENCY_CODE, java.lang.String CURRENCY_DESCRIPTION, java.math.BigDecimal EXCHANGE_RATE) {
    this.CURRENCY_CODE = CURRENCY_CODE;
    this.CURRENCY_DESCRIPTION = CURRENCY_DESCRIPTION;
    this.EXCHANGE_RATE = EXCHANGE_RATE;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return CURRENCY_CODE;
    case 1: return CURRENCY_DESCRIPTION;
    case 2: return EXCHANGE_RATE;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      new org.apache.avro.Conversions.DecimalConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CURRENCY_CODE = value$ != null ? value$.toString() : null; break;
    case 1: CURRENCY_DESCRIPTION = value$ != null ? value$.toString() : null; break;
    case 2: EXCHANGE_RATE = (java.math.BigDecimal)value$; break;
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
   * Gets the value of the 'CURRENCY_DESCRIPTION' field.
   * @return The value of the 'CURRENCY_DESCRIPTION' field.
   */
  public java.lang.String getCURRENCYDESCRIPTION() {
    return CURRENCY_DESCRIPTION;
  }


  /**
   * Sets the value of the 'CURRENCY_DESCRIPTION' field.
   * @param value the value to set.
   */
  public void setCURRENCYDESCRIPTION(java.lang.String value) {
    this.CURRENCY_DESCRIPTION = value;
  }

  /**
   * Gets the value of the 'EXCHANGE_RATE' field.
   * @return The value of the 'EXCHANGE_RATE' field.
   */
  public java.math.BigDecimal getEXCHANGERATE() {
    return EXCHANGE_RATE;
  }


  /**
   * Sets the value of the 'EXCHANGE_RATE' field.
   * @param value the value to set.
   */
  public void setEXCHANGERATE(java.math.BigDecimal value) {
    this.EXCHANGE_RATE = value;
  }

  /**
   * Creates a new CurrencyValue RecordBuilder.
   * @return A new CurrencyValue RecordBuilder
   */
  public static com.fnz.debezium.schema.CurrencyValue.Builder newBuilder() {
    return new com.fnz.debezium.schema.CurrencyValue.Builder();
  }

  /**
   * Creates a new CurrencyValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CurrencyValue RecordBuilder
   */
  public static com.fnz.debezium.schema.CurrencyValue.Builder newBuilder(com.fnz.debezium.schema.CurrencyValue.Builder other) {
    if (other == null) {
      return new com.fnz.debezium.schema.CurrencyValue.Builder();
    } else {
      return new com.fnz.debezium.schema.CurrencyValue.Builder(other);
    }
  }

  /**
   * Creates a new CurrencyValue RecordBuilder by copying an existing CurrencyValue instance.
   * @param other The existing instance to copy.
   * @return A new CurrencyValue RecordBuilder
   */
  public static com.fnz.debezium.schema.CurrencyValue.Builder newBuilder(com.fnz.debezium.schema.CurrencyValue other) {
    if (other == null) {
      return new com.fnz.debezium.schema.CurrencyValue.Builder();
    } else {
      return new com.fnz.debezium.schema.CurrencyValue.Builder(other);
    }
  }

  /**
   * RecordBuilder for CurrencyValue instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CurrencyValue>
    implements org.apache.avro.data.RecordBuilder<CurrencyValue> {

    private java.lang.String CURRENCY_CODE;
    private java.lang.String CURRENCY_DESCRIPTION;
    private java.math.BigDecimal EXCHANGE_RATE;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fnz.debezium.schema.CurrencyValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CURRENCY_CODE)) {
        this.CURRENCY_CODE = data().deepCopy(fields()[0].schema(), other.CURRENCY_CODE);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.CURRENCY_DESCRIPTION)) {
        this.CURRENCY_DESCRIPTION = data().deepCopy(fields()[1].schema(), other.CURRENCY_DESCRIPTION);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.EXCHANGE_RATE)) {
        this.EXCHANGE_RATE = data().deepCopy(fields()[2].schema(), other.EXCHANGE_RATE);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing CurrencyValue instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fnz.debezium.schema.CurrencyValue other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.CURRENCY_CODE)) {
        this.CURRENCY_CODE = data().deepCopy(fields()[0].schema(), other.CURRENCY_CODE);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CURRENCY_DESCRIPTION)) {
        this.CURRENCY_DESCRIPTION = data().deepCopy(fields()[1].schema(), other.CURRENCY_DESCRIPTION);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.EXCHANGE_RATE)) {
        this.EXCHANGE_RATE = data().deepCopy(fields()[2].schema(), other.EXCHANGE_RATE);
        fieldSetFlags()[2] = true;
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
    public com.fnz.debezium.schema.CurrencyValue.Builder setCURRENCYCODE(java.lang.String value) {
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
    public com.fnz.debezium.schema.CurrencyValue.Builder clearCURRENCYCODE() {
      CURRENCY_CODE = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'CURRENCY_DESCRIPTION' field.
      * @return The value.
      */
    public java.lang.String getCURRENCYDESCRIPTION() {
      return CURRENCY_DESCRIPTION;
    }


    /**
      * Sets the value of the 'CURRENCY_DESCRIPTION' field.
      * @param value The value of 'CURRENCY_DESCRIPTION'.
      * @return This builder.
      */
    public com.fnz.debezium.schema.CurrencyValue.Builder setCURRENCYDESCRIPTION(java.lang.String value) {
      validate(fields()[1], value);
      this.CURRENCY_DESCRIPTION = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'CURRENCY_DESCRIPTION' field has been set.
      * @return True if the 'CURRENCY_DESCRIPTION' field has been set, false otherwise.
      */
    public boolean hasCURRENCYDESCRIPTION() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'CURRENCY_DESCRIPTION' field.
      * @return This builder.
      */
    public com.fnz.debezium.schema.CurrencyValue.Builder clearCURRENCYDESCRIPTION() {
      CURRENCY_DESCRIPTION = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'EXCHANGE_RATE' field.
      * @return The value.
      */
    public java.math.BigDecimal getEXCHANGERATE() {
      return EXCHANGE_RATE;
    }


    /**
      * Sets the value of the 'EXCHANGE_RATE' field.
      * @param value The value of 'EXCHANGE_RATE'.
      * @return This builder.
      */
    public com.fnz.debezium.schema.CurrencyValue.Builder setEXCHANGERATE(java.math.BigDecimal value) {
      validate(fields()[2], value);
      this.EXCHANGE_RATE = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'EXCHANGE_RATE' field has been set.
      * @return True if the 'EXCHANGE_RATE' field has been set, false otherwise.
      */
    public boolean hasEXCHANGERATE() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'EXCHANGE_RATE' field.
      * @return This builder.
      */
    public com.fnz.debezium.schema.CurrencyValue.Builder clearEXCHANGERATE() {
      EXCHANGE_RATE = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CurrencyValue build() {
      try {
        CurrencyValue record = new CurrencyValue();
        record.CURRENCY_CODE = fieldSetFlags()[0] ? this.CURRENCY_CODE : (java.lang.String) defaultValue(fields()[0]);
        record.CURRENCY_DESCRIPTION = fieldSetFlags()[1] ? this.CURRENCY_DESCRIPTION : (java.lang.String) defaultValue(fields()[1]);
        record.EXCHANGE_RATE = fieldSetFlags()[2] ? this.EXCHANGE_RATE : (java.math.BigDecimal) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CurrencyValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<CurrencyValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CurrencyValue>
    READER$ = (org.apache.avro.io.DatumReader<CurrencyValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










