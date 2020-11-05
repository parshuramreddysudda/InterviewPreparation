import java.util.Iterator;
import java.util.PriorityQueue;

public class FIndThirdMax {

	public static void main(String[] args) {

		int[] arr = { 4,5,6,8,6,8,1,5,14,6 };
		System.out.println(findThirdMax(arr));

	}

	private static int findThirdMax(int[] nums) {

		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!pq.contains(nums[i])&&pq.size()<3) {
				pq.offer(nums[i]);
				continue;
			}
			else if(pq.peek()<nums[i]&&!pq.contains(nums[i])) {
				pq.poll();
				pq.add(nums[i]);
			}
		}
		return pq.poll();
	}

}
