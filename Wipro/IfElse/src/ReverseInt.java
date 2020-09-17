import java.util.Scanner;
 

/**
 * @author parsh
 *
 */
public class ReverseInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int num =Integer.parseInt(reader.next());
		int reversed=0;
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
		System.out.println(reversed);

	}

}
