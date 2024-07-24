package Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 6, 3, 200, 4, 1, 2}));
    }

    public static int longestConsecutive(int[] nums) {

        int longestConsecutive = 1, maxSize = 1;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        for (Integer value : treeSet) {
            if (treeSet.contains(value + 1))
                maxSize++;
            else {
                longestConsecutive = Math.max(longestConsecutive, maxSize);
                maxSize = 1;
            }
        }
        System.out.println(treeSet);
        return longestConsecutive;
    }
}
