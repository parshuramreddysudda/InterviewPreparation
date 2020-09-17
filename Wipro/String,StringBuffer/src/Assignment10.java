/** 
 * Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:Wipro,3
o/p:propropro
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Wipro";
		int n = 3;
		
		StringBuffer sb = new StringBuffer();
			
		for (int i = 0; i < n; i++) {
			sb.append(str.substring(str.length() - n));
		}

		System.out.println(sb);
	}

}
