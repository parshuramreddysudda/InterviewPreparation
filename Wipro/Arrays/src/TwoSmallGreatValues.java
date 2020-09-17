import java.util.Arrays;

/**
 Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
 *
 * 
 */

/**
 * @author parsh
 *
 */
public class TwoSmallGreatValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int inputArray[] = new int[]{10, 11, 88, 2, 12, 120};
		 
		 Arrays.sort(inputArray);
		 System.out.println("Smallest Numbers "+inputArray[0]+" "+inputArray[1]);
		 System.out.print("Largest Numbers "+inputArray[inputArray.length-2]+" "+inputArray[inputArray.length-1]);
		 
	}

}
