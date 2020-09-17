import java.util.Scanner;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment6 {

	/**
	 * 
	 */
	public Assignment6() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			String name = "";
			int subA = 0;
			int subB = 0;
			int subC = 0;
			
			try {				
				name = sc.nextLine();
				
				if (sc.hasNextInt())
					subA = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subB = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subC = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (subA < 0) throw new IllegalArgumentException();
				if (subA > 100) throw new IllegalArgumentException();
				
				if (subB < 0) throw new IllegalArgumentException();
				if (subB > 100) throw new IllegalArgumentException();
				
				if (subC < 0) throw new IllegalArgumentException();
				if (subC > 100) throw new IllegalArgumentException();
				
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
		}
		
		sc.close();

	}
}
