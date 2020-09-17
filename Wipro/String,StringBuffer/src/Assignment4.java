/**
 Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "TomCata";
		
		String output;
		
		if (str.length() % 2 == 0) {
			output = str.substring(0, str.length() / 2);
		} else {
			output = null;
		}
		
		System.out.println(output);
	}

}
