
public class RemoveElement {

	public RemoveElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

      int[] nums= {3,2,2,3};
      int val=2;
      int length = 0;

      for (int pointer2 = 0; pointer2 < nums.length; pointer2++) {
        if (nums[pointer2] != val) {
          nums[length] = nums[pointer2];
          length++;
        }
      }
	}

}
