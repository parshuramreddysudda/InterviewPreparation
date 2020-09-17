import java.util.*;

public class SubArrayWithSum {

	public SubArrayWithSum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			int length = sc.nextInt();
			int sum = sc.nextInt();
			int[] arr = new int[length];
			int left = 0, right = 0;
			int result = length - 1;
			for (int i = 0; i < length; i++) {
				arr[i] = sc.nextInt();
			}
			while (left <= length - 1 && right <= length - 1) {
				if (getSum(arr, left, right) <= sum) {
//					System.out.println("Sum is " + sum);
					right++;
				} else {

					result = Math.min(result, (right - left));
					System.out.println("Right is " + right + "Left is " + left + "Sum is " + getSum(arr, left, right));
					left++;

				}

			}
			System.out.println(result + 1);

		}

	}

	static int getSum(int[] arr, int start, int last) {
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += arr[i];
		}
		return sum;

	}

}
