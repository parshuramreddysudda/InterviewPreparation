package stacks;

import java.util.ArrayList;

public class StackArray {

	ArrayList<Integer> stack = new ArrayList<Integer>();

	public void push(int number) {
		stack.add(number);
	}

	public int pop() {
		int n = stack.get(stack.size()-1);
		System.out.println(stack.remove(stack.size()-1));
		return n;
	}

	public int peek() {
		return stack.get(stack.size()-1);
	}

	public boolean isEmpty() {
		return stack.size() == 0;
	}
}
