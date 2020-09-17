import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerachInRotatedArray {

	public SerachInRotatedArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while (testcase-- > 0) {
			int length = sc.nextInt();
			List<Integer> ls = new ArrayList<Integer>(length);
			for (int i = 0; i < length; i++) {
				ls.add(sc.nextInt());
			}
			System.out.println(ls.indexOf(sc.nextInt()));
		}

	}

}
