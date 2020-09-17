import java.util.Optional;

// Given an Employee object which may be initialized to null, use Optional class to check if it is null and to throw an user defined exception InvalidEmployeeException.

public class Assignment3 {

	public Assignment3() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("null")
	public static void main(String[] args) throws InvalidEmployeeException {

		Employee employ = null;
		Optional<Employee> check = Optional.ofNullable(employ);
		if (check.isPresent()) {
			System.out.print(employ.id);
		} else {
			check.orElseThrow(()->new InvalidEmployeeException());
		}

	}

}

class InvalidEmployeeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmployeeException() {
		System.out.print(" Employee data Not Found");
	}
}

class Employee {

	public int id;
	public String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
