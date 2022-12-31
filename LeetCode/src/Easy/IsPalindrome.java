package Easy;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a cansdfghjkal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        s=s.replaceAll("[^a-zA-Z0-9]", " ");
//        System.out.println("String is "+s);
        s=s.replaceAll(" ","");
        int start=0,last=s.length()-1;
        s=s.toLowerCase();
        while (start<last){
            if(s.charAt(start++)!=s.charAt(last--))
                return false;
        }
//        System.out.println(" String is "+s);
        return true;
    }
}
