package leetcode.ArraysStrings;

public class DiagonalTraverse {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 5 }, { 4, 5, 8, 6 }, { 7, 8, 0, 9 }, { 1, 2, 3, 4 } };
		int i = 0, j = 0;
		System.out.println(matrix.length);
		while (i < matrix.length && j < matrix[0].length) {
			System.out.println("Executed;");
			j = 0;
			while (i >= 0 && j < matrix[0].length) {
				System.out.println("Second I value is " + i-- + " J value is " + j++);
			}
			i = 0;
			while (j >= 0 && i < matrix.length) {
				System.out.println("First I value is " + (i++) + " J value is " + j--);
			}

		}
	}

}
