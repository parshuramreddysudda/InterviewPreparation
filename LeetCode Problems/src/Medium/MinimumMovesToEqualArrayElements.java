package Medium;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {

    public static void main(String[] args) {

        System.out.println(minMoves2(new int[]{23,423,5,34,5,4,6,5,7,657,65,7,45,6,34,6}));
    }

   static public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int sum=nums[(nums.length-1)/2];
       int result=0;
       for (int num : nums)
           result += (Math.abs(sum - num));

       return result;
}
}
