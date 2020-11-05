
public class FindPeakElement {

	public static void main(String[] args) {

		int[] arr = { 6,7,8,1,2,3,4,5 };
		System.out.println(findPeak(arr));

	}

	private static int findPeak(int[] nums) {
		int target = 0;
		if (nums == null || nums.length == 0)
			return -1;

		int left = 0, right = nums.length-1,mid=0;
		while (left < right) {
			mid = left + (right - left) / 2;
			System.out.println("Left is "+left+" Right is "+right+" mid value is "+mid);
			if(left==right){
				return left;
			}
			else if(nums[mid]>nums[mid+1]) {
				right=mid;
			}
			else {
				left=mid+1;
			}
		}
		return left;
	}

}
