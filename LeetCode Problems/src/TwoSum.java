import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 0,0,2};
		int target=0;
		int left =0 ,right=nums.length-1,sum=0;

		while(left<right) {
			sum=nums[left]+nums[right];
			
			if(target==sum) {
				System.out.print(target);
				break;
			}
			
			if(sum>target) {
				right--;
			}
			else if (sum<target) {
				left++;
			}
			
		}
		System.out.print("Executed temp is "+(left+1)+" I value is "+(right+1));
	}

}
