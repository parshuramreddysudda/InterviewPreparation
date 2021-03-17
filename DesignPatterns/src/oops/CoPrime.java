package oops;

import java.util.*;

public class CoPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int number = sc.nextInt();
		int count = 0;
		for (int i = 1; i < number; i++) {
			if (isCoPrime(i, number))
				count++;
		}
		System.out.println("No of co primes are " + count);

	}

	static boolean isCoPrime(int no1, int no2) {

		int temp;
		{
			temp = no2;
			no2 = no1;
			no1 = temp;
		}
		int r = -1;
		while (r != 0) {
			r = no1 % no2;
			no1 = no2;
			no2 = r;
		}
		if (no1 == 1)
			return true;
		else
			return false;

	}
}
