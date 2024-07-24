import java.util.Random;

public class QuantilesAlgorithm {

    // PARTITION algorithm
    public static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p;
        for (int k = p; k < r; k++) {
            if (A[k] < x) {
                swap(A, i, k);
                i++;
            }
        }
        swap(A, i, r);
        return i;
    }

    // RANDOMIZED-PARTITION algorithm
    public static int randomizedPartition(int[] A, int p, int r) {
        int x = random(p, r);
        swap(A, x, r);
        return partition(A, p, r);
    }

    // RANDOMIZED-SELECT algorithm
    public static int randomizedSelect(int[] A, int p, int r, int i) {
        while (true) {
            if (p == r)
                return A[p];
            int q = randomizedPartition(A, p, r);
            int k = q - p + 1;
            if (i == k)
                return A[q];
            if (i < k)
                r = q - 1;
            else {
                p = q + 1;
                i = i - k;
            }
        }
    }

    // k-QUANTILES-SUB algorithm
    public static void kQuantilesSub(int[] A, int p, int r, int[] pos, int f, int e, int[] quantiles) {
        if (f + 1 > e)
            return;
        int mid = (f + e) / 2;
        int q = randomizedSelect(A, p, r, pos[mid]);
        quantiles[mid] = q;
        int k = q - p + 1;
        for (int i = mid + 1; i < e; i++)
            pos[i] = pos[i] - k;
        kQuantilesSub(A, q + 1, r, pos, mid + 1, e, quantiles);
    }

    // k-QUANTILES algorithm
    public static int[] kQuantiles(int[] A, int k) {
        int n = A.length;
        int num = n / k;
        int mod = n % k;
        int[] pos = new int[k];
        for (int i = 0; i < k; i++)
            pos[i] = num;
        for (int i = 0; i < mod; i++)
            pos[i] += 1;
        for (int i = 1; i < k; i++)
            pos[i] += pos[i - 1];
        int[] quantiles = new int[k];
        kQuantilesSub(A, 0, n - 1, pos, 0, k, quantiles);
        return quantiles;
    }

    // Helper function to swap elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper function to generate a random number between p and r (inclusive)
    public static int random(int p, int r) {
        Random rand = new Random();
        return rand.nextInt(r - p + 1) + p;
    }

    public static void main(String[] args) {
        int[] A = {7, 4, 9, 1, 3, 5, 8, 2, 6};
        int k = 3;
        int[] quantiles = kQuantiles(A, k);

        System.out.println("Quantiles:");
        for (int quantile : quantiles) {
            System.out.println(quantile);
        }
    }

//    Parition(A, p, r)
//        x = A[r]
//        i= p - 1
//        for j = p to r - 1
//            if A[j] < x
//                i ++
//                exchange A[i] with A[j]
//        exchange A[i + 1] with A[r]
//        return i +1
}
