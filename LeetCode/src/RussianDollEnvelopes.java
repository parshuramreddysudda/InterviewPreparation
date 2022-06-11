import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RussianDollEnvelopes {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        System.out.println(maxEnvelopes(arr));
    }

    public static int maxEnvelopes(int[][] envelopes) {

        Set<int[]> set = new HashSet<>(Arrays.asList(envelopes));

        // check element is present or not. if not loop will
        // break.
        for (int[] arr : set) {
            for (int j : arr) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(set);

        return 0;
    }
}
