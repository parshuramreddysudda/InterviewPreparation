/**
 * 
 */
package Automobile;

/**
 * @author parsh
 *
 */
	public class Ford extends Vehicle {

		private String modelName;
		private String registrationNumber;
		private String ownerName;
		private int speed;
		private int tempControl;

		public Ford(String modelName, String registrationNumber, String ownerName, int speed, int tempControl) {
			super();
			this.modelName = modelName;
			this.registrationNumber = registrationNumber;
			this.ownerName = ownerName;
			this.speed = speed;
			this.tempControl = tempControl;
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
		
		public int tempControl() {
			return tempControl;
		}

	}

