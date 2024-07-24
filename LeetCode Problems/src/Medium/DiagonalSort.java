package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalSort {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(diagonalSort(new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}})));
    }

    public static int[][] diagonalSort(int[][] mat) {
        // parse right to matrix

        int m = mat.length, n = mat[0].length;
//        System.out.println("M is " + m + "  N is" + n);
        for (int j = 0; j < n - 1; j++)
            sortMatrix(mat, 0, j);

        for (int j = 1; j < m - 1; j++)
            sortMatrix(mat, j, 0);

        return mat;
    }

    public static void sortMatrix(int[][] mat, int m, int n) {
        List<Integer> list=new ArrayList<>();

//        System.out.println(" M value is "+m+" N valye is "+n+" Array Lenght is "+list.size());
        for (int i = m, j = n; i < mat.length && j < mat[0].length; i++, j++) {
//            System.out.println(" First array I value is " + i + " J valye is " + j);
            list.add(mat[i][j]);
        }

//        System.out.println("Array is before sort" + list);

        Collections.sort(list);

//        System.out.println("Array is After sort" + list);
        for (int i = m, j = n, k = 0; i < mat.length && j < mat[0].length; i++, j++, k++) {
//            System.out.println(" Second array  I value is " + i + " J valye is " + j);
            mat[i][j] =list.get(k);
        }
    }
}
