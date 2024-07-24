package Medium;

public class InterLeavingString {
    public static void main(String[] args) {
        System.out.println(isInterleave(new String("aabcc"), new String("dbbca"), new String("aadbbcbcac")));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        int i = 0;
        boolean str1 = false, str2 = true, str = false;
        while (s3.length() > 0) {

            while (s1.charAt(i) == s3.charAt(i) && s1.length() > 1 && s3.length() > 1) {
                System.out.println(" Char is " + s1.charAt(i) + " And I value is " + i);
                i++;
                str1 = true;
            }

            if (i == 0 && str1 && s1.length() > 1) {
                return false;
            }
            s1 = s1.substring(i, s1.length() - 1);
            s3 = s3.substring(i, s3.length() - 1);
            System.out.println(" String 1 is"+s1);
            i = 0;
            while (s2.charAt(i) == s3.charAt(i) && s2.length() > 1 && s3.length() > 1) {
                System.out.println(" Char is " + s2.charAt(i) + " And I value is " + i);
                i++;
            }
            if (i == 0 && s2.length() > 1)
                return false;
            s2 = s2.substring(i, s2.length() - 1);
            s3 = s3.substring(i, s3.length() - 1);
            System.out.println(" String 2 is"+s2);
            i = 0;
        }
        return true;
    }
}
