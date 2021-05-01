package com.SmartWatchgRPC;

import com.SmartWatchgRPC.MessagingGrpc.MessagingImplBase;
import com.SmartWatchgRPC.MessagingOuterClass.Empty;
import com.SmartWatchgRPC.MessagingOuterClass.Message;
import com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation;
import com.SmartWatchgRPC.MessagingOuterClass.searchKey;
import com.SmartWatchgRPC.MessagingOuterClass.searchResults;

import io.grpc.stub.StreamObserver;

public class MessagingService extends MessagingImplBase {

	// Check for new messages. Server streaming. 
	@Override
	public void checkMessages(Empty request, StreamObserver<Message> responseObserver) {
		NewMessages myMessages = new NewMessages();
		String[] messageList = myMessages.getMessages();
		
		Message.Builder response = Message.newBuilder();
		for (int i = 0; i < messageList.length; i++)
		{
			response.setMessage(messageList[i]);
			responseObserver.onNext(response.build());
		}
		
		responseObserver.onCompleted();
		System.out.println("New messages returned.");
		
	}

	// client sends a message to be sent as a string. Return boolean to confirm message has been sent. Unary. 
	@Override
	public void sendMessage(Message request, StreamObserver<messageConfirmation> responseObserver) {
		String message = request.getMessage();
		messageConfirmation.Builder response = messageConfirmation.newBuilder();
		response.setConfirmation(true);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	// client sends a search key as a string. Check if it is in message database and return any relevant messages. Server streaming.
	@Override
	public void searchMessages(searchKey request, StreamObserver<searchResults> responseObserver) {
		String searchKey = request.getSearchKey().toLowerCase();
		NewMessages myMessages = new NewMessages();
		String[] messageList = myMessages.getMessages();
		searchResults.Builder response = searchResults.newBuilder();
		boolean noResults = true;
		int resultCounter = 0;

		for (int i = 0; i < messageList.length; i++)
		{
			if (messageList[i].toLowerCase().contains(searchKey))
			{
				noResults = false;
				resultCounter++;
				response.setMessages(messageList[i]);
				response.setNumberOfMessages(resultCounter);
				responseObserver.onNext(response.build());
			}
		}
		
		if (noResults == true)
		{
			response.setMessages("No messages found.");
			responseObserver.onNext(response.build());
		}
		
		responseObserver.onCompleted();
	}
	
	// Database of new messages
	public class NewMessages {
		private String message1 = "Hi, how are you keeping?";
		private String message2 = "Remember to get bread in the shop!";
		private String message3 = "Are you free for a call today?";
		private String message4 = "Would you like to go for a drink on Saturday?";
		private String message5 = "Thanks for all your help yesterday, see you soon!";
		String[] messages = {message1, message2, message3, message4, message5};
		
		public String[] getMessages(){
			return messages;
		}
			
	}
	

}


