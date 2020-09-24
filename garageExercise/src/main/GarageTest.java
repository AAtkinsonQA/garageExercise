package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GarageTest {

	@Test
	void carTest() {
		Car rand = new Car(false, "Train", 4, 500, "Honda");
		assertEquals(rand.calcRepairCost(),1000);
		Car x = new Car();
	}
	@Test
	void trainTest() {
		Train rand1 = new Train(false, "Train", 4, 500,true, 6);
		assertEquals(rand1.calcRepairCost(),2006);
		Train x = new Train();
	}
	@Test
	void motorTest() {
		Vehicle motorcycle1 = new Motorcycle(false, "Motorcycle", 1, 150, 2,"Vauxhall");
		assertEquals(motorcycle1.calcRepairCost(),180);
		Motorcycle x = new Motorcycle();
	}
	@Test
	void garageTest() {
		Garage garage1 = new Garage();
		Vehicle car1 = new Car(false, "Car", 4, 500, "Volkswagen");
		Vehicle car2 = new Car(false, "Car", 6, 2000, "Honda");
		Vehicle train = new Train(true, "Train", 50, 10000, false, 6);
		Vehicle motorcycle1 = new Motorcycle(false, "Motorcycle", 1, 150, 2,"Vauxhall");
		
		//Adding vehicles to garage:
		garage1.addVehicle(car1);
		garage1.addVehicle(car2);
		garage1.addVehicle(train);
		garage1.addVehicle(motorcycle1);
		
		//Printing garage:
		System.out.println(garage1.toString());
		
		//Calculating specific bill for each vehicle:
		System.out.println(garage1.calcBill());
		
		//Removing vehicle type from garage:
		System.out.println(garage1.removeVehicle("Train"));
		
		//Clearing garage:
		System.out.println(garage1.emptyGarage());
	}
}
