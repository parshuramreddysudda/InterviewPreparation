package leetcode.ArraysStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 } };

		List<Integer> list = new ArrayList<Integer>();

		int r1 = 0, r2 = matrix.length - 1;
		int c1 = 0, c2 = matrix[0].length - 1;
		while (r1 <= r2 && c1 <= c2) {
			for (int c = c1; c < c2; c++)
				list.add(matrix[r1][c]);

			for (int r = r1 + 1; r < r2; r++)
				list.add(matrix[r][c2]);

			if (r1 < r2 && c1 < c2) {
				for (int c = c2; c > c1; c--)
					list.add(matrix[r2][c]);

				for (int r = r2; r > r1; r--)
					list.add(matrix[r][c1]);
			}
			r1++;
			c1++;
			r2--;
			c2--;

		}
		System.out.println("Result array is " + Arrays.asList(list));

	}

}
