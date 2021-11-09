package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.vehicles.Vehicle;

public class Garage {
	
	private List<Vehicle> storage = new ArrayList<Vehicle>();
	
	private static Garage instance = null;
	
	private Garage() {
		
	}
	
	public static Garage getInstance() {
		if (instance==null) {
			instance = new Garage();
		}
		return instance;
	}
	
	public void addVehicle(Vehicle vehicle) {
		storage.add(vehicle);
	}

	public List<Vehicle> getStorage() {
		return storage;
	}
	
	public void removeByID(int ID) {
		for (Vehicle vehicle: storage) {
			if (vehicle.getID()==ID) {
				storage.remove(vehicle);
			}
		}
	}
	
	public void fixByID(int ID) {
		for (Vehicle vehicle: storage) {
			if (vehicle.getID()==ID) {
				System.out.println("Vehicle ID "+ID+" Costs $"+vehicle.bill());
				removeByID(ID);
			}
		}
	}
	
	public void emptyGarage() {
		storage.clear();
	}
	
	public void billing() {
		for (Vehicle vehicle: storage) {
			System.out.println("Vehicle Reg: "+ vehicle.getReg()+" Bill: $"+vehicle.bill());
		}	
	}
}
