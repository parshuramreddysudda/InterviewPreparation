import java.util.Arrays;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = new int[]{10, 11, 88, 2, 12, 120};
		 
		 Arrays.sort(inputArray);
		 for(int i=0;i<inputArray.length;i++) {
			 System.out.println((inputArray[i]));
		 }
	}

}
