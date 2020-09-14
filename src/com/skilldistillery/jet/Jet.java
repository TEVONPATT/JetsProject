package com.skilldistillery.jet;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	public void fly() {
//		System.out.println("Model: " + model + " Speed:  MPH" + speed + 
//				" Range: " + range + " Price: " + price + 
//				" Amount of time jet can fly before fuel runs out: " + range/speed);
	}
	public double getSpeedInMach() {
		return speed * 0.00130332;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		String output =  "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ ", getSpeedInMach()=" + getSpeedInMach() + " Amount of time jet can fly before fuel runs out: " + range/speed;
		return output;
	}
	public void displayJet() {
		String jetData = toString();
		System.out.println(jetData);
	}
}
