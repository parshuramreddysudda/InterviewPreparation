package hashmap;

import java.util.Map;
import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str="loveleetcode";
        System.out.println(firstUniqChar(str));
    }
    public static int firstUniqChar(String str){

        Map<Character,Integer> map=new HashMap<Character,Integer>();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            map.put(character, map.containsKey(character) ? map.get(character) + 1 : 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
