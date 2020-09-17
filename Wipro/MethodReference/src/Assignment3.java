
// Define your own class and a parameterized constructor with one integer argument. It should check the argument and display "Prime" or "Not Prime". 
//Define your own functional interface to refer this constructor and invoke it to check whether the given number is Prime or Not.

interface prime {
	void primeClass(int n);

}

public class Assignment3 {

	public Assignment3(int n) {
		int m = n / 2;
		int flag = 0;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}

	public static void main(String[] args) {

		prime reference = Assignment3::new;

		reference.primeClass(1293773);

	}
}
