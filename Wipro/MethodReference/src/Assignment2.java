
// Define your own class with a static method "int digitCount(int n)" which should return the number of digits in a given input "n". 
//Define your own functional interface to refer this static method and invoke it to get the number of digits.

interface count {
	int intDigitCountInstance(int n);
}

public class Assignment2 {

	public static int intDigitCount(int n) {

		return String.valueOf(n).length();

	}

	public static void main(String[] args) {

		count digitCount = Assignment2::intDigitCount;

		System.out.println("Length is " + digitCount.intDigitCountInstance(345683456));

	}
}
