package Easy;

import java.util.Arrays;

public class TansposeMatrix {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{{1, 2}, {4, 5}, {7, 8}})));
    }

    public static int[][] transpose(int[][] matrix) {

        System.out.println("Matrix length m=" + matrix.length + " N is " + matrix[0].length);
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] replica = new int[n][m];
        for (int i = 0; i < m; i++) 
            for (int j = 0 ; j < n; j++)
                    replica[j][i]=matrix[i][j];
        return replica;
    }

}



