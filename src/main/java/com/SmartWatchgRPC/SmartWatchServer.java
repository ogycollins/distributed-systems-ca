package com.SmartWatchgRPC;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SmartWatchServer {
	public static void main(String[] args) throws InterruptedException, IOException
	{	
		// Service Listener
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns.addServiceListener("_smartWatch._tcp.local.", new smartWatchServiceListener());
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
		
		// initiate 3 service servers 
		SmartWatchServer restaurantsService = new SmartWatchServer();
		SmartWatchServer healthService = new SmartWatchServer();
		SmartWatchServer messagingService = new SmartWatchServer();

		// get properties for each service from properties file
		Properties restaurantProperties = restaurantsService.getProperties("Restaurant Service", "src/main/resources/restaurantsService.properties");
		Properties healthProperties = healthService.getProperties("Health Service", "src/main/resources/healthService.properties");
		Properties messengingProperties = messagingService.getProperties("Messenging Service", "src/main/resources/messengingService.properties" );
		
		// register services with jmDNS
		restaurantsService.registerService(restaurantProperties);
		healthService.registerService(healthProperties);
		messagingService.registerService(messengingProperties);
		

		
		Server server = ServerBuilder.forPort(9090)
				.addService(new RestaurantsService())
				.addService(new HealthService())
				.addService(new MessagingService())
				.build();
		server.start();
		
		System.out.println("Server started at " + server.getPort());
		


		server.awaitTermination();
	}
	

	
	private Properties getProperties(String serviceName, String filePath) {
		
			Properties prop = null;		
			
			 try (InputStream input = new FileInputStream(filePath)) {
	
		            prop = new Properties();
	
		            // load a properties file
		            prop.load(input);
	
		            // get the property value and print it out
		            System.out.println(serviceName + " properties ...");
		            System.out.println("\t service_type: " + prop.getProperty("service_type"));
		            System.out.println("\t service_name: " +prop.getProperty("service_name"));
		            System.out.println("\t service_description: " +prop.getProperty("service_description"));
			        System.out.println("\t service_port: " +prop.getProperty("service_port"));
	
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		
			 return prop;
		}
		
	private void registerService(Properties properties) {
		
		 try {
	            // Create instance of JmDNS 
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            // Property Variables
	            String service_type = properties.getProperty("service_type");
	            String service_name = properties.getProperty("service_name");
	            int service_port = Integer.valueOf(properties.getProperty("service_port") );            
	            String service_description_properties = properties.getProperty("service_description");
	            
	            // Register the service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("Registering service %s of type %s \n", service_name, service_type);
	            Thread.sleep(1000); // Pause

	            //jmdns.unregisterAllServices(); // Method to unregister services

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	}
	
	private static class smartWatchServiceListener implements ServiceListener
	{
		@Override
		public void serviceAdded (ServiceEvent event) 
		{
			System.out.println("Service added: " + event.getInfo());
		}
		
		@Override
		public void serviceRemoved (ServiceEvent event) {
			System.out.println("Service removed: " + event.getInfo());
		}
		
		@Override
		public void serviceResolved (ServiceEvent event) {
			System.out.println("Service resolved: " + event.getInfo());
		}
	}
	
	
}
