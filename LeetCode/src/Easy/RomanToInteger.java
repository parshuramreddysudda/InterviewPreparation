package Easy;

import java.util.HashMap;
import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> rank = new HashMap<>();
        HashMap<Character, Integer> value = new HashMap<>();
        Character[] str = new Character[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values = new int[]{1, 5, 10, 50, 100, 500, 1000};
        for (int i = 0; i < values.length; i++) {
            rank.put(str[i], i);
            value.put(str[i], values[i]);
        }
        int currentRank = -1;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (currentRank > rank.get(s.charAt(i))) {
                result -=  value.get(s.charAt(i));
            } else {
                result += value.get(s.charAt(i));
            }
            currentRank = Math.max(rank.get(s.charAt(i)), currentRank);
        }
        return result;
    }
}

