package DynamicProgramming;

public class MinDifference {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3,9 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		Boolean[][] dp = new Boolean[arr.length][sum + 1];
		System.out.print(dynamicProgrammingSingleArray(arr,sum));

	}

	private static int dynamicProgrammingSingleArray(int[] nums, int sum) {

		int sum1 = sum / 2;
		boolean[] dp = new boolean[sum1 + 1];

		dp[0] = true;

		for (int i = 1; i < dp.length; i++) {
			dp[i] = (nums[0] == i ? true : false);
		}
		
		for (int i = 1; i < nums.length; i++) {
			for (int s = sum1; s >= 0; s--) {

				if (s >= nums[i]) {
					dp[s] = dp[s - nums[i]];
				}
			}
			print1DArray(dp);
			System.out.println();

		}
		for (int i = dp.length - 1; i >= 0; i--) {
			if (dp[i]) {
				sum1 = i;
				break;
			}
		}
		System.out.println("Sum1 is "+sum1);

		int sum2 = sum - sum1;
		return Math.abs(sum2 - sum1);
	}

	@SuppressWarnings("unused")
	private static int dynamicProgramming1(int[] nums, int sum) {

		int sum1 = sum / 2;
		boolean[][] dp = new boolean[nums.length][sum1 + 1];

		for (int i = 0; i < nums.length; i++)
			dp[i][0] = true;

		for (int i = 1; i < dp.length; i++) {
			dp[0][i] = (nums[0] == i ? true : false);
		}
		for (int i = 1; i < nums.length; i++) {
			for (int s = 1; s <= sum1; s++) {
				if (dp[i - 1][s]) {
					dp[i][s] = dp[i - 1][s];
				} else if (s >= nums[i]) {
					dp[i][s] = dp[i - 1][s - nums[i]];
				}
			}
		}
		printArray(dp);
		for (int i = dp[0].length - 1; i >= 0; i--) {
			if (dp[nums.length - 1][i]) {
				sum1 = i;
				break;
			}
		}

		int sum2 = sum - sum1;
		return Math.abs(sum2 - sum1);
	}

	static void printArray(boolean[][] dp) {

		for (int i = 0; i < dp.length; i++) {

			// Loop through all elements of current row
			for (int j = 0; j < dp[i].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

	}

	static void print1DArray(boolean[] dp) {
		for (int j = 0; j < dp.length; j++) {
			System.out.print(dp[j] + " ");
		}
	}

	@SuppressWarnings("unused")
	private static int doPartition(Integer[][] dp, int[] arr, int index, int sum1, int sum2) {

		if (index == arr.length)
			return Math.abs(sum1 - sum2);

		if (dp[index][sum2] == null) {
			int diff1 = doPartition(dp, arr, index + 1, sum1 + arr[index], sum2);

			int diff2 = doPartition(dp, arr, index + 1, sum1, sum2 + arr[index]);

			dp[index][sum2] = Math.min(diff1, diff2);
		}
		return dp[index][sum2];
	}

	@SuppressWarnings("unused")
	private static int BruteForce1(int[] arr, int index, int sum1, int sum2) {
		if (index == arr.length)
			return Math.abs(sum1 - sum2);

		int diff1 = BruteForce1(arr, index + 1, sum1 + arr[index], sum2);

		int diff2 = BruteForce1(arr, index + 1, sum1, sum2 + arr[index]);

		return Math.min(diff1, diff2);

	}
}
