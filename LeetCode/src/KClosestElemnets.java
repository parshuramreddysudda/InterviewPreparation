import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KClosestElemnets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1,1,1,10,10,10};
		int target = 9;
		int k = 2;
		 int index = binarySearch(arr, target);
		 System.out.println("Index is "+index);
			List<Integer> list=new ArrayList<Integer>();
			int right=index;
			int left=index;
			while(k>=1) {
				if(left>=1) {left--;k--;}
				System.out.println("K value is before "+k);
				if(right<arr.length&&k>=1) {right++;k--;}
				System.out.println("K value is after "+k);
				
			}
			System.out.println("Left is "+left+" Right is "+right);
			for(int i=left;i<right&&i<arr.length;i++)
				list.add(arr[i]);
			System.out.println(list);
	}

	private static int binarySearch(int[] nums, int target) {
		int start = 0, end = nums.length - 1, mid = 0;

		while (start <= end) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
