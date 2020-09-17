import java.util.Optional;

// Use Optional class and avoid NullPointerException from the below code:

public class Assignment1 {

	public Assignment1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String names[] = new String[5];
		Optional<String> check=Optional.ofNullable(names[0]);
		if(check.isPresent()) {
			System.out.print(names[0].length());
		}
		else {
			System.out.print("No data Found");
		}
 

	}

}
