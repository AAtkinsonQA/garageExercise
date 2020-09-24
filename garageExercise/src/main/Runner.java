package main;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		
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
