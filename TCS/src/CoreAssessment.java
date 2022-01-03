import java.util.Iterator;
import java.util.Scanner;

public class CoreAssessment {

	public static void main(String[] args) {

//		int value = 5;
//		int number1 = 401;
//		int number2 = 10;
//		String str="asva";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the option");
		int value=sc.nextInt();
		System.out.println("Enter the First number ");
		int number1=sc.nextInt();
		System.out.println("Enter the Second number ");
		int number2=sc.nextInt();
		System.out.println("Enter the text");
		String str=sc.next();
		

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
			reverseString(str);
			break;

		case 6:
			break;
			
		default:
			break;
		}
	}

	private static void reverseString(String input) {

		StringBuilder input1 = new StringBuilder();
		 
        input1.append(input);
 

        input1.reverse();
 

        System.out.println(input1);
		
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
