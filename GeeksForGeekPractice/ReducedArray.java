import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReducedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			int length = sc.nextInt();
			int[] arr = new int[length];
			List<Integer> list = new ArrayList<Integer>(length);
			for (int i = 0; i < length; i++) {
				arr[i] = sc.nextInt();
				list.add(arr[i]);
			}
			Collections.sort(list);
			for (int i = 0; i < length; i++) {
				System.out.print(list.indexOf(arr[i]) + " ");
			}

		}
	}

}
