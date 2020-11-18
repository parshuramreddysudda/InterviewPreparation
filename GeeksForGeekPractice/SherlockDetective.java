import java.util.HashMap;
import java.util.Scanner;

public class SherlockDetective {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i <n; i++) {
				arr[i] = sc.nextInt();
			}
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(arr[i], i);
			}
			for(int i=0;i<=n;i++) {
				if(!map.containsKey(i))System.out.println(i);
			}
			

		}

	}

}
