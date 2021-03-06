// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/number.proto

package com.fr.planet;

public final class NumbersTraining {
  private NumbersTraining() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NumbersOrBuilder extends
      // @@protoc_insertion_point(interface_extends:planets.Numbers)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 number = 1;</code>
     */
    java.util.List<java.lang.Integer> getNumberList();
    /**
     * <code>repeated int32 number = 1;</code>
     */
    int getNumberCount();
    /**
     * <code>repeated int32 number = 1;</code>
     */
    int getNumber(int index);
  }
  /**
   * Protobuf type {@code planets.Numbers}
   */
  public  static final class Numbers extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:planets.Numbers)
      NumbersOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Numbers.newBuilder() to construct.
    private Numbers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Numbers() {
      number_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Numbers(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                number_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              number_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                number_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                number_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          number_ = java.util.Collections.unmodifiableList(number_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fr.planet.NumbersTraining.internal_static_planets_Numbers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fr.planet.NumbersTraining.internal_static_planets_Numbers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fr.planet.NumbersTraining.Numbers.class, com.fr.planet.NumbersTraining.Numbers.Builder.class);
    }

    public static final int NUMBER_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> number_;
    /**
     * <code>repeated int32 number = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getNumberList() {
      return number_;
    }
    /**
     * <code>repeated int32 number = 1;</code>
     */
    public int getNumberCount() {
      return number_.size();
    }
    /**
     * <code>repeated int32 number = 1;</code>
     */
    public int getNumber(int index) {
      return number_.get(index);
    }
    private int numberMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getNumberList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(numberMemoizedSerializedSize);
      }
      for (int i = 0; i < number_.size(); i++) {
        output.writeInt32NoTag(number_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < number_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(number_.get(i));
        }
        size += dataSize;
        if (!getNumberList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        numberMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof com.fr.planet.NumbersTraining.Numbers)) {
        return super.equals(obj);
      }
      com.fr.planet.NumbersTraining.Numbers other = (com.fr.planet.NumbersTraining.Numbers) obj;

      boolean result = true;
      result = result && getNumberList()
          .equals(other.getNumberList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getNumberCount() > 0) {
        hash = (37 * hash) + NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + getNumberList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fr.planet.NumbersTraining.Numbers parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fr.planet.NumbersTraining.Numbers parseFrom(
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
    public static Builder newBuilder(com.fr.planet.NumbersTraining.Numbers prototype) {
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
     * Protobuf type {@code planets.Numbers}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:planets.Numbers)
        com.fr.planet.NumbersTraining.NumbersOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fr.planet.NumbersTraining.internal_static_planets_Numbers_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fr.planet.NumbersTraining.internal_static_planets_Numbers_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fr.planet.NumbersTraining.Numbers.class, com.fr.planet.NumbersTraining.Numbers.Builder.class);
      }

      // Construct using com.fr.planet.NumbersTraining.Numbers.newBuilder()
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
        number_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fr.planet.NumbersTraining.internal_static_planets_Numbers_descriptor;
      }

      @java.lang.Override
      public com.fr.planet.NumbersTraining.Numbers getDefaultInstanceForType() {
        return com.fr.planet.NumbersTraining.Numbers.getDefaultInstance();
      }

      @java.lang.Override
      public com.fr.planet.NumbersTraining.Numbers build() {
        com.fr.planet.NumbersTraining.Numbers result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.fr.planet.NumbersTraining.Numbers buildPartial() {
        com.fr.planet.NumbersTraining.Numbers result = new com.fr.planet.NumbersTraining.Numbers(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          number_ = java.util.Collections.unmodifiableList(number_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.number_ = number_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fr.planet.NumbersTraining.Numbers) {
          return mergeFrom((com.fr.planet.NumbersTraining.Numbers)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fr.planet.NumbersTraining.Numbers other) {
        if (other == com.fr.planet.NumbersTraining.Numbers.getDefaultInstance()) return this;
        if (!other.number_.isEmpty()) {
          if (number_.isEmpty()) {
            number_ = other.number_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNumberIsMutable();
            number_.addAll(other.number_);
          }
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
        com.fr.planet.NumbersTraining.Numbers parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fr.planet.NumbersTraining.Numbers) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> number_ = java.util.Collections.emptyList();
      private void ensureNumberIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          number_ = new java.util.ArrayList<java.lang.Integer>(number_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 number = 1;</code>
       */
      public java.util.List<java.lang.Integer>
          getNumberList() {
        return java.util.Collections.unmodifiableList(number_);
      }
      /**
       * <code>repeated int32 number = 1;</code>
       */
      public int getNumberCount() {
        return number_.size();
      }
      /**
       * <code>repeated int32 number = 1;</code>
       */
      public int getNumber(int index) {
        return number_.get(index);
      }
      /**
       * <code>repeated int32 number = 1;</code>
       */
      public Builder setNumber(
          int index, int value) {
        ensureNumberIsMutable();
        number_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 number = 1;</code>
       */
      public Builder addNumber(int value) {
        ensureNumberIsMutable();
        number_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 number = 1;</code>
       */
      public Builder addAllNumber(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureNumberIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, number_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 number = 1;</code>
       */
      public Builder clearNumber() {
        number_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:planets.Numbers)
    }

    // @@protoc_insertion_point(class_scope:planets.Numbers)
    private static final com.fr.planet.NumbersTraining.Numbers DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fr.planet.NumbersTraining.Numbers();
    }

    public static com.fr.planet.NumbersTraining.Numbers getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Numbers>
        PARSER = new com.google.protobuf.AbstractParser<Numbers>() {
      @java.lang.Override
      public Numbers parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Numbers(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Numbers> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Numbers> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.fr.planet.NumbersTraining.Numbers getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_planets_Numbers_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_planets_Numbers_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026resources/number.proto\022\007planets\"\031\n\007Num" +
      "bers\022\016\n\006number\030\001 \003(\005B \n\rcom.fr.planetB\017N" +
      "umbersTrainingb\006proto3"
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
    internal_static_planets_Numbers_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_planets_Numbers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_planets_Numbers_descriptor,
        new java.lang.String[] { "Number", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
