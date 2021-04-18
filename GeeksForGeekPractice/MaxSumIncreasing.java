import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxSumIncreasing {
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
			int lis[] = new int[length];
			int i, j, max = 0;
			for (i = 0; i < length; i++) {
				arr[i] = sc.nextInt();
				lis[i] = arr[i];
			}

			for (i = 1; i < length; i++) {
				for (j = 0; j < i; j++) {
					if (arr[i] > arr[j] && lis[i] <= lis[j] + arr[i]) {
						lis[i] = lis[j] + arr[i];
//						System.out.println(" I value is " + i + " J Value is " + j + " List Updated " + lis[i]);
					} 
//					else {
//						System.out.println("Else Called Line  I value is " + i + " J Value is " + j);
//					}
				}
			}
			for (i = 0; i < arr.length; i++) {
				max = Math.max(max, lis[i]);
			}
			System.out.println(max);
		}

	}

}
