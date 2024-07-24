import java.util.*;

public class SingleNumber {

	public static void main(String[] args) {
		
		Set<Integer> map=new HashSet<Integer>();
		

		int[] nums = { 4,1,2,1,2,5,6,8,1,6};
		int i = 1;
		while (i < nums.length) {
		 if(!map.contains(nums[i])) {
//			 return false;
			 System.out.println("Duplicate detected"+nums[i]);break;
		 }
		 else {
			 map.add(nums[i]);
		 }
		}
		System.out.println("ELement is "+nums[0]);
		
	}

}
