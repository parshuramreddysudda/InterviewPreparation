import java.util.Arrays;
import java.util.Scanner;

public class MAximizeToys {

	public MAximizeToys() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {

			int length = sc.nextInt();
			int Money = sc.nextInt();
			int[] arr = new int[length];
			for (int i = 0; i < length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int i = 0;
			while (Money >= 0) {
				Money -= arr[i++];
				
			}
			System.out.print(i-1);
		}

	}

}
