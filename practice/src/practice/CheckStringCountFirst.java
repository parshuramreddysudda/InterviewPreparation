package practice;

public class CheckStringCountFirst {

	public static void main(String[] args) {

		String s = "11Thinktostart";
		System.out.println(findStringCount(s));

	}

	private static String findStringCount(String str) {

		String num = "";
		int i = 0;
		for (i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c))
				num += Character.toString(c);
			else
				break;
		}
		String subString = str.substring(i, str.length());

		if (subString.length() == Integer.parseInt(num))
			return "TRUE " + num;
		else
			return "FALSE " + subString.length();

	}

}
