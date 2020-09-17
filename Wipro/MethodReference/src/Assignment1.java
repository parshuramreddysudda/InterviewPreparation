
// Define your own class with an instance method "int factorial(int n)" which should return the factorial of the given input "n". 
//Define your own functional interface to refer this instance method and invoke it to get the factorial result. 

interface fact {
	int factorialInstance(int n);

}

public class Assignment1 {

	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {

		Assignment1 fac = new Assignment1();
		fact reference = fac::factorial;

		System.out.println("Factorrial is " + reference.factorialInstance(12));

	}
}
