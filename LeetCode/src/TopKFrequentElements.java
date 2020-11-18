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
		int[] nums = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
		int k = 10, repeat = 0;

		for (int n : nums) {
			repeat = hash.getOrDefault(n, 0);
			hash.put(n, repeat + 1);
		}
		int i = 0;
		PriorityQueue<Map.Entry<Integer, Integer>> queue=new PriorityQueue()
		
		
//		collection.splice()

	}

}
