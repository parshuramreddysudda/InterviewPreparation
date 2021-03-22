package assignment4;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String str="mariaram";
		 int i = 0, j = str.length() - 1;
		 
	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j))
	                System.out.println("Not a Palindrome");
	            i++;
	            j--;
	        }
	        System.out.println("Is a Palindrome");

	}

}
