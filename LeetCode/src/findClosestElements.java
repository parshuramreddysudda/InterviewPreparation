import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class findClosestElements {

	public static void main(String[] args) {

//		Output: ["e","l","l"]
		String[] st = { "cool", "loock", "cook" };
		System.out.println(st.length);
		List<String> list = commonChars(st);
		Stream.of(list.toString()).forEach(System.out::println);

	}

	private static List<String> commonChars(String[] A) {

		List<String> list = new ArrayList<String>();

		char c = 'a';
		boolean flag = false;
		for (int i = 0; i < A[0].length(); i++) {
			flag = true;
			c = A[0].charAt(i);
			for (int j = 1; j < A.length; j++) {
				if (A[j].indexOf(c) < 0) {
					flag = false;
					break;
				}
				String str = A[j];
				A[j] = str = str.substring(0, A[j].indexOf(c)) + "0" + str.substring(A[j].indexOf(c) + 1);
			}
			if (flag)
				list.add(String.valueOf(c));
		}
		return list;
	}
}
