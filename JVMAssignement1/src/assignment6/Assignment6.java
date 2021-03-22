package assignment6;

import java.util.Scanner;

public class Assignment6 {

	public Assignment6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = { 1, 6, 4, 6, 47, 5547446, 4, 756, 8, 67, 8, 3, 6446 };
		int max = 0;
		for (int i = 0; i < num.length; i++)
			if (max < num[i])
				max = num[i];
		System.out.println("Max number is " + max);

	}

}
