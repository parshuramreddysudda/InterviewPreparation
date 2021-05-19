package assignement4;

import java.util.Scanner;

public class WithAssertion {

	public static void main(String[] args) throws MyOwnNegativeValueEnteredException, MyZeroNegativeValueEnteredException {

		System.out.println("Enter rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        assert rows>=0:"Should be greater than zero";
        if(rows<0)
        	throw new MyOwnNegativeValueEnteredException("negative number that was entered");
        if(rows==0)
        	throw new MyZeroNegativeValueEnteredException("negative number that was entered");
        PrintTriangle.printrows(rows);
	} 

}
