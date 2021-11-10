package com.qa.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qa.garage.Garage;
import com.qa.utils.Utils;
import com.qa.vehicles.Car;
import com.qa.vehicles.Vehicle;

public class CarMenu implements VehicleMenu<Car> {
	
	Garage garage;
	Utils input;
	
	public CarMenu() {
		this.garage = Garage.getInstance();
		this.input = new Utils();
	}
	
	public CarMenu(Garage garage, Utils input) {
		this.garage = garage;
		this.input = input;
	}
	
	public void createVehicle() {
		System.out.println("How many Wheels?");
		int wheels = input.getInt();
		System.out.println("Registration?");
		String reg = input.getString();
		System.out.println("Heated Seats? true/false");
		boolean seats = input.getBoolean();
		
		garage.addVehicle(new Car(wheels, reg, seats));
	}

	public List<Car> readByType() {
		List<Car> found = new ArrayList<Car>();
		
		for(Vehicle vehicle: garage.getStorage()) {
			if (vehicle instanceof Car) {
				found.add((Car) vehicle);
			}
		}
		return found;
	}

	public void deleteByType() {
		for(Vehicle vehicle: garage.getStorage()) {
			if (vehicle instanceof Car) {
				garage.removeByID(vehicle.getID());
			}
		}
	}

}
