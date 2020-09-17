{
//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
import java.math.BigInteger;
//Position this line where user code will be pasted.
// Driver class with main function
class GFG {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    // Taking first element 
		    // in BigInteger x
		    BigInteger x = sc.nextBigInteger();
		    
		    // Taking second element in
		    // BigInteger y
		    BigInteger y = sc.nextBigInteger();
		    
		    // Calling function add to find mod two BigIntegers
		    MathematicalOperation obj = new MathematicalOperation();
		    System.out.println(obj.mod(x, y));
		}
		
		
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/* Class MathematicalOperation with mod fucntion
* x, y : Two parameters of BigIntegers to find mod
*/
class MathematicalOperation{
    
    static BigInteger mod(BigInteger x, BigInteger y){
        
       return y.mod(x); 
    }
    
}