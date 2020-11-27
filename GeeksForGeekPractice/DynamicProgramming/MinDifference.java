package DynamicProgramming;

public class MinDifference {

	public static void main(String[] args) {
		int arr[] = { 1, 4 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		Integer[][] dp = new Integer[arr.length][sum + 1];
		System.out.print(doPartition(dp, arr, 0, 0, 0));

	}

	private static int doPartition(Integer[][] dp, int[] arr, int index, int sum1, int sum2) {

		if (index == arr.length)
			return Math.abs(sum1 - sum2);
		
		if (dp[index][sum2] == null) {
			int diff1 = doPartition(dp,arr, index + 1, sum1 + arr[index], sum2);

			int diff2 = doPartition(dp,arr, index + 1, sum1, sum2 + arr[index]);

			dp[index][sum2]=Math.min(diff1, diff2);
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
