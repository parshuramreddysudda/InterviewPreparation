package assignment1;

public class GetFact extends Thread {

	int number;

	public void run() {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is " + fact);
	}

	public void setNumber(int num) {
		this.number = num;
	}

}
