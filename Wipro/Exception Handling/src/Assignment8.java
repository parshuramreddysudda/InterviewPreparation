/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment8 {

	/**
	 * 
	 */
	public Assignment8() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InvalidAgeException {
		String name = args[0];
		
		int age = Integer.parseInt(args[1]);
		
		if (age < 18 || age >= 60)
			throw new InvalidAgeException();
		
		System.out.println("Name: " + name + " Age: " + age);
	}
	@SuppressWarnings("serial")
	public static class InvalidAgeException extends Exception {
		public InvalidAgeException() {
			super();
			System.out.println("Invalid age");
		}
	}
}
