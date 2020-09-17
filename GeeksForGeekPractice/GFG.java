import java.math.BigInteger;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class GFG {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		{
			Scanner sc = new Scanner(System.in).useDelimiter("\n");

			// Initializing a Dictionary
			Dictionary geek = new Hashtable();
			geek.put("A", 2);
			geek.put("B", 22);
			geek.put("C", 222);
			geek.put("D", 3);
			geek.put("E", 33);
			geek.put("F", 333);
			geek.put("G", 4);
			geek.put("H", 44);
			geek.put("I", 444);
			geek.put("J", 5);
			geek.put("K", 55);
			geek.put("L", 555);
			geek.put("M", 6);
			geek.put("N", 66);
			geek.put("O", 666);
			geek.put("P", 7);
			geek.put("Q", 77);
			geek.put("R", 777);
			geek.put("S", 7777);
			geek.put("T", 8);
			geek.put("U", 88);
			geek.put("V", 888);
			geek.put("W", 9);
			geek.put("X", 99);
			geek.put("Y", 999);
			geek.put("Z", 9999);
			geek.put(" ", 0);

			int testcase = sc.nextInt();

			while (testcase-- > 0) {

				String s = sc.next();
//			if(sc.hasNextLine()){
//			    String k = sc.nextLine();
//			    if(k.length() > 0)
//			    	s +=" "+k;
//			}
				String result = "";
				for (int i = 0; i < s.length(); i++) {
					result += geek.get(String.valueOf(s.charAt(i)));
				}
				System.out.println(result);

			}
		}
	}

}
