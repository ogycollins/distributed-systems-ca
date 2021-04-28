//package com.SmartWatchgRPC;
//
//import com.SmartWatchgRPC.Health.feedback;
//import com.SmartWatchgRPC.Health.location;
//import com.SmartWatchgRPC.Health.map;
//import com.SmartWatchgRPC.Health.stats;
//import com.SmartWatchgRPC.healthGrpc.healthImplBase;
//
//import io.grpc.stub.StreamObserver;
//
//public class HealthService extends healthImplBase {
//
//	@Override
//	public void recordActivity(stats request, StreamObserver<feedback> responseObserver) {
//		// TODO Auto-generated method stub
//		super.recordActivity(request, responseObserver);
//	}
//
//	@Override
//	public StreamObserver<location> trackLocation(StreamObserver<map> responseObserver) {
//		// TODO Auto-generated method stub
//		return super.trackLocation(responseObserver);
//	}
//
//	@Override
//	public StreamObserver<stats> pairEquipment(StreamObserver<feedback> responseObserver) {
//		// TODO Auto-generated method stub
//		return super.pairEquipment(responseObserver);
//	}
//
//}
