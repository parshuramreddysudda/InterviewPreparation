public class BackspaceStringCompare {
    public static void main(String[] args) {

        System.out.println( backspaceCompare("y#f#o##f","y#f#o##f"));
    }
    public static boolean backspaceCompare(String s, String t) {


        StringBuilder s1=new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && s1.length() == 0) {
                continue;
            } else if (s.charAt(i) == '#' && i != 0) {
                s1.deleteCharAt(s1.length() - 1);
            } else {
                s1.append(s.charAt(i));
            }
        }

        System.out.println("S1 is " + s1 + " S1 length is " + s1.length() + " s1 is " + s1.charAt(0));
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < t.length(); i++) {

            if (t.charAt(i) == '#' && s2.length() == 0) {
                continue;
            } else if (t.charAt(i) == '#' && i != 0) {
                s2.deleteCharAt(s2.length() - 1);
            } else {
                s2.append(t.charAt(i));
            }

            System.out.println("S2 is " + s2 + " I value is " + i + "  S2 lenght " + s2.length());
        }

        System.out.println("S2 is "+s2);

        return s1.toString().equalsIgnoreCase(s2.toString());
    }
}
