import java.util.Scanner;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int number =Integer.parseInt(reader.next());
		int sum=0;
		 while (number != 0) 
	        { 
	            sum = sum + number % 10; 
	            number = number/10; 
	        }
		 System.out.print(sum);
	      

	}

}
