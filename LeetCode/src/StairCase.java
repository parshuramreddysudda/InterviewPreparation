
public class StairCase {

	public static void main(String[] args) {


		int n=10;
		int[] dp=new int[n+1];
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		System.out.print(dp[n]);

	}

}
