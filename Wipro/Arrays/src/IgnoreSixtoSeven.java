

/**
 Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
 * 
 */

/**
 * @author parsh
 *
 */
public class IgnoreSixtoSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,6,3,7,6,27,7,1};
		int sum = 0;
		outer:
		for (int i = 0; i < n.length; i++) {
		    if (n[i] == 6) {
		        for (int j = i + 1; j < n.length; j++) {
		            if (n[j] == 7) {
		                i = j;
		                continue outer;
		            }
		        }
		    }
		    sum += n[i];
		}

		System.out.println(sum); 

	}

}
