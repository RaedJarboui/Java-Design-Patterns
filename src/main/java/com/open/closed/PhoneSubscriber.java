package com.open.closed;

import java.util.List;

//open for modification : override methodes from superclass Subscriber to implement the specific logic for PhoneSubscriber class
public class PhoneSubscriber extends Subscriber {

	@Override
	public double calculateBill() {
		List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
		long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
		return totalDuration * baseRate / 100;
	}

}
