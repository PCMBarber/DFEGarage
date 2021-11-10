package com.qa.menu;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.garage.Garage;
import com.qa.utils.Utils;
import com.qa.vehicles.Car;

@RunWith(MockitoJUnitRunner.class)
public class TestCarMenu {
	
	@Mock
	Garage garage;
	
	@Mock
	Utils input;
	
	@InjectMocks
	CarMenu menu;
	
	@Test
	public void testCreateVehicle() {
		when(input.getInt()).thenReturn(4);
		when(input.getString()).thenReturn("NEST");
		when(input.getBoolean()).thenReturn(true);
		
		Car testCar = new Car(4, "NEST", true);
		testCar.setID(testCar.getID()+1); 
		// Car that the method creates will be 1 ID higher
		
		menu.createVehicle();
		
		verify(input, times(1)).getInt();
		verify(input, times(1)).getString();
		verify(input, times(1)).getBoolean();
		verify(garage, times(1)).addVehicle(testCar);
	}
	
	
	
	
	
	
	
	
	
	
	
}
