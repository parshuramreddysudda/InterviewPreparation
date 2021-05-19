package assignement3;

import java.util.Scanner;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,
}

public class EnumWeeks {

	public static void main(String[] args) {

		System.out.println("Input the name of the day (:in capital letters)");
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		try {
			printDay(Day.valueOf(day));
		} catch (Exception e) {
			System.out.println("Woo check the string you entered, `"+day + "` This is not a valid one");
		}
		
	}

	private static void printDay(Day day) {

		switch (day) {
		case MONDAY:
			System.out.println("Its monday, new start");
			break;
		case TUESDAY:
			System.out.println("Its monday, new start");
			break;
		case WEDNESDAY:
			System.out.println("Its monday, new start");
			break;
		case THURSDAY:
			System.out.println("Its monday, new start");
			break;
		case FRIDAY:
			System.out.println("Its monday, new start");
			break;
		case SATURDAY:
			System.out.println("Its monday, new start");
			break;

		default:
			System.out.println("Woo check the string you entered "+day + " This is not a valid one");
			break;
		}

	}

}
