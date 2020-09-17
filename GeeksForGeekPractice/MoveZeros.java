import java.util.Scanner;

public class MoveZeros {

	public MoveZeros() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
			int n = sc.nextInt();
			long[] nums = new long[n];
			int j = 0;
			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt();
			}
			
			for (int i = 0; i < nums.length ; i++) {
				 if(nums[i]!=0) {
					 nums[j++]=nums[i];
				 }
			}
			for(int i=j;i<nums.length;i++) {
				nums[i]=0;
			}

			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i]);
			}
			System.out.println();
		}


	}

}
