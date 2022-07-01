package Medium;

import java.util.*;

public class MaximumErasureValue {
    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[]{187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434}));

//        3, 4, 5, 5, 5, 5, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1, 4, 6
    }

    public static int maximumUniqueSubarray(int[] nums) {

        Set<Integer> hashset = new HashSet<>();
        int max = 0, count = 0;
        int left = 0, right = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hashset.contains(nums[i])) {
                System.out.println("Before Queue ");
                System.out.println(Arrays.toString(hashset.toArray()));
                while (!hashset.isEmpty() && nums[i] != nums[left]) {
                    System.out.println("Array value "+nums[left]);
                    hashset.remove(nums[left]);
                    count -= nums[left++];
                }
                System.out.println("After queue");
                System.out.println(Arrays.toString(hashset.toArray()));
                right++;
            }
           else{
                hashset.add(nums[right]);
                right++;
                count += nums[i];
            }
            max = Math.max(max, count);
            System.out.println(" max value is "+max+" Count is "+count+" i values is "+nums[i]);

        }
        System.out.println(max);
        return 0;
    }
}
