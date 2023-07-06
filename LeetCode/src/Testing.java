import java.util.*;

class SlidingWindowMaximum {

	public static void main(String[] args) {
		System.out.println(findMaxSlidingWindow(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},3));
	}
	public static int[] findMaxSlidingWindow(int[] nums, int w) {
		Queue<Integer> queue=new PriorityQueue<Integer>(Collections.reverseOrder());
		List<Integer> list=new ArrayList<Integer>();

		if(w>=nums.length){
			Arrays.sort(nums);
			return new int[]{nums[nums.length-1]};
		}

		for(int i=0;i<w;i++)
			queue.offer(nums[i]);
		list.add(queue.peek());

		for(int i=w;i<nums.length-w-1;i++){
			System.out.println("Array is ");
			System.out.println("Array is "+nums[i-w]);
			queue.remove(nums[i-w]);
			queue.add(nums[i]);
			list.add(queue.peek());
		}
		// int[] array = new int[list.size()];
		// list.toArray(array);
		int[] array = new int[list.size()];
		for(int i = 0; i < list.size(); i++) array[i] = list.get(i);
		return array;
	}
}