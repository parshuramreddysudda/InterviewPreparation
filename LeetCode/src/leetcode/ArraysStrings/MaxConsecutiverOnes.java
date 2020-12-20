package leetcode.ArraysStrings;

public class MaxConsecutiverOnes {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1, 0 };
		int start = 0, end = 0;
		int length = nums.length;
		int result = 0;
		while (start < length) {

			while (end < length) {
				if (nums[end] == 1) 
					end++;
				else
					break;
			}
			result = Math.max(result, end - start);
			start = end;
			start++;
			end++;
		}
		System.out.println("Result is" + result);

	}

}
