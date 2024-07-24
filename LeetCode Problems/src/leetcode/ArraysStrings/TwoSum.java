package leetcode.ArraysStrings;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 5, 7, 8, 90 };
		int target = -100;

		System.out.println(Arrays.toString(findNums(numbers, target)));
	}

	private static int[] findNums(int[] numbers, int target) {

		int start = 0, end = numbers.length - 1;
		while (start < end) {
//			System.out.println(start + " " + end);
			if (target == numbers[start] + numbers[end]) {
				System.out.println(start + " result " + end);
				return new int[] { start, end };
			} else if (target > numbers[start] + numbers[end]) {
				start++;
			} else {
				end--;
			}
		}
		return new int[] { 0 };
	}

}
