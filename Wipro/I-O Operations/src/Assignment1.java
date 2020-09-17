import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment1 {

	/**
	 * 
	 */
	public Assignment1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename = sc.nextLine();
		System.out.println("Enter the character to be counted");
		char needle = sc.nextLine().charAt(0);
	
		File file = new File(filename);
		int charCount = 0;
		String currentDirectory = System.getProperty("user.dir");
	    System.out.println("The current working directory is " + currentDirectory);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		int ch;
		do {
			ch = br.read();
			
			if (ch >= 65 && ch <= 90) ch += 32;
			if (needle >= 65 && needle <= 90) needle += 32;
			
			if (ch == needle)
				charCount++;
		} while (ch != -1);
				
		System.out.println("File '" + filename + "' has " +
				charCount + " instances of letter '" + needle + "'.");
		
		br.close();
		sc.close();
	}

}
