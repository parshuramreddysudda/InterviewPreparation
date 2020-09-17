import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrderingStrings {

	public OrderingStrings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while (testcase-- > 0) {
			int stringLength = sc.nextInt();
			String[] list = new String[stringLength];
			for (int i = 0; i < stringLength; i++) {
				list[i] = sc.next();
			}
			Arrays.sort(list);
			System.out.println( list[0] + " " + list[stringLength-1]);

		}

	}

}
