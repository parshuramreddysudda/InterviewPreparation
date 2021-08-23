package assignment3;

import java.util.Scanner;

public class Assignment3 {

	public Assignment3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
  

	}

}
