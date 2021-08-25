package painting;

public class OddDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 10, 11, 7, 12, 14 };
		int length = 5;
		System.out.println(findOddEven(arr.length, arr));
	}

	static private int findOddEven(int input1, int[] input2) {
		int odd = 0, even = 0;
		for (int i = 0; i < input2.length; i++) {
			if (input2[i] % 2 == 0) {
				even += input2[i];
			} else {
				odd += input2[i];
			}
		}
		return odd - even;
	}

}
same 