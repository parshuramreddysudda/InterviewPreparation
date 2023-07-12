package Easy;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("aaaaaa","bbaaaa"));
    }

    public static boolean isSubsequence(String s, String t) {

        int index=0;
        int pointer=0;
        while(index<t.length() && pointer<s.length()){
            char ch=s.charAt(pointer++);
            while(index<t.length() && t.charAt(index)!=ch) {
                index++;
                if (index == s.length())
                    return false;
            }
        }

        return pointer==s.length();
    }
}
