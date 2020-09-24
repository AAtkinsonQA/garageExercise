package main;

public class Vehicle {
	
	private boolean isMoving;
	private String type;
	private int numOfPassengers;
	private int weightInKg;
	
	public Vehicle(boolean isMoving, String type, int numOfPassengers, int weightInKg) {
		super();
		this.isMoving = isMoving;
		this.type = type;
		this.numOfPassengers = numOfPassengers;
		this.weightInKg = weightInKg;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public int getWeightInKg() {
		return weightInKg;
	}

	public void setWeightInKg(int weightInKg) {
		this.weightInKg = weightInKg;
	}
	
}
