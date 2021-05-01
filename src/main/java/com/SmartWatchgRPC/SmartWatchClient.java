package com.SmartWatchgRPC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.SmartWatchgRPC.Restaurants.location;
import com.SmartWatchgRPC.Restaurants.orderConfirmation;
import com.SmartWatchgRPC.Restaurants.orderDetails;
import com.SmartWatchgRPC.Restaurants.orderDetails.Builder;
import com.SmartWatchgRPC.Restaurants.reservationConfirmation;
import com.SmartWatchgRPC.Restaurants.reservationDetails;
import com.SmartWatchgRPC.Restaurants.restaurant;
import com.SmartWatchgRPC.restaurantsGrpc.restaurantsBlockingStub;
import com.SmartWatchgRPC.restaurantsGrpc.restaurantsStub;
import com.google.protobuf.Message;
import com.SmartWatchgRPC.healthGrpc.healthBlockingStub;
import com.SmartWatchgRPC.healthGrpc.healthStub;
import com.SmartWatchgRPC.Health.feedback;
import com.SmartWatchgRPC.Health.map;
import com.SmartWatchgRPC.Health.stats;
import com.SmartWatchgRPC.MessagingGrpc.MessagingBlockingStub;
import com.SmartWatchgRPC.MessagingGrpc.MessagingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class SmartWatchClient {
	private static restaurantsBlockingStub restaurantsBlockingStub;
	private static restaurantsStub restaurantsStub;
	private static healthBlockingStub healthBlockingStub;
	private static healthStub healthStub;
	private static MessagingBlockingStub MessagingBlockingStub;
	private static MessagingStub MessagingStub;
	static int counter = 0;
	static int counter2 = 0;

	
	public static void main(String[] args)
	{
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		// stubs 		
		restaurantsBlockingStub = restaurantsGrpc.newBlockingStub(channel);
		restaurantsStub = restaurantsGrpc.newStub(channel);
		healthBlockingStub = healthGrpc.newBlockingStub(channel);
		healthStub = healthGrpc.newStub(channel);
		MessagingBlockingStub = MessagingGrpc.newBlockingStub(channel);
		MessagingStub = MessagingGrpc.newStub(channel);
		
//		getRestaurants();
//		makeReservation();
//		makeOrder();
		
//		recordActivity();
//		trackLocation();
//		pairEquipment();
		
//		checkMessages();
		
		
	}
	
	// 
	public static void getRestaurants() {
		location thisLocation = location.newBuilder().setLatitude(53.715322408807424).setLongtitude(-6.35401120348594).build();
		
		Iterator<restaurant> nearByRestaurants = restaurantsBlockingStub.getRestaurants(thisLocation);
		
		while(nearByRestaurants.hasNext()) {
			restaurant restaurant = nearByRestaurants.next();
			System.out.println(restaurant);				
		}
		
	}
	
	public static void makeReservation() 
	{
		reservationDetails myReservationDetails = reservationDetails.newBuilder().setTime("9pm").setRestaurantName("Sorrento").setNumberOfSeats(3).build();
		reservationConfirmation reservationConfirmation = restaurantsBlockingStub.makeReservation(myReservationDetails);
		System.out.println(reservationConfirmation);				

	}
	
	public static void makeOrder()
	{
		List<String> myItems = new ArrayList<String>();
		myItems.add("spaghetti");
		myItems.add("meatballs");
		myItems.add("garlic bread");
		myItems.add("lasagne");
		myItems.add("red wine");
		myItems.add("ice cream");
		System.out.println("New Order incoming...");

		
		
		StreamObserver<orderConfirmation> responseObserver = new StreamObserver<orderConfirmation>() {
			@Override
			public void onNext(orderConfirmation order) {
				System.out.println("Item List: " + order.getOrderSummary());
				System.out.println("Total Cost: " + order.getTotalCost());

			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				System.out.println("Order Complete");
				
			}	
		};
		
		StreamObserver<orderDetails> requestObserver = restaurantsStub.makeOrder(responseObserver);
		try {
	
			for (int i = 0; i < myItems.size(); i++)
			{
				requestObserver.onNext(orderDetails.newBuilder().setItem(myItems.get(i)).setPaymentDetails("Visa").build());
				Thread.sleep(500);
			}
			// End of items to be added
			requestObserver.onCompleted();
			Thread.sleep(500);



		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}
	
	// Health Client Methods
	public static void recordActivity()
	{
		stats myStats = stats.newBuilder().setActivityType("Running").setTime(2000).setDistance(5).setCalories(200).build();
		feedback myFeedback = healthBlockingStub.recordActivity(myStats);
		System.out.println(myFeedback);
		
	}
	
	public static void trackLocation()
	{
		StreamObserver<map> responseObserver = new StreamObserver<map>() {
			@Override
			public void onNext(map myMap) {
				System.out.println(myMap);

			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				System.out.println("Image received.");
				
			}	
		};
		
		StreamObserver<com.SmartWatchgRPC.Health.location> requestObserver = healthStub.trackLocation(responseObserver);
		try {
	
			for (int i = 0; i < 20; i++)
			{
				requestObserver.onNext(com.SmartWatchgRPC.Health.location.newBuilder().setLatitude(i*50).setLongitude(i*40).build());
				Thread.sleep(500);
			}
			// 20 co-ordinates sent
			requestObserver.onCompleted();
			Thread.sleep(500);

		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public static void pairEquipment()
	{
		StreamObserver<feedback> responseObserver = new StreamObserver<feedback>() {
			@Override
			public void onNext(feedback myFeedback) {
				System.out.println(myFeedback.getSummary());
				System.out.println(myFeedback.getFeedback());
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				System.out.println("Activity ended.");
				
			}	
		};
		
		StreamObserver<stats> requestObserver = healthStub.pairEquipment(responseObserver);
		try {
	
			for (int i = 0; i < 20; i++)
			{
				requestObserver.onNext(stats.newBuilder().setActivityType("Bicycle").setTime(500).setDistance(1).setCalories(20).build());
				Thread.sleep(500);
			}
			// 20 co-ordinates sent
			requestObserver.onCompleted();
			Thread.sleep(500);

		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public static void checkMessages() {

		Iterator<com.SmartWatchgRPC.MessagingOuterClass.Message> myMessages = MessagingBlockingStub.checkMessages(null);
		
		while(myMessages.hasNext()) {
			com.SmartWatchgRPC.MessagingOuterClass.Message myMessage = myMessages.next();
			System.out.println(myMessage);				
		}

		
	}
	
	public static void sendMessage() {
		
	}
	
	public static void searchMessages()
	{
		
	}
}
