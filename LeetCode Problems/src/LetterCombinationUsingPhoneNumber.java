import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombinationUsingPhoneNumber {
    public static void main(String[] args) {
        String digit = "23";
        System.out.println(letterCombinations(digit));

    }

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return list;

        int len = digits.length();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = digits.charAt(i) - '0';
        }
        String letters[] = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < letters[arr[0]].length(); i++) {
            queue.offer(String.valueOf(letters[arr[0]].charAt(i)));
        }
        for (int i = 1; i < arr.length; i++) {
            int size = queue.size();
            while (size-- > 0) {
                String ch = queue.poll();
                for (int j = 0; j < letters[arr[i]].length(); j++) {
                    queue.offer(letters[arr[i]].charAt(j) + ch);
                    System.out.println("String inserted onto queue is : "+letters[arr[i]].charAt(j) + ch);
                }
            }
        }
        System.out.println("Queue size is "+queue.size());

        while (!queue.isEmpty()){
            list.add(queue.poll());
        }

        return list;
    }

}
