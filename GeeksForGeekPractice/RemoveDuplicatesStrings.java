import java.util.Scanner;

public class RemoveDuplicatesStrings {

	public RemoveDuplicatesStrings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while (testcase-- > 0) {
			String word = sc.next();
			String result = String.valueOf(word.charAt(0));
			for (int i = 1; i < word.length(); i++) {
				if (!result.contains(String.valueOf(word.charAt(i)))) {
					result += String.valueOf(word.charAt(i));
				}
			}
			System.out.println(result);

		}

	}

}
