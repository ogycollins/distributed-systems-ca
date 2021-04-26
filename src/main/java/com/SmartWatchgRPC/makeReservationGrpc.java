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
public final class makeReservationGrpc {

  private makeReservationGrpc() {}

  public static final String SERVICE_NAME = "makeReservation";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static makeReservationStub newStub(io.grpc.Channel channel) {
    return new makeReservationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static makeReservationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new makeReservationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static makeReservationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new makeReservationFutureStub(channel);
  }

  /**
   */
  public static abstract class makeReservationImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class makeReservationStub extends io.grpc.stub.AbstractStub<makeReservationStub> {
    private makeReservationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private makeReservationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected makeReservationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new makeReservationStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class makeReservationBlockingStub extends io.grpc.stub.AbstractStub<makeReservationBlockingStub> {
    private makeReservationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private makeReservationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected makeReservationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new makeReservationBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class makeReservationFutureStub extends io.grpc.stub.AbstractStub<makeReservationFutureStub> {
    private makeReservationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private makeReservationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected makeReservationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new makeReservationFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final makeReservationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(makeReservationImplBase serviceImpl, int methodId) {
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

  private static abstract class makeReservationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    makeReservationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.Restaurants.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("makeReservation");
    }
  }

  private static final class makeReservationFileDescriptorSupplier
      extends makeReservationBaseDescriptorSupplier {
    makeReservationFileDescriptorSupplier() {}
  }

  private static final class makeReservationMethodDescriptorSupplier
      extends makeReservationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    makeReservationMethodDescriptorSupplier(String methodName) {
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
      synchronized (makeReservationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new makeReservationFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
