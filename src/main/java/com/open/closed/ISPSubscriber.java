package com.open.closed;

import java.util.List;

//open for modification : override methodes from superclass Subscriber to implement the specific logic for ISPSubscriber class
public class ISPSubscriber extends Subscriber {

	private long freeUsage;

	public ISPSubscriber() {

	}

	@Override
	public double calculateBill() {
		List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
		long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
		long chargeableData = totalData - freeUsage;
		return chargeableData * baseRate / 100;
	}

}
