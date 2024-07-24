package Hard;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static List<Integer> findLIS(int[] arr) {
        int n = arr.length;
        int[] lisLength = new int[n];
        int[] previousIndex = new int[n];

        Arrays.fill(lisLength, 1);
        Arrays.fill(previousIndex, -1);

        int maxLength = 1;
        int endingIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lisLength[i] < lisLength[j] + 1) {
                    lisLength[i] = lisLength[j] + 1;
                    previousIndex[i] = j;
                }
            }

            if (lisLength[i] > maxLength) {
                maxLength = lisLength[i];
                endingIndex = i;
            }
        }

        List<Integer> lis = new ArrayList<>();
        while (endingIndex != -1) {
            lis.add(arr[endingIndex]);
            endingIndex = previousIndex[endingIndex];
        }

        // Reverse the LIS to get the increasing order
        List<Integer> reversedLIS = new ArrayList<>();
        for (int i = lis.size() - 1; i >= 0; i--) {
            reversedLIS.add(lis.get(i));
        }

        return reversedLIS;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        List<Integer> lis = findLIS(arr);

        System.out.println("Longest Increasing Subsequence: " + lis);
    }


}
