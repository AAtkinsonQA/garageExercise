package main;

public class Motorcycle extends Vehicle {

	private int numOfWheels = 2;
	private String brand;
	
	public Motorcycle(boolean isMoving, String type, int numOfPassengers, int weightInKg, int numOfWheels,
			String brand) {
		super(isMoving, type, numOfPassengers, weightInKg);
		this.numOfWheels = numOfWheels;
		this.brand = brand;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
