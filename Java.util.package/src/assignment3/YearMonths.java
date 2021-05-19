package assignment3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class YearMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long monthsBetween = ChronoUnit.MONTHS.between(LocalDate.parse("2006-08-31").withDayOfMonth(1),
				LocalDate.parse("2016-11-30").withDayOfMonth(1));
		long yearsBetween = ChronoUnit.YEARS.between(LocalDate.parse("2001-04-12").withDayOfMonth(1),
				LocalDate.parse("2019-11-30").withDayOfMonth(1));
		System.out.println("Month are  " + monthsBetween + " Years are " + yearsBetween);
	}

}
