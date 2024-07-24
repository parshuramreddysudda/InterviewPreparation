package leetcode.ArraysStrings;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {

		int[] digits = { 9, 9, 9, 9, 8, 9, 9, 9, 9, 9 };
		 
		for(int i=0;i<digits.length;i++) {
			if(digits[i]<9) {
				digits[i]+=1;
			}
			else {
				
			}
		}
		System.out.println("Result is " + Arrays.toString(digits));

	}

}
