package stacks;

public class StackAsArray {

	public static void main(String[] args) {

		StackArray stack = new StackArray();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());

	}

}
