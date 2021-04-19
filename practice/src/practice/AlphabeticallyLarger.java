package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlphabeticallyLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ZYxXgkjabskjdieoibbsdyisdvlblZ";

		System.out.println(solution(str));

	}

	private static String solution(String str) {

		List<Character> chars = new ArrayList<>();
		for (char ch : str.toCharArray()) {
			chars.add(ch);
		}

		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!Character.isUpperCase(ch))
				for (int j = 0; j < str.length(); j++) {
					char capital = Character.toUpperCase(ch);
					if (str.indexOf(capital) >= 0) {
						max = Math.max(max, getValue(ch));
					}
				}
		}
		String result="";
		if (max != 0)
			result = Character.toString(Character.toUpperCase((char) max));
		else
			result = "NO";
	
		return result;
	}

	public static int getValue(char c) {

		int n = c;
		return n;

	}

}
