import java.util.*;

public class ShortestPathWithConstraints {
    static class Cell {
        int row, col, distance;

        public Cell(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }
    }


    public static int maxMinDistance(int m, int n,int startRow, int startCol, int endRow, int endCol, List<Integer> rowList, List<Integer> colList) {


        boolean[][] visited = new boolean[m][n];
        int[][] values=new int[m][n];
        PriorityQueue<Cell> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance); // Change the comparator

        pq.offer(new Cell(startRow, startCol, Integer.MAX_VALUE));
        int minDistanceTotal=Integer.MAX_VALUE;
        visited[startRow][startCol] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while (!pq.isEmpty()) {
            Cell cell = pq.poll();
            if (cell.row == endRow && cell.col == endCol) {
                System.out.println("Excuted");
                return minDistanceTotal; // Return the maximum minimum distance found
            }
            for (int d = 0; d < 4; d++) {
                int newRow = cell.row + dr[d];
                int newCol = cell.col + dc[d];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    int newMinDistance = calculateMinDistance(newRow,newCol,rowList,colList);
                    minDistanceTotal = Math.min(minDistanceTotal, values[newRow][newCol]);
                    pq.offer(new Cell(newRow, newCol,newMinDistance));
                    values[newRow][newCol]=newMinDistance;
                    visited[newRow][newCol] = true;
                }
            }
        }
        System.out.println("Executed");

        return -1; // No valid path found
    }

    public static int calculateMinDistance(int row, int col, List<Integer> monsterRow, List<Integer> monsterColumn) {
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < monsterRow.size(); i++) {
            int monsterRowPos = monsterRow.get(i);
            int monsterColPos = monsterColumn.get(i);

            int distance = Math.abs(monsterRowPos - row) + Math.abs(monsterColPos - col);
            minDistance = Math.min(minDistance, distance);
        }
        return minDistance;
    }


    public static void main(String[] args) {
        int startRow = 1;
        int startCol = 1;
        int endRow = 4;
        int endCol = 2;

        int shortestDistance = maxMinDistance(5,3, startRow, startCol, endRow, endCol, Arrays.asList(0,1), Arrays.asList(2,2));

        if (shortestDistance != -1) {
            System.out.println("Shortest distance: " + shortestDistance);
        } else {
            System.out.println("No valid path found.");
        }
    }
}
