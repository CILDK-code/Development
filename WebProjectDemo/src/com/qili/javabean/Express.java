package com.qili.javabean;

public class Express {
	private String delivery;
	private String mindTime;
	private String worry;
	private String attitude;
	public Express() {
	}
	public Express(String delivery, String mindTime, String worry, String attitude) {
		this.delivery = delivery;
		this.mindTime = mindTime;
		this.worry = worry;
		this.attitude = attitude;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getMindTime() {
		return mindTime;
	}
	public void setMindTime(String mindTime) {
		this.mindTime = mindTime;
	}
	public String getWorry() {
		return worry;
	}
	public void setWorry(String worry) {
		this.worry = worry;
	}
	public String getAttitude() {
		return attitude;
	}
	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}
	
}
