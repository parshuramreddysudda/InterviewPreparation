package DynamicProgramming;

public class UnboundKanpSack {

	public static void main(String[] args) {

		int W = 5;
		int val[] = { 2,6,7,10,13 };
		int wt[] = { 1,2,3,4,5 };
		int[][] dp = new int[val.length][W + 1];

		System.out.println("Value is " + knapSack(wt, val, 0, W));
		System.out.println("Dynamic Programming Value is " + dynamicProgramming2D(wt, val, W));

	}

	static int dynamicProgramming2D(int[] wt, int[] val, int capacity) {

		Integer dp[][] = new Integer[wt.length][capacity + 1];
		for (int i = 0; i < wt.length; i++)
			dp[i][0] = 0;

		for (int i = 0; i <= capacity; i++)
			dp[0][i] = val[0] * i;

		for (int i = 1; i < wt.length; i++) {
			for (int c = 1; c <= capacity; c++) {
				if (c < wt[i])
					dp[i][c] = dp[i - 1][c];
				else {
					dp[i][c] = Math.max(dp[i - 1][c], dp[i][c - wt[i]] + val[i]);
				}
			}
		}
		pritnArray(dp);

		return dp[wt.length-1][capacity];
	}

	@SuppressWarnings("unused")
	private static void pritnArray(Integer[][] dp) {

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int knapSack(int[] wt, int[] val, int index, int capacity) {

		if (index >= wt.length || capacity <= 0)
			return 0;

		int profit1 = 0, profit2 = 0;
		if (wt[index] <= capacity) {
			profit1 = val[index] + knapSack(wt, val, index, capacity - wt[index]);
		}
		profit2 = knapSack(wt, val, index + 1, capacity);

		return Math.max(profit1, profit2);
	}

}
