/**
 * 
 */
package Recurssions;

import java.util.Scanner;

/**
 * @author parsh
 *
 */
public class Recursivesequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of test cases");
		int t=sc.nextInt();
		for(int j=0;j<t;j++) {
			
		
		long n=sc.nextInt();
		long sum=0,start=1;
		for(int i=1;i<=n;i++) {
			sum+=calculateValue(start,i);
			start=start+i;
		}
		System.out.println("Answer is"+sum);
		}
	
	}
	static long calculateValue(long start,long rep) {
		
		long sum=1,number=start;
		for(int i=1;i<rep;i++) {
			start=start*(number+i);
		}
		return start;
		
	}

}
