public class UniquePathsTwo {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 0, 0}, {0, 0, 1}, {0, 0, 0}};
        uniquePathsWithObstacles(arr);

    }

    static int m = 0;
    static int n = 0;
    static int count = 0;

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        m = obstacleGrid.length - 1;
        n = obstacleGrid[0].length - 1;
        System.out.println(" M is " + m + " N is " + n);
        uniquePathsWithObstaclesRecursion(0, 0, obstacleGrid);
        System.out.println("Count is " + count);
        return 0;
    }

    public static void uniquePathsWithObstaclesRecursion(int i, int j, int[][] obstacleGrid) {

        if (i == m && j == n)
            count++;
        if (i <= m && j <= n && i + 1 <= m && obstacleGrid[i + 1][j] != 1) {
            uniquePathsWithObstaclesRecursion(i + 1, j, obstacleGrid);
        }
        System.out.println(" I value is " + i + " J value is " + j);
        if (i <= m && j <= n && j + 1 <= n && obstacleGrid[i][j + 1] != 1) {
            uniquePathsWithObstaclesRecursion(i, j + 1, obstacleGrid);
        }
    }


}