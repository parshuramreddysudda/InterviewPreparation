package Medium;

public class BestTimeToSell2 {
    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
//    expected to be 2

    public static int maxProfit(int[] nums) {
        int min = nums[0], totalProfit = 0;
        int pos = 1, max = -1;
        while (pos < nums.length) {
            if (nums[pos] < min)
                min = nums[pos];
            while (pos < nums.length && max < nums[pos])
                max = nums[pos++];

            totalProfit+=max-min;
            max = -1;
            if (pos<nums.length) min = nums[pos];
            pos++;
        }

        return totalProfit;
    }
}
