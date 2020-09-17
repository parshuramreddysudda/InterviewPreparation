import java.util.Scanner;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class PalindromeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int num =Integer.parseInt(reader.next());
		int original=num;
		int reversed=0;
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
		if(original==reversed) {
			System.out.print(original+" is a palindrome");
		}
		else {
			System.out.print(original+" is not a palindrome");
		}

	}

}
