package Hard;

public class MinimumWindowSubsequence {
    public static void main(String[] args) {

    }
    public static String minWindow(String S, String T) {

        int s1=0,s2=0,s1Length=S.length(),s2Length=T.length();
        int start=0,end=0;
        int minLength=Integer.MAX_VALUE;
        String minSubstring=null;

        while(s1<s1Length){

            if(S.charAt(s1)==T.charAt(s2)){
                if(s2==s2Length-1) {
                    end=s1;
                    while (s2 >= 0) {
                        if (S.charAt(s1) == T.charAt(s2)) {
                            s2--;
                        }
                        s1--;
                    }
                    start=s1+1;
                    System.out.println("Min String is "+S.substring(start,end));
                    if ((end - start + 1) < minLength) {
                        minSubstring = S.substring(start, end + 1);
                        minLength = minSubstring.length();
                    }
                    s1=s1+1;
                    s2=0;
                }
                else s2++;

            }
            s1++;
        }

        return minSubstring;

    }
}
