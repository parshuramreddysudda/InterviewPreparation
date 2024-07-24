package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {


    }


    public int singleNumber(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }
        Set<Integer> set=new HashSet<>();
        for (int n:nums){
            if(set.contains(n)){
                set.remove(n);
            }else {
                set.add(n);
            }
        }

        return set.iterator().next();
    }
}
