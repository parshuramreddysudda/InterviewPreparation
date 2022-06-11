package HashMap;

import java.util.*;

public class CombinationWithOtherAlgorithms {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 3, 4}, new int[]{3, 2, 4, 1, 5, 3})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> hashSet=new HashSet<>();
        for (int j : nums1) {
            hashSet.add(j);
        }
        ArrayList<Integer> result=new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            if(hashSet.contains(nums2[i]) && !(result.contains(nums2[i]))){
                result.add(nums2[i]);
            }
        }

        int [] arr = new int[result.size()];
        for(int i = 0;i < arr.length;i++)
            arr[i] = result.get(i);

        return arr;
    }
}
