import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxHops {

	public MaxHops() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			int length = sc.nextInt();
			int[] dp = new int[length + 1];
			System.out.print(FindMaxHops(dp,length));

		}
	}
	static int FindMaxHops(int[] dp,int length) {
		if(length==1) {
			return 1;
		}
		else if(length==2){
			return 2;
		}
		else if(length==3) {
			return 4;
		}
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i <= length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		return dp[length];

		
	}
}
