package DynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class KnapsackZeroOne {

	public static void main(String[] args) {

		int n = 3;
		int W = 5;
		int val[] = { 3, 2, 3, 4, 3 };
		int wt[] = { 1, 2, 4, 5, 2 };
		int[][] dp = new int[val.length][W + 1];

		knapSack(W, wt, val);

		System.out.println("Value is " + dp[wt.length - 1][W]);

	}

	static int knapSack(int capacity, int weights[], int profits[]) {
		int n = profits.length;
		int[] dp1 = new int[capacity + 1];
		int[] dp2 = new int[capacity + 1];
		for (int i = 0; i <= capacity; i++) {
			dp1[i] = weights[0] <= i ? profits[0] : 0;
		}

		
		for (int i = 1; i < n; i++) {
			for (int c = 1; c <= capacity; c++) {
				if (weights[i] <= c)
					dp1[i][c] = Math.max(dp[i - 1][c], profits[i] + dp[i - 1][c - weights[i]]);
				else
					dp2[i][c] = dp1[i - 1];
			}
		} 
		int c = capacity;
		Set<Integer> set = new HashSet<Integer>();
		int totalProfit = dp[n - 1][capacity];

		for (int i = dp.length - 1; i > 0; i--) {

			if (c == 0 || dp[i][c] != dp[i - 1][c]) {
				set.add(i + 1);
				c -= weights[i];
				totalProfit -= profits[i];
			}
		}
		System.out.println("Capacity is "+c);
		if (totalProfit != 0)
			set.add(1);

		System.out.println("set:" + set);

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(" " + dp[i][j]);
			}
			System.out.println();
		}

		return dp[n - 1][capacity];
	}

}
