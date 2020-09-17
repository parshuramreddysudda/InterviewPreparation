/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment7 {

	/**
	 * 
	 */
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment7 registration = new Assignment7();
		
		try {
			registration.registerUser("Mickey", "US");
			//registration.registerUser("Mini", "India");
		} catch (InvalidCountryException e) {
//			System.out.println(e.getMessage());
		}
	}
	@SuppressWarnings("serial")
	public class InvalidCountryException extends Exception {
		public InvalidCountryException() {
			super();
			System.out.println("InvalidCountryException occured");
			System.out.println("User Outside India  cannot be registered");
		}
	}

}

