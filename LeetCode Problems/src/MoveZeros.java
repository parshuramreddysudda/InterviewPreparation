import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = { 0, 1,9,87,0,0,0,0,0,788};
		int j = 0;
		
		for (int i = 0; i < nums.length ; i++) {
			 if(nums[i]!=0) {
				 nums[j++]=nums[i];
			 }
		}
		for(int i=j;i<nums.length;i++) {
			nums[i]=0;
		}
		System.out.println("J values is " + j);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
