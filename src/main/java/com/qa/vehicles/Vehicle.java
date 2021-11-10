package com.qa.vehicles;

import java.util.Objects;

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

	public void setID(int iD) {
		ID = iD;
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

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicle.count = count;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return ID == other.ID && Objects.equals(reg, other.reg) && wheels == other.wheels;
	}
	
}
