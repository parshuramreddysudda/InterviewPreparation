
public class RemoveDuplicates {

	public RemoveDuplicates() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int j = 0;
		for(int i=0;i<nums.length;i++) {
			if(i==0||nums[i-1]!=nums[i]) {
				nums[j++]=nums[i];
			}
		}
		for (int i = 0; i <j; i++) {
			System.out.println(nums[i]);
		}

	}

}
