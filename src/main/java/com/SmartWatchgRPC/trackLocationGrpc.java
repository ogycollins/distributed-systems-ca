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
    comments = "Source: health.proto")
public final class trackLocationGrpc {

  private trackLocationGrpc() {}

  public static final String SERVICE_NAME = "trackLocation";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static trackLocationStub newStub(io.grpc.Channel channel) {
    return new trackLocationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static trackLocationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new trackLocationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static trackLocationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new trackLocationFutureStub(channel);
  }

  /**
   */
  public static abstract class trackLocationImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class trackLocationStub extends io.grpc.stub.AbstractStub<trackLocationStub> {
    private trackLocationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private trackLocationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected trackLocationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new trackLocationStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class trackLocationBlockingStub extends io.grpc.stub.AbstractStub<trackLocationBlockingStub> {
    private trackLocationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private trackLocationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected trackLocationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new trackLocationBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class trackLocationFutureStub extends io.grpc.stub.AbstractStub<trackLocationFutureStub> {
    private trackLocationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private trackLocationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected trackLocationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new trackLocationFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final trackLocationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(trackLocationImplBase serviceImpl, int methodId) {
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

  private static abstract class trackLocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    trackLocationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.Health.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("trackLocation");
    }
  }

  private static final class trackLocationFileDescriptorSupplier
      extends trackLocationBaseDescriptorSupplier {
    trackLocationFileDescriptorSupplier() {}
  }

  private static final class trackLocationMethodDescriptorSupplier
      extends trackLocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    trackLocationMethodDescriptorSupplier(String methodName) {
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
      synchronized (trackLocationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new trackLocationFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
