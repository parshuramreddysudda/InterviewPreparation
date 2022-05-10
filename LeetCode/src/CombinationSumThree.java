import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumThree {
    public static void main(String[] args) {
        int k = 3, n = 9;
        System.out.println(combinationSum3(k, n));
    }

    static List<List<Integer>> mainList = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combinationSum3(int k, int n) {

        if (k > n)
            return mainList;

        backTrackSolution(new ArrayList<Integer>(), k, 0, n, 1);
        System.out.println("LIst size is " + mainList.size());
        return mainList;
    }

    public static void backTrackSolution(List<Integer> tempList, int k, int size, int targetSum, int start) {


        if (targetSum == 0 && k == size) {
            mainList.add(new ArrayList<>(tempList));
            return;
        } else if (k < size)
            return;

        else {
            for (int i = start; i < 10; i++) {
                if (i <= targetSum) {
                    tempList.add(i);
                    backTrackSolution(tempList, k, size + 1, targetSum - i, i + 1);
                    System.out.println(" Target is" + targetSum + " Size is " + size + " TempList size is " + tempList.size());
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

}
