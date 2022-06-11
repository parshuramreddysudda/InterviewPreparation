package Medium;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {

        if(s.length()==0||s.length()==1){
            return s.length();
        }
        HashSet<Character> set = new HashSet<>();
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                size = Math.max(size, set.size());
                set.clear();
                set.add(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return size;
    }
}
