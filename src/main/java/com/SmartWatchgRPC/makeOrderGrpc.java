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
    comments = "Source: restaurants.proto")
public final class makeOrderGrpc {

  private makeOrderGrpc() {}

  public static final String SERVICE_NAME = "makeOrder";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static makeOrderStub newStub(io.grpc.Channel channel) {
    return new makeOrderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static makeOrderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new makeOrderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static makeOrderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new makeOrderFutureStub(channel);
  }

  /**
   */
  public static abstract class makeOrderImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class makeOrderStub extends io.grpc.stub.AbstractStub<makeOrderStub> {
    private makeOrderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private makeOrderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected makeOrderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new makeOrderStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class makeOrderBlockingStub extends io.grpc.stub.AbstractStub<makeOrderBlockingStub> {
    private makeOrderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private makeOrderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected makeOrderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new makeOrderBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class makeOrderFutureStub extends io.grpc.stub.AbstractStub<makeOrderFutureStub> {
    private makeOrderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private makeOrderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected makeOrderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new makeOrderFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final makeOrderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(makeOrderImplBase serviceImpl, int methodId) {
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

  private static abstract class makeOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    makeOrderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.Restaurants.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("makeOrder");
    }
  }

  private static final class makeOrderFileDescriptorSupplier
      extends makeOrderBaseDescriptorSupplier {
    makeOrderFileDescriptorSupplier() {}
  }

  private static final class makeOrderMethodDescriptorSupplier
      extends makeOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    makeOrderMethodDescriptorSupplier(String methodName) {
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
      synchronized (makeOrderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new makeOrderFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
