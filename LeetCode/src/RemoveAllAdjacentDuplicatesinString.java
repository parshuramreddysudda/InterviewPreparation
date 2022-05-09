import java.util.Stack;

public class RemoveAllAdjacentDuplicatesinString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if ((!stack.isEmpty()) && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder result =new StringBuilder();
        while (!stack.isEmpty()) {
           result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
