
public class MinClimbing {

	public static void main(String[] args) {

		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };

		int[] min = new int[cost.length];
		min[0] = cost[0];
		min[1] = cost[1];
		for (int i = 2; i < cost.length; i++) {
			min[i] = Math.min(cost[i] + min[i - 1], cost[i] + min[i - 2]);
		}
		System.out.println(Math.min(min[min.length - 1], min[min.length - 2]));
	}

}
