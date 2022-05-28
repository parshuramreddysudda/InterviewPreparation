import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {

        System.out.println(longestValidParentheses2(")()())"));
    }

    public static int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int length = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
                stack.forEach(System.out::print);
            } else {
                stack.pop();
                if (stack.isEmpty())
                    stack.push(i);
                else
                    length = Math.max(i - stack.peek(), length);

            }
            System.out.println("\nMax lenth is " + length);
        }
        return length;
    }

    public static int longestValidParentheses2(String s) {

        int right = 0, left = 0, maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                left++;
            else right++;

            if (left == right)
                maxLength = Math.max(maxLength, left + right);
        }
        left=0;right=0;
        for (int i = s.length()-1; i > 0; i--) {
            if (s.charAt(i) == '(')
                left++;
            else right++;

            if (left == right)
                maxLength = Math.max(maxLength, left + right);
        }
        return maxLength;
    }
}
