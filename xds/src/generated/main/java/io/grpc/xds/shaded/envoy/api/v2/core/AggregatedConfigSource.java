// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/config_source.proto

package io.grpc.xds.shaded.envoy.api.v2.core;

/**
 * <pre>
 * Aggregated Discovery Service (ADS) options. This is currently empty, but when
 * set in :ref:`ConfigSource &lt;envoy_api_msg_core.ConfigSource&gt;` can be used to
 * specify that ADS is to be used.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.AggregatedConfigSource}
 */
public  final class AggregatedConfigSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.AggregatedConfigSource)
    AggregatedConfigSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AggregatedConfigSource.newBuilder() to construct.
  private AggregatedConfigSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AggregatedConfigSource() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AggregatedConfigSource(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_AggregatedConfigSource_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_AggregatedConfigSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource.class, io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource other = (io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource) obj;

    boolean result = true;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Aggregated Discovery Service (ADS) options. This is currently empty, but when
   * set in :ref:`ConfigSource &lt;envoy_api_msg_core.ConfigSource&gt;` can be used to
   * specify that ADS is to be used.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.AggregatedConfigSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.AggregatedConfigSource)
      io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_AggregatedConfigSource_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_AggregatedConfigSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource.class, io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource.newBuilder()
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
    public Builder clear() {
      super.clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_AggregatedConfigSource_descriptor;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource getDefaultInstanceForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource.getDefaultInstance();
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource build() {
      io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource buildPartial() {
      io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource result = new io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource(this);
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource) {
        return mergeFrom((io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource other) {
      if (other == io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.AggregatedConfigSource)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.AggregatedConfigSource)
  private static final io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource();
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AggregatedConfigSource>
      PARSER = new com.google.protobuf.AbstractParser<AggregatedConfigSource>() {
    public AggregatedConfigSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AggregatedConfigSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AggregatedConfigSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AggregatedConfigSource> getParserForType() {
    return PARSER;
  }

  public io.grpc.xds.shaded.envoy.api.v2.core.AggregatedConfigSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

