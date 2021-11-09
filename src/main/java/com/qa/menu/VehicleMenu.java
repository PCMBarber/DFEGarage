package com.qa.menu;

import java.util.List;

public interface VehicleMenu<T> {
	
	public void createVehicle();
	public List<T> readByType();
	public void deleteByType();
}
