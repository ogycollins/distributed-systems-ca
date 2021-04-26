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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: messaging.proto")
public final class sendMessageGrpc {

  private sendMessageGrpc() {}

  public static final String SERVICE_NAME = "sendMessage";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static sendMessageStub newStub(io.grpc.Channel channel) {
    return new sendMessageStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static sendMessageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new sendMessageBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static sendMessageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new sendMessageFutureStub(channel);
  }

  /**
   */
  public static abstract class sendMessageImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class sendMessageStub extends io.grpc.stub.AbstractStub<sendMessageStub> {
    private sendMessageStub(io.grpc.Channel channel) {
      super(channel);
    }

    private sendMessageStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sendMessageStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new sendMessageStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class sendMessageBlockingStub extends io.grpc.stub.AbstractStub<sendMessageBlockingStub> {
    private sendMessageBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private sendMessageBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sendMessageBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new sendMessageBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class sendMessageFutureStub extends io.grpc.stub.AbstractStub<sendMessageFutureStub> {
    private sendMessageFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private sendMessageFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sendMessageFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new sendMessageFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final sendMessageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(sendMessageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
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

  private static abstract class sendMessageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    sendMessageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.Messaging.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("sendMessage");
    }
  }

  private static final class sendMessageFileDescriptorSupplier
      extends sendMessageBaseDescriptorSupplier {
    sendMessageFileDescriptorSupplier() {}
  }

  private static final class sendMessageMethodDescriptorSupplier
      extends sendMessageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    sendMessageMethodDescriptorSupplier(String methodName) {
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
      synchronized (sendMessageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new sendMessageFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
