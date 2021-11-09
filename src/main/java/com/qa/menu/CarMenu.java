package com.qa.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Vehicle;

public class CarMenu implements VehicleMenu<Car> {
	
	Garage garage = Garage.getInstance();
	Scanner scan = new Scanner(System.in);
	
	public void createVehicle() {
		System.out.println("How many Wheels?");
		int wheels = scan.nextInt();
		scan.nextLine();
		System.out.println("Registration?");
		String reg = scan.nextLine();
		System.out.println("Heated Seats? true/false");
		boolean seats = scan.nextBoolean();
		scan.nextLine();
		
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
