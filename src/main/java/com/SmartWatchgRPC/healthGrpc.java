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
public final class healthGrpc {

  private healthGrpc() {}

  public static final String SERVICE_NAME = "health";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.SmartWatchgRPC.Health.stats,
      com.SmartWatchgRPC.Health.feedback> getRecordActivityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordActivity",
      requestType = com.SmartWatchgRPC.Health.stats.class,
      responseType = com.SmartWatchgRPC.Health.feedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SmartWatchgRPC.Health.stats,
      com.SmartWatchgRPC.Health.feedback> getRecordActivityMethod() {
    io.grpc.MethodDescriptor<com.SmartWatchgRPC.Health.stats, com.SmartWatchgRPC.Health.feedback> getRecordActivityMethod;
    if ((getRecordActivityMethod = healthGrpc.getRecordActivityMethod) == null) {
      synchronized (healthGrpc.class) {
        if ((getRecordActivityMethod = healthGrpc.getRecordActivityMethod) == null) {
          healthGrpc.getRecordActivityMethod = getRecordActivityMethod = 
              io.grpc.MethodDescriptor.<com.SmartWatchgRPC.Health.stats, com.SmartWatchgRPC.Health.feedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "health", "recordActivity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Health.stats.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Health.feedback.getDefaultInstance()))
                  .setSchemaDescriptor(new healthMethodDescriptorSupplier("recordActivity"))
                  .build();
          }
        }
     }
     return getRecordActivityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartWatchgRPC.Health.location,
      com.SmartWatchgRPC.Health.map> getTrackLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "trackLocation",
      requestType = com.SmartWatchgRPC.Health.location.class,
      responseType = com.SmartWatchgRPC.Health.map.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.SmartWatchgRPC.Health.location,
      com.SmartWatchgRPC.Health.map> getTrackLocationMethod() {
    io.grpc.MethodDescriptor<com.SmartWatchgRPC.Health.location, com.SmartWatchgRPC.Health.map> getTrackLocationMethod;
    if ((getTrackLocationMethod = healthGrpc.getTrackLocationMethod) == null) {
      synchronized (healthGrpc.class) {
        if ((getTrackLocationMethod = healthGrpc.getTrackLocationMethod) == null) {
          healthGrpc.getTrackLocationMethod = getTrackLocationMethod = 
              io.grpc.MethodDescriptor.<com.SmartWatchgRPC.Health.location, com.SmartWatchgRPC.Health.map>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "health", "trackLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Health.location.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Health.map.getDefaultInstance()))
                  .setSchemaDescriptor(new healthMethodDescriptorSupplier("trackLocation"))
                  .build();
          }
        }
     }
     return getTrackLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartWatchgRPC.Health.stats,
      com.SmartWatchgRPC.Health.feedback> getPairEquipmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pairEquipment",
      requestType = com.SmartWatchgRPC.Health.stats.class,
      responseType = com.SmartWatchgRPC.Health.feedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.SmartWatchgRPC.Health.stats,
      com.SmartWatchgRPC.Health.feedback> getPairEquipmentMethod() {
    io.grpc.MethodDescriptor<com.SmartWatchgRPC.Health.stats, com.SmartWatchgRPC.Health.feedback> getPairEquipmentMethod;
    if ((getPairEquipmentMethod = healthGrpc.getPairEquipmentMethod) == null) {
      synchronized (healthGrpc.class) {
        if ((getPairEquipmentMethod = healthGrpc.getPairEquipmentMethod) == null) {
          healthGrpc.getPairEquipmentMethod = getPairEquipmentMethod = 
              io.grpc.MethodDescriptor.<com.SmartWatchgRPC.Health.stats, com.SmartWatchgRPC.Health.feedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "health", "pairEquipment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Health.stats.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Health.feedback.getDefaultInstance()))
                  .setSchemaDescriptor(new healthMethodDescriptorSupplier("pairEquipment"))
                  .build();
          }
        }
     }
     return getPairEquipmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static healthStub newStub(io.grpc.Channel channel) {
    return new healthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static healthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new healthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static healthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new healthFutureStub(channel);
  }

  /**
   */
  public static abstract class healthImplBase implements io.grpc.BindableService {

    /**
     */
    public void recordActivity(com.SmartWatchgRPC.Health.stats request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.feedback> responseObserver) {
      asyncUnimplementedUnaryCall(getRecordActivityMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.location> trackLocation(
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.map> responseObserver) {
      return asyncUnimplementedStreamingCall(getTrackLocationMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.stats> pairEquipment(
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.feedback> responseObserver) {
      return asyncUnimplementedStreamingCall(getPairEquipmentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecordActivityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SmartWatchgRPC.Health.stats,
                com.SmartWatchgRPC.Health.feedback>(
                  this, METHODID_RECORD_ACTIVITY)))
          .addMethod(
            getTrackLocationMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.SmartWatchgRPC.Health.location,
                com.SmartWatchgRPC.Health.map>(
                  this, METHODID_TRACK_LOCATION)))
          .addMethod(
            getPairEquipmentMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.SmartWatchgRPC.Health.stats,
                com.SmartWatchgRPC.Health.feedback>(
                  this, METHODID_PAIR_EQUIPMENT)))
          .build();
    }
  }

  /**
   */
  public static final class healthStub extends io.grpc.stub.AbstractStub<healthStub> {
    private healthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private healthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected healthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new healthStub(channel, callOptions);
    }

    /**
     */
    public void recordActivity(com.SmartWatchgRPC.Health.stats request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.feedback> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecordActivityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.location> trackLocation(
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.map> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTrackLocationMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.stats> pairEquipment(
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.feedback> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPairEquipmentMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class healthBlockingStub extends io.grpc.stub.AbstractStub<healthBlockingStub> {
    private healthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private healthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected healthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new healthBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.SmartWatchgRPC.Health.feedback recordActivity(com.SmartWatchgRPC.Health.stats request) {
      return blockingUnaryCall(
          getChannel(), getRecordActivityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class healthFutureStub extends io.grpc.stub.AbstractStub<healthFutureStub> {
    private healthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private healthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected healthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new healthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SmartWatchgRPC.Health.feedback> recordActivity(
        com.SmartWatchgRPC.Health.stats request) {
      return futureUnaryCall(
          getChannel().newCall(getRecordActivityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECORD_ACTIVITY = 0;
  private static final int METHODID_TRACK_LOCATION = 1;
  private static final int METHODID_PAIR_EQUIPMENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final healthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(healthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_ACTIVITY:
          serviceImpl.recordActivity((com.SmartWatchgRPC.Health.stats) request,
              (io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.feedback>) responseObserver);
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
        case METHODID_TRACK_LOCATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.trackLocation(
              (io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.map>) responseObserver);
        case METHODID_PAIR_EQUIPMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.pairEquipment(
              (io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Health.feedback>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class healthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    healthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.Health.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("health");
    }
  }

  private static final class healthFileDescriptorSupplier
      extends healthBaseDescriptorSupplier {
    healthFileDescriptorSupplier() {}
  }

  private static final class healthMethodDescriptorSupplier
      extends healthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    healthMethodDescriptorSupplier(String methodName) {
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
      synchronized (healthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new healthFileDescriptorSupplier())
              .addMethod(getRecordActivityMethod())
              .addMethod(getTrackLocationMethod())
              .addMethod(getPairEquipmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
