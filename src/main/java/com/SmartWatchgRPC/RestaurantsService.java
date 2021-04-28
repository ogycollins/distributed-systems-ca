package com.SmartWatchgRPC;

import java.lang.reflect.Array;

import com.SmartWatchgRPC.Restaurants.location;
import com.SmartWatchgRPC.Restaurants.orderConfirmation;
import com.SmartWatchgRPC.Restaurants.orderDetails;
import com.SmartWatchgRPC.Restaurants.reservationConfirmation;
import com.SmartWatchgRPC.Restaurants.reservationDetails;
import com.SmartWatchgRPC.Restaurants.restaurant;
import com.SmartWatchgRPC.restaurantsGrpc.restaurantsImplBase;

import io.grpc.stub.StreamObserver;

public class RestaurantsService extends restaurantsImplBase {

	@Override
	public void getRestaurants(location request, StreamObserver<restaurant> responseObserver) {
		double latitude = request.getLatitude();
		double longtitude = request.getLongtitude();
		RestaurantDatabase restaurantDatabase = new RestaurantDatabase();
		Restaurant[] restaurantList =  restaurantDatabase.getRestaurantList();
		restaurant.Builder response = restaurant.newBuilder();		

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
	}

	@Override
	public void makeReservation(reservationDetails request, StreamObserver<reservationConfirmation> responseObserver) {
		String time = request.getTime();
		String restaurantName = request.getRestaurantName();
		int numberOfSeats = request.getNumberOfSeats();
	}

	@Override
	public void makeOrder(orderDetails request, StreamObserver<orderConfirmation> responseObserver) {
		boolean confirmation = request.getConfirmation();
		String item = request.getItem();
		String paymentDetails = request.getPaymentDetails();
	}
	
	 
	
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
	
	public class Restaurant {
		String name;
		double latitude;
		double longtitude;
		
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
}
