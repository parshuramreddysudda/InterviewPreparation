import java.math.BigInteger;
import java.util.Scanner;

public class Multipleof8 {

	
		public static void main (String[] args)
		 {
		 Scanner sc = new Scanner(System.in);
			
			int testcase = sc.nextInt();
			
			while(testcase-- > 0){
				BigInteger n = sc.nextBigInteger();
			   if(n.mod(BigInteger.valueOf(8))==BigInteger.valueOf(0)){
			       System.out.println("1");
			   }
			   else{
			         System.out.println("-1");
			   }
			   
			}
		 
		 }

}
