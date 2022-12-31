package Medium;

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        // Checking Individual Matrices
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
//                System.out.println("Calling matrix with I value" + i + " J value is" + j);
                if (!isValidMatrix(board, i, j)) return false;
                else
                    j += 2;
            }
            i += 2;
        }
        // System.out.println(" Matrix Checking Completed");
//        Checking Rows
        Set<Character> columnSet = new HashSet<Character>();
        Set<Character> rowSet = new HashSet<Character>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
//                System.out.println("I value is"+i+" J value is "+j);
                if (board[i][j] != '.' && rowSet.contains(board[i][j])) return false;
                else rowSet.add(board[i][j]);

                if (board[j][i] != '.' && columnSet.contains(board[j][i])) return false;
                else columnSet.add(board[j][i]);
            }
            columnSet.clear();
            rowSet.clear();
        }
        return true;
    }

    public static boolean isValidMatrix(char[][] board, int row, int column) {

        Set<Character> hashSet = new HashSet<Character>();
        for (int i = row; i < row+3; i++) {
            for (int j = column; j < column+3; j++) {
//                System.out.println("I value is"+i+" J value is "+j);
                if (board[i][j] != '.' && hashSet.contains(board[i][j]))
                    return false;
                else
                    hashSet.add(board[i][j]);
            }
        }
//        System.out.println("HashSet is " + hashSet);

        return true;
    }
}