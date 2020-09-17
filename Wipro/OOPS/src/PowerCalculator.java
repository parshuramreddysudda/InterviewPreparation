/**
 * 
 */

/**
 * @author parsh
 *
 */
public class PowerCalculator {
	
	double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
		
	}
	double powerInt(int num1,int num2) {
		return Math.pow(num1, num2);
		
	}
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PowerCalculator b= new PowerCalculator();
		System.out.println(b.powerInt(4, 5));
		System.out.print(b.powerDouble(3, 20));
	}

}
