package main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	public static void main(String[] args) {
		List<Vehicle> garage = new ArrayList<>();
		
		Vehicle car1 = new Car(false, "Car", 4, 500, "Volkswagen");
		Vehicle car2 = new Car(false, "Car", 6, 2000, "Honda");
		Vehicle train = new Train(true, "Train", 50, 10000, false, 6);
		Vehicle motorcycle1 = new Motorcycle(false, "Motorcycle", 1, 150, 2,"Vauxhall");
		
		//Adding vehicles to garage list:
		addVehicle(garage, car1);
		addVehicle(garage, car2);
		addVehicle(garage, train);
		addVehicle(garage, motorcycle1);
		
		printList(garage);
		
		//Removing vehicles by their type;
		removeVehicle(garage, "Train");
		
		printList(garage);
		
		//Calculating specific bill for each vehicle:
		for (Vehicle i: garage) {
			if (i instanceof Car) {
				System.out.println("The bill for this " + i.getNumOfPassengers() + " seater " + i.getType() + " is " + calculateBill(i.getType(),i.getWeightInKg()));
			}
			else {
				System.out.println("The bill for this " + i.getType() + " is " + calculateBill(i.getType(),i.getWeightInKg()));
			}
		}
		
		//Clearing garage list:
		emptyGarage(garage);
		
		printList(garage);
		
	}
	public static void printList(List<Vehicle> garage) {
		for (Vehicle i: garage) {
			System.out.print(i.getType());
			System.out.print(", ");
		}
		System.out.println("");
	}
	
	
	public static void addVehicle(List<Vehicle> garage, Vehicle vehicle) {
		garage.add(vehicle);
	}
	
	public static void removeVehicle(List<Vehicle> garage, String type) {
		List<Vehicle> tempList = new ArrayList<>();
		if (type == "Car") {
			for (Vehicle i: garage) {
				if (i instanceof Car) {
					tempList.add(i);
				}
			}

		}
		if (type == "Train") {
			for (Vehicle i: garage) {
				if (i instanceof Train) {
					tempList.add(i);
				}
			}
		}
		if (type == "Motorcycle") {
			for (Vehicle i: garage) {
				if (i instanceof Motorcycle) {
					tempList.add(i);
				}
			}
		}
		garage.removeAll(tempList);
		
	}
	
	public static void emptyGarage(List<Vehicle> garage) {
		garage.clear();
	}
	
	public static int calculateBill(String type, int weightInKg) {
		int bill = 0;
		if (type == "Car") {
			bill += 5000;
			bill *= weightInKg;
		}
		if (type == "Train") {
			bill += 20000;
			bill*= weightInKg;
		}
		if (type == "Motorcycle") {
			bill += 1000;
			bill *= weightInKg;
		}
		return bill;
	}
}

