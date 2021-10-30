package stacks;

import java.util.Stack;

public class LongestValidParan {

	public static void main(String[] args) {

		System.out.println(checkBalanced("((){}{}{}}"));
	}

	private static boolean checkBalanced(String x) {

		Stack<Character> charStack = new Stack<Character>();
		int count = 0;
		int max = 0;

		for (char ch : x.toCharArray()) {
			if (ch == '[' || ch == '{' || ch == '(')
				charStack.push(ch);
			
			if (charStack.isEmpty()) {
				max = Math.max(max, count);
				System.out.println("Max is " + max);
				return false;
			}

			if (ch == ')') {
				if (charStack.peek() == '(') {
					charStack.pop();
					count += 2;
					System.out.println("Called" + count);
				} else {
					System.out.println("Called else" + count);
					max = Math.max(max, count);
					count = 0;
				}

			}
			if (ch == ']') {
				if (charStack.peek() == '[') {
					charStack.pop();
					count += 2;
				} else {
					max = Math.max(max, count);
					count = 0;
				}
			}
			if (ch == '}') {
				if (charStack.peek() == '{') {
					charStack.pop();
					count += 2;
				} else {
					max = Math.max(max, count);
					count = 0;
				}
			}

		}
		max = Math.max(max, count);
		System.out.println("Max is " + max);
		return charStack.isEmpty();
	}

}
