package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortColours {
    public static void main(String[] args) {
        List<int[]> list=new ArrayList<>();
        list.add(new int[]{1,2,4});
        System.out.println(Arrays.toString(sortColours(new int[]{2,0,2,1,1,0})));
    }

    private static int[] sortColours(int[] nums) {

        if (nums.length == 0 || nums.length == 1)
            return nums;

        int zero = 0;
        int one = 0;
        int two = nums.length - 1;
        while(one<=two){
            if(nums[one]==0){
                nums[one++]=nums[zero];
                nums[zero++]=0;
            }
            else if (nums[one]==1){
                one++;
            }
            else {
                nums[one]=nums[two];
                nums[two--]=2;
            }
        }

        return nums;
    }


}
