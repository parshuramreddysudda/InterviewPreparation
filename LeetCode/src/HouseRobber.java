
public class HouseRobber {

	public static void main(String[] args) {


		int[] nums= {2,7,9,3,1};
		if(nums.length==1) {
//			return nums[1];
		}
		if(nums.length==2) {
//			return Math.max(nus[1], nums[2]);
		}
		
		int[] rob=new int[nums.length];
		rob[0]=nums[0];
		rob[1]=nums[1];
		
		for(int i=2;i<nums.length;i++) {
			rob[i]=Math.max(nums[i]+rob[i-2], rob[i-1]);
		}
		System.out.println(rob[nums.length-1]);

	}

}
