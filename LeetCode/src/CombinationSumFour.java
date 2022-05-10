import java.util.ArrayList;
import java.util.List;

public class CombinationSumFour {
    public static void main(String[] args) {
        int target = 10;
        System.out.println(combinationSum4(new int[]{4, 2, 1}, target));
    }

    public static int combinationSum4(int[] nums, int target) {

        if (nums.length == 0)
            return 0;

        return backTrackSolution(target, nums, 0);
    }

    public static int backTrackSolution(int targetSum, int[] candidates, int count) {


        if (targetSum < 0)
            return 0;

        if (targetSum == 0) {
            return count + 1;
        }

        for (int i = 0; i < candidates.length; i++) {
            count += backTrackSolution(targetSum - candidates[i], candidates, count);
            System.out.println(" Target is" + targetSum + " TempList size is " + " Count is " + count);
        }
        return count;

    }
}
