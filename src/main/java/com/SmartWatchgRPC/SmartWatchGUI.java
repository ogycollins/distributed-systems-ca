package com.SmartWatchgRPC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.JScrollPane;

public class SmartWatchGUI {
	private static restaurantsBlockingStub restaurantsBlockingStub;
	private static restaurantsStub restaurantsStub;
	private static healthBlockingStub healthBlockingStub;
	private static healthStub healthStub;
	private static MessagingBlockingStub MessagingBlockingStub;
	
	

	private JFrame frame;
	private JTextField menuItemField;
	private JTextField timeField;
	private JTextField restaurantField;
	private JTextField noOfGuests;
	private JTextField searchField;
	
	double lat = 53.715322408807424;
	double lon = -6.35401120348594;
	String activityType = "Running";
	double activityTime = 2000;
	double distance = 3;
	int calories = 200; 
	List<String> myItems = new ArrayList<String>();

	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		// stubs 		
		restaurantsBlockingStub = restaurantsGrpc.newBlockingStub(channel);
		restaurantsStub = restaurantsGrpc.newStub(channel);
		healthBlockingStub = healthGrpc.newBlockingStub(channel);
		healthStub = healthGrpc.newStub(channel);
		MessagingBlockingStub = MessagingGrpc.newBlockingStub(channel);
		
		// variables

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
		
