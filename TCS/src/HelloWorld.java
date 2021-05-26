import java.io.*;

public class HelloWorld {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Employee Name");
		String name = br.readLine();
		System.out.println("Enter percentage of salary");
		double percent = Double.parseDouble(br.readLine());
		if (percent > 0 && percent < 20) {
			System.out.println("Enter the Year of Experience");
			int time = Integer.parseInt(br.readLine());
			if (time > 0 && time < 15) {
				double permonth = 12000 + (2000 * (time));
				double dayshift = permonth * 6;
				double nightshift = (((permonth * percent) / 100) + permonth) * 6;
				double annualIncome = dayshift + nightshift;
				String str = "The annual salary of " + name + " is";
				System.out.println(str + " " + annualIncome);
			} else {
				System.out.println((int) time + " is an invalid year of experience");
			}
		} else
			System.out.println((int) percent + " is an invalid percentage");
	}
}