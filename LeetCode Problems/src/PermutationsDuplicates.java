import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationsDuplicates {

    public static void main(String[] args) {
        int target = 3;
        System.out.println(combinationSum4(new int[]{1, 1, 2}, target));
        System.out.println("Sum value is " + sum);
    }

    static int sum = 0;

    public static int combinationSum4(int[] nums, int target) {

        HashSet<ArrayList<Integer>> set=new HashSet<>();
        backTrackSolution(set, new ArrayList<>(), target, nums);
        List<List<Integer>> mainList = new ArrayList<List<Integer>>(set);
        System.out.println(mainList);
        return 9;
    }

    public static void backTrackSolution(HashSet<ArrayList<Integer>> mainList, List<Integer> tempList, int targetSum, int[] nums) {


        if (targetSum == 0) {
            List<Integer> list = new ArrayList<>();
            for (Integer i : tempList) {
                list.add(nums[i]);
            }
            mainList.add(new ArrayList<>(list));
            System.out.println(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(i)) {
                continue;
            }
            tempList.add(i);
            System.out.println(" Target is" + targetSum);
            backTrackSolution(mainList,tempList, targetSum - 1, nums);
            tempList.remove(tempList.size() - 1);
        }

    }
}