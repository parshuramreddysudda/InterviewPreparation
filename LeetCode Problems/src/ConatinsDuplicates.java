import java.util.HashSet;
import java.util.Set;

public class ConatinsDuplicates {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		int[] nums = { 1,1,1,3,3,4,3,2,4,2};
		int i = 0;
		while (i < nums.length) {
		 if(set.contains(nums[i])) {
//			 return false;
			 System.out.println("Duplicate detected"+nums[i]);break;
		 }
		 else {
			 set.add(nums[i]);
		 }
		}

	}

}
