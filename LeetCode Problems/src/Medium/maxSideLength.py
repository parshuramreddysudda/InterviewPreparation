from typing import List

class Solution:
    def maxSideLength(self, grid: List[List[int]], threshold: int) -> int:
        # ❌ Implement your solution here
        rows = len(grid)

        if rows == 0:
            return 0
        cols = len(grid[0])

        # ---------- Prefix sums ----------
        rowSum = [[0] * (cols + 1) for _ in range(rows)]
        colSum = [[0] * cols for _ in range(rows + 1)]

        for r in range(rows):
            for c in range(cols):
                rowSum[r][c + 1] = rowSum[r][c] + grid[r][c]
                colSum[r + 1][c] = colSum[r][c] + grid[r][c]

        # ---------- Helper functions ----------
        def getRowSum(r, c1, c2):
            return rowSum[r][c2 + 1] - rowSum[r][c1]

        def getColSum(c, r1, r2):
            return colSum[r2 + 1][c] - colSum[r1][c]

        # ---------- Check magic square ----------
        def isMagic(r, c, size):
            endR = r + size - 1
            endC = c + size - 1

            target = 0

            # check rows
            for i in range(r, endR + 1):
                target += getRowSum(i, c, endC)

            if target<=threshold:
                return size

            return 0

        # ---------- Try all square sizes ----------
        maxSize = 0

        for size in range(1, min(rows, cols) + 1):
            for r in range(rows - size + 1):
                for c in range(cols - size + 1):
                    maxSize =  max(maxSize,isMagic(r, c, size))

        return maxSize


def test_maxSideLength_1292():
    sol = Solution()

    def validate(mat, threshold, expected):
        result = sol.maxSideLength(mat, threshold)
        assert result == expected, (
            f"❌ Failed for mat={mat}, threshold={threshold}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate(
        [[1,1,3,2,4,3,2],
         [1,1,3,2,4,3,2],
         [1,1,3,2,4,3,2]],
        4,
        2
    )

    validate(
        [[2,2,2,2],
         [2,2,2,2],
         [2,2,2,2]],
        8,
        2
    )

    validate(
        [[1,2,3],
         [4,5,6],
         [7,8,9]],
        45,
        3
    )

    # 🔬 Edge cases
    validate([], 10, 0)                         # Empty matrix
    validate([[5]], 4, 0)                       # Single cell too large
    validate([[5]], 5, 1)                       # Single cell fits
    validate([[1,1],[1,1]], 0, 0)               # Threshold zero

    # 🔬 Corner / tricky cases
    validate(
        [[1,1,1],
         [1,1,1],
         [1,1,1]],
        3,
        1
    )

    validate(
        [[3,3,3],
         [3,3,3],
         [3,3,3]],
        27,
        3
    )

    validate(
        [[10,1,1],
         [1,1,1],
         [1,1,1]],
        4,
        2
    )

    # 🔬 Non-square matrix
    validate(
        [[1,2,3,4,5],
         [1,2,3,4,5]],
        12,
        2
    )

    # 🔬 Large matrix case (performance)
    large_mat = [[1]*50 for _ in range(50)]
    validate(large_mat, 2500, 50)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maxSideLength_1292()
