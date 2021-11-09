package com.qa.vehicles;

public abstract class Vehicle {
	
	private int ID;
	private int wheels;
	private String reg;
	
	private static int count = 0;
	
	public Vehicle(int wheels, String reg) {
		count++;
		ID = count;
		this.wheels = wheels;
		this.reg = reg;
	}
	
	public abstract int bill();
	
	public int getID() {
		return ID;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}
	
	
}
