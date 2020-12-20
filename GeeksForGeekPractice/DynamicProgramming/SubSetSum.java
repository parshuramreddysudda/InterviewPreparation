package DynamicProgramming;

public class SubSetSum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5 };
		int sum = 0;
		for (int s : arr) {
			sum += s;
		}

		boolean[] dp1 = new boolean[sum + 1];
		boolean[] dp2 = new boolean[sum + 1];
//			System.out.println(subSet(dp, arr, 0, 0, sum / 2));
		System.out.print(subsetDPWithOneArrayBoolean(arr));

		for (int i = 0; i < dp1.length; i++) {
//			System.out.println(dp2[i]);
		}

	}

	private static boolean subsetDPWithOneArrayBoolean(int[] arr) {
		int sum = 0;
		for (int s : arr) {
			sum += s;
		}
		boolean[] dp = new boolean[sum + 1];

		for (int i = 0; i < dp.length; i++)
			dp[i] = (i <= arr[0] ? true : false);

		for (int i = 1; i < arr.length; i++) {
			for (int s = sum; s >= 0; s--) {
//				System.out.println("I value is "+i);
				if (s >= arr[i])
					dp[s] = dp[s - arr[i]];
			}
		}

		return dp[sum];
	}

	private static boolean subsetDP(boolean[] dp1, boolean[] dp2, int[] arr, int sum) {

		for (int i = 0; i < dp1.length; i++)
			dp1[i] = (i <= arr[0] ? true : false);

		for (int i = 0; i < dp1.length; i++) {
			for (int s = 0; s < dp2.length; s++) {
				if (dp1[s]) {
					dp2[s] = dp1[s];
				} else if (s >= arr[i]) {
					dp2[s] = dp1[s - arr[i]];
				}
			}
			for (int k = 0; k < dp1.length; k++)
				dp1[k] = dp2[k];
		}

		return dp2[sum];
	}

}
