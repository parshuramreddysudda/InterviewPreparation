package stacks;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {

		String str = "This is the String";
		System.out.println(reverseString(str));

	}

	private static String reverseString(String str) {

		System.out.println("ASd");
		Stack<Character> charStack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++)
			charStack.add(str.charAt(i));

		String rev = "";	
		while (!charStack.isEmpty()) 
			rev += charStack.pop();
		
		return rev;
	}

}
