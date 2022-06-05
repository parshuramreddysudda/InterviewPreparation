package Hard;

import java.util.Stack;

public class NqueenTwo {

    public static void main(String[] args) {


        System.out.println(totalNQueens(11));
        System.out.println(ans);
    }

    static int ans = 0;
    static Stack<Integer> positiveDiagonal = new Stack<>();
    static Stack<Integer> negativeDiagonal = new Stack<>();

    public static int totalNQueens(int n) {
        int[][] board = new int[n][n];
        Stack<Integer> row = new Stack<>();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            row.push(i);
            positiveDiagonal.push(i);
            negativeDiagonal.push(-i);
            System.out.println(" First Row is "+0+" Column is "+i);
            solve(1, row, n-1,n);
            positiveDiagonal.pop();
            negativeDiagonal.pop();
            row.pop();
        }
        return ans;
    }

    public static void solve(int start, Stack<Integer> row, int size, int n) {

        if (size==0) {
            ans += 1;
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Row is "+start+" Column is "+i);
            if (verifyPosition(start, i, row)) {
                System.out.println(" Verified Row is "+start+" Column is "+i);
                row.push(i);
                positiveDiagonal.push(start + i);
                negativeDiagonal.push(start - i);
                solve(start + 1, row, size-1,n);
                positiveDiagonal.pop();
                negativeDiagonal.pop();
                row.pop();
            }
        }
    }

    public static boolean verifyPosition(int start, int i, Stack<Integer> row) {

        return !(row.contains(i) || positiveDiagonal.contains(start + i) || negativeDiagonal.contains(start - i));
    }


}

