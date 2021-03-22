package assignment5;

import java.util.Scanner;

public class Assignment5 {

	public Assignment5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println("Sum is " + sum);

	}

}
