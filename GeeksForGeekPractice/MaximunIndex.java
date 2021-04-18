import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaximunIndex {

	public MaximunIndex() {
		// TODO Auto-generated constructor stub
	}

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
			int n = sc.nextInt();
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			long RMax[] = new long[n];
			long LMin[] = new long[n];

			LMin[0] = arr[0];
			for (int i = 1; i < n; ++i)
				LMin[i] = Math.min(arr[i], LMin[i - 1]);

			RMax[n - 1] = arr[n - 1];
			for (int j = n - 2; j >= 0; --j)
				RMax[j] = Math.max(arr[j], RMax[j + 1]);

			int i = 0, j = 0, maxDiff = -1;
			while (j < n && i < n) {
				if (LMin[i] <= RMax[j]) {
					maxDiff = Integer.max(maxDiff, j - i);
					j++;
				} else
					i++;
			}
			System.out.println(maxDiff);

		}

	}

}
