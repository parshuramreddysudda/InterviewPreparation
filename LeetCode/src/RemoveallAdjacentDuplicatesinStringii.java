import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class RemoveallAdjacentDuplicatesinStringii {

    static class CharCounter {
        char ch;
        int counter;

        CharCounter(char ch) {
            this.ch = ch;
            this.counter = 1;
        }

        @Override
        public String toString() {
            return String.valueOf(ch);
        }
    }

    public static void main(String[] args) {
        String str = "deeedbbcccbdaa";
        System.out.println(removeDuplicates(str, 3));
    }

    public static String removeDuplicates(String s, int k) {

        if (s.length() == 1)
            return s;

        Stack<CharCounter> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if ((!stack.isEmpty()) && s.charAt(i) == stack.peek().ch) {
                System.out.println(" Stack element is" + stack.peek().ch);
                if (stack.peek().counter == k - 1) {
                    stack.pop();
                } else {
                    stack.peek().counter++;
                }
            } else {
                stack.push(new CharCounter(s.charAt(i)));
            }
        }
        System.out.println("Stack size is" + stack.size());
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            while (stack.peek().counter > 0) {
                result.append(stack.peek().toString());
                stack.peek().counter--;
            }
            stack.pop();
        }

        return result.reverse().toString();
    }

    public static void PrintStack(Stack<CharCounter> s) {
        Stack<CharCounter> temp = new Stack<CharCounter>();

        while (s.empty() == false) {
            temp.push(s.peek());
            s.pop();
        }

        while (temp.empty() == false) {
            Character t = temp.peek().ch;
            System.out.print(t + " ");
            temp.pop();
            // To restore contents of
            // the original stack.
            s.push(new CharCounter(t));
            s.peek().counter = temp.peek().counter;
        }
    }

}
