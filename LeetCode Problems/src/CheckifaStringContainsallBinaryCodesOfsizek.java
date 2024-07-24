import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CheckifaStringContainsallBinaryCodesOfsizek {
    public static void main(String[] args) {

        System.out.println(hasAllCodes(new String("1000111"), 2));
    }

    public static boolean hasAllCodes(String s, int k) {

        Set<String> set = new HashSet<>();
        if(s.length()-k<0) return false;
        for(int i=0;i<=s.length()-k;i++) set.add(s.substring(i,i+k));

        Iterator itr = set.iterator();

        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        return set.size() == Math.pow(2, k);
    }
}
