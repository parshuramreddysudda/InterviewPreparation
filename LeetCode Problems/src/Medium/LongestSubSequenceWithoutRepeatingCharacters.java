package Medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;

class LongestSubSequenceWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(longestSubSequenceWithoutRepeatingCharacters("pwwkew"));
    }
    public static int longestSubSequenceWithoutRepeatingCharacters(String s) {

        if(s.isEmpty() ||s.length()==1){
            return s.length();
        }
//        HashMap<Character,Integer> set = new HashMap<>();
        int size = 0;
        Deque<Character> deque= new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {

            if(deque.contains(s.charAt(i))){
                size=Math.max(size,deque.size());
                while(deque.contains(s.charAt(i))){
                    deque.removeFirst();
                }
                deque.addLast(s.charAt(i));
            }else {
                deque.addLast(s.charAt(i));
            }

        }
        return Math.max(size,deque.size());
    }
}
