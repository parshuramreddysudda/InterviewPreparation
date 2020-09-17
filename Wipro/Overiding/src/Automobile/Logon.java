/**
 * 
 */
package Automobile;

/**
 * @author parsh
 *
 */

public class Logon extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int gps;
	
	

	public Logon(String modelName, String registrationNumber, String ownerName, int speed, int gps) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gps = gps;
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
	
	public int speed() {
		return speed;
	}
	
	public int gps() {
		return gps;
	}

}
