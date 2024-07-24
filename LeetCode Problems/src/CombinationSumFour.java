import java.util.ArrayList;
import java.util.List;

public class CombinationSumFour {
    public static void main(String[] args) {
        int target = 4;
        System.out.println(combinationSum4(new int[]{1,2,3}, target));
        System.out.println("Sum value is "+sum);
    }
static int  sum=0;
    public static int combinationSum4(int[] nums, int target) {

        if (nums.length == 0)
            return 0;

        return backTrackSolution(new ArrayList<>(),target, nums, 0);
    }

    public static int backTrackSolution(List<Integer> tempList,int targetSum, int[] nums, int count) {


        if (targetSum < 0)
            return 0;

        if (targetSum == 0) {
            sum+=1;
            System.out.println(tempList);
            return 1;
        }

        for (int i = 0; i < nums.length; i++) {
//            tempList.add(nums[i]);
            System.out.println(" Target is" + targetSum + " Count is " + count);
            count += backTrackSolution(tempList,targetSum - nums[i], nums, count);
//            tempList.remove(tempList.size()-1);
        }
        return count;

    }
}
