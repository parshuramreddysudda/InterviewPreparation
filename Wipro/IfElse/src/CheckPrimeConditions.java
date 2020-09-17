import java.util.Scanner;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class CheckPrimeConditions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int number =Integer.parseInt(reader.next());
        boolean check = false;
        if(number==0||number==1) {
        	System.out.print(number+" is neither prime nor composite");
        }
        else
        {
        	for(int i = 2; i <= number/2; ++i)
            {
                if(number % i == 0)
                {
                    check = true;
                    break;
                }
            }
            if (!check)
                System.out.println(number + " is a prime number.");
            else
                System.out.println(number + " is not a prime number.");
        }
        
		}
		catch(Exception e) {
			System.out.print("Please Enter a Integer Number");
		}

	}

}
