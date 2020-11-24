package leetcode.ArraysStrings;

public class LargestAtleastTwice {

	public static void main(String[] args) {

		int[] nums= {0,0,0,1};
		int max=0,index=0;
		
		for(int i=0;i<nums.length;i++) {
			if(max>nums[i]) {
				max=nums[i];
				index=i;
			}
			else {
				max=nums[i];
				index=i;
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(i!=index) {
				if((nums[i]*2)>max) {
					
				}
			}
		}
		System.out.print("False");

	}

}
