package assignement2;

public class FirstClass {
	public static void main(String[] args) {
		A1 a = new A1();
		a = new A1();
		a = new A1();
		a = new A1();
		Runtime.getRuntime().gc();
		/*
		 * 3 times
		 * Calling finalize method of the Object class 
		 * Calling finalize method of the Object class 
		 * Calling finalize method of the Object class
		 */
	}

}
