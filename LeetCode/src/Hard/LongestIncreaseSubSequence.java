package Hard;

import java.util.*;

class Longest {

    public static int lisLength(int[] nums) {
        int length = nums.length;
        // create a table
        int[][] dp = new int[length + 1][length + 2];
        for (int i = 0; i < length + 1; i++) {
            for (int j = 0; j < length + 2; j++) {
                dp[i][j] = -1;
            }
        }
        return lisLengthRec(nums, 0, -1, dp);
    }

    private static int lisLengthRec(int[] nums, int curr, int prev, int[][] dp) {
        // base case
        // if 'curr' reaches the end of the array, return 0
        if (curr == nums.length) {
            return 0;
        }

        // if subproblem has already been solved, use the stored result
        if (dp[curr][prev + 1] != -1) {
            return dp[curr][prev + 1];
        }

        // solve the first subproblem
        int length = lisLengthRec(nums, curr + 1, prev, dp);

        // solve the second subproblem
        if (prev < 0 || nums[prev] < nums[curr]) {
            length = Math.max(length, 1 + lisLengthRec(nums, curr + 1, curr, dp));
        }
        dp[curr][prev + 1] = length; // store the result of the current subproblem
        return dp[curr][prev + 1];
    }

    // driver code
    public static void main(String args[]) {

        int[][] arrays = {
                {10, 9, 2, 5, 3, 7, 101, 18},
                {7, 7, 7, 7, 7, 7, 7},
                {0, 1, 0, 3, 2, 3},
                {3, 2},
                {6, 9, 8, 2, 3, 5, 1, 4, 7},
                {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15},
                {9, 2, 5, 3, 6, 14, 11, 7, 9, 5, 13, 3, 15, 0, 8, 4, 1, 9, 5, 13, 3, 11, 7, 15, 0, 10, 6, 14, 9, 2, 5, 3, 2, 10, 6, 10, 6, 5, 13, 3, 11, 7, 15, 3, 11, 7, 15}
        };

        //  Let's uncomment the below lines and check the effect of dynamic programming using memoization

        // int[] newArray = {72, 56, 13, 33, 4, 5, 53, 14, 71, 42, 5, 74, 60, 15, 68, 42,
        //                   56, 58, 67, 32, 65, 75, 47, 29, 86, 32, 77, 39, 19, 54, 54, 18, 49, 34,
        //                   89, 85, 63, 86, 90, 53, 35, 2, 65, 63, 90, 26, 39, 41, 38, 32, 21, 35, 51,
        //                   34, 50, 27, 51, 94, 70, 94, 18, 89, 45, 40, 13, 56, 25, 59, 51, 6, 59, 56,
        //                   41, 44, 23, 26, 83, 8, 0, 33, 59, 43, 83, 40, 24, 86, 28, 2, 23, 87, 11,
        //                   23, 13, 48, 20, 64, 21, 93, 8, 70, 33, 48, 10, 29, 24, 59, 92, 23, 67, 79,
        //                   54, 7, 56, 5, 2, 63, 88, 58, 60, 95, 54, 7, 56, 5, 2, 63, 88, 58, 60, 95, 54, 7,
        //                   56, 5, 2, 63, 88, 58, 60, 95, 54, 7, 56, 5, 2, 63, 88, 58, 60, 95};
        // arrays = Arrays.copyOf(arrays, arrays.length + 1);
        // arrays[arrays.length - 1] = newArray;

        for (int i = 0; i < arrays.length; i++) {
            System.out.println((i + 1) + ".\tInput array: "+ Arrays.toString(arrays[i]));
            System.out.println("\tLength of LIS is: " + lisLength(arrays[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

}