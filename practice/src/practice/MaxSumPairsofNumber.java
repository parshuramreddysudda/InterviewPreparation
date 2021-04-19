package practice;

import java.util.HashMap;

public class MaxSumPairsofNumber {

	public static void main(String[] args) {

		int[] arr = { 51,32,43 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(getSum(arr[i]), arr[i]);
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = getSum(arr[i]);
			if (map.get(sum) != null) {
				System.out.println(sum);
				max = Math.max(max, arr[i] + map.get(sum));
			}
		}
		System.out.println(max);
		return max;

	}

	static int getSum(int n) {
		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}

		return sum;
	}

}
