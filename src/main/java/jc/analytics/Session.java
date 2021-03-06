/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package jc.analytics;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Conversion;
import org.apache.avro.Schema;
import org.apache.avro.data.ErrorBuilder;
import org.apache.avro.data.RecordBuilder;
import org.apache.avro.data.TimeConversions;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.*;

import com.jamcity.avro.generic.EnhancedRecord;
import com.jamcity.avro.schema.SchemaInfo;
import com.jamcity.avro.schema.SchemaLocator;

@SuppressWarnings("all")
@AvroGenerated
public class Session extends SpecificRecordBase implements SpecificRecord, EnhancedRecord {
  private static final long serialVersionUID = -3175805900385600916L;
  public static final Schema SCHEMA$ = new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Session\",\"namespace\":\"jc.analytics\",\"fields\":[{\"name\":\"serverDate\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"serverTimestamp\",\"type\":[\"null\",\"long\"]},{\"name\":\"userTimestamp\",\"type\":[\"null\",\"long\"]},{\"name\":\"appId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"eventJson\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static final SchemaInfo SCHEMA_INFO$ = new SchemaInfo(new SchemaLocator("analytics.session-value", 2), 63, SCHEMA$);
  public static Schema getClassSchema() { return SCHEMA$; }
  public static SchemaInfo getClassSchemaInfo() { return SCHEMA_INFO$; }
  @Deprecated public java.lang.String serverDate;
  @Deprecated public java.lang.Long serverTimestamp;
  @Deprecated public java.lang.Long userTimestamp;
  @Deprecated public java.lang.String appId;
  @Deprecated public java.lang.String sessionId;
  @Deprecated public java.lang.String userId;
  @Deprecated public java.lang.String eventJson;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Session() {}

  /**
   * All-args constructor.
   * @param serverDate The new value for serverDate
   * @param serverTimestamp The new value for serverTimestamp
   * @param userTimestamp The new value for userTimestamp
   * @param appId The new value for appId
   * @param sessionId The new value for sessionId
   * @param userId The new value for userId
   * @param eventJson The new value for eventJson
   */
  public Session(java.lang.String serverDate, java.lang.Long serverTimestamp, java.lang.Long userTimestamp, java.lang.String appId, java.lang.String sessionId, java.lang.String userId, java.lang.String eventJson) {
    this.serverDate = serverDate;
    this.serverTimestamp = serverTimestamp;
    this.userTimestamp = userTimestamp;
    this.appId = appId;
    this.sessionId = sessionId;
    this.userId = userId;
    this.eventJson = eventJson;
  }

