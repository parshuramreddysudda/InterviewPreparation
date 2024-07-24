import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {

        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        for (String value : word1) str1.append(value);

        StringBuilder str2=new StringBuilder();
        for (String s : word2) str2.append(s);

        return str1.toString().equalsIgnoreCase(str2.toString());

    }
}
