import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			int n = sc.nextInt();
			BigInteger x = sc.nextBigInteger();
			if (n <=2) {
				x = BigInteger.valueOf(1);
			}else {
				// Calling function add to add two BigIntegers
				MathematicalOperation obj = new MathematicalOperation();
				for (int i = 2; i < n; i++) {
	                  x=  obj.mul(x, BigInteger.valueOf(i));
	                  
				}
			}
	
			System.out.println(x);
		}

	}
}
