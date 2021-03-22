package assignment5;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str = "Java is java again java again";
		String st = "a";
		int count = str.length() - str.replace(st, "").length();
		System.out.println("Number of occurances of 'a' in " + st + " = " + count);
	}

}
