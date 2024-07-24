import java.util.ArrayList;
import java.util.List;

public class PermutationOne {

    public static void main(String[] args) {
        int target = 3;
        System.out.println(combinationSum4(new int[]{1, 3, 3}, target));
        System.out.println("Sum value is " + sum);
    }

    static int sum = 0;

    public static int combinationSum4(int[] nums, int target) {

        if (nums.length == 0)
            return 0;
//        System.out.println(backTrac kSolution(new ArrayList<>(), target, nums));
        backTrackSolution(new ArrayList<>(), target, nums);
        return 9;
    }

    public static void backTrackSolution(List<Integer> tempList, int targetSum, int[] nums) {


        if (targetSum == 0) {
            System.out.println(tempList);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) {
                continue;
            }
            tempList.add(nums[i]);
            backTrackSolution(tempList, targetSum - 1, nums);
            tempList.remove(tempList.size() - 1);
        }

        return ;
    }
}