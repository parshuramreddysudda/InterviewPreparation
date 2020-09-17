/**
 Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment5 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		String str = "Wipro";
		
		str = str.substring(1, str.length() - 1);
		
		System.out.println(str);
	}

}
