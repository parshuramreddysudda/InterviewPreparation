import java.util.Arrays;

public class metll {

	public static void main(String[] args) {
		int[] arr = new int[] { 1,6,-2,4};
		int length = 5;
		System.out.println(findOddEven(arr.length, arr));
	}

	private static int findOddEven(int input1, int[] input2) {

		Arrays.sort(input2);
		int total = 0, abs = 0;
		for (int i = 1; i < input1; i++) {
			abs = Math.abs(input2[i] - input2[i - 1]);
			total += abs;
			abs = 0;
		}

		return total;
	}

}