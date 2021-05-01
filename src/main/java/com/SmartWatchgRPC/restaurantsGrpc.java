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
public final class restaurantsGrpc {

  private restaurantsGrpc() {}

  public static final String SERVICE_NAME = "restaurants";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.SmartWatchgRPC.Restaurants.location,
      com.SmartWatchgRPC.Restaurants.restaurant> getGetRestaurantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRestaurants",
      requestType = com.SmartWatchgRPC.Restaurants.location.class,
      responseType = com.SmartWatchgRPC.Restaurants.restaurant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.SmartWatchgRPC.Restaurants.location,
      com.SmartWatchgRPC.Restaurants.restaurant> getGetRestaurantsMethod() {
    io.grpc.MethodDescriptor<com.SmartWatchgRPC.Restaurants.location, com.SmartWatchgRPC.Restaurants.restaurant> getGetRestaurantsMethod;
    if ((getGetRestaurantsMethod = restaurantsGrpc.getGetRestaurantsMethod) == null) {
      synchronized (restaurantsGrpc.class) {
        if ((getGetRestaurantsMethod = restaurantsGrpc.getGetRestaurantsMethod) == null) {
          restaurantsGrpc.getGetRestaurantsMethod = getGetRestaurantsMethod = 
              io.grpc.MethodDescriptor.<com.SmartWatchgRPC.Restaurants.location, com.SmartWatchgRPC.Restaurants.restaurant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "restaurants", "getRestaurants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Restaurants.location.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Restaurants.restaurant.getDefaultInstance()))
                  .setSchemaDescriptor(new restaurantsMethodDescriptorSupplier("getRestaurants"))
                  .build();
          }
        }
     }
     return getGetRestaurantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartWatchgRPC.Restaurants.reservationDetails,
      com.SmartWatchgRPC.Restaurants.reservationConfirmation> getMakeReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "makeReservation",
      requestType = com.SmartWatchgRPC.Restaurants.reservationDetails.class,
      responseType = com.SmartWatchgRPC.Restaurants.reservationConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SmartWatchgRPC.Restaurants.reservationDetails,
      com.SmartWatchgRPC.Restaurants.reservationConfirmation> getMakeReservationMethod() {
    io.grpc.MethodDescriptor<com.SmartWatchgRPC.Restaurants.reservationDetails, com.SmartWatchgRPC.Restaurants.reservationConfirmation> getMakeReservationMethod;
    if ((getMakeReservationMethod = restaurantsGrpc.getMakeReservationMethod) == null) {
      synchronized (restaurantsGrpc.class) {
        if ((getMakeReservationMethod = restaurantsGrpc.getMakeReservationMethod) == null) {
          restaurantsGrpc.getMakeReservationMethod = getMakeReservationMethod = 
              io.grpc.MethodDescriptor.<com.SmartWatchgRPC.Restaurants.reservationDetails, com.SmartWatchgRPC.Restaurants.reservationConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "restaurants", "makeReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Restaurants.reservationDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Restaurants.reservationConfirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new restaurantsMethodDescriptorSupplier("makeReservation"))
                  .build();
          }
        }
     }
     return getMakeReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SmartWatchgRPC.Restaurants.orderDetails,
      com.SmartWatchgRPC.Restaurants.orderConfirmation> getMakeOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "makeOrder",
      requestType = com.SmartWatchgRPC.Restaurants.orderDetails.class,
      responseType = com.SmartWatchgRPC.Restaurants.orderConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.SmartWatchgRPC.Restaurants.orderDetails,
      com.SmartWatchgRPC.Restaurants.orderConfirmation> getMakeOrderMethod() {
    io.grpc.MethodDescriptor<com.SmartWatchgRPC.Restaurants.orderDetails, com.SmartWatchgRPC.Restaurants.orderConfirmation> getMakeOrderMethod;
    if ((getMakeOrderMethod = restaurantsGrpc.getMakeOrderMethod) == null) {
      synchronized (restaurantsGrpc.class) {
        if ((getMakeOrderMethod = restaurantsGrpc.getMakeOrderMethod) == null) {
          restaurantsGrpc.getMakeOrderMethod = getMakeOrderMethod = 
              io.grpc.MethodDescriptor.<com.SmartWatchgRPC.Restaurants.orderDetails, com.SmartWatchgRPC.Restaurants.orderConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "restaurants", "makeOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Restaurants.orderDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SmartWatchgRPC.Restaurants.orderConfirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new restaurantsMethodDescriptorSupplier("makeOrder"))
                  .build();
          }
        }
     }
     return getMakeOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static restaurantsStub newStub(io.grpc.Channel channel) {
    return new restaurantsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static restaurantsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new restaurantsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static restaurantsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new restaurantsFutureStub(channel);
  }

  /**
   */
  public static abstract class restaurantsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRestaurants(com.SmartWatchgRPC.Restaurants.location request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.restaurant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRestaurantsMethod(), responseObserver);
    }

    /**
     */
    public void makeReservation(com.SmartWatchgRPC.Restaurants.reservationDetails request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.reservationConfirmation> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeReservationMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.orderDetails> makeOrder(
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.orderConfirmation> responseObserver) {
      return asyncUnimplementedStreamingCall(getMakeOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRestaurantsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.SmartWatchgRPC.Restaurants.location,
                com.SmartWatchgRPC.Restaurants.restaurant>(
                  this, METHODID_GET_RESTAURANTS)))
          .addMethod(
            getMakeReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.SmartWatchgRPC.Restaurants.reservationDetails,
                com.SmartWatchgRPC.Restaurants.reservationConfirmation>(
                  this, METHODID_MAKE_RESERVATION)))
          .addMethod(
            getMakeOrderMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.SmartWatchgRPC.Restaurants.orderDetails,
                com.SmartWatchgRPC.Restaurants.orderConfirmation>(
                  this, METHODID_MAKE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class restaurantsStub extends io.grpc.stub.AbstractStub<restaurantsStub> {
    private restaurantsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private restaurantsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected restaurantsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new restaurantsStub(channel, callOptions);
    }

    /**
     */
    public void getRestaurants(com.SmartWatchgRPC.Restaurants.location request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.restaurant> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetRestaurantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makeReservation(com.SmartWatchgRPC.Restaurants.reservationDetails request,
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.reservationConfirmation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.orderDetails> makeOrder(
        io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.orderConfirmation> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMakeOrderMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class restaurantsBlockingStub extends io.grpc.stub.AbstractStub<restaurantsBlockingStub> {
    private restaurantsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private restaurantsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected restaurantsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new restaurantsBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.SmartWatchgRPC.Restaurants.restaurant> getRestaurants(
        com.SmartWatchgRPC.Restaurants.location request) {
      return blockingServerStreamingCall(
          getChannel(), getGetRestaurantsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.SmartWatchgRPC.Restaurants.reservationConfirmation makeReservation(com.SmartWatchgRPC.Restaurants.reservationDetails request) {
      return blockingUnaryCall(
          getChannel(), getMakeReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class restaurantsFutureStub extends io.grpc.stub.AbstractStub<restaurantsFutureStub> {
    private restaurantsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private restaurantsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected restaurantsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new restaurantsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SmartWatchgRPC.Restaurants.reservationConfirmation> makeReservation(
        com.SmartWatchgRPC.Restaurants.reservationDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESTAURANTS = 0;
  private static final int METHODID_MAKE_RESERVATION = 1;
  private static final int METHODID_MAKE_ORDER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final restaurantsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(restaurantsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESTAURANTS:
          serviceImpl.getRestaurants((com.SmartWatchgRPC.Restaurants.location) request,
              (io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.restaurant>) responseObserver);
          break;
        case METHODID_MAKE_RESERVATION:
          serviceImpl.makeReservation((com.SmartWatchgRPC.Restaurants.reservationDetails) request,
              (io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.reservationConfirmation>) responseObserver);
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
        case METHODID_MAKE_ORDER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.makeOrder(
              (io.grpc.stub.StreamObserver<com.SmartWatchgRPC.Restaurants.orderConfirmation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class restaurantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    restaurantsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SmartWatchgRPC.Restaurants.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("restaurants");
    }
  }

  private static final class restaurantsFileDescriptorSupplier
      extends restaurantsBaseDescriptorSupplier {
    restaurantsFileDescriptorSupplier() {}
  }

  private static final class restaurantsMethodDescriptorSupplier
      extends restaurantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    restaurantsMethodDescriptorSupplier(String methodName) {
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
      synchronized (restaurantsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new restaurantsFileDescriptorSupplier())
              .addMethod(getGetRestaurantsMethod())
              .addMethod(getMakeReservationMethod())
              .addMethod(getMakeOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
