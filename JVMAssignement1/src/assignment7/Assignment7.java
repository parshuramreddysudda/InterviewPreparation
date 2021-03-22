package assignment7;

import java.util.Scanner;

public class Assignment7 {

	public Assignment7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factorial of num is "+fact(num));

	}

	private static int fact(int num) {
		
		if(num>=1)
			return num*fact(num-1);
		else 
			return 1;
	}

}
