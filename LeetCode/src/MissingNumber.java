import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{100,103,102,104}));
    }

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
            if (nums[i] + 1 != nums[i + 1])
                return nums[i] + 1;
        return -1;
    }
}
