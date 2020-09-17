import java.util.Scanner;

public class FormNumberDivisibleByThree {

	public FormNumberDivisibleByThree() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {

			int length = sc.nextInt();
			int result = 0, sum = 0;
			int[] arr = new int[length];
			for (int i = 0; i < length; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];

			}
			if (sum % 3 == 0) {
				result = 1;
			}
			System.out.println(result);
		}

	}

}
