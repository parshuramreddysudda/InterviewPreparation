public class MaximumProductOfWordLengths {
    public static void main(String[] args) {
        System.out.println(maxProduct(new String[]{"a","ab","abc","d","cd","bcd","abcd"}));
    }

    public static int maxProduct(String[] words) {

        int length=0;
        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                length=Math.max(length,checkStrings(words[i],words[j]));
            }
        }
        return length;
    }

    public static int checkStrings(String str1, String str2) {

        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(String.valueOf(str1.charAt(i)))) {
                return 0;
            }
        }

        return str1.length() * str2.length();
    }
}
