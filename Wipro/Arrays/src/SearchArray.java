import java.util.Scanner;
/**
 * 
Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
 * @author parsh
 *
 */
public class SearchArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = new int[]{10, 11, 88, 2, 12, 120};
		int result=0;
		@SuppressWarnings("resource")
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	     
		 for(int i=1;i < inputArray.length;i++)
		 { 
			 
		    if(inputArray[i] ==n){ 
		    	result=1;
		    	 System.out.print(i);
		       break;
		      } 
		      
		 }
		 if(result==0) {
			 System.out.print("-1");
		 }
		 
	

	}

}
