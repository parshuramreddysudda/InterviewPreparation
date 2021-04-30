package practice;

public class Stocks {

	public static void main(String[] args) {
		int arr[] = { 100, 60, 70, 65, 80, 85 };
		System.out.println(checkStocks(arr));

	}

	private static int[] checkStocks(int[] arr) {

		int j = 0;
		int result[] = new int[arr.length];
		result[0] = 1;
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			j = i - 1;
			count = 0;
			while (j >= 0) {
				if (arr[i] > arr[j]) {
					j--;
					count++;
				} else {
					count++;
					break;
				}
			}
			result[i] = count;
			System.out.println("I valeu is " + i + " Ja value is " + count);
		}
		return arr;

	}

}
