import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class RemoveallAdjacentDuplicatesinStringii {

    class CharCounter {
        char ch;
        int counter;
    }

    public static void main(String[] args) {
        String str = "deeedbbcccbdaa";
        System.out.println(removeDuplicates(str, 3));
    }

    public static String removeDuplicates(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            if ((!stack.isEmpty()) && stack.peek() == s.charAt(i)) {

                System.out.println("Stack size is" + stack.size());
                stack.push(s.charAt(i));
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
//                System.out.println("Before stack ");
//                PrintStack(stack);
//
//                System.out.println("After stack ");
//                PrintStack(stack);

            } else {
                stack.push(s.charAt(i));
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }

            if (map.get(stack.peek()) == k) {
                for (int j = 0; j < k; j++) {
                    stack.pop();
                }
                System.out.println("Stack Peek is"+stack.peek());
            }
        }
        System.out.println("Stack size is "+stack.size());

        return s;
    }
    public static void PrintStack(Stack<Character> s)
    {
        Stack<Character> temp = new Stack<Character>();

        while (s.empty() == false)
        {
            temp.push(s.peek());
            s.pop();
        }

        while (temp.empty() == false)
        {
            Character t = temp.peek();
            System.out.print(t + " ");
            temp.pop();
            // To restore contents of
            // the original stack.
            s.push(t);
        }
    }

}
