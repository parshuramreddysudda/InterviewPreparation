import java.util.Scanner;
/**
 * @author parsh
 *
 */
public class Stars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int number =Integer.parseInt(reader.next());
		
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("* ");	
			
			}
			System.out.print("\n");
			
		}

	}

}
