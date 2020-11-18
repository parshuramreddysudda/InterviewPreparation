import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int[] nums = {1,1,1,2,2,3};
		int k = 2, repeat = 0;

		for (int n : nums) {
			repeat = hash.getOrDefault(n, 0);
			hash.put(n, repeat + 1);
		}
		PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
				(a, b) -> (a.getValue() == b.getValue() ? Integer.compare( b.getKey(),a.getKey())
						: Integer.compare( b.getValue(),a.getValue())));
		for(Map.Entry<Integer, Integer> entry:hash.entrySet()) {
			queue.offer(entry);
		}
		int[] arr=new int[k];
		for(int i=0;i<k;i++) {
			arr[i]=queue.poll().getKey();
		}
		
		for(int i=0;i<k;i++) {
			System.out.println("Arra elements are "+arr[i]);
		}

	}

}
