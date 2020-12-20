package DynamicProgramming;

public class CoinChange {

	public static void main(String[] args) {

		int W = 7;
		int denomaination[] = { 1, 2, 3 };
		int[][] dp = new int[denomaination.length][W + 1];

//		System.out.println("Value is " + knapSack(denomaination, 0, W));
		System.out.println("Dynamic Programming Value is " + dynamicProgramming2D(denomaination, W));

	}

	@SuppressWarnings("unused")
	private static int knapSack(int[] den, int index, int total) {

		if (total == 0)
			return 0;

		if (total < 0 || index >= den.length)
			return Integer.MAX_VALUE;

		int sum1 = Integer.MAX_VALUE, sum2 = 0;
		if (total >= den[index]) {

			int res = knapSack(den, index, total - den[index]);
			if (res != Integer.MAX_VALUE) {
				sum1 = res + 1;
			}
		}
		sum2 = knapSack(den, index + 1, total);
		return Math.min(sum1, sum2);

	}

	static int dynamicProgramming2D(int[] den, int total) {

		int dp[][] = new int[den.length][total + 1];
		int n = den.length;

		for (int i = 0; i < n; i++)
			for (int j = 0; j <= total; j++)
				dp[i][j] = Integer.MAX_VALUE; 
		for (int i = 0; i < den.length; i++)
			dp[i][0] = 0;

		for (int i = 0; i < n; i++) {
			for (int t = 1; t <= total; t++) {
				if (i > 0)
					dp[i][t] = dp[i - 1][t];
				if (t >= den[i]) {
					if (dp[i][t - den[i]] != Integer.MAX_VALUE)
						dp[i][t] = Math.min(dp[i][t], dp[i][t - den[i]] + 1); // include the coin
				}
			}
		}
		pritnArray(dp);

		return dp[den.length - 1][total];
	}

	@SuppressWarnings("unused")
	private static void pritnArray(int[][] dp) {

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

	}

}
