// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExampleService.proto

package com.example.server;

public final class ExampleService {
  private ExampleService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloRequest_BagOfTricksEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloRequest_BagOfTricksEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ExampleService.proto\"\265\001\n\014HelloRequest\022" +
      "\014\n\004name\030\001 \001(\t\022\017\n\007hobbies\030\002 \003(\t\0223\n\013bagOfT" +
      "ricks\030\003 \003(\0132\036.HelloRequest.BagOfTricksEn" +
      "try\022\035\n\tsentiment\030\004 \001(\0162\n.Sentiment\0322\n\020Ba" +
      "gOfTricksEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001" +
      "(\t:\0028\001\"!\n\rHelloResponse\022\020\n\010greeting\030\001 \001(" +
      "\t*-\n\tSentiment\022\t\n\005HAPPY\020\000\022\n\n\006SLEEPY\020\001\022\t\n" +
      "\005ANGRY\020\0022<\n\017GreetingService\022)\n\010greeting\022" +
      "\r.HelloRequest\032\016.HelloResponseB\026\n\022com.ex" +
      "ample.serverP\001b\006proto3"
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
    internal_static_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloRequest_descriptor,
        new java.lang.String[] { "Name", "Hobbies", "BagOfTricks", "Sentiment", });
    internal_static_HelloRequest_BagOfTricksEntry_descriptor =
      internal_static_HelloRequest_descriptor.getNestedTypes().get(0);
    internal_static_HelloRequest_BagOfTricksEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloRequest_BagOfTricksEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
