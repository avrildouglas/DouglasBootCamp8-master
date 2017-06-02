/*
 * This is the parent class. Also called the super class
 */
public class Vehicle {
	public Vehicle() {
		System.out.println("A new vehicle has been created!");
	}
	public String accelerator() {
		return "The vehicle is accelerating...";
	}
	public String setSpeed() {
		return "The vehicle speed is 90 mph...";
	}
	public String breathe() {
		return "An animal breathe...";
	}
}
