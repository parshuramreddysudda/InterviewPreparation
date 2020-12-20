package practice;

import java.util.*;

public class Testing {
	public static void main(String[] args) {
		List<Integer> answered = new ArrayList<Integer>();
		answered.add(2);
		answered.add(4);
//		answered.add(3);

		List<Integer> needed = new ArrayList<Integer>();
		needed.add(4);
		needed.add(5);
//		needed.add(100);
		int q = 1;
		Integer[][] dp = new Integer[needed.size() + 1][needed.size() + 1];
		System.out.println(maxSubjectsNumber2(dp, answered, needed, q, 0));

	}

	@SuppressWarnings("unused")
	private static int maxSubjectsNumber(List<Integer> answered, List<Integer> needed, int q, int index) {
		if (q <= 0 || index >= answered.size())
			return 0;

		int sum1 = 0;
		int sum2 = 0;

		if (needed.get(index) - answered.get(index) <= q) {

			sum1 += maxSubjectsNumber(answered, needed, q - (needed.get(index) - answered.get(index)), index + 1) + 1;
		}
		sum2 += maxSubjectsNumber(answered, needed, q, index + 1);

		return Math.max(sum1, sum2);

	}

	private static int maxSubjectsNumber2(Integer[][] dp, List<Integer> answered, List<Integer> needed, int q,
			int index) {

		if (q <= 0 || index >= answered.size())
			return 0;

		int sum1 = 0;
		int sum2 = 0;
		if (dp[index][q] == null) {
			if (needed.get(index) - answered.get(index) <= q) {

				sum1 += maxSubjectsNumber2(dp, answered, needed, q - (needed.get(index) - answered.get(index)),
						index + 1) + 1;
			}
			sum2 += maxSubjectsNumber2(dp, answered, needed, q, index + 1);
			dp[index][q] = Math.max(sum1, sum2);
		}

		return dp[index][q];

	}

}
