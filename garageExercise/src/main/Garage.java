package main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private	List<Vehicle> garage = new ArrayList<>();
		
	public Garage() {
		super();
	}
	
	public float calcBill() {
		float bill = 0;
		for (Vehicle i: this.garage) {
			bill += i.calcRepairCost();
		}
		return bill;
	}
	
	public boolean addVehicle(Vehicle vehicle) {
		return this.garage.add(vehicle);
	}
	
	public List<Vehicle> removeVehicle(String type) {
		List<Vehicle> tempList = new ArrayList<>();
		for (Vehicle V: this.garage) {
			if (V.getClass().getSimpleName().equals(type)) {
				tempList.add(V);
			}
			
		}
		this.garage.removeAll(tempList);
		return tempList;
		
	}
	
	public boolean emptyGarage() {
		this.garage.clear();
		return this.garage.size() == 0;
	}

	@Override
	public String toString() {
		return "Garage [garage=" + garage + "]";
	}
	
}

