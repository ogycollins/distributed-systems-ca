package com.SmartWatchgRPC;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.SmartWatchgRPC.Restaurants.location;
import com.SmartWatchgRPC.Restaurants.orderConfirmation;
import com.SmartWatchgRPC.Restaurants.orderConfirmation.Builder;
import com.SmartWatchgRPC.Restaurants.orderDetails;
import com.SmartWatchgRPC.Restaurants.reservationConfirmation;
import com.SmartWatchgRPC.Restaurants.reservationDetails;
import com.SmartWatchgRPC.Restaurants.restaurant;
import com.SmartWatchgRPC.restaurantsGrpc.restaurantsImplBase;

import io.grpc.stub.StreamObserver;

public class RestaurantsService extends restaurantsImplBase {

	// get list of restaurants based on location (server streaming)
	@Override
	public void getRestaurants(location request, StreamObserver<restaurant> responseObserver) {
		double latitude = request.getLatitude();
		double longtitude = request.getLongtitude();
		RestaurantDatabase restaurantDatabase = new RestaurantDatabase();
		Restaurant[] restaurantList =  restaurantDatabase.getRestaurantList();
		restaurant.Builder response = restaurant.newBuilder();		
		
		System.out.println("Location received. Returning list of restaurants.");
		for (int i = 0; i < 5; i++)
		{
			double distance = calcDistance(latitude, restaurantList[i].getLat(), longtitude, restaurantList[i].getLong());
			
			if (distance <= 5)
			{
				response.setRestaurantDetails(restaurantList[i].getName());
				responseObserver.onNext(response.build());
			}
			else
			{
				response.setRestaurantDetails("No restaurants found");
				responseObserver.onNext(response.build());
				break;
			}
		}
		
		responseObserver.onCompleted();
		System.out.println("Response complete.");
	}

	// make a reservation at a restaurant (unary)
	@Override
	public void makeReservation(reservationDetails request, StreamObserver<reservationConfirmation> responseObserver) {
		String time = request.getTime();
		String restaurantName = request.getRestaurantName();
		int numberOfSeats = request.getNumberOfSeats();
		System.out.println("Reservation request received.");
		String reservationConfirmed = "Reservation confirmed at " + time + " at " + restaurantName + " for " + numberOfSeats + " people.";
		reservationConfirmation.Builder response = reservationConfirmation.newBuilder();
		
		response.setReservationSummary(reservationConfirmed);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		System.out.println("Response returned. ");

		
	}

	// make an order with a restaurant (client streaming)
	public StreamObserver<orderDetails> makeOrder (StreamObserver<orderConfirmation> responseObserver) {
		System.out.println("Receiving order details.");
		return new StreamObserver<orderDetails>()
			{
				Order myOrder = new Order();

				@Override
				public void onNext(orderDetails request) {
					System.out.println("Received item " + request.getItem());
					myOrder.addToOrder(request.getItem());	
					myOrder.setPaymentDetails(request.getPaymentDetails());
					
		
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onCompleted() {	
					orderConfirmation reply = orderConfirmation.newBuilder().setOrderSummary(myOrder.getItemList().toString()).setTotalCost("€20.50").build();
//					orderConfirmation.Builder response = orderConfirmation.newBuilder();
//					response.setOrderSummary(myOrder.getItemList().toString());
//					response.setTotalCost("€20.50");
					responseObserver.onNext(reply);	
					responseObserver.onCompleted();		
					System.out.println("Order details confirmed." + myOrder.getItemList().toString());
				}
			};
	}
	
	 
	// method to calculate distance based on latitude and longitude. Used by getRestaurants method
	public double calcDistance(double lat1, double lat2, double lon1, double lon2)
    {
 
        // Convert degress to radians
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
 
        // Haversine formula to calculate distance between 2 points based on latitude and longtitude
        double lonDiff = lon2 - lon1; // difference between 2 latitudes
        double latDiff = lat2 - lat1; // difference between 2 longtitudes
        double a = Math.pow(Math.sin(latDiff / 2), 2) 
                 + Math.cos(lat1) * Math.cos(lat2)
                 * Math.pow(Math.sin(lonDiff / 2),2);
             
        double c = 2 * Math.asin(Math.sqrt(a));
 
        // Radius of earth in kilometers. 
        double earthRadius = 6371;
 
        // calculate the result
        return(c * earthRadius);
    }
	
	// restaurant class used by getRestaurants method
	public class Restaurant {
		private String name;
		private double latitude;
		private double longtitude;
		
		Restaurant (String name, double latitude, double longtitude)
		{
			this.name = name;
			this.latitude = latitude;
			this.longtitude = longtitude;
		}
		
		public double getLat() {
			return latitude;
		}
		
		public double getLong() {
			return longtitude;
		}
		
		public String getName() {
			return name;
		}
		
		
	}
	
	// database of restaurants used by getRestaurants method
	public class RestaurantDatabase {
		Restaurant mcDonalds = new Restaurant("McDonalds", 53.71301477320824, -6.353288215127338);
		Restaurant abraKebabra = new Restaurant("AbraKebabra", 53.71410396892777, -6.345464342112054);
		Restaurant sorrentos = new Restaurant("Sorrentos", 53.71486461823695, -6.3499709132761915);
		Restaurant garamMasala = new Restaurant("GaramMasala", 53.71438582178078, -6.3529955458141965);
		Restaurant west29 = new Restaurant("West29", 53.71513896679619, -6.353549442112026);
		
		Restaurant[] restaurantList = {mcDonalds, abraKebabra, sorrentos, garamMasala, west29};
		
		public Restaurant[] getRestaurantList()
		{
			return this.restaurantList;
		}
	}
	
	// order class used by makeOrder class
	public class Order {
		private List<String> orderItems = new ArrayList<String>();
		private String paymentDetails;

		public void addToOrder(String item) {
			orderItems.add(item);
		}
		
		public void setPaymentDetails(String payment) {
			paymentDetails = payment;
		}
		
		public List<String> getItemList() {
			return orderItems;
		}
		
		public String getPaymentDetails() {
			return paymentDetails;
		}

	}
}
