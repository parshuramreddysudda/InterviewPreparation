
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EquilibriumPoint {
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
			int length = sc.nextInt();
			int[] arr = new int[length];
			int sum = 0;
			for (int i = 0; i < length; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			int leftSum = 0, flag = -1;
			for (int i = 0; i < length; i++) {
				sum = sum - arr[i];
				if (sum == leftSum) {
					flag = i + 1;
					break;
				}
				leftSum = leftSum + arr[i];
			}
			System.out.println(flag);

		}

	}

}
