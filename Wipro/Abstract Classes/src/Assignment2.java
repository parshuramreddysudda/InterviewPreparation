import java.util.Random;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartments = new Compartment[10];

		Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((4 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		compartments[i] = new FirstClass();
	    	else if (randomNum == 2)
	    		compartments[i] = new Ladies();
	    	else if (randomNum == 3)
	    		compartments[i] = new General();
	    	else if (randomNum == 4)
	    		compartments[i] = new Luggage();
	    	
	    	compartments[i].notice();
	    }
	}
	public static abstract class Compartment {
		public abstract void notice();
	}
	public static class FirstClass extends Compartment {

		@Override
		public void notice() {
			System.out.println("Notice: You're in FirstClass");
		}

	}
	public static class General extends Compartment {

		@Override
		public void notice() {
			System.out.println("Notice: You're in General");
		}

	}
	public static class Ladies extends Compartment {

		@Override
		public void notice() {
			System.out.println("Notice: You're in Ladies");
		}

	}
	public static class Luggage extends Compartment {

		@Override
		public void notice() {
			System.out.println("Notice: You're in Luggage");
		}

	}

}
