package practice;

import java.util.Arrays;

public class MinFilters {

	public static void main(String[] args) {
		int arr[] = { 5,17,12,8,1};
		System.out.println(minFilters(arr));
	}

	private static int minFilters(int[] arr) {

		Arrays.sort(arr);
		boolean minimum = true;
		int filters=0;
		int sum=findSumArray(arr);
		int requiredSum=sum/2;
		int position=arr.length-1;
		while (sum>requiredSum&&position>0) {
			if(arr[position-1]>arr[position])
				position--;
			
			arr[position]=arr[position]/2;
			filters++;
			sum=findSumArray(arr);
			
			
		}
		return filters;
	}
	
	static int findSumArray(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		return sum;
	}

}
