import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeakElement {

	public PeakElement() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = 1;

		while (testcase-- > 0) {
			int[] arr = { 1, 2, 3 };
			int length = 3;

			search(arr, 0, length - 1);

		}

	}

	private static int search(int[] arr, int s, int e) {

		int start = 0, end = arr.length - 1;
		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if ((mid == arr.length - 1 ||arr[mid] >= arr[mid + 1] )&& (mid == 0 || arr[mid-1] <= arr[mid])) {
				return mid;
			} else if (mid > 0 && arr[mid - 1] >= arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;


	}
}
