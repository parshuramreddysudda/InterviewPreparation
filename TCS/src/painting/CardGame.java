package painting;

public class CardGame {

	public static void main(String[] args) {

		int[] arr = { -2, 3, -1, -4, -2 };
		System.out.println(Cards(arr.length, arr));

	}

	private static int Cards(int input1, int[] input2) {

		int sum = input2[0], checkSum = 0;
		for (int i = 1; i < input1; i++) {
			System.out.println(i);
			checkSum = sum + input2[i];
			if (checkSum <= 0) {
				System.out.println("Check sum" + checkSum);
				sum += Math.abs(input2[i]);
			} else {
				
				sum += input2[i];
				System.out.println("Sum value"+sum);
			}
			checkSum = 0;
		}
		return sum;
	}

}
