import java.util.ArrayList;
import java.util.List;

public class Temp {
    public static String[] manipulateWords(String[] inputArray) {
        List<String> resultArray = new ArrayList<>();

        int length = inputArray.length;

        if (length == 0) {
            return new String[0];
        }

        for (int i = 0; i < length; i++) {
            String firstChar = String.valueOf(inputArray[i].charAt(0));
            String lastChar = String.valueOf(inputArray[(i + 1) % length].charAt(inputArray[(i + 1) % length].length() - 1));
            resultArray.add(firstChar + lastChar);
        }

        return resultArray.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] inputArray = {"cat", "dog", "ferret","scorpion"};
        String[] outputArray = manipulateWords(inputArray);

        for (String word : outputArray) {
            System.out.println(word);
        }
    }
}
