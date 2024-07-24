package Medium;

public class NumberofMatchingSubsequences {
    public static void main(String[] args) {

        System.out.println(numMatchingSubseq(new String("abcde"),new String[]{"a","bb","acd","ace"}));
    }
    public static int numMatchingSubseq(String s, String[] words) {

    int result=0;
        for (String word : words) {
            if (s.contains(word)) {
                System.out.println(word);
                result++;
            }
        }

        return result;
    }
}
