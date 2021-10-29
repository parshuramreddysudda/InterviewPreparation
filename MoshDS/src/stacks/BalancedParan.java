package stacks;

import java.util.Stack;

public class BalancedParan {

	public static void main(String[] args) {

		System.out.println(checkBalanced("{{{}}}{}{}{}"));
	}

	private static boolean checkBalanced(String x) {

		Stack<Character> charStack = new Stack<Character>();

		for (char ch : x.toCharArray()) {

			if (ch == '[')
				charStack.push(ch);
			if (ch == '{')
				charStack.push(ch);
			if (ch == '(')
				charStack.push(ch);

			if (charStack.isEmpty())
				return false;

			if (ch == ')') {
				if (charStack.peek() == '(')
					charStack.pop();
				else
					return false;
			}
			if (ch == ']') {
				if (charStack.peek() == '[')
					charStack.pop();
				else
					return false;
			}
			if (ch == '}') {
				if (charStack.peek() == '{')
					charStack.pop();
				else
					return false;
			}
			
			

		}

		return charStack.isEmpty();
	}

}
