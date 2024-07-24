package MS;

import java.util.Arrays;

public class WorstElement {
    public static void main(String[] args) {

        int count=0,total = 0;
        int[] A = new int[]{0,4,3,2,1};
        int key, j;
        for (int i = 2; i < A.length; i++) {
            key = A[i];
            j = i - 1;
            count=0;
            while (j > 0 && A[j] > key) {
                count++;
                A[j + 1] = A[j];
                j = j - 1;
            }
            total+=count;
            System.out.println(" I value is"+i+" Count value is "+count+" Total is "+total);
            A[j + 1] = key;
        }
        System.out.println(Arrays.toString(A));

    }
}
