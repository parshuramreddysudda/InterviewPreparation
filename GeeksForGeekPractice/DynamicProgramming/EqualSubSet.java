package DynamicProgramming;

import java.util.Arrays;

public class EqualSubSet {

	public static void main(String[] args) {

		int arr[] = { 2,2,3,5};
		int sum = 0;
		for (int s : arr) {
			sum += s;
		}
		if (sum % 2 != 0)
			System.out.println("Not found");
		else {
			boolean[][] dp = new boolean[arr.length][sum + 1];
//			System.out.println(subsetDP(dp, arr, 0));
			System.out.print(subsetDPWithOneArrayBoolean(arr));

//			for (int i = 0; i < dp.length; i++) {
//				for (int j = 0; j < dp[i].length; j++)
//					System.out.print(dp[i][j] + " ");
//				System.out.println();
//			}
		}

	}

	private static boolean subsetDPWithOneArrayBoolean(int[] arr) {
		int sum = 0;
		for (int s : arr) {
			sum += s;
		}
		sum /= 2;
		boolean[] dp = new boolean[sum + 1];

		for (int i = 0; i < dp.length; i++)
			dp[i] = (i <= arr[0] ? true : false);
		
		for (int k = 0; k < dp.length; k++) {
			System.out.print(dp[k] + " ");
		}

		for (int i = 1; i < arr.length; i++) {
			for (int s = sum; s >= 0; s--) {
				
				if (s >= arr[i]) 
					dp[s] = dp[s - arr[i]];
			}
			for (int k = 0; k < dp.length; k++) {
				System.out.print(dp[k] + " ");
			}
			System.out.println();
		}

		return dp[sum];
	}

	private static boolean subsetDP(boolean[][] dp, int[] arr, int sum) {

		for (int i = 0; i < dp.length; i++)
			dp[i][0] = true;

		for (int s = 1; s <= sum; s++) {
			dp[0][s] = (arr[0] == s ? true : false);
		}

		for (int i = 1; i < dp.length; i++) {
			for (int s = 1; s <= sum; s++) {

				if (dp[i - 1][s]) {
					dp[i][s] = dp[i - 1][s];
				} else if (s >= arr[i]) {
					dp[i][s] = dp[i - 1][s - arr[i]];
				}

			}
		}
		return dp[arr.length - 1][sum];
	}

	@SuppressWarnings("unused")
	private static boolean subSet(Boolean[][] dp, int[] arr, int index, int sum, int total) {

		if (sum > total || index >= arr.length) {
			return false;
		}
		if (sum == total) {
			return true;
		}
		if (dp[index][sum] == null) {
			boolean first = subSet(dp, arr, index + 1, sum + arr[index], total);
			boolean second = subSet(dp, arr, index + 1, sum, total);
			dp[index][sum] = first || second;
		}

		return dp[index][sum];
	}

	@SuppressWarnings("unused")
	private static boolean subSetOneDimension(Boolean[] dp, int[] arr, int index, int sum, int total) {

		System.out.println("SUm is " + sum);
		if (sum > total || index >= arr.length) {
			return false;
		}
		if (sum == total) {
			return true;
		}
		if (dp[sum] == null) {
			boolean first = subSetOneDimension(dp, arr, index + 1, sum + arr[index], total);
			boolean second = subSetOneDimension(dp, arr, index + 1, sum, total);
			dp[sum] = first || second;
		}

		return dp[sum];
	}

}
