
public class MaxLengthOfPositiveSubArray {

	public MaxLengthOfPositiveSubArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[] nums = { 1,2,3,5,-6,4,0,10};
		int positive = 0, negative = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				positive++;
			} else if (nums[i] < 0) {
				negative++;
			}
		}
		if (negative % 2 == 0) {
			System.out.print(positive+negative);
		} else {
			System.out.print(positive + negative - 1);
		}

	}

}
