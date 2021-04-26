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
public final class pairEquipmentGrpc {

  private pairEquipmentGrpc() {}

  public static final String SERVICE_NAME = "pairEquipment";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static pairEquipmentStub newStub(io.grpc.Channel channel) {
    return new pairEquipmentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static pairEquipmentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new pairEquipmentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static pairEquipmentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new pairEquipmentFutureStub(channel);
  }

  /**
   */
  public static abstract class pairEquipmentImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class pairEquipmentStub extends io.grpc.stub.AbstractStub<pairEquipmentStub> {
    private pairEquipmentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private pairEquipmentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected pairEquipmentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new pairEquipmentStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class pairEquipmentBlockingStub extends io.grpc.stub.AbstractStub<pairEquipmentBlockingStub> {
    private pairEquipmentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private pairEquipmentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected pairEquipmentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new pairEquipmentBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class pairEquipmentFutureStub extends io.grpc.stub.AbstractStub<pairEquipmentFutureStub> {
    private pairEquipmentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private pairEquipmentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected pairEquipmentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new pairEquipmentFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final pairEquipmentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(pairEquipmentImplBase serviceImpl, int methodId) {
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

  private static abstract class pairEquipmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    pairEquipmentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.Health.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("pairEquipment");
    }
  }

  private static final class pairEquipmentFileDescriptorSupplier
      extends pairEquipmentBaseDescriptorSupplier {
    pairEquipmentFileDescriptorSupplier() {}
  }

  private static final class pairEquipmentMethodDescriptorSupplier
      extends pairEquipmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    pairEquipmentMethodDescriptorSupplier(String methodName) {
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
      synchronized (pairEquipmentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new pairEquipmentFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
