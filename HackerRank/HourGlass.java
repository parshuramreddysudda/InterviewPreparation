
public class HourGlass {

	public static void main(String[] args) {

		int[][] arr = { { -1, -1, 0, -9, -2, -2 }, 
				{ -2, -1, -6, -8, -2, -5 }, 
				{ -1, -1, -1, -2, -3, -4 },
				{ -1, -9, -2, -4, -4, -5 }, 
				{-7 ,-3 ,-3 ,-2, -9, -9},
				{ -1, -3, -1, -2, -4, 5 } };
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				max = Math.max(max, checkHourGlass(arr, i, j));
			}
		}
		System.out.println("Max input is" + max);

	}

	private static int checkHourGlass(int[][] arr, int i, int j) {

		int sum = 0;
		for (int k = 0; k < 3; k++) {
			sum += arr[i + k][j + 0] + arr[i + k][j + 1] + arr[k + i][2 + j];
		}
		sum -= arr[i + 1][j] + arr[i + 1][j + 2];

		return sum;
	}

}