		String myMessage = "Hi, how are you?";
		String searchKey = "you";
		Scanner in = new Scanner(System.in);
		int choice = 0;
		boolean inputValid = true;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmartWatchGUI window = new SmartWatchGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SmartWatchGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 494, 643);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{164, 142, 174, 83, 0};
		gridBagLayout.rowHeights = new int[]{31, 17, 0, 0, 0, 0, 15, 22, 13, 15, 0, 15, 0, 44, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Smart Watch");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  Restaurant Service");
		lblNewLabel_1.setForeground(new Color(85, 107, 47));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton getRestaurants = new JButton("Get Nearby Restaurants");
		getRestaurants.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_getRestaurants = new GridBagConstraints();
		gbc_getRestaurants.insets = new Insets(0, 0, 5, 5);
		gbc_getRestaurants.gridx = 2;
		gbc_getRestaurants.gridy = 1;
		frame.getContentPane().add(getRestaurants, gbc_getRestaurants);
		
		JLabel reservationTitle = new JLabel("Make A Reservation");
		reservationTitle.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_reservationTitle = new GridBagConstraints();
		gbc_reservationTitle.gridwidth = 4;
		gbc_reservationTitle.insets = new Insets(0, 0, 5, 0);
		gbc_reservationTitle.gridx = 0;
		gbc_reservationTitle.gridy = 2;
		frame.getContentPane().add(reservationTitle, gbc_reservationTitle);
		
		JLabel lblNewLabel_4 = new JLabel("Time:");
		lblNewLabel_4.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 2;
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		timeField = new JTextField();
		timeField.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_timeField = new GridBagConstraints();
		gbc_timeField.insets = new Insets(0, 0, 5, 5);
		gbc_timeField.fill = GridBagConstraints.HORIZONTAL;
		gbc_timeField.gridx = 2;
		gbc_timeField.gridy = 3;
		frame.getContentPane().add(timeField, gbc_timeField);
		timeField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Restaurant:");
		lblNewLabel_5.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridwidth = 2;
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		restaurantField = new JTextField();
		restaurantField.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_restaurantField = new GridBagConstraints();
		gbc_restaurantField.insets = new Insets(0, 0, 5, 5);
		gbc_restaurantField.fill = GridBagConstraints.HORIZONTAL;
		gbc_restaurantField.gridx = 2;
		gbc_restaurantField.gridy = 4;
		frame.getContentPane().add(restaurantField, gbc_restaurantField);
		restaurantField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Number Of Guests:");
		lblNewLabel_6.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridwidth = 2;
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 5;
		frame.getContentPane().add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		noOfGuests = new JTextField();
		noOfGuests.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_noOfGuests = new GridBagConstraints();
		gbc_noOfGuests.insets = new Insets(0, 0, 5, 5);
		gbc_noOfGuests.fill = GridBagConstraints.HORIZONTAL;
		gbc_noOfGuests.gridx = 2;
		gbc_noOfGuests.gridy = 5;
		frame.getContentPane().add(noOfGuests, gbc_noOfGuests);
		noOfGuests.setColumns(10);
		
		JButton reservationBtn = new JButton("Make Reservation");
		reservationBtn.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_reservationBtn = new GridBagConstraints();
		gbc_reservationBtn.anchor = GridBagConstraints.EAST;
		gbc_reservationBtn.insets = new Insets(0, 0, 5, 0);
		gbc_reservationBtn.gridx = 3;
		gbc_reservationBtn.gridy = 5;
		frame.getContentPane().add(reservationBtn, gbc_reservationBtn);
		
		JLabel lblNewLabel_2 = new JLabel("Make An Order");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 4;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 6;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_8 = new JLabel("Menu Item:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.gridwidth = 2;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 7;
		frame.getContentPane().add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		menuItemField = new JTextField();
		GridBagConstraints gbc_menuItemField = new GridBagConstraints();
		gbc_menuItemField.insets = new Insets(0, 0, 5, 5);
		gbc_menuItemField.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuItemField.gridx = 2;
		gbc_menuItemField.gridy = 7;
		frame.getContentPane().add(menuItemField, gbc_menuItemField);
		menuItemField.setColumns(10);
		
		JButton addToOrderBtn = new JButton("Add To Order");
		GridBagConstraints gbc_addToOrderBtn = new GridBagConstraints();
		gbc_addToOrderBtn.insets = new Insets(0, 0, 5, 0);
		gbc_addToOrderBtn.gridx = 3;
		gbc_addToOrderBtn.gridy = 7;
		frame.getContentPane().add(addToOrderBtn, gbc_addToOrderBtn);
		
		JButton orderCompleteBtn = new JButton("Order Complete");
		GridBagConstraints gbc_orderCompleteBtn = new GridBagConstraints();
		gbc_orderCompleteBtn.insets = new Insets(0, 0, 5, 0);
		gbc_orderCompleteBtn.gridx = 3;
		gbc_orderCompleteBtn.gridy = 8;
		frame.getContentPane().add(orderCompleteBtn, gbc_orderCompleteBtn);
		
		JLabel lblNewLabel_7 = new JLabel("  Health Service");
		lblNewLabel_7.setForeground(new Color(85, 107, 47));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.gridwidth = 2;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 9;
		frame.getContentPane().add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JButton recordActivityBtn = new JButton("Record Activity");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.gridwidth = 2;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 10;
		frame.getContentPane().add(recordActivityBtn, gbc_btnNewButton_4);
		
		JButton trackLocationButton = new JButton("Track Location");

		GridBagConstraints gbc_trackLocationButton = new GridBagConstraints();
		gbc_trackLocationButton.insets = new Insets(0, 0, 5, 5);
		gbc_trackLocationButton.gridx = 2;
		gbc_trackLocationButton.gridy = 10;
		frame.getContentPane().add(trackLocationButton, gbc_trackLocationButton);
		
		JButton pairEquipmentBtn = new JButton("Pair Equipment");
		GridBagConstraints gbc_pairEquipmentBtn = new GridBagConstraints();
		gbc_pairEquipmentBtn.insets = new Insets(0, 0, 5, 0);
		gbc_pairEquipmentBtn.gridx = 3;
		gbc_pairEquipmentBtn.gridy = 10;
		frame.getContentPane().add(pairEquipmentBtn, gbc_pairEquipmentBtn);
		
		JLabel lblNewLabel_9 = new JLabel("  Messager");
		lblNewLabel_9.setForeground(new Color(85, 107, 47));
		lblNewLabel_9.setBackground(new Color(85, 107, 47));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 11;
		frame.getContentPane().add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JButton checkMessagesBtn = new JButton("Check For New Messages");
		GridBagConstraints gbc_checkMessagesBtn = new GridBagConstraints();
		gbc_checkMessagesBtn.gridwidth = 4;
		gbc_checkMessagesBtn.insets = new Insets(0, 0, 5, 0);
		gbc_checkMessagesBtn.gridx = 0;
		gbc_checkMessagesBtn.gridy = 12;
		frame.getContentPane().add(checkMessagesBtn, gbc_checkMessagesBtn);
		
		JLabel lblNewLabel_11 = new JLabel("New message:");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.gridwidth = 2;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 0;
		gbc_lblNewLabel_11.gridy = 13;
		frame.getContentPane().add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		JTextArea newMessageWindow = new JTextArea();
		GridBagConstraints gbc_newMessageWindow = new GridBagConstraints();
		gbc_newMessageWindow.insets = new Insets(0, 0, 5, 5);
		gbc_newMessageWindow.fill = GridBagConstraints.BOTH;
		gbc_newMessageWindow.gridx = 2;
		gbc_newMessageWindow.gridy = 13;
		frame.getContentPane().add(newMessageWindow, gbc_newMessageWindow);
		
		JButton sendMessageBtn = new JButton("Send");
		GridBagConstraints gbc_sendMessageBtn = new GridBagConstraints();
		gbc_sendMessageBtn.insets = new Insets(0, 0, 5, 0);
		gbc_sendMessageBtn.gridx = 3;
		gbc_sendMessageBtn.gridy = 13;
		frame.getContentPane().add(sendMessageBtn, gbc_sendMessageBtn);
		
		JLabel lblNewLabel_10 = new JLabel("Search:");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 14;
		frame.getContentPane().add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		searchField = new JTextField();
		GridBagConstraints gbc_searchField = new GridBagConstraints();
		gbc_searchField.gridwidth = 2;
		gbc_searchField.insets = new Insets(0, 0, 5, 5);
		gbc_searchField.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchField.gridx = 1;
		gbc_searchField.gridy = 14;
		frame.getContentPane().add(searchField, gbc_searchField);
		searchField.setColumns(10);
		
		JButton searchBtn = new JButton("Search");
		GridBagConstraints gbc_searchBtn = new GridBagConstraints();
		gbc_searchBtn.insets = new Insets(0, 0, 5, 0);
		gbc_searchBtn.gridx = 3;
		gbc_searchBtn.gridy = 14;
		frame.getContentPane().add(searchBtn, gbc_searchBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 15;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);
		
		JTextArea outputText = new JTextArea();
		scrollPane.setViewportView(outputText);
		outputText.setWrapStyleWord(true);
		outputText.setLineWrap(true);
		outputText.setBackground(new Color(240, 255, 240));
		
		// Restaurant Service Methods
		// get list of nearby restaurants based on GPS co-ordinates
		getRestaurants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputText.setText(null);
				lat = 53.715322408807424; // re-initialize to useful values
				lon = -6.35401120348594; // re-initialize to useful values
				
				location thisLocation = location.newBuilder().setLatitude(lat).setLongtitude(lon).build();
				Iterator<restaurant> nearByRestaurants = restaurantsBlockingStub.getRestaurants(thisLocation);
				
				while(nearByRestaurants.hasNext()) {
					restaurant restaurant = nearByRestaurants.next();
					outputText.append(restaurant.toString()+ "\n");				
				}
			}
		});
		
		// make a reservation
		reservationBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputText.setText(null);
				reservationDetails myReservationDetails = reservationDetails.newBuilder().setTime(timeField.getText()).setRestaurantName(restaurantField.getText()).setNumberOfSeats(Integer.parseInt(noOfGuests.getText())).build();
				reservationConfirmation reservationConfirmation = restaurantsBlockingStub.makeReservation(myReservationDetails);
				outputText.append(reservationConfirmation + "\n");
				timeField.setText(null);
				restaurantField.setText(null);
				noOfGuests.setText(null);

			}
		});
		
		// add a new item to a running order
		addToOrderBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String thisItem = menuItemField.getText();
				myItems.add(thisItem);
				menuItemField.setText(null);
			}
		});
				
		// (part of previous method) process order when all items added		
		orderCompleteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputText.setText(null);
				StreamObserver<orderConfirmation> responseObserver = new StreamObserver<orderConfirmation>() {
					@Override
					public void onNext(orderConfirmation order) {
						outputText.append("Item List: " + order.getOrderSummary() + "\n");
						outputText.append("Total Cost: " + order.getTotalCost() + "\n");
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
					}

					@Override
					public void onCompleted() {
						outputText.append("Order Complete \n");
						
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



				} catch (RuntimeException ex) {
					ex.printStackTrace();
				} catch (InterruptedException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} 	
			}
		});
		
		// health services
		// record activity
		recordActivityBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputText.setText(null);
				stats myStats = stats.newBuilder().setActivityType(activityType).setTime(activityTime).setDistance(distance).setCalories(calories).build();
				feedback myFeedback = healthBlockingStub.recordActivity(myStats);
				outputText.append(myFeedback + "\n");
			}
		});
		
		// Track Location During Activity Button
		trackLocationButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputText.setText(null);
				StreamObserver<map> responseObserver = new StreamObserver<map>() {
					@Override
					public void onNext(map myMap) {
						outputText.setText(myMap + "\n");

					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
					}

					@Override
					public void onCompleted() {
						outputText.setText("Image received. \n"); // String in place of an image file.
						
					}	
				};
				
				StreamObserver<com.SmartWatchgRPC.Health.location> requestObserver = healthStub.trackLocation(responseObserver);
				try {
			
					for (int i = 0; i < 20; i++)
					{
						requestObserver.onNext(com.SmartWatchgRPC.Health.location.newBuilder().setLatitude(lat).setLongitude(lon).build());
						Thread.sleep(500);
						// longtitude and latitude increased on each loop to simulate movement of position
						lat = lat + .5; 
						lon = lon + .5;
					}
					// 20 co-ordinates sent
					requestObserver.onCompleted();
					Thread.sleep(500);

				} catch (RuntimeException ex) {
					ex.printStackTrace();
				} catch (InterruptedException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} 
			}
		});
		
		// Pair Equipment Method
		pairEquipmentBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputText.setText(null);
				StreamObserver<feedback> responseObserver = new StreamObserver<feedback>() {
					@Override
					public void onNext(feedback myFeedback) {
						outputText.append(myFeedback.getSummary() + "\n");
						outputText.append(myFeedback.getFeedback() + "\n");
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();
					}

					@Override
					public void onCompleted() {
						outputText.append("Activity ended. \n");
						
					}	
				};
				
				StreamObserver<stats> requestObserver = healthStub.pairEquipment(responseObserver);
				try {
			
					for (int i = 0; i < 20; i++)
					{
						requestObserver.onNext(stats.newBuilder().setActivityType(activityType).setTime(activityTime).setDistance(distance).setCalories(calories).build());
						Thread.sleep(500);
					}
					// 20 co-ordinates sent
					requestObserver.onCompleted();
					Thread.sleep(500);

				} catch (RuntimeException ex) {
					ex.printStackTrace();
				} catch (InterruptedException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} 
				
			}
		});
		
		// Check for new messages
		checkMessagesBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputText.setText(null);
				Iterator<com.SmartWatchgRPC.MessagingOuterClass.Message> myMessages = MessagingBlockingStub.checkMessages(null);
				
				while(myMessages.hasNext()) {
					com.SmartWatchgRPC.MessagingOuterClass.Message myMessage = myMessages.next();
					outputText.append(myMessage + "\n");				
				}
				
			}
		});
		
		sendMessageBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputText.setText(null);
				String newMessage = newMessageWindow.getText();
				Message myMessage = Message.newBuilder().setMessage(newMessage).build();
				messageConfirmation messageSent = MessagingBlockingStub.sendMessage(myMessage);
				if (messageSent.getConfirmation()) 
				{
					outputText.append("Your message: " + newMessage + "\n");
					outputText.append("Message sent succesfully \n");
					newMessageWindow.setText(null);

				}
				else
				{
					outputText.append("Message failed \n");
				}
			}
		});
		
		searchBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputText.setText(null);
				String newSearchKey = searchField.getText();
				searchKey mySearchKey = searchKey.newBuilder().setSearchKey(newSearchKey).build();
				searchField.setText(null);
				Iterator<searchResults> mySearchResults = MessagingBlockingStub.searchMessages(mySearchKey);
				
				while(mySearchResults.hasNext()) {
					searchResults myMessage = mySearchResults.next();
					outputText.append("Search Key: " + newSearchKey + "\n");
					outputText.append(myMessage.toString() + "\n");
				}
			}
		});				
	}
}
