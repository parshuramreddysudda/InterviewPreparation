import java.util.Scanner;

public class FindTwoPrimeNumbers {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();
		int temp = 0, i = 0;

		while (testcase-- > 0) {

			int number = sc.nextInt();
			for (i = 2; i < number / 2; i++) {
				if (isPrime(i)) {
					temp = number - i;
					if(isPrime(temp))
						break;
				}

			}
			System.out.println("Result is "+i+" Other is "+temp);
		}

	}

	static boolean isPrime(int num) {
		boolean result = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				result = false;
				break;
			}
		}
		return result;

	}

}
