/**
 * 
 */
package Automobile;

public class Hero extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	

	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	@Override
	public void getModelName() {
		System.out.println("modelName: " + modelName);
	}

	@Override
	public void getRegistrationNumber() {
		System.out.println("registrationNumber: " + registrationNumber);
	}

	@Override
	public void getOwnerName() {
		System.out.println("ownerName: " + ownerName);
	}

	public int getSpeed() {
		return speed;
	}
	
	public void radio() {
		System.out.println("Accessing the radio");
	}
	
}
