package Medium;

import java.util.HashSet;

class LongestSubSequenceWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(longestSubSequenceWithoutRepeatingCharacters("abcabcaacbd"));
    }
    public static int longestSubSequenceWithoutRepeatingCharacters(String s) {

        if(s.length()==0||s.length()==1){
            return s.length();
        }
        HashSet<Character> set = new HashSet<>();
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                size = Math.max(size, set.size());
                while(set.contains(s.charAt(i))){
                    set.remove(0);
                }
                set.add(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return size;
    }
}
