/**
 Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Wipro";
		int n = str.length();
		
		String repeater = "";
		
		if (n < 2) repeater = str;
		else repeater = str.substring(0, 2);
		
		String output = "";
		
		for (int i = 0; i < n; i++) {
			output += repeater;
		}
		
		System.out.println(output);

	}
}
