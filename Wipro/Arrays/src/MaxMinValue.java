/**
 *  Write a program to initialize an integer array and find the maximum and minimum value of the array.
 */

/**
 * @author parsh
 *
 */
public class MaxMinValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int inputArray[] = new int[]{10, 11, 88, 2, 12, 120};
		 int maxValue=inputArray[0];
		 for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		      } 
		    }
		 int minValue=inputArray[0];
		 for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    }
		 System.out.println("Max Value is "+ maxValue);
		 System.out.print("Min Value is "+ minValue);
		 

	}

}
