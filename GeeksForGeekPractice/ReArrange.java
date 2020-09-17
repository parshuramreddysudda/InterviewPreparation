
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReArrange {

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
			for (int i = 0; i < length; i++) {
				arr[i] = sc.nextInt();
			}
			int left = 0, right = length - 1;
			while (left < right) {
				System.out.print(arr[right--]);
				System.out.print(arr[left++]);
			}
			if (length % 2 != 0)
				System.out.print(arr[length / 2]);
			System.out.println();
		}

	}

}
