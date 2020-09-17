import java.util.*;

public class FirstRepeating {

	public FirstRepeating() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			int length = sc.nextInt();
			int result = 0;
			List<Integer> list = new ArrayList<Integer>(length);
			for (int i = 0; i < length; i++) {
				list.add(i);
				if (list.indexOf(i) > 0) {
					result = Math.min(result, i);
				}
			}
			for (int i = 0; i < length; i++) {
			}

		}
	}

}
