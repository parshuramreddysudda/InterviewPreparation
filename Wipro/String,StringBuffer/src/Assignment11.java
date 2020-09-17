/**
 *  Given two strings a and b, return a new string, following the rules given below. 
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.

Example1)
i/p:abcXY123XYijk,XY
o/p:c13i

Example2)
i/p:XY123XY,XY
o/p:13

Example3)
i/p:XY1XY,XY
o/p:11
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "abcXY123XYijk"; // "XY123XY"
		String str2 = "XY";
		
		StringBuffer sb = new StringBuffer();
		
		while (str1.indexOf(str2) != -1) {	
			int index = str1.indexOf(str2);
			
			if (index == 0 && index + str2.length() < str1.length() - 1) {
				sb.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			
			if (index - 1 >= 0 && index + str2.length() >= str1.length()) {
				sb.append(str1.charAt(index - 1));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			
			if (index + str2.length() < str1.length() - 1 && index - 1 >= 0) {
				sb.append(str1.charAt(index - 1));
				sb.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
			}
		}

		System.out.println(sb);
	}

}
