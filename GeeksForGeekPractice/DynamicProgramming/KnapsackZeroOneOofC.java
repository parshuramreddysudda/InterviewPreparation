package DynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class KnapsackZeroOneOofC {

	public static void main(String[] args) {

		int n = 3;
		int W = 6;
		int val[] = {1,6,10,16 };
		int wt[] = { 1,2,3,5 };
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
					dp2[c] = Math.max(dp1[c], profits[i] + dp1[c - weights[i]]);
				else
					dp2[c] = dp1[c];
			}
			for (int j = 0; j < dp1.length; j++)
				dp1[j] = dp2[j];
		}


		for (int j = 0; j <dp1.length; j++) 
			System.out.print(" " + dp1[j]);
		
		System.out.println();
		for (int j = 0; j <=capacity; j++) 
			System.out.print(" " + dp2[j]);
		
		System.out.println();
		System.out.println(dp2[capacity]);
		
		return dp2[capacity];
	}

}
