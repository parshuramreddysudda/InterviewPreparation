import java.util.Scanner;

public class Encryption {

	public Encryption() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String text = s.next();
		System.out.print(getStr(n,text));
	}

	private static String getStr(int num, String string) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			int castAscii = (int) ch;
			castAscii += num;
			result += Character.toString((char) castAscii);
		}
		return result;
	}

}
