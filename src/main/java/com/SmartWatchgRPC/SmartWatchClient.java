package com.SmartWatchgRPC;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.SmartWatchgRPC.Restaurants.location;
import com.SmartWatchgRPC.Restaurants.orderConfirmation;
import com.SmartWatchgRPC.Restaurants.orderDetails;
import com.SmartWatchgRPC.Restaurants.reservationConfirmation;
import com.SmartWatchgRPC.Restaurants.reservationDetails;
import com.SmartWatchgRPC.Restaurants.restaurant;
import com.SmartWatchgRPC.restaurantsGrpc.restaurantsBlockingStub;
import com.SmartWatchgRPC.restaurantsGrpc.restaurantsStub;
import com.SmartWatchgRPC.healthGrpc.healthBlockingStub;
import com.SmartWatchgRPC.healthGrpc.healthStub;
import com.SmartWatchgRPC.Health.feedback;
import com.SmartWatchgRPC.Health.map;
import com.SmartWatchgRPC.Health.stats;
import com.SmartWatchgRPC.MessagingGrpc.MessagingBlockingStub;
import com.SmartWatchgRPC.MessagingGrpc.MessagingStub;
import com.SmartWatchgRPC.MessagingOuterClass.Message;
import com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation;
import com.SmartWatchgRPC.MessagingOuterClass.searchKey;
import com.SmartWatchgRPC.MessagingOuterClass.searchResults;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class SmartWatchClient {
	private static restaurantsBlockingStub restaurantsBlockingStub;
	private static restaurantsStub restaurantsStub;
	private static healthBlockingStub healthBlockingStub;
	private static healthStub healthStub;
	private static MessagingBlockingStub MessagingBlockingStub;
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
		
		// variables
		double lat = 53.715322408807424;
		double lon = -6.35401120348594;
		String time = "9pm";
		String restaurantName = "Sorrento";
		int numberOfSeats = 3;
		List<String> myItems = new ArrayList<String>();
		myItems.add("spaghetti");
		myItems.add("meatballs");
		myItems.add("garlic bread");
		myItems.add("lasagne");
		myItems.add("red wine");
		myItems.add("ice cream");
		String activityType = "Running";
		double activityTime = 2000;
		double distance = 3;
		int calories = 200; 
		String myMessage = "Hi, how are you?";
		String searchKey = "you";
		Scanner in = new Scanner(System.in);
		int choice = 0;
		boolean inputValid = true;
		
		do {
			System.out.println("Main Menu");
			System.out.println("Please choose from one of the following options:");
			System.out.println("1  - Get a list of restaurants nearby");
			System.out.println("2  - Make a reservation at a nearby restaurant");
			System.out.println("3  - Make an order at a nearby restaurant");
			System.out.println("4  - Record an exercise activity");
			System.out.println("5  - Track your location during an exercise activity");
			System.out.println("6  - Track your workout on an exercise machine");
			System.out.println("7  - Check your messages");
			System.out.println("8  - Send a message");
			System.out.println("9  - Search for messages based on a word or phrase");
			System.out.println("10 - Quit the client");
			// validate input check
			do {

				if (in.hasNextInt())
				{
					choice = in.nextInt();
				} 
				else
				{
					in.next();
					System.out.println("Please make a valid selection 1-10.");
				}
				
			} while (choice < 1 && choice > 10);
			
			// Restaurant Service
			if (choice == 1) 
			{
				System.out.println("Please input current latitude: ");
				System.out.println("(suggested value: 53.715322408807424)");
				do {

					if (in.hasNextDouble())
					{
						lat = in.nextDouble();
						inputValid = true;

					} 
					else
					{
						in.next();
						System.out.println("Please enter a valid latitude.");
						inputValid = false;
					}
					
				} while (!inputValid);
				
				System.out.println("Please input current longitude: ");
				System.out.println("(suggested value: -6.35401120348594)");
				do {

					if (in.hasNextDouble())
					{
						lon = in.nextDouble();
						inputValid = true;
					} 
					else
					{
						in.next();
						System.out.println("Please enter a valid longitude.");
						inputValid = false;
					}
					
				} while (!inputValid);

				getRestaurants(lat, lon);
			}
			else  if (choice == 2)
			{
				in.nextLine();
				System.out.println("Enter required time:");
				time = in.nextLine();
				System.out.println("Enter restaurant name:");
				restaurantName = in.nextLine();

				System.out.println("Enter number of guests:");
				do
				{
					if (in.hasNextInt())
					{
						numberOfSeats = in.nextInt();
						inputValid = true;
					}
					else
					{
						in.next();
						System.out.println("Please enter a valid number of guests.");
						inputValid = false;
		
					}
				} while (!inputValid);
				in.nextLine();
				

				makeReservation(time, restaurantName, numberOfSeats);
				
			}
			else  if (choice == 3)
			{
				makeOrder();
				
			}
			// Health Services
			else  if (choice == 4)
			{
				recordActivity(activityType, activityTime, distance, calories);
			}
			else  if (choice == 5)
			{
				trackLocation(lat, lon);
			}
			else  if (choice == 6)
			{
				pairEquipment(activityType, activityTime, distance, calories);
			}
			// Messaging Service
			else  if (choice == 7)
			{
				checkMessages();
			}
			else  if (choice == 8)
			{
				in.nextLine();
				System.out.println("Enter message to be sent:");
				myMessage = in.nextLine();
				sendMessage(myMessage);
	
			}
			else  if (choice == 9)
			{
				in.nextLine();
				System.out.println("Enter word or phrase to be searched:");
				System.out.println("(Suggested searches: you, hi, to");
				searchKey = in.nextLine();
				searchMessages(searchKey);
			}

			
			
		} while (choice !=10);
		
	}
	
	// Restaurant Methods
	public static void getRestaurants(double lat, double lon) {
		location thisLocation = location.newBuilder().setLatitude(lat).setLongtitude(lon).build();
		
		Iterator<restaurant> nearByRestaurants = restaurantsBlockingStub.getRestaurants(thisLocation);
		
		while(nearByRestaurants.hasNext()) {
			restaurant restaurant = nearByRestaurants.next();
			System.out.println(restaurant);				
		}
		
	}
	
	public static void makeReservation(String time, String restaurantName, int numberofSeats) 
	{
		reservationDetails myReservationDetails = reservationDetails.newBuilder().setTime(time).setRestaurantName(restaurantName).setNumberOfSeats(numberofSeats).build();
		reservationConfirmation reservationConfirmation = restaurantsBlockingStub.makeReservation(myReservationDetails);
		System.out.println(reservationConfirmation);				

	}
	
	public static void makeOrder()
	{
		Scanner in = new Scanner(System.in);
		List<String> myItems = new ArrayList<String>();
		System.out.println("Enter first item:");
		String thisItem = in.nextLine();
		do 
		{
			myItems.add(thisItem);
			System.out.println("Enter next item or type done to finish");
			thisItem = in.nextLine();
		} while (!thisItem.toLowerCase().equals("done"));
	
		
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
	
	// Health Service Methods
	public static void recordActivity(String activity, double time, double distance, int cals)
	{
		stats myStats = stats.newBuilder().setActivityType(activity).setTime(time).setDistance(distance).setCalories(cals).build();
		feedback myFeedback = healthBlockingStub.recordActivity(myStats);
		System.out.println(myFeedback);
		
	}
	
	public static void trackLocation(double lat, double lon)
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
				requestObserver.onNext(com.SmartWatchgRPC.Health.location.newBuilder().setLatitude(lat).setLongitude(lon).build());
				Thread.sleep(500);
				lat = lat + .5;
				lon = lon + .5;
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
	
	public static void pairEquipment(String activityType, double time, double distance, int cals)
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
				requestObserver.onNext(stats.newBuilder().setActivityType(activityType).setTime(time).setDistance(distance).setCalories(cals).build());
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
	
	// Messager Service Methods
	public static void checkMessages() {

		Iterator<com.SmartWatchgRPC.MessagingOuterClass.Message> myMessages = MessagingBlockingStub.checkMessages(null);
		
		while(myMessages.hasNext()) {
			com.SmartWatchgRPC.MessagingOuterClass.Message myMessage = myMessages.next();
			System.out.println(myMessage);				
		}

		
	}
	
	public static void sendMessage(String newMessage) {
		Message myMessage = Message.newBuilder().setMessage(newMessage).build();
		messageConfirmation messageSent = MessagingBlockingStub.sendMessage(myMessage);
		if (messageSent.getConfirmation()) 
		{
			System.out.println("Your message: " + newMessage);
			System.out.println("Message sent succesfully");
		}
		else
		{
			System.out.println("Message failed");
		}
		
	}
	
	public static void searchMessages(String newSearchKey)
	{
	searchKey mySearchKey = searchKey.newBuilder().setSearchKey(newSearchKey).build();
		
		Iterator<searchResults> mySearchResults = MessagingBlockingStub.searchMessages(mySearchKey);
		
		while(mySearchResults.hasNext()) {
			searchResults myMessage = mySearchResults.next();
			System.out.println(myMessage);				
		}
		
	}
}
