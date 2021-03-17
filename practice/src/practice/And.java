package practice;

public class And {

	public And() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String binar1 = "01100";
		String binar2 = "10101";
		int decimal = Integer.parseInt(binar1, 2);

		int decimal2 = Integer.parseInt(binar2, 2);

		int a = 13; /* 60 = 0011 1100 */

		int b = 7; /* 13 = 0000 1101 */
		int d = 3;
		int c = 3;
		int e = 8;
		c = a & b; /* 12 = 0000 1100 */
		System.out.println("C values is " + Integer.toBinaryString(c));
		int binar11 = Integer.parseInt(Integer.toBinaryString(c), 2);
		binar11 = binar11 | d;
		System.out.println(Integer.toBinaryString(binar11));

		int[] arr = { 13,7,2,8,3 };
		System.out.println("Max length is " + findMaxNumber(arr));
	}

	private static int findMaxNumber(int[] arr) {
		if (arr.length == 0)
			return 0;
		if (arr.length == 1)
			return 1;
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			maxLength = Math.max(maxLength, checkIfGreaterThanZero(arr[i], arr, i));

		}
		return maxLength;
	}

	public static int checkIfGreaterThanZero(int a, int[] arr, int poisiton) {

		int currentValue = a;
		int maxLength = 1;
		int tempBinary = 0;
		for (int i = 0; i < arr.length; i++) {
			if (poisiton == i)
				continue;
			tempBinary = currentValue & arr[i];

//			System.out.println("Current values is " + Integer.toBinaryString(tempBinary) + " First is" + a
//					+ " Second vakues is " + arr[i]);
			if (Integer.parseInt(Integer.toBinaryString(tempBinary), 2) > 0) {
				maxLength++;
				currentValue = tempBinary;
			}

		}
//		System.out.println("Max lenght is " + maxLength);
		return maxLength;
	}

}
