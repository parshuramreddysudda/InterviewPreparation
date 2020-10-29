
public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 9;
		int start = 0, end = nums.length - 1, mid = 0;
		
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				System.out.print("Found");
				break;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.print("Mis id "+mid);

	}

}
