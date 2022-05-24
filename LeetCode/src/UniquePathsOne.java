import java.util.Arrays;

public class UniquePathsOne {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths(int m, int n) {

        int[][] array = new int[m][n];

        for (int i = 1; i < n; i++) {
            array[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            array[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                array[i][j] = array[i - 1][j] + array[i][j - 1];
            }
        }

        print2D(array);


        return array[m-1][n-1];
    }

    public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));

    }
}
