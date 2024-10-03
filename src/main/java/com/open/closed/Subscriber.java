package com.open.closed;

//base class : should be always closed for modification and open for extension to other subclasses
public abstract class Subscriber {

	protected Long subscriberId;

	protected String address;

	protected Long phoneNumber;

	protected int baseRate;

	abstract double calculateBill();

	public Long getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Long subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}

}
