import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(shortestPathBinaryMatrix(grid));

    }


    public static int shortestPathBinaryMatrix(int[][] grid) {


        Queue<int[]> queue = new LinkedList<>();

        if (grid[0][0] == 1)
            return 0;
        int gridSize = grid.length - 1;

        queue.add(new int[]{0, 0, 1});

        int[][] dir = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] queArray = queue.poll();

                if (queArray[0] == gridSize && queArray[1] == gridSize)
                    return queArray[2];

                for (int[] d : dir) {
                    int r = queArray[0] + d[0];
                    int c = queArray[1] + d[1];

                    if (r <= gridSize && c <= gridSize && r >= 0 && c >= 0 && grid[r][c] == 0) {
                        queue.add(new int[]{r, c, queArray[2] + 1});
                    }
                }

            }
        }

        return -1;
    }
}
