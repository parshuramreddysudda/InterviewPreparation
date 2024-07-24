import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int k = 3, n = 9;
        int target = 7;
        System.out.println(combinationSum(new int[]{1,2,3}, 3));
    }

    static List<List<Integer>> mainList = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        if (candidates.length == 0)
            return mainList;

        backTrackSolution(new ArrayList<Integer>(), target, candidates, 0);
        System.out.println("LIst size is " + mainList.size());
        return mainList;
    }

    public static void backTrackSolution(List<Integer> tempList, int targetSum, int[] candidates, int start) {


        if (targetSum < 0)
            return;

        if (targetSum == 0) {
            mainList.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            backTrackSolution(tempList, targetSum - candidates[i], candidates, i);
            System.out.println(" Target is" + targetSum + " TempList size is " + tempList.size());
            tempList.remove(tempList.size() - 1);
        }

    }

    private static void combinationSum(int[] candidates, int startIndex, int target, List<Integer> subResult, List<List<Integer>> result) {
        if (target < 0) {
            return; // No combination is possible
        }
        if (target == 0) {
            result.add(new ArrayList<>(subResult)); // If target is reached, add this combination to result
        }
        /**
         * Use startIndex so that same candidate values are not picked again
         * Without startIndex, if we use 0, we will get permutations,
         * i.e. repeat of same combinations but in different orders. Try it
         */
        for (int i = 0; i < candidates.length; i++) {
            subResult.add(candidates[i]);
            combinationSum(candidates, i, target-1, subResult, result);
            subResult.remove(subResult.size() - 1); // Backtrack, remove the last element added
        }
    }
}
