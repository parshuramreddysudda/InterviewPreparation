package Medium;

import java.util.Arrays;

public class MatrixRotate {
    public static void main(String[] args) {
      rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }

    public static void rotate(int[][] matrix) {

        System.out.println(" Matrix before rotation");
        System.out.println(Arrays.toString(matrix));
        for (int i = 0; i < 1; i++) {
            rotateMatrix(i,i,matrix);
        }

        System.out.println(" Matrix After rotation");
        for (int[] x : matrix)
        {
            for (int y : x)
            {
                System.out.print(y + "  ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrix(int row, int col, int[][] matrix) {
        int length= matrix.length,temp=0;
        int[] arr=new int[length];

//        Rotate First

        for (int i = row,j=row; j <length-row ; j++) {
            arr[j]=matrix[i][j];
            System.out.println(" I value is "+i+" J value is "+j);
        }
        System.out.println(" Array is "+Arrays.toString(arr));
        System.out.println("Second Time rotating");

//        Rotate 2 time

        for (int i = row, j=length-row-1;i<length-row; i++) {
            temp=matrix[i][j];
            matrix[i][j]=arr[i];
            arr[i]=temp;
            System.out.println(" I value is "+i+" J value is "+j);
        }
        System.out.println(" Matrix After rotation");
        for (int[] x : matrix)
        {
            for (int y : x)
            {
                System.out.print(y + "  ");
            }
            System.out.println();
        }
//        Rotate 3rd time
        System.out.println(" Array is "+Arrays.toString(arr));
        System.out.println("Thrid Time rotating");
        for (int i = length-row-1, j=length-row-1;j>=row; j--) {
            temp=matrix[i][j];
            matrix[i][j]=arr[length-j-1];
            arr[length-j-1]=temp;
            System.out.println(" I value is "+i+" J value is "+j+" Array value is "+(length-j-1)+" Temp is "+matrix[i][j]);
        }
        System.out.println(" Array is "+Arrays.toString(arr));
//        Fourth rotation
//        System.out.println("Fourth Time rotating");
//
//        for (int i = length-row-1, j=row;i>=row; i--) {
//            temp=matrix[i][j];
//            matrix[i][j]=arr[length-i-1];
//            arr[length-i-1]=temp;
//            System.out.println(" I value is "+i+" J value is "+j+" Array value is "+(length-i-1));
//        }

        System.out.println(" Array is "+Arrays.toString(arr));
    }
}
