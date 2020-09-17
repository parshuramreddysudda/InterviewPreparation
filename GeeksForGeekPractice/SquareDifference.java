import java.util.Arrays;
import java.util.Scanner;

public class SquareDifference {

	public SquareDifference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {

			long num = sc.nextInt();
			long multiply = 0;
			long sumOfFirst = (num * (num + 1))/2;
			System.out.println(sumOfFirst);
			sumOfFirst = sumOfFirst * sumOfFirst;
			for (int i = 1; i <= num; i++)
				multiply += (i * i);

			System.out.println(Math.abs(sumOfFirst - multiply));
		}

	}

}
