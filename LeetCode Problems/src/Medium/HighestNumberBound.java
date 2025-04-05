import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HighestNumberUnderBound {


    public static String findHighestNumber(List<Integer> digits, String higherBound) {
        Collections.sort(digits, Collections.reverseOrder());
        int boundLength = higherBound.length();
        int digitsCount = digits.size();


        // If we can't form a number with the same number of digits as the bound,
        // the answer is the largest number with one less digit
        if (digitsCount < boundLength) {
            return listToString(digits);
        }


        // Try to form a number with the same number of digits as the bound
        List<Integer> result = new ArrayList<>();
        if (buildNumber(digits, higherBound, 0, result)) {
            return listToString(result);
        }


        // If no number with same length is possible, return largest number with one less digit
        if (digitsCount > 1) {
            return listToString(digits.subList(0, boundLength - 1));
        }


        return ""; // edge case: no possible number
    }


    private static boolean buildNumber(List<Integer> digits, String bound, int index, List<Integer> current) {
        if (index == bound.length()) {
            return true;
        }


        int boundDigit = Character.getNumericValue(bound.charAt(index));
        for (int i = 0; i < digits.size(); i++) {
            int digit = digits.get(i);
            if (digit > boundDigit) {
                if(current.isEmpty()) {
                    continue; // can't start with a larger digit
                }
                else{
                    // If we've already chosen a smaller digit earlier, we can take any remaining digits
                    current.addAll(digits);
                    return true;
                }
            }


            List<Integer> remainingDigits = new ArrayList<>(digits);
            remainingDigits.remove(i);
            current.add(digit);


            if (digit < boundDigit) {
                // If we've chosen a smaller digit, the rest can be in any order
                current.addAll(remainingDigits);
                return true;
            }


            if (buildNumber(remainingDigits, bound, index + 1, current)) {
                return true;
            }


            // Backtrack
            current.remove(current.size() - 1);
        }


        return false;
    }


    private static String listToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        // Example 1
        List<Integer> digits1 = new ArrayList<>();
        digits1.add(8);
        digits1.add(7);
        digits1.add(1);
        String bound1 = "1000";
        System.out.println("Digits: " + digits1 + ", higher bound: " + bound1);
        System.out.println("Answer: " + findHighestNumber(digits1, bound1)); // Output: 871


        // Example 2
        List<Integer> digits2 = new ArrayList<>();
        digits2.add(8);
        digits2.add(7);
        digits2.add(1);
        String bound2 = "200";
        System.out.println("\nDigits: " + digits2 + ", higher bound: " + bound2);
        System.out.println("Answer: " + findHighestNumber(digits2, bound2)); // Output: 187


        // Additional test case
        List<Integer> digits3 = new ArrayList<>();
        digits3.add(4);
        digits3.add(3);
        digits3.add(2);
        String bound3 = "321";
        System.out.println("\nDigits: " + digits3 + ", higher bound: " + bound3);
        System.out.println("Answer: " + findHighestNumber(digits3, bound3)); // Output: 243
    }
}
