public class CountSortedVowelStrings {
    public static void main(String[] args) {
        int target = 6;

        System.out.println(combinationSum4(new int[]{1, 2, 3, 4, 5}, target));
    }

    static int count = 0;

    public static int combinationSum4(int[] nums, int target) {

        if (nums.length == 0)
            return 0;

        backTrackSolution(target, nums, 0);
        System.out.println(count);
        return count;
    }

    public static void backTrackSolution(int size, int[] candidates, int start) {


        if (size == 0) {
            count +=  1;
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            backTrackSolution(size - 1, candidates, i);
            System.out.println(" Size is" + size + " TempList size is " + " Count is " + count);
        }


    }
}
