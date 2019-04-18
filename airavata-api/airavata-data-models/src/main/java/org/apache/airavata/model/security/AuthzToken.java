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
package org.apache.airavata.model.security;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class AuthzToken implements org.apache.thrift.TBase<AuthzToken, AuthzToken._Fields>, java.io.Serializable, Cloneable, Comparable<AuthzToken> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthzToken");

  private static final org.apache.thrift.protocol.TField ACCESS_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("accessToken", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CLAIMS_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("claimsMap", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AuthzTokenStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AuthzTokenTupleSchemeFactory();

  private java.lang.String accessToken; // required
  private java.util.Map<java.lang.String,java.lang.String> claimsMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACCESS_TOKEN((short)1, "accessToken"),
    CLAIMS_MAP((short)2, "claimsMap");

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
        case 1: // ACCESS_TOKEN
          return ACCESS_TOKEN;
        case 2: // CLAIMS_MAP
          return CLAIMS_MAP;
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
  private static final _Fields optionals[] = {_Fields.CLAIMS_MAP};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACCESS_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("accessToken", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLAIMS_MAP, new org.apache.thrift.meta_data.FieldMetaData("claimsMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthzToken.class, metaDataMap);
  }

  public AuthzToken() {
  }

  public AuthzToken(
    java.lang.String accessToken)
  {
    this();
    this.accessToken = accessToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthzToken(AuthzToken other) {
    if (other.isSetAccessToken()) {
      this.accessToken = other.accessToken;
    }
    if (other.isSetClaimsMap()) {
      java.util.Map<java.lang.String,java.lang.String> __this__claimsMap = new java.util.HashMap<java.lang.String,java.lang.String>(other.claimsMap);
      this.claimsMap = __this__claimsMap;
    }
  }

  public AuthzToken deepCopy() {
    return new AuthzToken(this);
  }

  @Override
  public void clear() {
    this.accessToken = null;
    this.claimsMap = null;
  }

  public java.lang.String getAccessToken() {
    return this.accessToken;
  }

  public void setAccessToken(java.lang.String accessToken) {
    this.accessToken = accessToken;
  }

  public void unsetAccessToken() {
    this.accessToken = null;
  }

  /** Returns true if field accessToken is set (has been assigned a value) and false otherwise */
  public boolean isSetAccessToken() {
    return this.accessToken != null;
  }

  public void setAccessTokenIsSet(boolean value) {
    if (!value) {
      this.accessToken = null;
    }
  }

  public int getClaimsMapSize() {
    return (this.claimsMap == null) ? 0 : this.claimsMap.size();
  }

  public void putToClaimsMap(java.lang.String key, java.lang.String val) {
    if (this.claimsMap == null) {
      this.claimsMap = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.claimsMap.put(key, val);
  }

  public java.util.Map<java.lang.String,java.lang.String> getClaimsMap() {
    return this.claimsMap;
  }

  public void setClaimsMap(java.util.Map<java.lang.String,java.lang.String> claimsMap) {
    this.claimsMap = claimsMap;
  }

  public void unsetClaimsMap() {
    this.claimsMap = null;
  }

  /** Returns true if field claimsMap is set (has been assigned a value) and false otherwise */
  public boolean isSetClaimsMap() {
    return this.claimsMap != null;
  }

  public void setClaimsMapIsSet(boolean value) {
    if (!value) {
      this.claimsMap = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ACCESS_TOKEN:
      if (value == null) {
        unsetAccessToken();
      } else {
        setAccessToken((java.lang.String)value);
      }
      break;

    case CLAIMS_MAP:
      if (value == null) {
        unsetClaimsMap();
      } else {
        setClaimsMap((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ACCESS_TOKEN:
      return getAccessToken();

    case CLAIMS_MAP:
      return getClaimsMap();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ACCESS_TOKEN:
      return isSetAccessToken();
    case CLAIMS_MAP:
      return isSetClaimsMap();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthzToken)
      return this.equals((AuthzToken)that);
    return false;
  }

  public boolean equals(AuthzToken that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_accessToken = true && this.isSetAccessToken();
    boolean that_present_accessToken = true && that.isSetAccessToken();
    if (this_present_accessToken || that_present_accessToken) {
      if (!(this_present_accessToken && that_present_accessToken))
        return false;
      if (!this.accessToken.equals(that.accessToken))
        return false;
    }

    boolean this_present_claimsMap = true && this.isSetClaimsMap();
    boolean that_present_claimsMap = true && that.isSetClaimsMap();
    if (this_present_claimsMap || that_present_claimsMap) {
      if (!(this_present_claimsMap && that_present_claimsMap))
        return false;
      if (!this.claimsMap.equals(that.claimsMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAccessToken()) ? 131071 : 524287);
    if (isSetAccessToken())
      hashCode = hashCode * 8191 + accessToken.hashCode();

    hashCode = hashCode * 8191 + ((isSetClaimsMap()) ? 131071 : 524287);
    if (isSetClaimsMap())
      hashCode = hashCode * 8191 + claimsMap.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AuthzToken other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAccessToken()).compareTo(other.isSetAccessToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccessToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accessToken, other.accessToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetClaimsMap()).compareTo(other.isSetClaimsMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClaimsMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.claimsMap, other.claimsMap);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthzToken(");
    boolean first = true;

    sb.append("accessToken:");
    if (this.accessToken == null) {
      sb.append("null");
    } else {
      sb.append(this.accessToken);
    }
    first = false;
    if (isSetClaimsMap()) {
      if (!first) sb.append(", ");
      sb.append("claimsMap:");
      if (this.claimsMap == null) {
        sb.append("null");
      } else {
        sb.append(this.claimsMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetAccessToken()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'accessToken' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AuthzTokenStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthzTokenStandardScheme getScheme() {
      return new AuthzTokenStandardScheme();
    }
  }

  private static class AuthzTokenStandardScheme extends org.apache.thrift.scheme.StandardScheme<AuthzToken> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthzToken struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACCESS_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.accessToken = iprot.readString();
              struct.setAccessTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLAIMS_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.claimsMap = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map0.size);
                java.lang.String _key1;
                java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.claimsMap.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setClaimsMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthzToken struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.accessToken != null) {
        oprot.writeFieldBegin(ACCESS_TOKEN_FIELD_DESC);
        oprot.writeString(struct.accessToken);
        oprot.writeFieldEnd();
      }
      if (struct.claimsMap != null) {
        if (struct.isSetClaimsMap()) {
          oprot.writeFieldBegin(CLAIMS_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.claimsMap.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter4 : struct.claimsMap.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthzTokenTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthzTokenTupleScheme getScheme() {
      return new AuthzTokenTupleScheme();
    }
  }

  private static class AuthzTokenTupleScheme extends org.apache.thrift.scheme.TupleScheme<AuthzToken> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthzToken struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.accessToken);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetClaimsMap()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetClaimsMap()) {
        {
          oprot.writeI32(struct.claimsMap.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter5 : struct.claimsMap.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthzToken struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.accessToken = iprot.readString();
      struct.setAccessTokenIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.claimsMap = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map6.size);
          java.lang.String _key7;
          java.lang.String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.claimsMap.put(_key7, _val8);
          }
        }
        struct.setClaimsMapIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

