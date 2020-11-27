import java.util.HashMap;

public class CountVowels {

	public static void main(String[] args) {
		String input1 = "aresinous";
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		StringBuilder sb = new StringBuilder();

		for (int k = 0; k < input1.length(); k++) {
			if (input1.charAt(k) == 'a') {
				a++;
			} else if (input1.charAt(k) == 'e') {
				e++;
			} else if (input1.charAt(k) == 'i') {
				i++;
			} else if (input1.charAt(k) == 'o') {
				o++;
			} else if (input1.charAt(k) == 'u') {
				u++;
			}
		}
		String result = "";
		if (a > 1 || e > 1 || i > 1 || o > 1 || u > 1) {
			sb.append(input1);
			sb.reverse();
			for (int k = 0; k < input1.length(); k++) {
				result += Character.toString(Character.toUpperCase(sb.charAt(k)));
			}
			result += ":ERROR";
		} else {
			for (int k = 0; k < input1.length(); k++) {
				char ch = input1.charAt(k);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				} else {
					result += Character.toString(Character.toUpperCase(input1.charAt(k)));
				}
			}
			result += ":" + String.valueOf(result.length());
		}
		System.out.println(result);

//		return result;

	}
}
