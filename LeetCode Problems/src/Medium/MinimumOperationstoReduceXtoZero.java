package Medium;

public class MinimumOperationstoReduceXtoZero {
    public static void main(String[] args) {

        System.out.println(minOperations(new int[]{3,2,20,1,1,3}, 10));
    }

    public static int minOperations(int[] nums, int x) {

        int start = 0, last = nums.length - 1;
        int count = 0;
        while (x > 0 && start <=last) {

            if ((nums[start] > nums[last] || nums[start]==x) && x - nums[start] >= 0) {
                System.out.println(" Start is " + start + " Nums is " + nums[start]);
                System.out.println(" Last is " + last + " Nums is " + nums[last]);
                x -= nums[start++];
            } else if (x - nums[last] >= 0) {
                System.out.println(" Start is " + start + " Nums is " + nums[start]);
                System.out.println(" Last is " + last + " Nums is " + nums[last]);
                x -= nums[last--];
            } else {
                System.out.println(" Start is " + start + " Nums is " + nums[start]);
                System.out.println(" Last is " + last + " Nums is " + nums[last]);
                System.out.println(" X value is " + x);
                return -1;
            }
            count++;
        }
        System.out.println(" COunt value is " + count);
        if (x > 0)
            return -1;
        return count;
    }
}
