import java.util.Scanner; 
/**
 *   Write a program to receive a color code from the user (an Alphabhet). 

The program should then print the color name, based on the color code given. 

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 

If color code provided by the user is not valid then print "Invalid Code". 
 */

/**
 * @author parsh
 */


public class ColorCode {
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		char c = reader.next().charAt(0);
		switch(c) {
		case 'R':System.out.print("Red");
		break;
		case 'B':System.out.print("Blue");
		break;
		case 'G':System.out.print("Green");
		break;
		case 'O':System.out.print("Orange");
		break;
		case 'Y':System.out.print("Yellow");
		break;
		default:System.out.print("Invalid Code");
		}
	}

}


