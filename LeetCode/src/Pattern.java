import java.util.Stack;

public class Pattern {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,3,2,0};
//        [1,0,1,-4,-3] false

        System.out.println(find132pattern(nums));
    }

    public static boolean find132pattern(int[] nums) {


        Stack<Integer> stack = new Stack<>();
        int min = 99999999;
        for (int i = nums.length - 1; i >= 0; i--) {

            if (min != 99999999 && min > nums[i])
                return true;

            while ((!stack.isEmpty()) && nums[i] > stack.peek()) {
                min = stack.pop();
            }
            System.out.println("Min is " + min);

            stack.push(nums[i]);
        }
        return false;
    }
}


//    int i = -1, j = 0;
//        while (i++ < nums.length-2) {
//        for (j = i + 1; j < nums.length-1; j++) {
//        for (int k = j + 1; k < nums.length; k++) {
//        System.out.println(" J is " + j + " K is " + k);
//        if (nums[i] < nums[k] && nums[k] < nums[j]) {
//        return true;
//        }
//        }
//        }
//        }
//
//        return false;

//    Stack<Integer> stack = new Stack<>();
//    int min = Integer.MAX_VALUE;
//        for (int num : nums) {
//                if (!stack.isEmpty())
//                min = Math.min(min, stack.peek());
//
//                System.out.println("Stack size is" + stack.size() + " Min value is " + min + " Peek si " + (stack.empty() ? "" : stack.peek()) + " num is " + num);
//                while ((!stack.isEmpty()) && num >= stack.peek()) {
//                System.out.println("Executed");
//                stack.pop();
//                }
//                System.out.println("Stack size is" + stack.size() + " Min value is " + min + " Peek si " + (stack.empty() ? "" : stack.peek()) + " num is " + num);
//
//                if ((!stack.empty()) && stack.peek() >= num && num > min)
//                return true;
//
//                stack.push(num);
//                }

