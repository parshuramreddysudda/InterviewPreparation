import java.util.HashSet;
import java.util.Set;

public class NumberofJewels {

	public static void main(String[] args) {

		String J = "BzRHI", S = "VEwnJGxNyA";
		int i = 0;
		int[] charmap = new int[52];

		while (i < J.length()) {
			charmap[hashCode(J.charAt(i))] = 1;
			i++;

		}
		i = 0;
		int count = 0;
		while (i < S.length()) {
			if(charmap[hashCode(S.charAt(i))]==1) {
				System.out.println("Element found is "+S.charAt(i)+" Char map is "+hashCode(S.charAt(i)));
				count++;
			}
			i++;
		}
		System.out.println("Count is "+count);
		
	}


	static int hashCode(char c) {
		
		if (c >= 'a' && c <= 'z') {
			System.out.println("Char is "+c);
			System.out.println((c - 'a'));
			return (c - 'a');
		}
		if (c >= 'A' && c <= 'Z') {
			System.out.println("Char is "+c);
			System.out.println((c - 'A')+26);
			return (c - 'A')+26;
		}
		return -1;
	}

}
