import java.util.Optional;

// Given a String address, print the address if it is not null or else print the default address as "India".

public class Assignment2 {

	public Assignment2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String addrress = null;
		String defa = "India";
		Optional<String> check = Optional.ofNullable(addrress);
		System.out.print(check.orElse(defa));

	}

}
