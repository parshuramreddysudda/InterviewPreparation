package Hard;

import java.util.Collections;
import java.util.PriorityQueue;

public class BestTimeToSell3 {
    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
    }
    public static int maxProfit(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>( Collections.reverseOrder());
        int min = nums[0], totalProfit = 0;
        int pos = 1, max = -1;
        while (pos < nums.length) {
            if (nums[pos] < min)
                min = nums[pos];
            while (pos < nums.length &&( min < nums[pos] ||max < nums[pos]) )
                max = nums[pos++];

            totalProfit=max-min;
            pq.add(totalProfit);
            max = -1;
            if (pos<nums.length) min = nums[pos];
            pos++;
        }
        int count=3;
        totalProfit=0;
        System.out.println(pq);
        while (!pq.isEmpty() && count-->0){
            totalProfit+=pq.poll();
             System.out.println("Total is"+totalProfit);
            count--;
        }

        return totalProfit;
    }
}
