
public class FIndRange {

	public static void main(String[] args) {
		int[] arr = { 5,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,8,8,8,8,9 };
		System.out.print(binarySearch(arr, 45));

	}

	static int binarySearch(int[] nums, int target) {
		
		if (nums == null || nums.length == 0)
			return -1;

		System.out.print(nums.length);
		int left = 0, right = nums.length-1;
		while (left <= right) {
//			System.out.println(left);
			int mid = left + (right - left) / 2;
			if (target < nums[mid]) {
				right = mid - 1;
			} else if (target > nums[mid]) {
				left = mid +1;
			} else {
				
				right=mid-1;
			}
		}
		left = 0; right = nums.length-1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target > nums[mid]) {
				left = mid +1;
			} else if (target < nums[mid]) {
				right = mid -1;
			} else {
				
				left = mid +1;
			}
		}
		
		
		return left;
	}

}
