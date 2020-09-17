import java.util.Scanner;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment3 {

	/**
	 * 
	 */
	public Assignment3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param argss
	 */

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int input = sc.nextInt();
			
			String output = String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0');
			System.out.println(output);
			
			
			sc.close();

		}

	

}
