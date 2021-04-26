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
public final class searchMessagesGrpc {

  private searchMessagesGrpc() {}

  public static final String SERVICE_NAME = "searchMessages";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static searchMessagesStub newStub(io.grpc.Channel channel) {
    return new searchMessagesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static searchMessagesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new searchMessagesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static searchMessagesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new searchMessagesFutureStub(channel);
  }

  /**
   */
  public static abstract class searchMessagesImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class searchMessagesStub extends io.grpc.stub.AbstractStub<searchMessagesStub> {
    private searchMessagesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchMessagesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchMessagesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchMessagesStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class searchMessagesBlockingStub extends io.grpc.stub.AbstractStub<searchMessagesBlockingStub> {
    private searchMessagesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchMessagesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchMessagesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchMessagesBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class searchMessagesFutureStub extends io.grpc.stub.AbstractStub<searchMessagesFutureStub> {
    private searchMessagesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchMessagesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchMessagesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchMessagesFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final searchMessagesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(searchMessagesImplBase serviceImpl, int methodId) {
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

  private static abstract class searchMessagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    searchMessagesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.Messaging.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("searchMessages");
    }
  }

  private static final class searchMessagesFileDescriptorSupplier
      extends searchMessagesBaseDescriptorSupplier {
    searchMessagesFileDescriptorSupplier() {}
  }

  private static final class searchMessagesMethodDescriptorSupplier
      extends searchMessagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    searchMessagesMethodDescriptorSupplier(String methodName) {
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
      synchronized (searchMessagesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new searchMessagesFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
