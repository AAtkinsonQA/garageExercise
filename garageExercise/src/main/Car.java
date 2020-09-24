package main;

public class Car extends Vehicle{
	
	private String brand;

	public Car(boolean isMoving, String type, int numOfPassengers, int weightInKg, String brand) {
		super(isMoving, type, numOfPassengers, weightInKg);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
