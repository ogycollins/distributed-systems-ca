package com.SmartWatchgRPC;

import java.util.ArrayList;
import java.util.List;

import com.SmartWatchgRPC.Health.feedback;
import com.SmartWatchgRPC.Health.location;
import com.SmartWatchgRPC.Health.map;
import com.SmartWatchgRPC.Health.stats;
import com.SmartWatchgRPC.Restaurants.orderConfirmation;
import com.SmartWatchgRPC.Restaurants.orderDetails;
import com.SmartWatchgRPC.RestaurantsService.Order;
import com.SmartWatchgRPC.healthGrpc.healthImplBase;

import io.grpc.stub.StreamObserver;

public class HealthService extends healthImplBase {
	
	// record details of an exercise activity when it is finished and receive confirmation and feedback (unary).
	@Override
	public void recordActivity(stats request, StreamObserver<feedback> responseObserver) {
		String activityType = request.getActivityType();
		double time = request.getTime();
		double distance = request.getDistance();
		int calories = request.getCalories(); 
		
		System.out.println("Activity details received. ");

		feedback.Builder response = feedback.newBuilder();
		response.setSummary("Activity type: " + activityType + ". Time taken: " + time + " seconds. Distance: " + distance + "km. Calories Burned: " + calories + "cals.");
		response.setFeedback("Activity recorded to your account. You're making great progress, keep it up!");
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		System.out.println("Feedback sent. ");
		
	}
	
	// stream GPS location and return a map of the route taken (client streaming)
	@Override
	public StreamObserver<location> trackLocation(StreamObserver<map> responseObserver) {
		System.out.println("Receiving stream of GPS co-ordinates.");
		return new StreamObserver<location>()
			{
				List<Double> latitude = new ArrayList<Double>();
				List<Double> longitude = new ArrayList<Double>();
				

				@Override
				public void onNext(location request) {
					latitude.add(request.getLatitude());
					longitude.add(request.getLongitude());
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onCompleted() {			
					map.Builder response = map.newBuilder();
					response.setImage("This is a picture of the route taken based on the GPS data received.");
					responseObserver.onNext(response.build());	
					responseObserver.onCompleted();		
					System.out.println("Map returned.");
				}
			};
	}

	@Override
	public StreamObserver<stats> pairEquipment(StreamObserver<feedback> responseObserver) {
		// TODO Auto-generated method stub
		return super.pairEquipment(responseObserver);
	}

}
