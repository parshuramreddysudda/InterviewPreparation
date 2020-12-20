package leetcode.ArraysStrings;

public class ReverseTwoPointer {

	public static void main(String[] args) {

		char[] s = { 'h', 'e', 'v', 'l', 'o', 'p' };
		int first = 0, last = s.length - 1;
		char c = 'a';
		while (first < last) {
			System.out.println("printed");
			c = s[first];
			s[first] = s[last];
			s[last] = c;
			first++;
			last--;
		}
		for (char c1 : s)
			System.out.println(c1);

	}

}
