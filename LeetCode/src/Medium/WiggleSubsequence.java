package Medium;

public class WiggleSubsequence {
    public static void main(String[] args) {

    }

    public static int wiggleMaxLength(int[] nums) {

        int i = 0;
        int sequence = 0, result = 0;
        while (i < nums.length) {
            int diff = nums[i] - nums[i++];
            if (diff == 0) {
                result = Math.max(result, sequence);
                sequence = 0;
            } else if (diff > 0) {
                while (i < nums.length) {
                    if (nums[i] - nums[i++] < 0) {
                        sequence++;
                    } else {
                        sequence = 0;
                    }
                    if (i < nums.length - 1 && nums[i] - nums[i++] > 0) {

                    }
                }

            }
        }
        return 0;
    }

}
