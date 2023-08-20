package educative.ModifiedBinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        System.out.println( binarySearchRotated(new ArrayList<>(Arrays.asList(4, 5, 6, 1, 2, 3)),3));
        int[][] inputs = {
                {1, 2, 2, 3, 3, 4, 4},
                {1, 1, 2, 2, 3, 4, 4, 5, 5},
                {1, 1, 2, 3, 3},
                {1, 1, 2},
                {0, 2, 2, 3, 3, 4, 4, 5, 5}
        };
        for (int i = 0; i < inputs.length; i++) {
            System.out.print(i + 1);
            System.out.println(".\tInput array: " + Arrays.toString(inputs[i]));
            System.out.println("\n\tSingle element found: " + singleNonDuplicate(inputs[i]));
//            System.out.println(PrintHyphens.repeat("-", 100));
        }
    }


    private static int singleNonDuplicate(int[] nums) {

        int left=0,right=nums.length-1;
        int mid=0;
        while(left<right){
            mid=(left+right)/2;
            if(mid%2!=0)
                mid--;
            if(nums[mid]==nums[mid+1]){
                left=mid+2;
            }else {
                right=mid-1;
            }
        }


        return nums[left];
    }


    public static int binarySearchRotated(List<Integer> nums, int target) {

        // Replace this placeholder return statement with your code
        int left=0,right=nums.size()-1,mid=0;

        while(left<=right){
            mid=(left+right)/2;
            if(nums.get(mid)==target)
                return mid;
            else if (nums.get(left)<nums.get(right)) {
                if (target < nums.get(mid))
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {
                if (nums.get(left)>target)
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return -1;
    }
}
