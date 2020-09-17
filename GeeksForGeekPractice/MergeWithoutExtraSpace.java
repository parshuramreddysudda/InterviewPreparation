
import java.io.*;
import java.util.*;

public class MergeWithoutExtraSpace {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		int testcase = sc.nextInt();
		while (testcase-- > 0) {
			int firstLength = sc.nextInt();
			int secondLength = sc.nextInt();
			int[] firstArray = new int[firstLength];
			int[] secondArray = new int[secondLength];
			for (int i = 0; i < firstLength; i++) {
				firstArray[i] = sc.nextInt();
			}
			for (int i = 0; i < secondLength; i++) {
				secondArray[i] = sc.nextInt();
			}
			int first = firstArray.length - 1, second = 0, temp = 0;
			while (first >= 0 && second < secondArray.length - 1) {
				if (firstArray[first] > secondArray[second]) {
					temp = secondArray[second];
					secondArray[second] = firstArray[first];
					firstArray[first] = temp;
				}
				first--;
				second++;

			}
			MergeSort ob = new MergeSort();
			ob.sort(firstArray, 0, firstArray.length - 1);
			ob.sort(secondArray, 0, secondArray.length - 1);

			for (int i = 0; i < firstLength; i++) {
				System.out.print(firstArray[i] + " ");
			}
			for (int i = 0; i < secondLength; i++) {
				System.out.print(secondArray[i] + " ");
			}
			System.out.println();
		}

	}

}

class MergeSort {

	void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}
}
/* This code is contributed by Rajat Mishra */
