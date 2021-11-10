package com.qa.garage;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.vehicles.Car;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Truck;
import com.qa.vehicles.Vehicle;

public class GarageTest {
	
	private Garage testGarage = Garage.getInstance();
	
	private Car testCar = new Car(0, null, false);
	private Motorbike testBike = new Motorbike(0, null, false);
	
	@Before
	public void before() {
		testGarage.addVehicle(testCar);
		testGarage.addVehicle(testBike);
	}
	
	@After
	public void after() {
		testGarage.emptyGarage();
		Vehicle.setCount(0);
	}
	
	@Test
	public void testGetStorage() {
		List<Vehicle> actual = testGarage.getStorage();
		List<Vehicle> expected = new ArrayList<Vehicle>();
		
		expected.add(testCar);
		expected.add(testBike);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testAddVehicle() {
		Truck testTruck = new Truck(0, null, 0);
		testGarage.addVehicle(testTruck);
		
		List<Vehicle> actual = testGarage.getStorage();
		List<Vehicle> expected = new ArrayList<Vehicle>();
		
		expected.add(testCar);
		expected.add(testBike);
		expected.add(testTruck);
		
		Assert.assertEquals(expected, actual);
	}
}











