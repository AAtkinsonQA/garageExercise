package main;

public class Train extends Vehicle {
	
	private boolean isSteamTrain;
	private int carriages;
	
	public Train() {
		super();
	}

	public Train(boolean isMoving, String type, int numOfPassengers, int weightInKg, boolean isSteamTrain,
			int carriages) {
		super(isMoving, type, numOfPassengers, weightInKg);
		this.isSteamTrain = isSteamTrain;
		this.carriages = carriages;
	}

	public boolean isSteamTrain() {
		return isSteamTrain;
	}

	public void setSteamTrain(boolean isSteamTrain) {
		this.isSteamTrain = isSteamTrain;
	}

	public int getCarriages() {
		return carriages;
	}

	public void setCarriages(int carriages) {
		this.carriages = carriages;
	}

	@Override
	public float calcRepairCost() {
		return getWeightInKg()*4 + this.carriages;
	}
	
	
}
