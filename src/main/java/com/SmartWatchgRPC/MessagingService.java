//package com.SmartWatchgRPC;
//
//import com.SmartWatchgRPC.MessagingGrpc.MessagingImplBase;
//import com.SmartWatchgRPC.MessagingOuterClass.Empty;
//import com.SmartWatchgRPC.MessagingOuterClass.Message;
//import com.SmartWatchgRPC.MessagingOuterClass.messageConfirmation;
//import com.SmartWatchgRPC.MessagingOuterClass.searchKey;
//
//import io.grpc.stub.StreamObserver;
//
//public class MessagingService extends MessagingImplBase {
//
//	@Override
//	public void checkMessages(Empty request, StreamObserver<Message> responseObserver) {
//		// TODO Auto-generated method stub
//		super.checkMessages(request, responseObserver);
//	}
//
//	@Override
//	public void sendMessage(Message request, StreamObserver<messageConfirmation> responseObserver) {
//		// TODO Auto-generated method stub
//		super.sendMessage(request, responseObserver);
//	}
//
//	@Override
//	public void searchMessages(searchKey request, StreamObserver<Message> responseObserver) {
//		// TODO Auto-generated method stub
//		super.searchMessages(request, responseObserver);
//	}
//
//}
