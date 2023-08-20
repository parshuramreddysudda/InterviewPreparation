import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ParallelPerfectPairs {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] numbers = generateRandomArray(100000);  // Change array length as needed
        int perfectPairCount = countPerfectPairsParallel(numbers, 4);  // Number of threads

        System.out.println("Number of perfect pairs: " + perfectPairCount);
    }

    public static int countPerfectPairsParallel(int[] numbers, int numThreads)
            throws InterruptedException, ExecutionException {
        int n = numbers.length;
        int[] maxAbs = new int[n];
        int[] minAbs = new int[n];

        for (int i = 0; i < n; i++) {
            maxAbs[i] = Math.max(numbers[i], -numbers[i]);
            minAbs[i] = Math.min(numbers[i], -numbers[i]);
        }

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<Integer>> futures = new ArrayList<>();

        int chunkSize = n / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? n : (i + 1) * chunkSize;
            int[] subArray = Arrays.copyOfRange(numbers, start, end);

            Callable<Integer> task = () -> {
                int perfectPairCount = 0;
                for (int x : subArray) {
                    for (int y : numbers) {
                        if (Math.abs(x - y) <= maxAbs[x] && Math.abs(x + y) >= minAbs[x]) {
                            perfectPairCount++;
                        }
                    }
                }
                return perfectPairCount;
            };

            futures.add(executor.submit(task));
        }

        int totalPerfectPairs = 0;
        for (Future<Integer> future : futures) {
            totalPerfectPairs += future.get();
        }

        executor.shutdown();
        return totalPerfectPairs;
    }

    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000) - 500;  // Generate random numbers between -500 and 499
        }
        return array;
    }
}
