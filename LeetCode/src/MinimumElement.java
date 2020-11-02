
public class MinimumElement {

	public static void main(String[] args) {


		int[] arr = { 4,5,6,7,8,9,10,0,1,2,3 };
		System.out.println(findMin(arr));

	}
	private static int findMin(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;

		int left = 0, right = nums.length-1,mid=0;
		while (left < right) {
			mid = left + (right - left) / 2;
			System.out.println("Left is "+left+" Right is "+right+" mid value is "+mid);
			if(left==right){
				return left;
			}
			else if(nums[mid]>nums[right]) {
				left=mid+1;
			}
			else {
				right=mid;
			}
		}
		return left;
	}

}
