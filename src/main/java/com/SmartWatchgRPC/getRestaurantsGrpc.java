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
public final class getRestaurantsGrpc {

  private getRestaurantsGrpc() {}

  public static final String SERVICE_NAME = "getRestaurants";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static getRestaurantsStub newStub(io.grpc.Channel channel) {
    return new getRestaurantsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static getRestaurantsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new getRestaurantsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static getRestaurantsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new getRestaurantsFutureStub(channel);
  }

  /**
   */
  public static abstract class getRestaurantsImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class getRestaurantsStub extends io.grpc.stub.AbstractStub<getRestaurantsStub> {
    private getRestaurantsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private getRestaurantsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected getRestaurantsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new getRestaurantsStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class getRestaurantsBlockingStub extends io.grpc.stub.AbstractStub<getRestaurantsBlockingStub> {
    private getRestaurantsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private getRestaurantsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected getRestaurantsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new getRestaurantsBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class getRestaurantsFutureStub extends io.grpc.stub.AbstractStub<getRestaurantsFutureStub> {
    private getRestaurantsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private getRestaurantsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected getRestaurantsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new getRestaurantsFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final getRestaurantsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(getRestaurantsImplBase serviceImpl, int methodId) {
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

  private static abstract class getRestaurantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    getRestaurantsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.Restaurants.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("getRestaurants");
    }
  }

  private static final class getRestaurantsFileDescriptorSupplier
      extends getRestaurantsBaseDescriptorSupplier {
    getRestaurantsFileDescriptorSupplier() {}
  }

  private static final class getRestaurantsMethodDescriptorSupplier
      extends getRestaurantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    getRestaurantsMethodDescriptorSupplier(String methodName) {
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
      synchronized (getRestaurantsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new getRestaurantsFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
