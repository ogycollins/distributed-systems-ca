package SmartWatchClient;

import com.SmartWatchgRPC.restaurantsGrpc;

import java.util.Iterator;

import com.SmartWatchgRPC.Restaurants.location;
import com.SmartWatchgRPC.Restaurants.restaurant;
import com.SmartWatchgRPC.restaurantsGrpc.restaurantsBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartWatchClient {
	public static void main(String[] args)
	{
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		// stubs 
		restaurantsBlockingStub restaurantsStub = restaurantsGrpc.newBlockingStub(channel);
		location thisLocation = location.newBuilder().setLatitude(53.715322408807424).setLongtitude(-6.35401120348594).build();
		
		Iterator<restaurant> nearByRestaurants = restaurantsStub.getRestaurants(thisLocation);
		
		while(nearByRestaurants.hasNext()) {
			restaurant restaurant = nearByRestaurants.next();
			System.out.println(restaurant);				
		}
	}
}
