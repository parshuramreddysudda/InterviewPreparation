/**
 Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		String str1 = "Mark";
		String str2 = "Kate";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		
		if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
			sb.append(str2.substring(1, str2.length()));
		} else {
			sb.append(str2);
		}
		
		System.out.println(sb);		
		
		sb.append(str1);
		
	}


}
