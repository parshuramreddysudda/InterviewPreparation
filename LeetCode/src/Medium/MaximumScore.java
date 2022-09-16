package Medium;

import java.util.Arrays;

public class MaximumScore {
    public static void main(String[] args) {

        System.out.println(maximumScore(new int[]{-5, -3, -3, -2, 7, 1}, new int[]{-10, -5, 3, 4, 6}));
    }

    public static int maximumScore(int[] nums, int[] multipliers) {

        Arrays.sort(nums);
        Arrays.sort(multipliers);
        System.out.println(Arrays.toString(multipliers));
        int multiEnd = multipliers.length - 1, numEnd = nums.length - 1;
        int sum = 0, numStart = 0, multStart = 0;

        while (multiEnd > 0 && numEnd > 0 && numStart <nums.length && multStart>multipliers.length) {

            System.out.println(" Num start is" + numStart+" Multiend is"+multiEnd);
            int rearSum = multipliers[multiEnd] * nums[numStart];
            int frontSum = multipliers[multiEnd] * nums[numEnd];

            System.out.println("Rear Sum is"+rearSum+" FrontSUm is"+frontSum+" Total Sum"+ sum);
            if (rearSum > frontSum) {
                numStart++;
                sum += rearSum;
            } else {
                numEnd--;
                sum += frontSum;
            }
            multiEnd--;
        }
        System.out.println(sum);

        return 9;
    }
        public int maximumScore2(int[] nums, int[] multipliers) {
            // For Right Pointer
            int n = nums.length;
            // Number of Operations
            int m = multipliers.length;
            int[] dp = new int[m + 1];

            for (int op = m - 1; op >= 0; op--) {
                int[] next_row = dp.clone();
                // Present Row is now next_Row because we are moving upwards
                for (int left = op; left >= 0; left--) {
                    dp[left] = Math.max(multipliers[op] * nums[left] + next_row[left + 1],
                            multipliers[op] * nums[n - 1 - (op - left)] + next_row[left]);
                }
            }

            return dp[0];
        }
}
