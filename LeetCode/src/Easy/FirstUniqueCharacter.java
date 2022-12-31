package Easy;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            if(s.lastIndexOf(s.charAt(i))== s.indexOf(s.charAt(i)))
                return i;
        }
        return -1;
    }
}
