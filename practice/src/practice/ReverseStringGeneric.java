package practice;

public class ReverseStringGeneric {

	public ReverseStringGeneric() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str = "Java is the Good Programing Language";
	
		String[] arr = str.split(" ");
		String newString = "";
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				newString += reverseString(arr[i]);
			} else {
				newString += arr[i];
			}
			newString+=" ";
		}
		System.out.println("Original String is \n"+str);
		System.out.println("Modified String is \n"+newString);

	}

	private static String reverseString(String string) {

		String newString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			newString += string.charAt(i);
		}
		return newString;
	}

}
