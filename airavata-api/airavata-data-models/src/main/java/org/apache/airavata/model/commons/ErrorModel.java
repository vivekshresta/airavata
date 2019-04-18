/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.commons;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class ErrorModel implements org.apache.thrift.TBase<ErrorModel, ErrorModel._Fields>, java.io.Serializable, Cloneable, Comparable<ErrorModel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ErrorModel");

  private static final org.apache.thrift.protocol.TField ERROR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("errorId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("creationTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ACTUAL_ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("actualErrorMessage", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_FRIENDLY_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("userFriendlyMessage", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TRANSIENT_OR_PERSISTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("transientOrPersistent", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField ROOT_CAUSE_ERROR_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("rootCauseErrorIdList", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ErrorModelStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ErrorModelTupleSchemeFactory();

  private java.lang.String errorId; // required
  private long creationTime; // optional
  private java.lang.String actualErrorMessage; // optional
  private java.lang.String userFriendlyMessage; // optional
  private boolean transientOrPersistent; // optional
  private java.util.List<java.lang.String> rootCauseErrorIdList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_ID((short)1, "errorId"),
    CREATION_TIME((short)2, "creationTime"),
    ACTUAL_ERROR_MESSAGE((short)3, "actualErrorMessage"),
    USER_FRIENDLY_MESSAGE((short)4, "userFriendlyMessage"),
    TRANSIENT_OR_PERSISTENT((short)5, "transientOrPersistent"),
    ROOT_CAUSE_ERROR_ID_LIST((short)6, "rootCauseErrorIdList");

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
        case 1: // ERROR_ID
          return ERROR_ID;
        case 2: // CREATION_TIME
          return CREATION_TIME;
        case 3: // ACTUAL_ERROR_MESSAGE
          return ACTUAL_ERROR_MESSAGE;
        case 4: // USER_FRIENDLY_MESSAGE
          return USER_FRIENDLY_MESSAGE;
        case 5: // TRANSIENT_OR_PERSISTENT
          return TRANSIENT_OR_PERSISTENT;
        case 6: // ROOT_CAUSE_ERROR_ID_LIST
          return ROOT_CAUSE_ERROR_ID_LIST;
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
  private static final int __CREATIONTIME_ISSET_ID = 0;
  private static final int __TRANSIENTORPERSISTENT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CREATION_TIME,_Fields.ACTUAL_ERROR_MESSAGE,_Fields.USER_FRIENDLY_MESSAGE,_Fields.TRANSIENT_OR_PERSISTENT,_Fields.ROOT_CAUSE_ERROR_ID_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_ID, new org.apache.thrift.meta_data.FieldMetaData("errorId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("creationTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ACTUAL_ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("actualErrorMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_FRIENDLY_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("userFriendlyMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRANSIENT_OR_PERSISTENT, new org.apache.thrift.meta_data.FieldMetaData("transientOrPersistent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ROOT_CAUSE_ERROR_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("rootCauseErrorIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ErrorModel.class, metaDataMap);
  }

  public ErrorModel() {
    this.errorId = "DO_NOT_SET_AT_CLIENTS";

    this.transientOrPersistent = false;

  }

  public ErrorModel(
    java.lang.String errorId)
  {
    this();
    this.errorId = errorId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ErrorModel(ErrorModel other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetErrorId()) {
      this.errorId = other.errorId;
    }
    this.creationTime = other.creationTime;
    if (other.isSetActualErrorMessage()) {
      this.actualErrorMessage = other.actualErrorMessage;
    }
    if (other.isSetUserFriendlyMessage()) {
      this.userFriendlyMessage = other.userFriendlyMessage;
    }
    this.transientOrPersistent = other.transientOrPersistent;
    if (other.isSetRootCauseErrorIdList()) {
      java.util.List<java.lang.String> __this__rootCauseErrorIdList = new java.util.ArrayList<java.lang.String>(other.rootCauseErrorIdList);
      this.rootCauseErrorIdList = __this__rootCauseErrorIdList;
    }
  }

  public ErrorModel deepCopy() {
    return new ErrorModel(this);
  }

  @Override
  public void clear() {
    this.errorId = "DO_NOT_SET_AT_CLIENTS";

    setCreationTimeIsSet(false);
    this.creationTime = 0;
    this.actualErrorMessage = null;
    this.userFriendlyMessage = null;
    this.transientOrPersistent = false;

    this.rootCauseErrorIdList = null;
  }

  public java.lang.String getErrorId() {
    return this.errorId;
  }

  public void setErrorId(java.lang.String errorId) {
    this.errorId = errorId;
  }

  public void unsetErrorId() {
    this.errorId = null;
  }

  /** Returns true if field errorId is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorId() {
    return this.errorId != null;
  }

  public void setErrorIdIsSet(boolean value) {
    if (!value) {
      this.errorId = null;
    }
  }

  public long getCreationTime() {
    return this.creationTime;
  }

  public void setCreationTime(long creationTime) {
    this.creationTime = creationTime;
    setCreationTimeIsSet(true);
  }

  public void unsetCreationTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  /** Returns true if field creationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreationTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  public void setCreationTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATIONTIME_ISSET_ID, value);
  }

  public java.lang.String getActualErrorMessage() {
    return this.actualErrorMessage;
  }

  public void setActualErrorMessage(java.lang.String actualErrorMessage) {
    this.actualErrorMessage = actualErrorMessage;
  }

  public void unsetActualErrorMessage() {
    this.actualErrorMessage = null;
  }

  /** Returns true if field actualErrorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetActualErrorMessage() {
    return this.actualErrorMessage != null;
  }

  public void setActualErrorMessageIsSet(boolean value) {
    if (!value) {
      this.actualErrorMessage = null;
    }
  }

  public java.lang.String getUserFriendlyMessage() {
    return this.userFriendlyMessage;
  }

  public void setUserFriendlyMessage(java.lang.String userFriendlyMessage) {
    this.userFriendlyMessage = userFriendlyMessage;
  }

  public void unsetUserFriendlyMessage() {
    this.userFriendlyMessage = null;
  }

  /** Returns true if field userFriendlyMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetUserFriendlyMessage() {
    return this.userFriendlyMessage != null;
  }

  public void setUserFriendlyMessageIsSet(boolean value) {
    if (!value) {
      this.userFriendlyMessage = null;
    }
  }

  public boolean isTransientOrPersistent() {
    return this.transientOrPersistent;
  }

  public void setTransientOrPersistent(boolean transientOrPersistent) {
    this.transientOrPersistent = transientOrPersistent;
    setTransientOrPersistentIsSet(true);
  }

  public void unsetTransientOrPersistent() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRANSIENTORPERSISTENT_ISSET_ID);
  }

  /** Returns true if field transientOrPersistent is set (has been assigned a value) and false otherwise */
  public boolean isSetTransientOrPersistent() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRANSIENTORPERSISTENT_ISSET_ID);
  }

  public void setTransientOrPersistentIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRANSIENTORPERSISTENT_ISSET_ID, value);
  }

  public int getRootCauseErrorIdListSize() {
    return (this.rootCauseErrorIdList == null) ? 0 : this.rootCauseErrorIdList.size();
  }

  public java.util.Iterator<java.lang.String> getRootCauseErrorIdListIterator() {
    return (this.rootCauseErrorIdList == null) ? null : this.rootCauseErrorIdList.iterator();
  }

  public void addToRootCauseErrorIdList(java.lang.String elem) {
    if (this.rootCauseErrorIdList == null) {
      this.rootCauseErrorIdList = new java.util.ArrayList<java.lang.String>();
    }
    this.rootCauseErrorIdList.add(elem);
  }

  public java.util.List<java.lang.String> getRootCauseErrorIdList() {
    return this.rootCauseErrorIdList;
  }

  public void setRootCauseErrorIdList(java.util.List<java.lang.String> rootCauseErrorIdList) {
    this.rootCauseErrorIdList = rootCauseErrorIdList;
  }

  public void unsetRootCauseErrorIdList() {
    this.rootCauseErrorIdList = null;
  }

  /** Returns true if field rootCauseErrorIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetRootCauseErrorIdList() {
    return this.rootCauseErrorIdList != null;
  }

  public void setRootCauseErrorIdListIsSet(boolean value) {
    if (!value) {
      this.rootCauseErrorIdList = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ERROR_ID:
      if (value == null) {
        unsetErrorId();
      } else {
        setErrorId((java.lang.String)value);
      }
      break;

    case CREATION_TIME:
      if (value == null) {
        unsetCreationTime();
      } else {
        setCreationTime((java.lang.Long)value);
      }
      break;

    case ACTUAL_ERROR_MESSAGE:
      if (value == null) {
        unsetActualErrorMessage();
      } else {
        setActualErrorMessage((java.lang.String)value);
      }
      break;

    case USER_FRIENDLY_MESSAGE:
      if (value == null) {
        unsetUserFriendlyMessage();
      } else {
        setUserFriendlyMessage((java.lang.String)value);
      }
      break;

    case TRANSIENT_OR_PERSISTENT:
      if (value == null) {
        unsetTransientOrPersistent();
      } else {
        setTransientOrPersistent((java.lang.Boolean)value);
      }
      break;

    case ROOT_CAUSE_ERROR_ID_LIST:
      if (value == null) {
        unsetRootCauseErrorIdList();
      } else {
        setRootCauseErrorIdList((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_ID:
      return getErrorId();

    case CREATION_TIME:
      return getCreationTime();

    case ACTUAL_ERROR_MESSAGE:
      return getActualErrorMessage();

    case USER_FRIENDLY_MESSAGE:
      return getUserFriendlyMessage();

    case TRANSIENT_OR_PERSISTENT:
      return isTransientOrPersistent();

    case ROOT_CAUSE_ERROR_ID_LIST:
      return getRootCauseErrorIdList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERROR_ID:
      return isSetErrorId();
    case CREATION_TIME:
      return isSetCreationTime();
    case ACTUAL_ERROR_MESSAGE:
      return isSetActualErrorMessage();
    case USER_FRIENDLY_MESSAGE:
      return isSetUserFriendlyMessage();
    case TRANSIENT_OR_PERSISTENT:
      return isSetTransientOrPersistent();
    case ROOT_CAUSE_ERROR_ID_LIST:
      return isSetRootCauseErrorIdList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ErrorModel)
      return this.equals((ErrorModel)that);
    return false;
  }

  public boolean equals(ErrorModel that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_errorId = true && this.isSetErrorId();
    boolean that_present_errorId = true && that.isSetErrorId();
    if (this_present_errorId || that_present_errorId) {
      if (!(this_present_errorId && that_present_errorId))
        return false;
      if (!this.errorId.equals(that.errorId))
        return false;
    }

    boolean this_present_creationTime = true && this.isSetCreationTime();
    boolean that_present_creationTime = true && that.isSetCreationTime();
    if (this_present_creationTime || that_present_creationTime) {
      if (!(this_present_creationTime && that_present_creationTime))
        return false;
      if (this.creationTime != that.creationTime)
        return false;
    }

    boolean this_present_actualErrorMessage = true && this.isSetActualErrorMessage();
    boolean that_present_actualErrorMessage = true && that.isSetActualErrorMessage();
    if (this_present_actualErrorMessage || that_present_actualErrorMessage) {
      if (!(this_present_actualErrorMessage && that_present_actualErrorMessage))
        return false;
      if (!this.actualErrorMessage.equals(that.actualErrorMessage))
        return false;
    }

    boolean this_present_userFriendlyMessage = true && this.isSetUserFriendlyMessage();
    boolean that_present_userFriendlyMessage = true && that.isSetUserFriendlyMessage();
    if (this_present_userFriendlyMessage || that_present_userFriendlyMessage) {
      if (!(this_present_userFriendlyMessage && that_present_userFriendlyMessage))
        return false;
      if (!this.userFriendlyMessage.equals(that.userFriendlyMessage))
        return false;
    }

    boolean this_present_transientOrPersistent = true && this.isSetTransientOrPersistent();
    boolean that_present_transientOrPersistent = true && that.isSetTransientOrPersistent();
    if (this_present_transientOrPersistent || that_present_transientOrPersistent) {
      if (!(this_present_transientOrPersistent && that_present_transientOrPersistent))
        return false;
      if (this.transientOrPersistent != that.transientOrPersistent)
        return false;
    }

    boolean this_present_rootCauseErrorIdList = true && this.isSetRootCauseErrorIdList();
    boolean that_present_rootCauseErrorIdList = true && that.isSetRootCauseErrorIdList();
    if (this_present_rootCauseErrorIdList || that_present_rootCauseErrorIdList) {
      if (!(this_present_rootCauseErrorIdList && that_present_rootCauseErrorIdList))
        return false;
      if (!this.rootCauseErrorIdList.equals(that.rootCauseErrorIdList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetErrorId()) ? 131071 : 524287);
    if (isSetErrorId())
      hashCode = hashCode * 8191 + errorId.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreationTime()) ? 131071 : 524287);
    if (isSetCreationTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(creationTime);

    hashCode = hashCode * 8191 + ((isSetActualErrorMessage()) ? 131071 : 524287);
    if (isSetActualErrorMessage())
      hashCode = hashCode * 8191 + actualErrorMessage.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserFriendlyMessage()) ? 131071 : 524287);
    if (isSetUserFriendlyMessage())
      hashCode = hashCode * 8191 + userFriendlyMessage.hashCode();

    hashCode = hashCode * 8191 + ((isSetTransientOrPersistent()) ? 131071 : 524287);
    if (isSetTransientOrPersistent())
      hashCode = hashCode * 8191 + ((transientOrPersistent) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetRootCauseErrorIdList()) ? 131071 : 524287);
    if (isSetRootCauseErrorIdList())
      hashCode = hashCode * 8191 + rootCauseErrorIdList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ErrorModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetErrorId()).compareTo(other.isSetErrorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorId, other.errorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreationTime()).compareTo(other.isSetCreationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreationTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creationTime, other.creationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetActualErrorMessage()).compareTo(other.isSetActualErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActualErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actualErrorMessage, other.actualErrorMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserFriendlyMessage()).compareTo(other.isSetUserFriendlyMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserFriendlyMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userFriendlyMessage, other.userFriendlyMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransientOrPersistent()).compareTo(other.isSetTransientOrPersistent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransientOrPersistent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transientOrPersistent, other.transientOrPersistent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRootCauseErrorIdList()).compareTo(other.isSetRootCauseErrorIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRootCauseErrorIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rootCauseErrorIdList, other.rootCauseErrorIdList);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorModel(");
    boolean first = true;

    sb.append("errorId:");
    if (this.errorId == null) {
      sb.append("null");
    } else {
      sb.append(this.errorId);
    }
    first = false;
    if (isSetCreationTime()) {
      if (!first) sb.append(", ");
      sb.append("creationTime:");
      sb.append(this.creationTime);
      first = false;
    }
    if (isSetActualErrorMessage()) {
      if (!first) sb.append(", ");
      sb.append("actualErrorMessage:");
      if (this.actualErrorMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.actualErrorMessage);
      }
      first = false;
    }
    if (isSetUserFriendlyMessage()) {
      if (!first) sb.append(", ");
      sb.append("userFriendlyMessage:");
      if (this.userFriendlyMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.userFriendlyMessage);
      }
      first = false;
    }
    if (isSetTransientOrPersistent()) {
      if (!first) sb.append(", ");
      sb.append("transientOrPersistent:");
      sb.append(this.transientOrPersistent);
      first = false;
    }
    if (isSetRootCauseErrorIdList()) {
      if (!first) sb.append(", ");
      sb.append("rootCauseErrorIdList:");
      if (this.rootCauseErrorIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.rootCauseErrorIdList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetErrorId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'errorId' is unset! Struct:" + toString());
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

  private static class ErrorModelStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ErrorModelStandardScheme getScheme() {
      return new ErrorModelStandardScheme();
    }
  }

  private static class ErrorModelStandardScheme extends org.apache.thrift.scheme.StandardScheme<ErrorModel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ErrorModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorId = iprot.readString();
              struct.setErrorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.creationTime = iprot.readI64();
              struct.setCreationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACTUAL_ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.actualErrorMessage = iprot.readString();
              struct.setActualErrorMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_FRIENDLY_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userFriendlyMessage = iprot.readString();
              struct.setUserFriendlyMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TRANSIENT_OR_PERSISTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.transientOrPersistent = iprot.readBool();
              struct.setTransientOrPersistentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ROOT_CAUSE_ERROR_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.rootCauseErrorIdList = new java.util.ArrayList<java.lang.String>(_list0.size);
                java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.rootCauseErrorIdList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRootCauseErrorIdListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ErrorModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.errorId != null) {
        oprot.writeFieldBegin(ERROR_ID_FIELD_DESC);
        oprot.writeString(struct.errorId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreationTime()) {
        oprot.writeFieldBegin(CREATION_TIME_FIELD_DESC);
        oprot.writeI64(struct.creationTime);
        oprot.writeFieldEnd();
      }
      if (struct.actualErrorMessage != null) {
        if (struct.isSetActualErrorMessage()) {
          oprot.writeFieldBegin(ACTUAL_ERROR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.actualErrorMessage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.userFriendlyMessage != null) {
        if (struct.isSetUserFriendlyMessage()) {
          oprot.writeFieldBegin(USER_FRIENDLY_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.userFriendlyMessage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTransientOrPersistent()) {
        oprot.writeFieldBegin(TRANSIENT_OR_PERSISTENT_FIELD_DESC);
        oprot.writeBool(struct.transientOrPersistent);
        oprot.writeFieldEnd();
      }
      if (struct.rootCauseErrorIdList != null) {
        if (struct.isSetRootCauseErrorIdList()) {
          oprot.writeFieldBegin(ROOT_CAUSE_ERROR_ID_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.rootCauseErrorIdList.size()));
            for (java.lang.String _iter3 : struct.rootCauseErrorIdList)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ErrorModelTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ErrorModelTupleScheme getScheme() {
      return new ErrorModelTupleScheme();
    }
  }

  private static class ErrorModelTupleScheme extends org.apache.thrift.scheme.TupleScheme<ErrorModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ErrorModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.errorId);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCreationTime()) {
        optionals.set(0);
      }
      if (struct.isSetActualErrorMessage()) {
        optionals.set(1);
      }
      if (struct.isSetUserFriendlyMessage()) {
        optionals.set(2);
      }
      if (struct.isSetTransientOrPersistent()) {
        optionals.set(3);
      }
      if (struct.isSetRootCauseErrorIdList()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetCreationTime()) {
        oprot.writeI64(struct.creationTime);
      }
      if (struct.isSetActualErrorMessage()) {
        oprot.writeString(struct.actualErrorMessage);
      }
      if (struct.isSetUserFriendlyMessage()) {
        oprot.writeString(struct.userFriendlyMessage);
      }
      if (struct.isSetTransientOrPersistent()) {
        oprot.writeBool(struct.transientOrPersistent);
      }
      if (struct.isSetRootCauseErrorIdList()) {
        {
          oprot.writeI32(struct.rootCauseErrorIdList.size());
          for (java.lang.String _iter4 : struct.rootCauseErrorIdList)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ErrorModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.errorId = iprot.readString();
      struct.setErrorIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.creationTime = iprot.readI64();
        struct.setCreationTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.actualErrorMessage = iprot.readString();
        struct.setActualErrorMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.userFriendlyMessage = iprot.readString();
        struct.setUserFriendlyMessageIsSet(true);
      }
      if (incoming.get(3)) {
        struct.transientOrPersistent = iprot.readBool();
        struct.setTransientOrPersistentIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.rootCauseErrorIdList = new java.util.ArrayList<java.lang.String>(_list5.size);
          java.lang.String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.rootCauseErrorIdList.add(_elem6);
          }
        }
        struct.setRootCauseErrorIdListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

