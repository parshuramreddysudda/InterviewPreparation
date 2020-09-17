import java.util.Scanner;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment5 {

	/**
	 * 
	 */
	public Assignment5() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			double r = division(a, b);
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	public static double division(int a, int b) throws ArithmeticException {
		return a / b;
	}

}
