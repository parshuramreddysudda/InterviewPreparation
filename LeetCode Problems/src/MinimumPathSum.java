
public class MinimumPathSum {

	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int rows = grid.length;
		int cols = grid[0].length;
		int[][] dp = new int[rows][cols];

//	        Rows Sum
		int rowSum = 0;

		for (int i = rows - 1; i >= 0; i--) {
			rowSum += grid[i][cols - 1]; // grid[rowIndex][colIndex]
			dp[i][cols - 1] = rowSum;
		}

		int colSum = 0;
		for (int i = cols - 1; i >= 0; i--) {
			colSum += grid[rows - 1][i];
			dp[rows - 1][i] = colSum;
		}

		for (int i = rows - 2; i >= 0; i--) {
			for (int j= cols - 2; j >= 0; j--) {
//				if(i==0)
				dp[i][j]=Math.min(dp[i+1][j], dp[i][j+1])+grid[i][j];
			}
		}
	}

}
