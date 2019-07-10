/*
 * Copyright (c) [2018]
 * This file is part of the java-wisdomcore
 *
 * The java-wisdomcore is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The java-wisdomcore is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the java-wisdomcore. If not, see <http://www.gnu.org/licenses/>.
 */

package org.wisdom.protobuf.tcp;

public final class HandshakeModel {
  private HandshakeModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ByteMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.ethereum.protobuf.tcp.ByteMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes meg = 1;</code>
     */
    com.google.protobuf.ByteString getMeg();
  }
  /**
   * Protobuf type {@code org.ethereum.protobuf.tcp.ByteMessage}
   */
  public  static final class ByteMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.ethereum.protobuf.tcp.ByteMessage)
      ByteMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ByteMessage.newBuilder() to construct.
    private ByteMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ByteMessage() {
      meg_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ByteMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {

              meg_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_ByteMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_ByteMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HandshakeModel.ByteMessage.class, HandshakeModel.ByteMessage.Builder.class);
    }

    public static final int MEG_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString meg_;
    /**
     * <code>bytes meg = 1;</code>
     */
    public com.google.protobuf.ByteString getMeg() {
      return meg_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!meg_.isEmpty()) {
        output.writeBytes(1, meg_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!meg_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, meg_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof HandshakeModel.ByteMessage)) {
        return super.equals(obj);
      }
      HandshakeModel.ByteMessage other = (HandshakeModel.ByteMessage) obj;

      if (!getMeg()
          .equals(other.getMeg())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MEG_FIELD_NUMBER;
      hash = (53 * hash) + getMeg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HandshakeModel.ByteMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.ByteMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.ByteMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.ByteMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.ByteMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.ByteMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.ByteMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HandshakeModel.ByteMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HandshakeModel.ByteMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HandshakeModel.ByteMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HandshakeModel.ByteMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HandshakeModel.ByteMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HandshakeModel.ByteMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.ethereum.protobuf.tcp.ByteMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.ethereum.protobuf.tcp.ByteMessage)
        HandshakeModel.ByteMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_ByteMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_ByteMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HandshakeModel.ByteMessage.class, HandshakeModel.ByteMessage.Builder.class);
      }

      // Construct using HandshakeModel.ByteMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        meg_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_ByteMessage_descriptor;
      }

      @java.lang.Override
      public HandshakeModel.ByteMessage getDefaultInstanceForType() {
        return HandshakeModel.ByteMessage.getDefaultInstance();
      }

      @java.lang.Override
      public HandshakeModel.ByteMessage build() {
        HandshakeModel.ByteMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HandshakeModel.ByteMessage buildPartial() {
        HandshakeModel.ByteMessage result = new HandshakeModel.ByteMessage(this);
        result.meg_ = meg_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HandshakeModel.ByteMessage) {
          return mergeFrom((HandshakeModel.ByteMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HandshakeModel.ByteMessage other) {
        if (other == HandshakeModel.ByteMessage.getDefaultInstance()) return this;
        if (other.getMeg() != com.google.protobuf.ByteString.EMPTY) {
          setMeg(other.getMeg());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HandshakeModel.ByteMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HandshakeModel.ByteMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString meg_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes meg = 1;</code>
       */
      public com.google.protobuf.ByteString getMeg() {
        return meg_;
      }
      /**
       * <code>bytes meg = 1;</code>
       */
      public Builder setMeg(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }

        meg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes meg = 1;</code>
       */
      public Builder clearMeg() {

        meg_ = getDefaultInstance().getMeg();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.ethereum.protobuf.tcp.ByteMessage)
    }

    // @@protoc_insertion_point(class_scope:org.ethereum.protobuf.tcp.ByteMessage)
    private static final HandshakeModel.ByteMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HandshakeModel.ByteMessage();
    }

    public static HandshakeModel.ByteMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ByteMessage>
        PARSER = new com.google.protobuf.AbstractParser<ByteMessage>() {
      @java.lang.Override
      public ByteMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ByteMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ByteMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ByteMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HandshakeModel.ByteMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HelloMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.ethereum.protobuf.tcp.HelloMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 p2pVersion = 1;</code>
     */
    long getP2PVersion();

    /**
     * <code>string clientId = 2;</code>
     */
    java.lang.String getClientId();
    /**
     * <code>string clientId = 2;</code>
     */
    com.google.protobuf.ByteString
        getClientIdBytes();

    /**
     * <code>uint32 type = 3;</code>
     */
    int getType();

    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    java.util.List<HandshakeModel.HelloMessage.Capability>
        getCapabilityList();
    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    HandshakeModel.HelloMessage.Capability getCapability(int index);
    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    int getCapabilityCount();
    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    java.util.List<? extends HandshakeModel.HelloMessage.CapabilityOrBuilder>
        getCapabilityOrBuilderList();
    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    HandshakeModel.HelloMessage.CapabilityOrBuilder getCapabilityOrBuilder(
        int index);

    /**
     * <code>uint64 listenPort = 5;</code>
     */
    long getListenPort();

    /**
     * <code>string peerId = 6;</code>
     */
    java.lang.String getPeerId();
    /**
     * <code>string peerId = 6;</code>
     */
    com.google.protobuf.ByteString
        getPeerIdBytes();
  }
  /**
   * Protobuf type {@code org.ethereum.protobuf.tcp.HelloMessage}
   */
  public  static final class HelloMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.ethereum.protobuf.tcp.HelloMessage)
      HelloMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HelloMessage.newBuilder() to construct.
    private HelloMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HelloMessage() {
      clientId_ = "";
      capability_ = java.util.Collections.emptyList();
      peerId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HelloMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              p2PVersion_ = input.readUInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              clientId_ = s;
              break;
            }
            case 24: {

              type_ = input.readUInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                capability_ = new java.util.ArrayList<HandshakeModel.HelloMessage.Capability>();
                mutable_bitField0_ |= 0x00000008;
              }
              capability_.add(
                  input.readMessage(HandshakeModel.HelloMessage.Capability.parser(), extensionRegistry));
              break;
            }
            case 40: {

              listenPort_ = input.readUInt64();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              peerId_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          capability_ = java.util.Collections.unmodifiableList(capability_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HandshakeModel.HelloMessage.class, HandshakeModel.HelloMessage.Builder.class);
    }

    public interface CapabilityOrBuilder extends
        // @@protoc_insertion_point(interface_extends:org.ethereum.protobuf.tcp.HelloMessage.Capability)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>string name = 1;</code>
       */
      java.lang.String getName();
      /**
       * <code>string name = 1;</code>
       */
      com.google.protobuf.ByteString
          getNameBytes();

      /**
       * <code>uint64 version = 2;</code>
       */
      long getVersion();
    }
    /**
     * Protobuf type {@code org.ethereum.protobuf.tcp.HelloMessage.Capability}
     */
    public  static final class Capability extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:org.ethereum.protobuf.tcp.HelloMessage.Capability)
        CapabilityOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use Capability.newBuilder() to construct.
      private Capability(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Capability() {
        name_ = "";
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Capability(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                java.lang.String s = input.readStringRequireUtf8();

                name_ = s;
                break;
              }
              case 16: {

                version_ = input.readUInt64();
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HandshakeModel.HelloMessage.Capability.class, HandshakeModel.HelloMessage.Capability.Builder.class);
      }

      public static final int NAME_FIELD_NUMBER = 1;
      private volatile java.lang.Object name_;
      /**
       * <code>string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int VERSION_FIELD_NUMBER = 2;
      private long version_;
      /**
       * <code>uint64 version = 2;</code>
       */
      public long getVersion() {
        return version_;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (!getNameBytes().isEmpty()) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
        }
        if (version_ != 0L) {
          output.writeUInt64(2, version_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getNameBytes().isEmpty()) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
        }
        if (version_ != 0L) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt64Size(2, version_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof HandshakeModel.HelloMessage.Capability)) {
          return super.equals(obj);
        }
        HandshakeModel.HelloMessage.Capability other = (HandshakeModel.HelloMessage.Capability) obj;

        if (!getName()
            .equals(other.getName())) return false;
        if (getVersion()
            != other.getVersion()) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
        hash = (37 * hash) + VERSION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getVersion());
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static HandshakeModel.HelloMessage.Capability parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static HandshakeModel.HelloMessage.Capability parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static HandshakeModel.HelloMessage.Capability parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static HandshakeModel.HelloMessage.Capability parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static HandshakeModel.HelloMessage.Capability parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static HandshakeModel.HelloMessage.Capability parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static HandshakeModel.HelloMessage.Capability parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static HandshakeModel.HelloMessage.Capability parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static HandshakeModel.HelloMessage.Capability parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static HandshakeModel.HelloMessage.Capability parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static HandshakeModel.HelloMessage.Capability parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static HandshakeModel.HelloMessage.Capability parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(HandshakeModel.HelloMessage.Capability prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code org.ethereum.protobuf.tcp.HelloMessage.Capability}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:org.ethereum.protobuf.tcp.HelloMessage.Capability)
          HandshakeModel.HelloMessage.CapabilityOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  HandshakeModel.HelloMessage.Capability.class, HandshakeModel.HelloMessage.Capability.Builder.class);
        }

        // Construct using HandshakeModel.HelloMessage.Capability.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          name_ = "";

          version_ = 0L;

          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_descriptor;
        }

        @java.lang.Override
        public HandshakeModel.HelloMessage.Capability getDefaultInstanceForType() {
          return HandshakeModel.HelloMessage.Capability.getDefaultInstance();
        }

        @java.lang.Override
        public HandshakeModel.HelloMessage.Capability build() {
          HandshakeModel.HelloMessage.Capability result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public HandshakeModel.HelloMessage.Capability buildPartial() {
          HandshakeModel.HelloMessage.Capability result = new HandshakeModel.HelloMessage.Capability(this);
          result.name_ = name_;
          result.version_ = version_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof HandshakeModel.HelloMessage.Capability) {
            return mergeFrom((HandshakeModel.HelloMessage.Capability)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(HandshakeModel.HelloMessage.Capability other) {
          if (other == HandshakeModel.HelloMessage.Capability.getDefaultInstance()) return this;
          if (!other.getName().isEmpty()) {
            name_ = other.name_;
            onChanged();
          }
          if (other.getVersion() != 0L) {
            setVersion(other.getVersion());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          HandshakeModel.HelloMessage.Capability parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (HandshakeModel.HelloMessage.Capability) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private java.lang.Object name_ = "";
        /**
         * <code>string name = 1;</code>
         */
        public java.lang.String getName() {
          java.lang.Object ref = name_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            name_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>string name = 1;</code>
         */
        public com.google.protobuf.ByteString
            getNameBytes() {
          java.lang.Object ref = name_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            name_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>string name = 1;</code>
         */
        public Builder setName(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }

          name_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>string name = 1;</code>
         */
        public Builder clearName() {

          name_ = getDefaultInstance().getName();
          onChanged();
          return this;
        }
        /**
         * <code>string name = 1;</code>
         */
        public Builder setNameBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

          name_ = value;
          onChanged();
          return this;
        }

        private long version_ ;
        /**
         * <code>uint64 version = 2;</code>
         */
        public long getVersion() {
          return version_;
        }
        /**
         * <code>uint64 version = 2;</code>
         */
        public Builder setVersion(long value) {

          version_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>uint64 version = 2;</code>
         */
        public Builder clearVersion() {

          version_ = 0L;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:org.ethereum.protobuf.tcp.HelloMessage.Capability)
      }

      // @@protoc_insertion_point(class_scope:org.ethereum.protobuf.tcp.HelloMessage.Capability)
      private static final HandshakeModel.HelloMessage.Capability DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new HandshakeModel.HelloMessage.Capability();
      }

      public static HandshakeModel.HelloMessage.Capability getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<Capability>
          PARSER = new com.google.protobuf.AbstractParser<Capability>() {
        @java.lang.Override
        public Capability parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Capability(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<Capability> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<Capability> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public HandshakeModel.HelloMessage.Capability getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int bitField0_;
    public static final int P2PVERSION_FIELD_NUMBER = 1;
    private long p2PVersion_;
    /**
     * <code>uint64 p2pVersion = 1;</code>
     */
    public long getP2PVersion() {
      return p2PVersion_;
    }

    public static final int CLIENTID_FIELD_NUMBER = 2;
    private volatile java.lang.Object clientId_;
    /**
     * <code>string clientId = 2;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      }
    }
    /**
     * <code>string clientId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>uint32 type = 3;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int CAPABILITY_FIELD_NUMBER = 4;
    private java.util.List<HandshakeModel.HelloMessage.Capability> capability_;
    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    public java.util.List<HandshakeModel.HelloMessage.Capability> getCapabilityList() {
      return capability_;
    }
    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    public java.util.List<? extends HandshakeModel.HelloMessage.CapabilityOrBuilder>
        getCapabilityOrBuilderList() {
      return capability_;
    }
    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    public int getCapabilityCount() {
      return capability_.size();
    }
    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    public HandshakeModel.HelloMessage.Capability getCapability(int index) {
      return capability_.get(index);
    }
    /**
     * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
     */
    public HandshakeModel.HelloMessage.CapabilityOrBuilder getCapabilityOrBuilder(
        int index) {
      return capability_.get(index);
    }

    public static final int LISTENPORT_FIELD_NUMBER = 5;
    private long listenPort_;
    /**
     * <code>uint64 listenPort = 5;</code>
     */
    public long getListenPort() {
      return listenPort_;
    }

    public static final int PEERID_FIELD_NUMBER = 6;
    private volatile java.lang.Object peerId_;
    /**
     * <code>string peerId = 6;</code>
     */
    public java.lang.String getPeerId() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        peerId_ = s;
        return s;
      }
    }
    /**
     * <code>string peerId = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPeerIdBytes() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        peerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (p2PVersion_ != 0L) {
        output.writeUInt64(1, p2PVersion_);
      }
      if (!getClientIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientId_);
      }
      if (type_ != 0) {
        output.writeUInt32(3, type_);
      }
      for (int i = 0; i < capability_.size(); i++) {
        output.writeMessage(4, capability_.get(i));
      }
      if (listenPort_ != 0L) {
        output.writeUInt64(5, listenPort_);
      }
      if (!getPeerIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, peerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (p2PVersion_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, p2PVersion_);
      }
      if (!getClientIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientId_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, type_);
      }
      for (int i = 0; i < capability_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, capability_.get(i));
      }
      if (listenPort_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, listenPort_);
      }
      if (!getPeerIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, peerId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof HandshakeModel.HelloMessage)) {
        return super.equals(obj);
      }
      HandshakeModel.HelloMessage other = (HandshakeModel.HelloMessage) obj;

      if (getP2PVersion()
          != other.getP2PVersion()) return false;
      if (!getClientId()
          .equals(other.getClientId())) return false;
      if (getType()
          != other.getType()) return false;
      if (!getCapabilityList()
          .equals(other.getCapabilityList())) return false;
      if (getListenPort()
          != other.getListenPort()) return false;
      if (!getPeerId()
          .equals(other.getPeerId())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + P2PVERSION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getP2PVersion());
      hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
      hash = (53 * hash) + getClientId().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      if (getCapabilityCount() > 0) {
        hash = (37 * hash) + CAPABILITY_FIELD_NUMBER;
        hash = (53 * hash) + getCapabilityList().hashCode();
      }
      hash = (37 * hash) + LISTENPORT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getListenPort());
      hash = (37 * hash) + PEERID_FIELD_NUMBER;
      hash = (53 * hash) + getPeerId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HandshakeModel.HelloMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.HelloMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.HelloMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.HelloMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.HelloMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.HelloMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.HelloMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HandshakeModel.HelloMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HandshakeModel.HelloMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HandshakeModel.HelloMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HandshakeModel.HelloMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HandshakeModel.HelloMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HandshakeModel.HelloMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.ethereum.protobuf.tcp.HelloMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.ethereum.protobuf.tcp.HelloMessage)
        HandshakeModel.HelloMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HandshakeModel.HelloMessage.class, HandshakeModel.HelloMessage.Builder.class);
      }

      // Construct using HandshakeModel.HelloMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCapabilityFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        p2PVersion_ = 0L;

        clientId_ = "";

        type_ = 0;

        if (capabilityBuilder_ == null) {
          capability_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          capabilityBuilder_.clear();
        }
        listenPort_ = 0L;

        peerId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HelloMessage_descriptor;
      }

      @java.lang.Override
      public HandshakeModel.HelloMessage getDefaultInstanceForType() {
        return HandshakeModel.HelloMessage.getDefaultInstance();
      }

      @java.lang.Override
      public HandshakeModel.HelloMessage build() {
        HandshakeModel.HelloMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HandshakeModel.HelloMessage buildPartial() {
        HandshakeModel.HelloMessage result = new HandshakeModel.HelloMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.p2PVersion_ = p2PVersion_;
        result.clientId_ = clientId_;
        result.type_ = type_;
        if (capabilityBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0)) {
            capability_ = java.util.Collections.unmodifiableList(capability_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.capability_ = capability_;
        } else {
          result.capability_ = capabilityBuilder_.build();
        }
        result.listenPort_ = listenPort_;
        result.peerId_ = peerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HandshakeModel.HelloMessage) {
          return mergeFrom((HandshakeModel.HelloMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HandshakeModel.HelloMessage other) {
        if (other == HandshakeModel.HelloMessage.getDefaultInstance()) return this;
        if (other.getP2PVersion() != 0L) {
          setP2PVersion(other.getP2PVersion());
        }
        if (!other.getClientId().isEmpty()) {
          clientId_ = other.clientId_;
          onChanged();
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (capabilityBuilder_ == null) {
          if (!other.capability_.isEmpty()) {
            if (capability_.isEmpty()) {
              capability_ = other.capability_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureCapabilityIsMutable();
              capability_.addAll(other.capability_);
            }
            onChanged();
          }
        } else {
          if (!other.capability_.isEmpty()) {
            if (capabilityBuilder_.isEmpty()) {
              capabilityBuilder_.dispose();
              capabilityBuilder_ = null;
              capability_ = other.capability_;
              bitField0_ = (bitField0_ & ~0x00000008);
              capabilityBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCapabilityFieldBuilder() : null;
            } else {
              capabilityBuilder_.addAllMessages(other.capability_);
            }
          }
        }
        if (other.getListenPort() != 0L) {
          setListenPort(other.getListenPort());
        }
        if (!other.getPeerId().isEmpty()) {
          peerId_ = other.peerId_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HandshakeModel.HelloMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HandshakeModel.HelloMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long p2PVersion_ ;
      /**
       * <code>uint64 p2pVersion = 1;</code>
       */
      public long getP2PVersion() {
        return p2PVersion_;
      }
      /**
       * <code>uint64 p2pVersion = 1;</code>
       */
      public Builder setP2PVersion(long value) {

        p2PVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 p2pVersion = 1;</code>
       */
      public Builder clearP2PVersion() {

        p2PVersion_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object clientId_ = "";
      /**
       * <code>string clientId = 2;</code>
       */
      public java.lang.String getClientId() {
        java.lang.Object ref = clientId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clientId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string clientId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getClientIdBytes() {
        java.lang.Object ref = clientId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string clientId = 2;</code>
       */
      public Builder setClientId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string clientId = 2;</code>
       */
      public Builder clearClientId() {

        clientId_ = getDefaultInstance().getClientId();
        onChanged();
        return this;
      }
      /**
       * <code>string clientId = 2;</code>
       */
      public Builder setClientIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        clientId_ = value;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>uint32 type = 3;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>uint32 type = 3;</code>
       */
      public Builder setType(int value) {

        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 type = 3;</code>
       */
      public Builder clearType() {

        type_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<HandshakeModel.HelloMessage.Capability> capability_ =
        java.util.Collections.emptyList();
      private void ensureCapabilityIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          capability_ = new java.util.ArrayList<HandshakeModel.HelloMessage.Capability>(capability_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          HandshakeModel.HelloMessage.Capability, HandshakeModel.HelloMessage.Capability.Builder, HandshakeModel.HelloMessage.CapabilityOrBuilder> capabilityBuilder_;

      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public java.util.List<HandshakeModel.HelloMessage.Capability> getCapabilityList() {
        if (capabilityBuilder_ == null) {
          return java.util.Collections.unmodifiableList(capability_);
        } else {
          return capabilityBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public int getCapabilityCount() {
        if (capabilityBuilder_ == null) {
          return capability_.size();
        } else {
          return capabilityBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public HandshakeModel.HelloMessage.Capability getCapability(int index) {
        if (capabilityBuilder_ == null) {
          return capability_.get(index);
        } else {
          return capabilityBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public Builder setCapability(
          int index, HandshakeModel.HelloMessage.Capability value) {
        if (capabilityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCapabilityIsMutable();
          capability_.set(index, value);
          onChanged();
        } else {
          capabilityBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public Builder setCapability(
          int index, HandshakeModel.HelloMessage.Capability.Builder builderForValue) {
        if (capabilityBuilder_ == null) {
          ensureCapabilityIsMutable();
          capability_.set(index, builderForValue.build());
          onChanged();
        } else {
          capabilityBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public Builder addCapability(HandshakeModel.HelloMessage.Capability value) {
        if (capabilityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCapabilityIsMutable();
          capability_.add(value);
          onChanged();
        } else {
          capabilityBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public Builder addCapability(
          int index, HandshakeModel.HelloMessage.Capability value) {
        if (capabilityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCapabilityIsMutable();
          capability_.add(index, value);
          onChanged();
        } else {
          capabilityBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public Builder addCapability(
          HandshakeModel.HelloMessage.Capability.Builder builderForValue) {
        if (capabilityBuilder_ == null) {
          ensureCapabilityIsMutable();
          capability_.add(builderForValue.build());
          onChanged();
        } else {
          capabilityBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public Builder addCapability(
          int index, HandshakeModel.HelloMessage.Capability.Builder builderForValue) {
        if (capabilityBuilder_ == null) {
          ensureCapabilityIsMutable();
          capability_.add(index, builderForValue.build());
          onChanged();
        } else {
          capabilityBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public Builder addAllCapability(
          java.lang.Iterable<? extends HandshakeModel.HelloMessage.Capability> values) {
        if (capabilityBuilder_ == null) {
          ensureCapabilityIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, capability_);
          onChanged();
        } else {
          capabilityBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public Builder clearCapability() {
        if (capabilityBuilder_ == null) {
          capability_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          capabilityBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public Builder removeCapability(int index) {
        if (capabilityBuilder_ == null) {
          ensureCapabilityIsMutable();
          capability_.remove(index);
          onChanged();
        } else {
          capabilityBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public HandshakeModel.HelloMessage.Capability.Builder getCapabilityBuilder(
          int index) {
        return getCapabilityFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public HandshakeModel.HelloMessage.CapabilityOrBuilder getCapabilityOrBuilder(
          int index) {
        if (capabilityBuilder_ == null) {
          return capability_.get(index);  } else {
          return capabilityBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public java.util.List<? extends HandshakeModel.HelloMessage.CapabilityOrBuilder>
           getCapabilityOrBuilderList() {
        if (capabilityBuilder_ != null) {
          return capabilityBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(capability_);
        }
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public HandshakeModel.HelloMessage.Capability.Builder addCapabilityBuilder() {
        return getCapabilityFieldBuilder().addBuilder(
            HandshakeModel.HelloMessage.Capability.getDefaultInstance());
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public HandshakeModel.HelloMessage.Capability.Builder addCapabilityBuilder(
          int index) {
        return getCapabilityFieldBuilder().addBuilder(
            index, HandshakeModel.HelloMessage.Capability.getDefaultInstance());
      }
      /**
       * <code>repeated .org.ethereum.protobuf.tcp.HelloMessage.Capability capability = 4;</code>
       */
      public java.util.List<HandshakeModel.HelloMessage.Capability.Builder>
           getCapabilityBuilderList() {
        return getCapabilityFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          HandshakeModel.HelloMessage.Capability, HandshakeModel.HelloMessage.Capability.Builder, HandshakeModel.HelloMessage.CapabilityOrBuilder>
          getCapabilityFieldBuilder() {
        if (capabilityBuilder_ == null) {
          capabilityBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              HandshakeModel.HelloMessage.Capability, HandshakeModel.HelloMessage.Capability.Builder, HandshakeModel.HelloMessage.CapabilityOrBuilder>(
                  capability_,
                  ((bitField0_ & 0x00000008) != 0),
                  getParentForChildren(),
                  isClean());
          capability_ = null;
        }
        return capabilityBuilder_;
      }

      private long listenPort_ ;
      /**
       * <code>uint64 listenPort = 5;</code>
       */
      public long getListenPort() {
        return listenPort_;
      }
      /**
       * <code>uint64 listenPort = 5;</code>
       */
      public Builder setListenPort(long value) {

        listenPort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 listenPort = 5;</code>
       */
      public Builder clearListenPort() {

        listenPort_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object peerId_ = "";
      /**
       * <code>string peerId = 6;</code>
       */
      public java.lang.String getPeerId() {
        java.lang.Object ref = peerId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          peerId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string peerId = 6;</code>
       */
      public com.google.protobuf.ByteString
          getPeerIdBytes() {
        java.lang.Object ref = peerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          peerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string peerId = 6;</code>
       */
      public Builder setPeerId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        peerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string peerId = 6;</code>
       */
      public Builder clearPeerId() {

        peerId_ = getDefaultInstance().getPeerId();
        onChanged();
        return this;
      }
      /**
       * <code>string peerId = 6;</code>
       */
      public Builder setPeerIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        peerId_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.ethereum.protobuf.tcp.HelloMessage)
    }

    // @@protoc_insertion_point(class_scope:org.ethereum.protobuf.tcp.HelloMessage)
    private static final HandshakeModel.HelloMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HandshakeModel.HelloMessage();
    }

    public static HandshakeModel.HelloMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloMessage>
        PARSER = new com.google.protobuf.AbstractParser<HelloMessage>() {
      @java.lang.Override
      public HelloMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HelloMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HelloMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HandshakeModel.HelloMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DisconnectMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.ethereum.protobuf.tcp.DisconnectMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string reasonCode = 1;</code>
     */
    java.lang.String getReasonCode();
    /**
     * <code>string reasonCode = 1;</code>
     */
    com.google.protobuf.ByteString
        getReasonCodeBytes();
  }
  /**
   * Protobuf type {@code org.ethereum.protobuf.tcp.DisconnectMessage}
   */
  public  static final class DisconnectMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.ethereum.protobuf.tcp.DisconnectMessage)
      DisconnectMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DisconnectMessage.newBuilder() to construct.
    private DisconnectMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DisconnectMessage() {
      reasonCode_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DisconnectMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              reasonCode_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HandshakeModel.DisconnectMessage.class, HandshakeModel.DisconnectMessage.Builder.class);
    }

    public static final int REASONCODE_FIELD_NUMBER = 1;
    private volatile java.lang.Object reasonCode_;
    /**
     * <code>string reasonCode = 1;</code>
     */
    public java.lang.String getReasonCode() {
      java.lang.Object ref = reasonCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reasonCode_ = s;
        return s;
      }
    }
    /**
     * <code>string reasonCode = 1;</code>
     */
    public com.google.protobuf.ByteString
        getReasonCodeBytes() {
      java.lang.Object ref = reasonCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reasonCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getReasonCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reasonCode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getReasonCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reasonCode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof HandshakeModel.DisconnectMessage)) {
        return super.equals(obj);
      }
      HandshakeModel.DisconnectMessage other = (HandshakeModel.DisconnectMessage) obj;

      if (!getReasonCode()
          .equals(other.getReasonCode())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REASONCODE_FIELD_NUMBER;
      hash = (53 * hash) + getReasonCode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HandshakeModel.DisconnectMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.DisconnectMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.DisconnectMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.DisconnectMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.DisconnectMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.DisconnectMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.DisconnectMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HandshakeModel.DisconnectMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HandshakeModel.DisconnectMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HandshakeModel.DisconnectMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HandshakeModel.DisconnectMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HandshakeModel.DisconnectMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HandshakeModel.DisconnectMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.ethereum.protobuf.tcp.DisconnectMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.ethereum.protobuf.tcp.DisconnectMessage)
        HandshakeModel.DisconnectMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HandshakeModel.DisconnectMessage.class, HandshakeModel.DisconnectMessage.Builder.class);
      }

      // Construct using HandshakeModel.DisconnectMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reasonCode_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_descriptor;
      }

      @java.lang.Override
      public HandshakeModel.DisconnectMessage getDefaultInstanceForType() {
        return HandshakeModel.DisconnectMessage.getDefaultInstance();
      }

      @java.lang.Override
      public HandshakeModel.DisconnectMessage build() {
        HandshakeModel.DisconnectMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HandshakeModel.DisconnectMessage buildPartial() {
        HandshakeModel.DisconnectMessage result = new HandshakeModel.DisconnectMessage(this);
        result.reasonCode_ = reasonCode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HandshakeModel.DisconnectMessage) {
          return mergeFrom((HandshakeModel.DisconnectMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HandshakeModel.DisconnectMessage other) {
        if (other == HandshakeModel.DisconnectMessage.getDefaultInstance()) return this;
        if (!other.getReasonCode().isEmpty()) {
          reasonCode_ = other.reasonCode_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HandshakeModel.DisconnectMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HandshakeModel.DisconnectMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object reasonCode_ = "";
      /**
       * <code>string reasonCode = 1;</code>
       */
      public java.lang.String getReasonCode() {
        java.lang.Object ref = reasonCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          reasonCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string reasonCode = 1;</code>
       */
      public com.google.protobuf.ByteString
          getReasonCodeBytes() {
        java.lang.Object ref = reasonCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reasonCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string reasonCode = 1;</code>
       */
      public Builder setReasonCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        reasonCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string reasonCode = 1;</code>
       */
      public Builder clearReasonCode() {

        reasonCode_ = getDefaultInstance().getReasonCode();
        onChanged();
        return this;
      }
      /**
       * <code>string reasonCode = 1;</code>
       */
      public Builder setReasonCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        reasonCode_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.ethereum.protobuf.tcp.DisconnectMessage)
    }

    // @@protoc_insertion_point(class_scope:org.ethereum.protobuf.tcp.DisconnectMessage)
    private static final HandshakeModel.DisconnectMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HandshakeModel.DisconnectMessage();
    }

    public static HandshakeModel.DisconnectMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DisconnectMessage>
        PARSER = new com.google.protobuf.AbstractParser<DisconnectMessage>() {
      @java.lang.Override
      public DisconnectMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DisconnectMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DisconnectMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DisconnectMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HandshakeModel.DisconnectMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HandshakeMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.ethereum.protobuf.tcp.HandshakeMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.org.ethereum.protobuf.tcp.HandshakeMessage.DataType type = 1;</code>
     */
    int getTypeValue();
    /**
     * <code>.org.ethereum.protobuf.tcp.HandshakeMessage.DataType type = 1;</code>
     */
    HandshakeModel.HandshakeMessage.DataType getType();

    /**
     * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
     */
    boolean hasByteMessage();
    /**
     * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
     */
    HandshakeModel.ByteMessage getByteMessage();
    /**
     * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
     */
    HandshakeModel.ByteMessageOrBuilder getByteMessageOrBuilder();

    /**
     * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
     */
    boolean hasHelloMessage();
    /**
     * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
     */
    HandshakeModel.HelloMessage getHelloMessage();
    /**
     * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
     */
    HandshakeModel.HelloMessageOrBuilder getHelloMessageOrBuilder();

    /**
     * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
     */
    boolean hasDisconnectMessage();
    /**
     * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
     */
    HandshakeModel.DisconnectMessage getDisconnectMessage();
    /**
     * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
     */
    HandshakeModel.DisconnectMessageOrBuilder getDisconnectMessageOrBuilder();

    public HandshakeModel.HandshakeMessage.DataMsgCase getDataMsgCase();
  }
  /**
   * Protobuf type {@code org.ethereum.protobuf.tcp.HandshakeMessage}
   */
  public  static final class HandshakeMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.ethereum.protobuf.tcp.HandshakeMessage)
      HandshakeMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HandshakeMessage.newBuilder() to construct.
    private HandshakeMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HandshakeMessage() {
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HandshakeMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 26: {
              HandshakeModel.ByteMessage.Builder subBuilder = null;
              if (dataMsgCase_ == 3) {
                subBuilder = ((HandshakeModel.ByteMessage) dataMsg_).toBuilder();
              }
              dataMsg_ =
                  input.readMessage(HandshakeModel.ByteMessage.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((HandshakeModel.ByteMessage) dataMsg_);
                dataMsg_ = subBuilder.buildPartial();
              }
              dataMsgCase_ = 3;
              break;
            }
            case 34: {
              HandshakeModel.HelloMessage.Builder subBuilder = null;
              if (dataMsgCase_ == 4) {
                subBuilder = ((HandshakeModel.HelloMessage) dataMsg_).toBuilder();
              }
              dataMsg_ =
                  input.readMessage(HandshakeModel.HelloMessage.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((HandshakeModel.HelloMessage) dataMsg_);
                dataMsg_ = subBuilder.buildPartial();
              }
              dataMsgCase_ = 4;
              break;
            }
            case 42: {
              HandshakeModel.DisconnectMessage.Builder subBuilder = null;
              if (dataMsgCase_ == 5) {
                subBuilder = ((HandshakeModel.DisconnectMessage) dataMsg_).toBuilder();
              }
              dataMsg_ =
                  input.readMessage(HandshakeModel.DisconnectMessage.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((HandshakeModel.DisconnectMessage) dataMsg_);
                dataMsg_ = subBuilder.buildPartial();
              }
              dataMsgCase_ = 5;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HandshakeModel.HandshakeMessage.class, HandshakeModel.HandshakeMessage.Builder.class);
    }

    /**
     * Protobuf enum {@code org.ethereum.protobuf.tcp.HandshakeMessage.DataType}
     */
    public enum DataType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ByteMessage = 0;</code>
       */
      ByteMessage(0),
      /**
       * <code>HelloMessage = 1;</code>
       */
      HelloMessage(1),
      /**
       * <code>DisconnectMessage = 2;</code>
       */
      DisconnectMessage(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>ByteMessage = 0;</code>
       */
      public static final int ByteMessage_VALUE = 0;
      /**
       * <code>HelloMessage = 1;</code>
       */
      public static final int HelloMessage_VALUE = 1;
      /**
       * <code>DisconnectMessage = 2;</code>
       */
      public static final int DisconnectMessage_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DataType valueOf(int value) {
        return forNumber(value);
      }

      public static DataType forNumber(int value) {
        switch (value) {
          case 0: return ByteMessage;
          case 1: return HelloMessage;
          case 2: return DisconnectMessage;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DataType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DataType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
              public DataType findValueByNumber(int number) {
                return DataType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return HandshakeModel.HandshakeMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final DataType[] VALUES = values();

      public static DataType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private DataType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:org.ethereum.protobuf.tcp.HandshakeMessage.DataType)
    }

    private int dataMsgCase_ = 0;
    private java.lang.Object dataMsg_;
    public enum DataMsgCase
        implements com.google.protobuf.Internal.EnumLite {
      BYTEMESSAGE(3),
      HELLOMESSAGE(4),
      DISCONNECTMESSAGE(5),
      DATAMSG_NOT_SET(0);
      private final int value;
      private DataMsgCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DataMsgCase valueOf(int value) {
        return forNumber(value);
      }

      public static DataMsgCase forNumber(int value) {
        switch (value) {
          case 3: return BYTEMESSAGE;
          case 4: return HELLOMESSAGE;
          case 5: return DISCONNECTMESSAGE;
          case 0: return DATAMSG_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DataMsgCase
    getDataMsgCase() {
      return DataMsgCase.forNumber(
          dataMsgCase_);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.org.ethereum.protobuf.tcp.HandshakeMessage.DataType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.org.ethereum.protobuf.tcp.HandshakeMessage.DataType type = 1;</code>
     */
    public HandshakeModel.HandshakeMessage.DataType getType() {
      @SuppressWarnings("deprecation")
      HandshakeModel.HandshakeMessage.DataType result = HandshakeModel.HandshakeMessage.DataType.valueOf(type_);
      return result == null ? HandshakeModel.HandshakeMessage.DataType.UNRECOGNIZED : result;
    }

    public static final int BYTEMESSAGE_FIELD_NUMBER = 3;
    /**
     * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
     */
    public boolean hasByteMessage() {
      return dataMsgCase_ == 3;
    }
    /**
     * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
     */
    public HandshakeModel.ByteMessage getByteMessage() {
      if (dataMsgCase_ == 3) {
         return (HandshakeModel.ByteMessage) dataMsg_;
      }
      return HandshakeModel.ByteMessage.getDefaultInstance();
    }
    /**
     * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
     */
    public HandshakeModel.ByteMessageOrBuilder getByteMessageOrBuilder() {
      if (dataMsgCase_ == 3) {
         return (HandshakeModel.ByteMessage) dataMsg_;
      }
      return HandshakeModel.ByteMessage.getDefaultInstance();
    }

    public static final int HELLOMESSAGE_FIELD_NUMBER = 4;
    /**
     * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
     */
    public boolean hasHelloMessage() {
      return dataMsgCase_ == 4;
    }
    /**
     * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
     */
    public HandshakeModel.HelloMessage getHelloMessage() {
      if (dataMsgCase_ == 4) {
         return (HandshakeModel.HelloMessage) dataMsg_;
      }
      return HandshakeModel.HelloMessage.getDefaultInstance();
    }
    /**
     * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
     */
    public HandshakeModel.HelloMessageOrBuilder getHelloMessageOrBuilder() {
      if (dataMsgCase_ == 4) {
         return (HandshakeModel.HelloMessage) dataMsg_;
      }
      return HandshakeModel.HelloMessage.getDefaultInstance();
    }

    public static final int DISCONNECTMESSAGE_FIELD_NUMBER = 5;
    /**
     * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
     */
    public boolean hasDisconnectMessage() {
      return dataMsgCase_ == 5;
    }
    /**
     * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
     */
    public HandshakeModel.DisconnectMessage getDisconnectMessage() {
      if (dataMsgCase_ == 5) {
         return (HandshakeModel.DisconnectMessage) dataMsg_;
      }
      return HandshakeModel.DisconnectMessage.getDefaultInstance();
    }
    /**
     * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
     */
    public HandshakeModel.DisconnectMessageOrBuilder getDisconnectMessageOrBuilder() {
      if (dataMsgCase_ == 5) {
         return (HandshakeModel.DisconnectMessage) dataMsg_;
      }
      return HandshakeModel.DisconnectMessage.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != HandshakeModel.HandshakeMessage.DataType.ByteMessage.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (dataMsgCase_ == 3) {
        output.writeMessage(3, (HandshakeModel.ByteMessage) dataMsg_);
      }
      if (dataMsgCase_ == 4) {
        output.writeMessage(4, (HandshakeModel.HelloMessage) dataMsg_);
      }
      if (dataMsgCase_ == 5) {
        output.writeMessage(5, (HandshakeModel.DisconnectMessage) dataMsg_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != HandshakeModel.HandshakeMessage.DataType.ByteMessage.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (dataMsgCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (HandshakeModel.ByteMessage) dataMsg_);
      }
      if (dataMsgCase_ == 4) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, (HandshakeModel.HelloMessage) dataMsg_);
      }
      if (dataMsgCase_ == 5) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, (HandshakeModel.DisconnectMessage) dataMsg_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof HandshakeModel.HandshakeMessage)) {
        return super.equals(obj);
      }
      HandshakeModel.HandshakeMessage other = (HandshakeModel.HandshakeMessage) obj;

      if (type_ != other.type_) return false;
      if (!getDataMsgCase().equals(other.getDataMsgCase())) return false;
      switch (dataMsgCase_) {
        case 3:
          if (!getByteMessage()
              .equals(other.getByteMessage())) return false;
          break;
        case 4:
          if (!getHelloMessage()
              .equals(other.getHelloMessage())) return false;
          break;
        case 5:
          if (!getDisconnectMessage()
              .equals(other.getDisconnectMessage())) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      switch (dataMsgCase_) {
        case 3:
          hash = (37 * hash) + BYTEMESSAGE_FIELD_NUMBER;
          hash = (53 * hash) + getByteMessage().hashCode();
          break;
        case 4:
          hash = (37 * hash) + HELLOMESSAGE_FIELD_NUMBER;
          hash = (53 * hash) + getHelloMessage().hashCode();
          break;
        case 5:
          hash = (37 * hash) + DISCONNECTMESSAGE_FIELD_NUMBER;
          hash = (53 * hash) + getDisconnectMessage().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HandshakeModel.HandshakeMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.HandshakeMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.HandshakeMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.HandshakeMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.HandshakeMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HandshakeModel.HandshakeMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HandshakeModel.HandshakeMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HandshakeModel.HandshakeMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HandshakeModel.HandshakeMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HandshakeModel.HandshakeMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HandshakeModel.HandshakeMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HandshakeModel.HandshakeMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HandshakeModel.HandshakeMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.ethereum.protobuf.tcp.HandshakeMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.ethereum.protobuf.tcp.HandshakeMessage)
        HandshakeModel.HandshakeMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HandshakeModel.HandshakeMessage.class, HandshakeModel.HandshakeMessage.Builder.class);
      }

      // Construct using HandshakeModel.HandshakeMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        dataMsgCase_ = 0;
        dataMsg_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HandshakeModel.internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_descriptor;
      }

      @java.lang.Override
      public HandshakeModel.HandshakeMessage getDefaultInstanceForType() {
        return HandshakeModel.HandshakeMessage.getDefaultInstance();
      }

      @java.lang.Override
      public HandshakeModel.HandshakeMessage build() {
        HandshakeModel.HandshakeMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HandshakeModel.HandshakeMessage buildPartial() {
        HandshakeModel.HandshakeMessage result = new HandshakeModel.HandshakeMessage(this);
        result.type_ = type_;
        if (dataMsgCase_ == 3) {
          if (byteMessageBuilder_ == null) {
            result.dataMsg_ = dataMsg_;
          } else {
            result.dataMsg_ = byteMessageBuilder_.build();
          }
        }
        if (dataMsgCase_ == 4) {
          if (helloMessageBuilder_ == null) {
            result.dataMsg_ = dataMsg_;
          } else {
            result.dataMsg_ = helloMessageBuilder_.build();
          }
        }
        if (dataMsgCase_ == 5) {
          if (disconnectMessageBuilder_ == null) {
            result.dataMsg_ = dataMsg_;
          } else {
            result.dataMsg_ = disconnectMessageBuilder_.build();
          }
        }
        result.dataMsgCase_ = dataMsgCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HandshakeModel.HandshakeMessage) {
          return mergeFrom((HandshakeModel.HandshakeMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HandshakeModel.HandshakeMessage other) {
        if (other == HandshakeModel.HandshakeMessage.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        switch (other.getDataMsgCase()) {
          case BYTEMESSAGE: {
            mergeByteMessage(other.getByteMessage());
            break;
          }
          case HELLOMESSAGE: {
            mergeHelloMessage(other.getHelloMessage());
            break;
          }
          case DISCONNECTMESSAGE: {
            mergeDisconnectMessage(other.getDisconnectMessage());
            break;
          }
          case DATAMSG_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HandshakeModel.HandshakeMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HandshakeModel.HandshakeMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int dataMsgCase_ = 0;
      private java.lang.Object dataMsg_;
      public DataMsgCase
          getDataMsgCase() {
        return DataMsgCase.forNumber(
            dataMsgCase_);
      }

      public Builder clearDataMsg() {
        dataMsgCase_ = 0;
        dataMsg_ = null;
        onChanged();
        return this;
      }


      private int type_ = 0;
      /**
       * <code>.org.ethereum.protobuf.tcp.HandshakeMessage.DataType type = 1;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HandshakeMessage.DataType type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HandshakeMessage.DataType type = 1;</code>
       */
      public HandshakeModel.HandshakeMessage.DataType getType() {
        @SuppressWarnings("deprecation")
        HandshakeModel.HandshakeMessage.DataType result = HandshakeModel.HandshakeMessage.DataType.valueOf(type_);
        return result == null ? HandshakeModel.HandshakeMessage.DataType.UNRECOGNIZED : result;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HandshakeMessage.DataType type = 1;</code>
       */
      public Builder setType(HandshakeModel.HandshakeMessage.DataType value) {
        if (value == null) {
          throw new NullPointerException();
        }

        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HandshakeMessage.DataType type = 1;</code>
       */
      public Builder clearType() {

        type_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          HandshakeModel.ByteMessage, HandshakeModel.ByteMessage.Builder, HandshakeModel.ByteMessageOrBuilder> byteMessageBuilder_;
      /**
       * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
       */
      public boolean hasByteMessage() {
        return dataMsgCase_ == 3;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
       */
      public HandshakeModel.ByteMessage getByteMessage() {
        if (byteMessageBuilder_ == null) {
          if (dataMsgCase_ == 3) {
            return (HandshakeModel.ByteMessage) dataMsg_;
          }
          return HandshakeModel.ByteMessage.getDefaultInstance();
        } else {
          if (dataMsgCase_ == 3) {
            return byteMessageBuilder_.getMessage();
          }
          return HandshakeModel.ByteMessage.getDefaultInstance();
        }
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
       */
      public Builder setByteMessage(HandshakeModel.ByteMessage value) {
        if (byteMessageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataMsg_ = value;
          onChanged();
        } else {
          byteMessageBuilder_.setMessage(value);
        }
        dataMsgCase_ = 3;
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
       */
      public Builder setByteMessage(
          HandshakeModel.ByteMessage.Builder builderForValue) {
        if (byteMessageBuilder_ == null) {
          dataMsg_ = builderForValue.build();
          onChanged();
        } else {
          byteMessageBuilder_.setMessage(builderForValue.build());
        }
        dataMsgCase_ = 3;
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
       */
      public Builder mergeByteMessage(HandshakeModel.ByteMessage value) {
        if (byteMessageBuilder_ == null) {
          if (dataMsgCase_ == 3 &&
              dataMsg_ != HandshakeModel.ByteMessage.getDefaultInstance()) {
            dataMsg_ = HandshakeModel.ByteMessage.newBuilder((HandshakeModel.ByteMessage) dataMsg_)
                .mergeFrom(value).buildPartial();
          } else {
            dataMsg_ = value;
          }
          onChanged();
        } else {
          if (dataMsgCase_ == 3) {
            byteMessageBuilder_.mergeFrom(value);
          }
          byteMessageBuilder_.setMessage(value);
        }
        dataMsgCase_ = 3;
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
       */
      public Builder clearByteMessage() {
        if (byteMessageBuilder_ == null) {
          if (dataMsgCase_ == 3) {
            dataMsgCase_ = 0;
            dataMsg_ = null;
            onChanged();
          }
        } else {
          if (dataMsgCase_ == 3) {
            dataMsgCase_ = 0;
            dataMsg_ = null;
          }
          byteMessageBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
       */
      public HandshakeModel.ByteMessage.Builder getByteMessageBuilder() {
        return getByteMessageFieldBuilder().getBuilder();
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
       */
      public HandshakeModel.ByteMessageOrBuilder getByteMessageOrBuilder() {
        if ((dataMsgCase_ == 3) && (byteMessageBuilder_ != null)) {
          return byteMessageBuilder_.getMessageOrBuilder();
        } else {
          if (dataMsgCase_ == 3) {
            return (HandshakeModel.ByteMessage) dataMsg_;
          }
          return HandshakeModel.ByteMessage.getDefaultInstance();
        }
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.ByteMessage byteMessage = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          HandshakeModel.ByteMessage, HandshakeModel.ByteMessage.Builder, HandshakeModel.ByteMessageOrBuilder>
          getByteMessageFieldBuilder() {
        if (byteMessageBuilder_ == null) {
          if (!(dataMsgCase_ == 3)) {
            dataMsg_ = HandshakeModel.ByteMessage.getDefaultInstance();
          }
          byteMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              HandshakeModel.ByteMessage, HandshakeModel.ByteMessage.Builder, HandshakeModel.ByteMessageOrBuilder>(
                  (HandshakeModel.ByteMessage) dataMsg_,
                  getParentForChildren(),
                  isClean());
          dataMsg_ = null;
        }
        dataMsgCase_ = 3;
        onChanged();;
        return byteMessageBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          HandshakeModel.HelloMessage, HandshakeModel.HelloMessage.Builder, HandshakeModel.HelloMessageOrBuilder> helloMessageBuilder_;
      /**
       * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
       */
      public boolean hasHelloMessage() {
        return dataMsgCase_ == 4;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
       */
      public HandshakeModel.HelloMessage getHelloMessage() {
        if (helloMessageBuilder_ == null) {
          if (dataMsgCase_ == 4) {
            return (HandshakeModel.HelloMessage) dataMsg_;
          }
          return HandshakeModel.HelloMessage.getDefaultInstance();
        } else {
          if (dataMsgCase_ == 4) {
            return helloMessageBuilder_.getMessage();
          }
          return HandshakeModel.HelloMessage.getDefaultInstance();
        }
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
       */
      public Builder setHelloMessage(HandshakeModel.HelloMessage value) {
        if (helloMessageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataMsg_ = value;
          onChanged();
        } else {
          helloMessageBuilder_.setMessage(value);
        }
        dataMsgCase_ = 4;
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
       */
      public Builder setHelloMessage(
          HandshakeModel.HelloMessage.Builder builderForValue) {
        if (helloMessageBuilder_ == null) {
          dataMsg_ = builderForValue.build();
          onChanged();
        } else {
          helloMessageBuilder_.setMessage(builderForValue.build());
        }
        dataMsgCase_ = 4;
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
       */
      public Builder mergeHelloMessage(HandshakeModel.HelloMessage value) {
        if (helloMessageBuilder_ == null) {
          if (dataMsgCase_ == 4 &&
              dataMsg_ != HandshakeModel.HelloMessage.getDefaultInstance()) {
            dataMsg_ = HandshakeModel.HelloMessage.newBuilder((HandshakeModel.HelloMessage) dataMsg_)
                .mergeFrom(value).buildPartial();
          } else {
            dataMsg_ = value;
          }
          onChanged();
        } else {
          if (dataMsgCase_ == 4) {
            helloMessageBuilder_.mergeFrom(value);
          }
          helloMessageBuilder_.setMessage(value);
        }
        dataMsgCase_ = 4;
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
       */
      public Builder clearHelloMessage() {
        if (helloMessageBuilder_ == null) {
          if (dataMsgCase_ == 4) {
            dataMsgCase_ = 0;
            dataMsg_ = null;
            onChanged();
          }
        } else {
          if (dataMsgCase_ == 4) {
            dataMsgCase_ = 0;
            dataMsg_ = null;
          }
          helloMessageBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
       */
      public HandshakeModel.HelloMessage.Builder getHelloMessageBuilder() {
        return getHelloMessageFieldBuilder().getBuilder();
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
       */
      public HandshakeModel.HelloMessageOrBuilder getHelloMessageOrBuilder() {
        if ((dataMsgCase_ == 4) && (helloMessageBuilder_ != null)) {
          return helloMessageBuilder_.getMessageOrBuilder();
        } else {
          if (dataMsgCase_ == 4) {
            return (HandshakeModel.HelloMessage) dataMsg_;
          }
          return HandshakeModel.HelloMessage.getDefaultInstance();
        }
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.HelloMessage helloMessage = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          HandshakeModel.HelloMessage, HandshakeModel.HelloMessage.Builder, HandshakeModel.HelloMessageOrBuilder>
          getHelloMessageFieldBuilder() {
        if (helloMessageBuilder_ == null) {
          if (!(dataMsgCase_ == 4)) {
            dataMsg_ = HandshakeModel.HelloMessage.getDefaultInstance();
          }
          helloMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              HandshakeModel.HelloMessage, HandshakeModel.HelloMessage.Builder, HandshakeModel.HelloMessageOrBuilder>(
                  (HandshakeModel.HelloMessage) dataMsg_,
                  getParentForChildren(),
                  isClean());
          dataMsg_ = null;
        }
        dataMsgCase_ = 4;
        onChanged();;
        return helloMessageBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          HandshakeModel.DisconnectMessage, HandshakeModel.DisconnectMessage.Builder, HandshakeModel.DisconnectMessageOrBuilder> disconnectMessageBuilder_;
      /**
       * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
       */
      public boolean hasDisconnectMessage() {
        return dataMsgCase_ == 5;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
       */
      public HandshakeModel.DisconnectMessage getDisconnectMessage() {
        if (disconnectMessageBuilder_ == null) {
          if (dataMsgCase_ == 5) {
            return (HandshakeModel.DisconnectMessage) dataMsg_;
          }
          return HandshakeModel.DisconnectMessage.getDefaultInstance();
        } else {
          if (dataMsgCase_ == 5) {
            return disconnectMessageBuilder_.getMessage();
          }
          return HandshakeModel.DisconnectMessage.getDefaultInstance();
        }
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
       */
      public Builder setDisconnectMessage(HandshakeModel.DisconnectMessage value) {
        if (disconnectMessageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataMsg_ = value;
          onChanged();
        } else {
          disconnectMessageBuilder_.setMessage(value);
        }
        dataMsgCase_ = 5;
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
       */
      public Builder setDisconnectMessage(
          HandshakeModel.DisconnectMessage.Builder builderForValue) {
        if (disconnectMessageBuilder_ == null) {
          dataMsg_ = builderForValue.build();
          onChanged();
        } else {
          disconnectMessageBuilder_.setMessage(builderForValue.build());
        }
        dataMsgCase_ = 5;
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
       */
      public Builder mergeDisconnectMessage(HandshakeModel.DisconnectMessage value) {
        if (disconnectMessageBuilder_ == null) {
          if (dataMsgCase_ == 5 &&
              dataMsg_ != HandshakeModel.DisconnectMessage.getDefaultInstance()) {
            dataMsg_ = HandshakeModel.DisconnectMessage.newBuilder((HandshakeModel.DisconnectMessage) dataMsg_)
                .mergeFrom(value).buildPartial();
          } else {
            dataMsg_ = value;
          }
          onChanged();
        } else {
          if (dataMsgCase_ == 5) {
            disconnectMessageBuilder_.mergeFrom(value);
          }
          disconnectMessageBuilder_.setMessage(value);
        }
        dataMsgCase_ = 5;
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
       */
      public Builder clearDisconnectMessage() {
        if (disconnectMessageBuilder_ == null) {
          if (dataMsgCase_ == 5) {
            dataMsgCase_ = 0;
            dataMsg_ = null;
            onChanged();
          }
        } else {
          if (dataMsgCase_ == 5) {
            dataMsgCase_ = 0;
            dataMsg_ = null;
          }
          disconnectMessageBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
       */
      public HandshakeModel.DisconnectMessage.Builder getDisconnectMessageBuilder() {
        return getDisconnectMessageFieldBuilder().getBuilder();
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
       */
      public HandshakeModel.DisconnectMessageOrBuilder getDisconnectMessageOrBuilder() {
        if ((dataMsgCase_ == 5) && (disconnectMessageBuilder_ != null)) {
          return disconnectMessageBuilder_.getMessageOrBuilder();
        } else {
          if (dataMsgCase_ == 5) {
            return (HandshakeModel.DisconnectMessage) dataMsg_;
          }
          return HandshakeModel.DisconnectMessage.getDefaultInstance();
        }
      }
      /**
       * <code>.org.ethereum.protobuf.tcp.DisconnectMessage disconnectMessage = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          HandshakeModel.DisconnectMessage, HandshakeModel.DisconnectMessage.Builder, HandshakeModel.DisconnectMessageOrBuilder>
          getDisconnectMessageFieldBuilder() {
        if (disconnectMessageBuilder_ == null) {
          if (!(dataMsgCase_ == 5)) {
            dataMsg_ = HandshakeModel.DisconnectMessage.getDefaultInstance();
          }
          disconnectMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              HandshakeModel.DisconnectMessage, HandshakeModel.DisconnectMessage.Builder, HandshakeModel.DisconnectMessageOrBuilder>(
                  (HandshakeModel.DisconnectMessage) dataMsg_,
                  getParentForChildren(),
                  isClean());
          dataMsg_ = null;
        }
        dataMsgCase_ = 5;
        onChanged();;
        return disconnectMessageBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.ethereum.protobuf.tcp.HandshakeMessage)
    }

    // @@protoc_insertion_point(class_scope:org.ethereum.protobuf.tcp.HandshakeMessage)
    private static final HandshakeModel.HandshakeMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HandshakeModel.HandshakeMessage();
    }

    public static HandshakeModel.HandshakeMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HandshakeMessage>
        PARSER = new com.google.protobuf.AbstractParser<HandshakeMessage>() {
      @java.lang.Override
      public HandshakeMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HandshakeMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HandshakeMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HandshakeMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HandshakeModel.HandshakeMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_ethereum_protobuf_tcp_ByteMessage_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_ethereum_protobuf_tcp_ByteMessage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_ethereum_protobuf_tcp_HelloMessage_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_ethereum_protobuf_tcp_HelloMessage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017Handshake.proto\022\031org.ethereum.protobuf" +
      ".tcp\"\032\n\013ByteMessage\022\013\n\003meg\030\001 \001(\014\"\333\001\n\014Hel" +
      "loMessage\022\022\n\np2pVersion\030\001 \001(\004\022\020\n\010clientI" +
      "d\030\002 \001(\t\022\014\n\004type\030\003 \001(\r\022F\n\ncapability\030\004 \003(" +
      "\01322.org.ethereum.protobuf.tcp.HelloMessa" +
      "ge.Capability\022\022\n\nlistenPort\030\005 \001(\004\022\016\n\006pee" +
      "rId\030\006 \001(\t\032+\n\nCapability\022\014\n\004name\030\001 \001(\t\022\017\n" +
      "\007version\030\002 \001(\004\"\'\n\021DisconnectMessage\022\022\n\nr" +
      "easonCode\030\001 \001(\t\"\362\002\n\020HandshakeMessage\022B\n\004" +
      "type\030\001 \001(\01624.org.ethereum.protobuf.tcp.H" +
      "andshakeMessage.DataType\022=\n\013byteMessage\030" +
      "\003 \001(\0132&.org.ethereum.protobuf.tcp.ByteMe" +
      "ssageH\000\022?\n\014helloMessage\030\004 \001(\0132\'.org.ethe" +
      "reum.protobuf.tcp.HelloMessageH\000\022I\n\021disc" +
      "onnectMessage\030\005 \001(\0132,.org.ethereum.proto" +
      "buf.tcp.DisconnectMessageH\000\"D\n\010DataType\022" +
      "\017\n\013ByteMessage\020\000\022\020\n\014HelloMessage\020\001\022\025\n\021Di" +
      "sconnectMessage\020\002B\t\n\007dataMsgB\022B\016Handshak" +
      "eModelH\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_ethereum_protobuf_tcp_ByteMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_ethereum_protobuf_tcp_ByteMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_ethereum_protobuf_tcp_ByteMessage_descriptor,
        new java.lang.String[] { "Meg", });
    internal_static_org_ethereum_protobuf_tcp_HelloMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_ethereum_protobuf_tcp_HelloMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_ethereum_protobuf_tcp_HelloMessage_descriptor,
        new java.lang.String[] { "P2PVersion", "ClientId", "Type", "Capability", "ListenPort", "PeerId", });
    internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_descriptor =
      internal_static_org_ethereum_protobuf_tcp_HelloMessage_descriptor.getNestedTypes().get(0);
    internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_ethereum_protobuf_tcp_HelloMessage_Capability_descriptor,
        new java.lang.String[] { "Name", "Version", });
    internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_ethereum_protobuf_tcp_DisconnectMessage_descriptor,
        new java.lang.String[] { "ReasonCode", });
    internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_ethereum_protobuf_tcp_HandshakeMessage_descriptor,
        new java.lang.String[] { "Type", "ByteMessage", "HelloMessage", "DisconnectMessage", "DataMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}