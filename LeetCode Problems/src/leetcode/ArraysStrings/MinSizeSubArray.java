package leetcode.ArraysStrings;

public class MinSizeSubArray {

	public static void main(String[] args) {

		int nums[] = { 1,1,1,1,1,1,2,2,4,5,6,3,5,4,5,1,3,6,4 };
		int s = 7;
		int start = 0, end = 0;
		int length = nums.length;
		int arrSum = 0, minLen = Integer.MAX_VALUE;
		while (start < length) {

			if (arrSum >= s) {
				System.out.println("Sum is  " + arrSum + " Start is " + start + " End is " + end);
				minLen = Math.min(minLen, end - start);
				arrSum -= nums[start++];
			} else if (end == length) {
				arrSum -= nums[start++];
			} else {
				arrSum += nums[end++];
			}

		}
		System.out.println("Min Length is " + minLen);

	}

}
