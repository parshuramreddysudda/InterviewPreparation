import java.util.Scanner;

public class FindBalancedNumber {

	public FindBalancedNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {

			long number = sc.nextLong();
			String num = String.valueOf(number);
			int result = 0, leftSum = 0;
			if ((num.length()) % 2 != 0) {
				for (int i = 0; i < num.length() / 2; i++) {
					leftSum += Integer.parseInt(String.valueOf(num.charAt(i)));
				}
//				System.out.println("Left Sum is " + leftSum);
//				System.out.println("Number is" + num.charAt((num.length() - 1) / 2));

				for (int i = ((num.length() - 1) / 2) + 1; i < num.length(); i++) {
					leftSum -= Integer.parseInt(String.valueOf(num.charAt(i)));
				}
				if (leftSum == 0)
					result = 1;
			} else {
				result = 1;
			}
			System.out.println(result);

		}

	}

}
