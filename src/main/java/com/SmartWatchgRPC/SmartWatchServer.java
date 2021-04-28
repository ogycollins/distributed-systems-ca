package com.SmartWatchgRPC;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SmartWatchServer {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		Server server = ServerBuilder.forPort(9090).addService(new RestaurantsService()).build();
		
		server.start();
		
		System.out.println("Server started at " + server.getPort());
		
		server.awaitTermination();
	}
}
