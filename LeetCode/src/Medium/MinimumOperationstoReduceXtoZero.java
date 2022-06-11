package Medium;

public class MinimumOperationstoReduceXtoZero {
    public static void main(String[] args) {

        System.out.println(minOperations(new int[]{3,2,20,1,1,3}, 10));
    }

    public static int minOperations(int[] nums, int x) {

        int start = 0, last = nums.length - 1;
        int count = 0;
        while (x > 0 && start <= last) {
            System.out.println(" X value is " + x);
            if (nums[start] > nums[last] && x - nums[start] > 0) {
                System.out.println(" Start is " + start + " Nums is " + nums[start]);
                System.out.println(" Last is " + last + " Nums is " + nums[last]);
                start++;
                x -= nums[start++];
                count++;
            } else if(x - nums[last] >= 0) {
                x -= nums[last--];
                count++;
            }
        }
        if (x != 0)
            return -1;
        System.out.println(" COunt value is " + count);
        return 0;
    }
}
