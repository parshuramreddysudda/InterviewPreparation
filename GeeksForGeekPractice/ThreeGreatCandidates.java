import java.util.Arrays;
import java.util.Scanner;

public class ThreeGreatCandidates {

	public ThreeGreatCandidates() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			int n = sc.nextInt();
			long[] nums = new long[n];
			int j = 0;
			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt();
			}

			long number = 0;
			Arrays.sort(nums);

			System.out.println(Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 3] * nums[n - 2]));

		}
	}

}
