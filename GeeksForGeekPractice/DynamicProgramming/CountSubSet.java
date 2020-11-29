package DynamicProgramming;

public class CountSubSet {

	public static void main(String[] args) {
		int arr[] = { 1,2,2,6,4,8,2,4,6,8,6,4,2,4,6 };
		int target = 10;
		Integer[][] dp=new Integer[arr.length][target+1];
		System.out.println(dpSolution(arr,dp,0,0,target));

	}

	private static int dpSolution(int[] arr,Integer[][] dp, int sum, int index, int target) {
	
		if(sum==target) {
			return 1;
		}
		if(sum>target||index>=arr.length)
			return 0;

		if(dp[index][sum]==null) {
			int sum1 = 0,sum2=0;
			if(sum<target) {
				 sum1=dpSolution(arr,dp, arr[index] + sum, index + 1, target);
			}
			sum2=dpSolution(arr,dp, sum, index + 1, target);
			dp[index][sum]=sum1+sum2;
		}
		
		
		return dp[index][sum];
	}

	@SuppressWarnings("unused")
	private static int countSubSet(int[] arr, int sum, int index, int total) {

		if (sum == total) {
			return 1;
		}
		if (sum > total || index >= arr.length) {
			return 0;
		}
		int sum1 = 0,sum2=0;
		if (sum < total) {
			sum1 = countSubSet(arr, arr[index] + sum, index + 1, total);
		}

		sum2 = countSubSet(arr, sum, index + 1, total);

		return sum1 + sum2;
	}
	
	

}
