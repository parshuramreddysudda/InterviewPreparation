import java.util.Scanner;
/**
 *  Write a program to initialize an integer array and print the sum and average of the array.
 * @author parsh
 *
 */
public class OneDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, sum = 0;
        float average;
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);

	}

}
