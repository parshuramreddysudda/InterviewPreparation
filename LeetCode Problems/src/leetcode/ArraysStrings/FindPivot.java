package leetcode.ArraysStrings;

public class FindPivot {

	public static void main(String[] args) {

		int[] nums = { -1, -1, -1, -1, -1, -1, -1, 0 };

		int sum = 0, leftSum = 0;
		for (int num : nums)
			sum += num;
		for (int i = 0; i < nums.length; i++) {
			leftSum += nums[i];
			if (leftSum == sum) {
				System.out.println(i);
				break;
			} else {
				sum -= nums[i];
			}
		}

	}

}
