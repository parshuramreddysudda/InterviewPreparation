package educative.backtracking;

import java.util.Arrays;
import java.util.PriorityQueue;

public class JumpGame1 {
    public static void main(String[] args) {
        int[][] nums = {
                {3, 2, 2, 0, 1, 4},
                {2, 3, 1, 1, 9},
                {3, 2, 1, 0, 4},
                {0},
                {1},
                {4, 3, 2, 1, 0},
                {1, 1, 1, 1, 1},
                {4, 0, 0, 0, 1},
                {3, 3, 3, 3, 3},
                {1, 2, 3, 4, 5, 6, 7}
        };
        for (int i = 0; i < nums.length; i++) {
            System.out.println((i + 1) + ".\tInput array: " + Arrays.toString(nums[i]));
            if (jumpGame(nums[i]))
                System.out.println("\tCan we reach the very last index? True");
            else
                System.out.println("\tCan we reach the very last index? False");
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

    public static boolean jumpGame(int[] nums) {

        int target=nums.length-1;
        int steps=1;
        for (int i=nums.length-2;i>=0;i--){
            while(nums[i]-steps<0) {
                steps++;
                i--;
                if(i<0)
                    return false;
            }
            steps=1;
        }

        return true;
    }
}
