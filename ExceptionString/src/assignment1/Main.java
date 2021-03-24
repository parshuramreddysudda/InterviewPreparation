package assignment1;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur name :: ");
		String name = args[0];
		System.out.print("Enter ur age :: ");
		String age = args[1];

		int intage=Integer.parseInt(age);
		if (intage >= 18 && intage < 60)
			System.out.println("Age must be greater than ");
		else
			throw new Exception("not Valid age !!!");
	}

}
