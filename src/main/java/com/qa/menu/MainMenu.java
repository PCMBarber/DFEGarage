package com.qa.menu;

import java.util.Scanner;

public class MainMenu {
	
	Scanner scan = new Scanner(System.in);
	
	VehicleMenu<?> chosenVehicle;
	
	CarMenu carMenu = new CarMenu();
	TruckMenu truckMenu = new TruckMenu();
	MotorbikeMenu motorbikeMenu = new MotorbikeMenu();
	
	public void start() {
		System.out.println("What do you want to do?");
		System.out.println("1) Add a Vehicle");
		System.out.println("2) Read All Vehicles");
		System.out.println("3) Read By ID");
		System.out.println("4) Read By Type");
		System.out.println("5) Delete By ID");
		System.out.println("6) Delete By Type");
		System.out.println("7) Update Currently Stored Vehicle ");
		System.out.println("8) Exit The App");
		
		int choice = scan.nextInt();
		scan.nextLine();
		switch(choice) {
		case 1:
			choice();
			chosenVehicle.createVehicle();
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		default:
			
		}
	}
	
	public void choice() {
		System.out.println("1) Car");
		System.out.println("2) Motorbike");
		System.out.println("3) Truck");
		
		int choice = scan.nextInt();
		scan.nextLine();
		
		switch(choice) {
		case 1:
			chosenVehicle = carMenu;
			break;
		case 2:
			chosenVehicle = motorbikeMenu;
			break;
		case 3:
			chosenVehicle = truckMenu;
			break;
		default:
			choice();
		}
	}
}
