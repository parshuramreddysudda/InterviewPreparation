package Easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        Map<Character,String> stringMap=new HashMap<>();
        for (String str:arr) {
            if(stringMap.containsKey(str)){
                
            }
        }
        return false;
    }

}
