package DynamicProgramming;

public class EqualSubSet {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5,3 };
		int sum = 0;
		for (int s : arr) {
			sum += s;
		}
		if (sum % 2 != 0)
			System.out.println("Not found");
		else {
			Boolean[][] dp = new Boolean[arr.length][sum + 1];
			System.out.println(subSet(dp, arr, 0, 0, sum / 2));
		}

	}

	private static boolean subSet(Boolean[][] dp, int[] arr, int index, int sum, int total) {

		System.out.println("SUm is " + sum);
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
