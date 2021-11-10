package com.qa.vehicles;

import java.util.Objects;

public class Car extends Vehicle {
	
	private boolean heatedSeats;

	public Car(int wheels, String reg, boolean heatedSeats) {
		super(wheels, reg);
		this.heatedSeats = heatedSeats;
	}

	public boolean isHeatedSeats() {
		return heatedSeats;
	}

	public void setHeatedSeats(boolean heatedSeats) {
		this.heatedSeats = heatedSeats;
	}

	@Override
	public int bill() {
		return 250;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return heatedSeats == other.heatedSeats;
	}
	
}
