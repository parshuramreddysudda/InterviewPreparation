import java.util.Iterator;
import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {

		int[] nums = { 3,2,3,1,2,4,5,5,6 };
		int k = 4;

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for (int n : nums) {

			if (queue.size() == k) {
				if (queue.peek() < n) {
					queue.poll();
					queue.add(n);
				}
			} else {
				queue.add(n);
			}
		}
		Iterator it = queue.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		System.out.println("Peek Element is " + queue.peek());
		System.out.println(k + "th Largest element is " + queue.poll());

	}

}
