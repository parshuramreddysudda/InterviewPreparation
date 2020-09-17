/**	
 Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ab*cd";
		
		String[] strs = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : strs)
			sb.append(x);
		
		System.out.println(sb);

	}

}