  public Schema getSchema() { return SCHEMA$; }
  public SchemaInfo getSchemaInfo() { return SCHEMA_INFO$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return serverDate;
    case 1: return serverTimestamp;
    case 2: return userTimestamp;
    case 3: return appId;
    case 4: return sessionId;
    case 5: return userId;
    case 6: return eventJson;
    default: throw new AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: serverDate = (java.lang.String)value$; break;
    case 1: serverTimestamp = (java.lang.Long)value$; break;
    case 2: userTimestamp = (java.lang.Long)value$; break;
    case 3: appId = (java.lang.String)value$; break;
    case 4: sessionId = (java.lang.String)value$; break;
    case 5: userId = (java.lang.String)value$; break;
    case 6: eventJson = (java.lang.String)value$; break;
    default: throw new AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'serverDate' field.
   * @return The value of the 'serverDate' field.
   */
  public java.lang.String getServerDate() {
    return serverDate;
  }

  /**
   * Sets the value of the 'serverDate' field.
   * @param value the value to set.
   */
  public void setServerDate(java.lang.String value) {
    this.serverDate = value;
  }

  /**
   * Gets the value of the 'serverTimestamp' field.
   * @return The value of the 'serverTimestamp' field.
   */
  public java.lang.Long getServerTimestamp() {
    return serverTimestamp;
  }

  /**
   * Sets the value of the 'serverTimestamp' field.
   * @param value the value to set.
   */
  public void setServerTimestamp(java.lang.Long value) {
    this.serverTimestamp = value;
  }

  /**
   * Gets the value of the 'userTimestamp' field.
   * @return The value of the 'userTimestamp' field.
   */
  public java.lang.Long getUserTimestamp() {
    return userTimestamp;
  }

  /**
   * Sets the value of the 'userTimestamp' field.
   * @param value the value to set.
   */
  public void setUserTimestamp(java.lang.Long value) {
    this.userTimestamp = value;
  }

  /**
   * Gets the value of the 'appId' field.
   * @return The value of the 'appId' field.
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * Sets the value of the 'appId' field.
   * @param value the value to set.
   */
  public void setAppId(java.lang.String value) {
    this.appId = value;
  }

  /**
   * Gets the value of the 'sessionId' field.
   * @return The value of the 'sessionId' field.
   */
  public java.lang.String getSessionId() {
    return sessionId;
  }

  /**
   * Sets the value of the 'sessionId' field.
   * @param value the value to set.
   */
  public void setSessionId(java.lang.String value) {
    this.sessionId = value;
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.String value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'eventJson' field.
   * @return The value of the 'eventJson' field.
   */
  public java.lang.String getEventJson() {
    return eventJson;
  }

  /**
   * Sets the value of the 'eventJson' field.
   * @param value the value to set.
   */
  public void setEventJson(java.lang.String value) {
    this.eventJson = value;
  }

  /**
   * Creates a new Session RecordBuilder.
   * @return A new Session RecordBuilder
   */
  public static jc.analytics.Session.Builder newBuilder() {
    return new jc.analytics.Session.Builder();
  }

  /**
   * Creates a new Session RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Session RecordBuilder
   */
  public static jc.analytics.Session.Builder newBuilder(jc.analytics.Session.Builder other) {
    return new jc.analytics.Session.Builder(other);
  }

  /**
   * Creates a new Session RecordBuilder by copying an existing Session instance.
   * @param other The existing instance to copy.
   * @return A new Session RecordBuilder
   */
  public static jc.analytics.Session.Builder newBuilder(jc.analytics.Session other) {
    return new jc.analytics.Session.Builder(other);
  }

  /**
   * RecordBuilder for Session instances.
   */
  public static class Builder extends SpecificRecordBuilderBase<Session>
    implements RecordBuilder<Session> {

    private java.lang.String serverDate;
    private java.lang.Long serverTimestamp;
    private java.lang.Long userTimestamp;
    private java.lang.String appId;
    private java.lang.String sessionId;
    private java.lang.String userId;
    private java.lang.String eventJson;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(jc.analytics.Session.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.serverDate)) {
        this.serverDate = data().deepCopy(fields()[0].schema(), other.serverDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.serverTimestamp)) {
        this.serverTimestamp = data().deepCopy(fields()[1].schema(), other.serverTimestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.userTimestamp)) {
        this.userTimestamp = data().deepCopy(fields()[2].schema(), other.userTimestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.appId)) {
        this.appId = data().deepCopy(fields()[3].schema(), other.appId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[4].schema(), other.sessionId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.userId)) {
        this.userId = data().deepCopy(fields()[5].schema(), other.userId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.eventJson)) {
        this.eventJson = data().deepCopy(fields()[6].schema(), other.eventJson);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Session instance
     * @param other The existing instance to copy.
     */
    private Builder(jc.analytics.Session other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.serverDate)) {
        this.serverDate = data().deepCopy(fields()[0].schema(), other.serverDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.serverTimestamp)) {
        this.serverTimestamp = data().deepCopy(fields()[1].schema(), other.serverTimestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.userTimestamp)) {
        this.userTimestamp = data().deepCopy(fields()[2].schema(), other.userTimestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.appId)) {
        this.appId = data().deepCopy(fields()[3].schema(), other.appId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[4].schema(), other.sessionId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.userId)) {
        this.userId = data().deepCopy(fields()[5].schema(), other.userId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.eventJson)) {
        this.eventJson = data().deepCopy(fields()[6].schema(), other.eventJson);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'serverDate' field.
      * @return The value.
      */
    public java.lang.String getServerDate() {
      return serverDate;
    }

    /**
      * Sets the value of the 'serverDate' field.
      * @param value The value of 'serverDate'.
      * @return This builder.
      */
    public jc.analytics.Session.Builder setServerDate(java.lang.String value) {
      validate(fields()[0], value);
      this.serverDate = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'serverDate' field has been set.
      * @return True if the 'serverDate' field has been set, false otherwise.
      */
    public boolean hasServerDate() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'serverDate' field.
      * @return This builder.
      */
    public jc.analytics.Session.Builder clearServerDate() {
      serverDate = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'serverTimestamp' field.
      * @return The value.
      */
    public java.lang.Long getServerTimestamp() {
      return serverTimestamp;
    }

    /**
      * Sets the value of the 'serverTimestamp' field.
      * @param value The value of 'serverTimestamp'.
      * @return This builder.
      */
    public jc.analytics.Session.Builder setServerTimestamp(java.lang.Long value) {
      validate(fields()[1], value);
      this.serverTimestamp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'serverTimestamp' field has been set.
      * @return True if the 'serverTimestamp' field has been set, false otherwise.
      */
    public boolean hasServerTimestamp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'serverTimestamp' field.
      * @return This builder.
      */
    public jc.analytics.Session.Builder clearServerTimestamp() {
      serverTimestamp = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'userTimestamp' field.
      * @return The value.
      */
    public java.lang.Long getUserTimestamp() {
      return userTimestamp;
    }

    /**
      * Sets the value of the 'userTimestamp' field.
      * @param value The value of 'userTimestamp'.
      * @return This builder.
      */
    public jc.analytics.Session.Builder setUserTimestamp(java.lang.Long value) {
      validate(fields()[2], value);
      this.userTimestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'userTimestamp' field has been set.
      * @return True if the 'userTimestamp' field has been set, false otherwise.
      */
    public boolean hasUserTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'userTimestamp' field.
      * @return This builder.
      */
    public jc.analytics.Session.Builder clearUserTimestamp() {
      userTimestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'appId' field.
      * @return The value.
      */
    public java.lang.String getAppId() {
      return appId;
    }

    /**
      * Sets the value of the 'appId' field.
      * @param value The value of 'appId'.
      * @return This builder.
      */
    public jc.analytics.Session.Builder setAppId(java.lang.String value) {
      validate(fields()[3], value);
      this.appId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'appId' field has been set.
      * @return True if the 'appId' field has been set, false otherwise.
      */
    public boolean hasAppId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'appId' field.
      * @return This builder.
      */
    public jc.analytics.Session.Builder clearAppId() {
      appId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'sessionId' field.
      * @return The value.
      */
    public java.lang.String getSessionId() {
      return sessionId;
    }

    /**
      * Sets the value of the 'sessionId' field.
      * @param value The value of 'sessionId'.
      * @return This builder.
      */
    public jc.analytics.Session.Builder setSessionId(java.lang.String value) {
      validate(fields()[4], value);
      this.sessionId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'sessionId' field has been set.
      * @return True if the 'sessionId' field has been set, false otherwise.
      */
    public boolean hasSessionId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'sessionId' field.
      * @return This builder.
      */
    public jc.analytics.Session.Builder clearSessionId() {
      sessionId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.String getUserId() {
      return userId;
    }

    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public jc.analytics.Session.Builder setUserId(java.lang.String value) {
      validate(fields()[5], value);
      this.userId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public jc.analytics.Session.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventJson' field.
      * @return The value.
      */
    public java.lang.String getEventJson() {
      return eventJson;
    }

    /**
      * Sets the value of the 'eventJson' field.
      * @param value The value of 'eventJson'.
      * @return This builder.
      */
    public jc.analytics.Session.Builder setEventJson(java.lang.String value) {
      validate(fields()[6], value);
      this.eventJson = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'eventJson' field has been set.
      * @return True if the 'eventJson' field has been set, false otherwise.
      */
    public boolean hasEventJson() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'eventJson' field.
      * @return This builder.
      */
    public jc.analytics.Session.Builder clearEventJson() {
      eventJson = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Session build() {
      try {
        Session record = new Session();
        record.serverDate = fieldSetFlags()[0] ? this.serverDate : (java.lang.String) defaultValue(fields()[0]);
        record.serverTimestamp = fieldSetFlags()[1] ? this.serverTimestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.userTimestamp = fieldSetFlags()[2] ? this.userTimestamp : (java.lang.Long) defaultValue(fields()[2]);
        record.appId = fieldSetFlags()[3] ? this.appId : (java.lang.String) defaultValue(fields()[3]);
        record.sessionId = fieldSetFlags()[4] ? this.sessionId : (java.lang.String) defaultValue(fields()[4]);
        record.userId = fieldSetFlags()[5] ? this.userId : (java.lang.String) defaultValue(fields()[5]);
        record.eventJson = fieldSetFlags()[6] ? this.eventJson : (java.lang.String) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new AvroRuntimeException(e);
      }
    }
  }

  private static final DatumWriter WRITER$ = new SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(ObjectOutput out) throws IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final DatumReader READER$ = new SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(ObjectInput in) throws IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
