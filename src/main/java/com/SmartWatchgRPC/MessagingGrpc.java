package com.SmartWatchgRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Messaging Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: messaging.proto")
public final class MessagingGrpc {

  private MessagingGrpc() {}

  public static final String SERVICE_NAME = "Messaging";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.SmartWatchgRPC.MessagingOuterClass.Empty,
      com.SmartWatchgRPC.MessagingOuterClass.Message> getCheckMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkMessages",
      requestType = com.SmartWatchgRPC.MessagingOuterClass.Empty.class,
      responseType = com.SmartWatchgRPC.MessagingOuterClass.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.SmartWatchgRPC.MessagingOuterClass.Empty,
      com.SmartWatchgRPC.MessagingOuterClass.Message> getCheckMessagesMethod() {
    io.grpc.MethodDescriptor<com.SmartWatchgRPC.MessagingOuterClass.Empty, com.SmartWatchgRPC.MessagingOuterClass.Message> getCheckMessagesMethod;
    if ((getCheckMessagesMethod = MessagingGrpc.getCheckMessagesMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getCheckMessagesMethod = MessagingGrpc.getCheckMessagesMethod) == null) {
          MessagingGrpc.getCheckMessagesMethod = getCheckMessagesMethod = 
              io.grpc.MethodDescriptor.<com.SmartWatchgRPC.MessagingOuterClass.Empty, com.SmartWatchgRPC.MessagingOuterClass.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Messaging", "checkMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.MessagingOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.MessagingOuterClass.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("checkMessages"))
                  .build();
          }
        }
     }
     return getCheckMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartWatchgRPC.MessagingOuterClass.Message,
      com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = com.SmartWatchgRPC.MessagingOuterClass.Message.class,
      responseType = com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SmartWatchgRPC.MessagingOuterClass.Message,
      com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.SmartWatchgRPC.MessagingOuterClass.Message, com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation> getSendMessageMethod;
    if ((getSendMessageMethod = MessagingGrpc.getSendMessageMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getSendMessageMethod = MessagingGrpc.getSendMessageMethod) == null) {
          MessagingGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<com.SmartWatchgRPC.MessagingOuterClass.Message, com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Messaging", "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.MessagingOuterClass.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("sendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartWatchgRPC.MessagingOuterClass.searchKey,
      com.SmartWatchgRPC.MessagingOuterClass.searchResults> getSearchMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchMessages",
      requestType = com.SmartWatchgRPC.MessagingOuterClass.searchKey.class,
      responseType = com.SmartWatchgRPC.MessagingOuterClass.searchResults.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.SmartWatchgRPC.MessagingOuterClass.searchKey,
      com.SmartWatchgRPC.MessagingOuterClass.searchResults> getSearchMessagesMethod() {
    io.grpc.MethodDescriptor<com.SmartWatchgRPC.MessagingOuterClass.searchKey, com.SmartWatchgRPC.MessagingOuterClass.searchResults> getSearchMessagesMethod;
    if ((getSearchMessagesMethod = MessagingGrpc.getSearchMessagesMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getSearchMessagesMethod = MessagingGrpc.getSearchMessagesMethod) == null) {
          MessagingGrpc.getSearchMessagesMethod = getSearchMessagesMethod = 
              io.grpc.MethodDescriptor.<com.SmartWatchgRPC.MessagingOuterClass.searchKey, com.SmartWatchgRPC.MessagingOuterClass.searchResults>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Messaging", "searchMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.MessagingOuterClass.searchKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.MessagingOuterClass.searchResults.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("searchMessages"))
                  .build();
          }
        }
     }
     return getSearchMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagingStub newStub(io.grpc.Channel channel) {
    return new MessagingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessagingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessagingFutureStub(channel);
  }

  /**
   * <pre>
   * Messaging Service
   * </pre>
   */
  public static abstract class MessagingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc to check for new messages
     * </pre>
     */
    public void checkMessages(com.SmartWatchgRPC.MessagingOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.MessagingOuterClass.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc to send a new message
     * </pre>
     */
    public void sendMessage(com.SmartWatchgRPC.MessagingOuterClass.Message request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc to search old messages with a string
     * </pre>
     */
    public void searchMessages(com.SmartWatchgRPC.MessagingOuterClass.searchKey request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.MessagingOuterClass.searchResults> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMessagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckMessagesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.SmartWatchgRPC.MessagingOuterClass.Empty,
                com.SmartWatchgRPC.MessagingOuterClass.Message>(
                  this, METHODID_CHECK_MESSAGES)))
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SmartWatchgRPC.MessagingOuterClass.Message,
                com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getSearchMessagesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.SmartWatchgRPC.MessagingOuterClass.searchKey,
                com.SmartWatchgRPC.MessagingOuterClass.searchResults>(
                  this, METHODID_SEARCH_MESSAGES)))
          .build();
    }
  }

  /**
   * <pre>
   * Messaging Service
   * </pre>
   */
  public static final class MessagingStub extends io.grpc.stub.AbstractStub<MessagingStub> {
    private MessagingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc to check for new messages
     * </pre>
     */
    public void checkMessages(com.SmartWatchgRPC.MessagingOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.MessagingOuterClass.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCheckMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc to send a new message
     * </pre>
     */
    public void sendMessage(com.SmartWatchgRPC.MessagingOuterClass.Message request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc to search old messages with a string
     * </pre>
     */
    public void searchMessages(com.SmartWatchgRPC.MessagingOuterClass.searchKey request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.MessagingOuterClass.searchResults> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Messaging Service
   * </pre>
   */
  public static final class MessagingBlockingStub extends io.grpc.stub.AbstractStub<MessagingBlockingStub> {
    private MessagingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc to check for new messages
     * </pre>
     */
    public java.util.Iterator<com.SmartWatchgRPC.MessagingOuterClass.Message> checkMessages(
        com.SmartWatchgRPC.MessagingOuterClass.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getCheckMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc to send a new message
     * </pre>
     */
    public com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation sendMessage(com.SmartWatchgRPC.MessagingOuterClass.Message request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc to search old messages with a string
     * </pre>
     */
    public java.util.Iterator<com.SmartWatchgRPC.MessagingOuterClass.searchResults> searchMessages(
        com.SmartWatchgRPC.MessagingOuterClass.searchKey request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Messaging Service
   * </pre>
   */
  public static final class MessagingFutureStub extends io.grpc.stub.AbstractStub<MessagingFutureStub> {
    private MessagingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc to send a new message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation> sendMessage(
        com.SmartWatchgRPC.MessagingOuterClass.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_MESSAGES = 0;
  private static final int METHODID_SEND_MESSAGE = 1;
  private static final int METHODID_SEARCH_MESSAGES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessagingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessagingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_MESSAGES:
          serviceImpl.checkMessages((com.SmartWatchgRPC.MessagingOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.SmartWatchgRPC.MessagingOuterClass.Message>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.SmartWatchgRPC.MessagingOuterClass.Message) request,
              (io.grpc.stub.StreamObserver<com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation>) responseObserver);
          break;
        case METHODID_SEARCH_MESSAGES:
          serviceImpl.searchMessages((com.SmartWatchgRPC.MessagingOuterClass.searchKey) request,
              (io.grpc.stub.StreamObserver<com.SmartWatchgRPC.MessagingOuterClass.searchResults>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessagingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.MessagingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Messaging");
    }
  }

  private static final class MessagingFileDescriptorSupplier
      extends MessagingBaseDescriptorSupplier {
    MessagingFileDescriptorSupplier() {}
  }

  private static final class MessagingMethodDescriptorSupplier
      extends MessagingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessagingMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MessagingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagingFileDescriptorSupplier())
              .addMethod(getCheckMessagesMethod())
              .addMethod(getSendMessageMethod())
              .addMethod(getSearchMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
