import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 3, 4, 3, 3, 3, 3, 3};
        System.out.println(maxOperations(arr, 6));

    }

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(" Entry key is" + entry.getKey() + " Entry value is " + entry.getValue());
        }
        int half = k / 2;
        if (map.containsKey(half)) {

            answer = map.get(half) / 2;
            map.put(half, map.get(half) % 2);
            System.out.println(" sum is" + k / 2 % 2);
        }

        System.out.println("Answer is " + map.get(k / 2));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sum = k - entry.getKey();
            if (sum > 0 && entry.getValue() > 0) {

            }
        }
        return 0;
    }
}
