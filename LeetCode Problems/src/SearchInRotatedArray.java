
public class SearchInRotatedArray {

	public static void main(String[] args) {

		int[] nums = {3,1};
//		  if(nums == null || nums.length == 0)
//			    return -1;
		int target = 1;
		int start = 0, end = nums.length - 1, mid = 0;

		while (start <= end) {
			mid = start + (end - start) / 2;
//			if(target >= nums[end])
			System.out.println("Mid id " + mid + " Target is "+target+" Start is " + start + " End is " +end);
			
			if (nums[mid] == target) {
				System.out.print("Found");
				break;
			} 
			if(nums[start]<=nums[mid]) {
				if(target>=nums[start]&&target<=nums[mid]) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
			else {
				if(target<=nums[end]&&target>=nums[mid]) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
		}

	}

}
