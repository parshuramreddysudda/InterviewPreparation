import java.util.Scanner;

/**
 * @author parsh
 *
 */
public class PrimeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int number =Integer.parseInt(reader.next());
        boolean check = false;
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
