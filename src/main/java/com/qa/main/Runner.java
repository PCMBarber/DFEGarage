package com.qa.main;

import com.qa.vehicles.Car;
import static com.qa.garage.Garage.getInstance;

public class Runner {
	public static void main(String[] args) {
		Car i = new Car(4, "No46212", true);
		System.out.println("Value: "+i.getReg());
		
		change(i);
		System.out.println("Final Value: "+i.getReg());
	}
	
	public static void change(Car c) {
		System.out.println("Value: "+c.getReg());
		c.setReg("NewREG123");
		System.out.println("Value: "+c.getReg());
	}
}
