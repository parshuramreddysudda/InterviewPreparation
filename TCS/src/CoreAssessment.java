import java.util.Iterator;

public class CoreAssessment {

	public static void main(String[] args) {

		int value = 4;
		int number1 = 401;
		int number2 = 10;

		switch (value) {
		case 1:
			genrateSeries(number1);
			break;
		case 2:
			findSumOfPrimeNumbers(number1, number2);
			break;
		case 3:
			printPattern(number1);
			break;
		case 4:
			numberToWord(number1);
			break;
		case 5:
			genrateSeries(number1);
			break;

		case 6:
			genrateSeries(number1);
			break;
		default:
			break;
		}
	}

	private static void numberToWord(int number) {
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String word = Integer.toString(number);

		for (int i = 0; i < word.length(); i++) {
			System.out.print(unitsArray[Integer.parseInt(String.valueOf(word.charAt(i)))]+" ");
		}

	}

	public static void findSumOfPrimeNumbers(int number1, int number2) {
		int sum = 0, count = 0;
		for (int number = number1; number <= number2; number++) {
			count = 0;
			for (int i = 2; i <= number / 2; i++) {

				if (number % i == 0) {

					count++;
					break;
				}
			}

			if (count == 0 && number != 1) {

				sum = sum + number;
			}

		}
		System.out.println("The Sum of Prime Numbers from " + number1 + " to " + number2 + " is: " + sum);

	}

	public static void genrateSeries(int number) {

		for (int i = 1; i < number; i++) {
			System.out.print(i++ + " ");
			System.out.print(Math.negateExact(i) + " ");
		}

	}

	public static void printPattern(int number) {
		int i, j;

		for (i = 0; i <= number; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(j + " ");

			System.out.println();
		}

		for (i = 5; i > 0; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
