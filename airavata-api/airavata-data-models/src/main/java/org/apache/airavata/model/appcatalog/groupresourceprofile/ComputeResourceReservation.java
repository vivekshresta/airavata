/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.groupresourceprofile;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class ComputeResourceReservation implements org.apache.thrift.TBase<ComputeResourceReservation, ComputeResourceReservation._Fields>, java.io.Serializable, Cloneable, Comparable<ComputeResourceReservation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ComputeResourceReservation");

  private static final org.apache.thrift.protocol.TField RESERVATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("reservationId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RESERVATION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("reservationName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField QUEUE_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("queueNames", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField END_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("endTime", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ComputeResourceReservationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ComputeResourceReservationTupleSchemeFactory();

  private java.lang.String reservationId; // required
  private java.lang.String reservationName; // required
  private java.util.List<java.lang.String> queueNames; // required
  private long startTime; // required
  private long endTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESERVATION_ID((short)1, "reservationId"),
    RESERVATION_NAME((short)2, "reservationName"),
    QUEUE_NAMES((short)3, "queueNames"),
    START_TIME((short)4, "startTime"),
    END_TIME((short)5, "endTime");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESERVATION_ID
          return RESERVATION_ID;
        case 2: // RESERVATION_NAME
          return RESERVATION_NAME;
        case 3: // QUEUE_NAMES
          return QUEUE_NAMES;
        case 4: // START_TIME
          return START_TIME;
        case 5: // END_TIME
          return END_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STARTTIME_ISSET_ID = 0;
  private static final int __ENDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESERVATION_ID, new org.apache.thrift.meta_data.FieldMetaData("reservationId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESERVATION_NAME, new org.apache.thrift.meta_data.FieldMetaData("reservationName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUEUE_NAMES, new org.apache.thrift.meta_data.FieldMetaData("queueNames", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.END_TIME, new org.apache.thrift.meta_data.FieldMetaData("endTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ComputeResourceReservation.class, metaDataMap);
  }

  public ComputeResourceReservation() {
    this.reservationId = "DO_NOT_SET_AT_CLIENTS";

  }

  public ComputeResourceReservation(
    java.lang.String reservationId,
    java.lang.String reservationName,
    java.util.List<java.lang.String> queueNames,
    long startTime,
    long endTime)
  {
    this();
    this.reservationId = reservationId;
    this.reservationName = reservationName;
    this.queueNames = queueNames;
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.endTime = endTime;
    setEndTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ComputeResourceReservation(ComputeResourceReservation other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetReservationId()) {
      this.reservationId = other.reservationId;
    }
    if (other.isSetReservationName()) {
      this.reservationName = other.reservationName;
    }
    if (other.isSetQueueNames()) {
      java.util.List<java.lang.String> __this__queueNames = new java.util.ArrayList<java.lang.String>(other.queueNames);
      this.queueNames = __this__queueNames;
    }
    this.startTime = other.startTime;
    this.endTime = other.endTime;
  }

  public ComputeResourceReservation deepCopy() {
    return new ComputeResourceReservation(this);
  }

  @Override
  public void clear() {
    this.reservationId = "DO_NOT_SET_AT_CLIENTS";

    this.reservationName = null;
    this.queueNames = null;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
  }

  public java.lang.String getReservationId() {
    return this.reservationId;
  }

  public void setReservationId(java.lang.String reservationId) {
    this.reservationId = reservationId;
  }

  public void unsetReservationId() {
    this.reservationId = null;
  }

  /** Returns true if field reservationId is set (has been assigned a value) and false otherwise */
  public boolean isSetReservationId() {
    return this.reservationId != null;
  }

  public void setReservationIdIsSet(boolean value) {
    if (!value) {
      this.reservationId = null;
    }
  }

  public java.lang.String getReservationName() {
    return this.reservationName;
  }

  public void setReservationName(java.lang.String reservationName) {
    this.reservationName = reservationName;
  }

  public void unsetReservationName() {
    this.reservationName = null;
  }

  /** Returns true if field reservationName is set (has been assigned a value) and false otherwise */
  public boolean isSetReservationName() {
    return this.reservationName != null;
  }

  public void setReservationNameIsSet(boolean value) {
    if (!value) {
      this.reservationName = null;
    }
  }

  public int getQueueNamesSize() {
    return (this.queueNames == null) ? 0 : this.queueNames.size();
  }

  public java.util.Iterator<java.lang.String> getQueueNamesIterator() {
    return (this.queueNames == null) ? null : this.queueNames.iterator();
  }

  public void addToQueueNames(java.lang.String elem) {
    if (this.queueNames == null) {
      this.queueNames = new java.util.ArrayList<java.lang.String>();
    }
    this.queueNames.add(elem);
  }

  public java.util.List<java.lang.String> getQueueNames() {
    return this.queueNames;
  }

  public void setQueueNames(java.util.List<java.lang.String> queueNames) {
    this.queueNames = queueNames;
  }

  public void unsetQueueNames() {
    this.queueNames = null;
  }

  /** Returns true if field queueNames is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueNames() {
    return this.queueNames != null;
  }

  public void setQueueNamesIsSet(boolean value) {
    if (!value) {
      this.queueNames = null;
    }
  }

  public long getStartTime() {
    return this.startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
  }

  public void unsetStartTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public long getEndTime() {
    return this.endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
  }

  public void unsetEndTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case RESERVATION_ID:
      if (value == null) {
        unsetReservationId();
      } else {
        setReservationId((java.lang.String)value);
      }
      break;

    case RESERVATION_NAME:
      if (value == null) {
        unsetReservationName();
      } else {
        setReservationName((java.lang.String)value);
      }
      break;

    case QUEUE_NAMES:
      if (value == null) {
        unsetQueueNames();
      } else {
        setQueueNames((java.util.List<java.lang.String>)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((java.lang.Long)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESERVATION_ID:
      return getReservationId();

    case RESERVATION_NAME:
      return getReservationName();

    case QUEUE_NAMES:
      return getQueueNames();

    case START_TIME:
      return getStartTime();

    case END_TIME:
      return getEndTime();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RESERVATION_ID:
      return isSetReservationId();
    case RESERVATION_NAME:
      return isSetReservationName();
    case QUEUE_NAMES:
      return isSetQueueNames();
    case START_TIME:
      return isSetStartTime();
    case END_TIME:
      return isSetEndTime();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ComputeResourceReservation)
      return this.equals((ComputeResourceReservation)that);
    return false;
  }

  public boolean equals(ComputeResourceReservation that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_reservationId = true && this.isSetReservationId();
    boolean that_present_reservationId = true && that.isSetReservationId();
    if (this_present_reservationId || that_present_reservationId) {
      if (!(this_present_reservationId && that_present_reservationId))
        return false;
      if (!this.reservationId.equals(that.reservationId))
        return false;
    }

    boolean this_present_reservationName = true && this.isSetReservationName();
    boolean that_present_reservationName = true && that.isSetReservationName();
    if (this_present_reservationName || that_present_reservationName) {
      if (!(this_present_reservationName && that_present_reservationName))
        return false;
      if (!this.reservationName.equals(that.reservationName))
        return false;
    }

    boolean this_present_queueNames = true && this.isSetQueueNames();
    boolean that_present_queueNames = true && that.isSetQueueNames();
    if (this_present_queueNames || that_present_queueNames) {
      if (!(this_present_queueNames && that_present_queueNames))
        return false;
      if (!this.queueNames.equals(that.queueNames))
        return false;
    }

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_endTime = true;
    boolean that_present_endTime = true;
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetReservationId()) ? 131071 : 524287);
    if (isSetReservationId())
      hashCode = hashCode * 8191 + reservationId.hashCode();

    hashCode = hashCode * 8191 + ((isSetReservationName()) ? 131071 : 524287);
    if (isSetReservationName())
      hashCode = hashCode * 8191 + reservationName.hashCode();

    hashCode = hashCode * 8191 + ((isSetQueueNames()) ? 131071 : 524287);
    if (isSetQueueNames())
      hashCode = hashCode * 8191 + queueNames.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(startTime);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(endTime);

    return hashCode;
  }

  @Override
  public int compareTo(ComputeResourceReservation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetReservationId()).compareTo(other.isSetReservationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReservationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reservationId, other.reservationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReservationName()).compareTo(other.isSetReservationName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReservationName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reservationName, other.reservationName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetQueueNames()).compareTo(other.isSetQueueNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queueNames, other.queueNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEndTime()).compareTo(other.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endTime, other.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ComputeResourceReservation(");
    boolean first = true;

    sb.append("reservationId:");
    if (this.reservationId == null) {
      sb.append("null");
    } else {
      sb.append(this.reservationId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reservationName:");
    if (this.reservationName == null) {
      sb.append("null");
    } else {
      sb.append(this.reservationName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queueNames:");
    if (this.queueNames == null) {
      sb.append("null");
    } else {
      sb.append(this.queueNames);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    sb.append(this.endTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetReservationId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'reservationId' is unset! Struct:" + toString());
    }

    if (!isSetReservationName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'reservationName' is unset! Struct:" + toString());
    }

    if (!isSetQueueNames()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'queueNames' is unset! Struct:" + toString());
    }

    if (!isSetStartTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'startTime' is unset! Struct:" + toString());
    }

    if (!isSetEndTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'endTime' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ComputeResourceReservationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ComputeResourceReservationStandardScheme getScheme() {
      return new ComputeResourceReservationStandardScheme();
    }
  }

  private static class ComputeResourceReservationStandardScheme extends org.apache.thrift.scheme.StandardScheme<ComputeResourceReservation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ComputeResourceReservation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESERVATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reservationId = iprot.readString();
              struct.setReservationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESERVATION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reservationName = iprot.readString();
              struct.setReservationNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // QUEUE_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.queueNames = new java.util.ArrayList<java.lang.String>(_list0.size);
                java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.queueNames.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setQueueNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // END_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.endTime = iprot.readI64();
              struct.setEndTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ComputeResourceReservation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.reservationId != null) {
        oprot.writeFieldBegin(RESERVATION_ID_FIELD_DESC);
        oprot.writeString(struct.reservationId);
        oprot.writeFieldEnd();
      }
      if (struct.reservationName != null) {
        oprot.writeFieldBegin(RESERVATION_NAME_FIELD_DESC);
        oprot.writeString(struct.reservationName);
        oprot.writeFieldEnd();
      }
      if (struct.queueNames != null) {
        oprot.writeFieldBegin(QUEUE_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.queueNames.size()));
          for (java.lang.String _iter3 : struct.queueNames)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(struct.startTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_TIME_FIELD_DESC);
      oprot.writeI64(struct.endTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ComputeResourceReservationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ComputeResourceReservationTupleScheme getScheme() {
      return new ComputeResourceReservationTupleScheme();
    }
  }

  private static class ComputeResourceReservationTupleScheme extends org.apache.thrift.scheme.TupleScheme<ComputeResourceReservation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ComputeResourceReservation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.reservationId);
      oprot.writeString(struct.reservationName);
      {
        oprot.writeI32(struct.queueNames.size());
        for (java.lang.String _iter4 : struct.queueNames)
        {
          oprot.writeString(_iter4);
        }
      }
      oprot.writeI64(struct.startTime);
      oprot.writeI64(struct.endTime);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ComputeResourceReservation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.reservationId = iprot.readString();
      struct.setReservationIdIsSet(true);
      struct.reservationName = iprot.readString();
      struct.setReservationNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.queueNames = new java.util.ArrayList<java.lang.String>(_list5.size);
        java.lang.String _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = iprot.readString();
          struct.queueNames.add(_elem6);
        }
      }
      struct.setQueueNamesIsSet(true);
      struct.startTime = iprot.readI64();
      struct.setStartTimeIsSet(true);
      struct.endTime = iprot.readI64();
      struct.setEndTimeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
