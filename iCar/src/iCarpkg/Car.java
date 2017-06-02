package iCarpkg;

public class Car extends Vehicle {
	private String carMake;
	private String carColor;
	private double carSpeed; 
	
	public Car() {
		super();
	}
	public String accelerate() {
		return "The car is accelerating.";
	}
	public String setspeed(){
		return "The speed is going " + carSpeed + "mph";
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
}

