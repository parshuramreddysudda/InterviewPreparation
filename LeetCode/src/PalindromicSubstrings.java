public class PalindromicSubstrings {
    public static void main(String[] args) {
        String str = "abca";

        System.out.println(countSubstrings(str));
        ;

    }

    public static int countSubstrings(String s) {

        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;

        for (int gap = 0; gap < s.length(); gap++) {
            for (int i = 0, j = gap; i < s.length() - gap; i++, j++) {
                if (gap == 0) {
                    dp[i][j] = true;
                    count++;
                } else if (gap == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                        count++;
                    } else {
                        dp[i][j] = false;
                    }

                } else {
                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        count++;
                    } else {
                        dp[i][j] = false;
                    }
                }
                System.out.println("I value is " + i + "  J value is " + j);
            }
            System.out.println("New Array si");
        }
        System.out.println(print2D(dp));


        return count;
    }

    public static boolean print2D(boolean[][] mat) {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j]) {
                    System.out.print(" T ");
                } else {
                    System.out.print(" F ");
                }
            }
            System.out.println();
        }

        return false;
    }
}
