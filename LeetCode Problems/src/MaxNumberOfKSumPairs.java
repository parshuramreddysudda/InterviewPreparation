import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] arr = new int[]{5,5,5,4,3,3,55,6,7,7,7,89,8,7,6,5,3,2,2,4,5,6,8,8,9,9,9,7,4,3,4,56,7,8,9};
        System.out.println("Result is"+maxOperations2(arr, 19));

    }

    public static int maxOperations2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<k) {
                if (map.containsKey(k-nums[i]) && map.get(nums[i])>0) {
                    answer++;
                    map.put(nums[i], map.get(nums[i]) - 1);
                } else {
                    map.put(nums[i], map.getOrDefault(nums[i],0)+1);
                }
            }
        }
        return  answer;
    }

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<k) {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(" Entry key is" + entry.getKey() + " Entry value is " + entry.getValue());
        }
        int half = k / 2;
        if (k%2==0 && map.containsKey(half)) {
            answer = map.get(half) / 2;
            map.put(half, map.get(half) % 2);
            System.out.println(" Sum is" + k / 2 % 2);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(" Entry key is" + entry.getKey() + " Entry value is " + entry.getValue());
        }
        System.out.println("Answer is " + answer);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sum = k - entry.getKey();
            if (entry.getValue() > 0 && map.containsKey(sum) && entry.getKey()!=sum && map.get(sum)>0) {
                System.out.println("Sum value is "+sum+" For loop Entry key is" + entry.getKey() + " Entry value is " + entry.getValue()+" Answer is "+answer);
                    answer+=Math.min(entry.getValue(),map.get(sum));
                map.put(entry.getKey(), 0);
                map.put(sum,0);
            }
        }
        return answer;
    }
}
