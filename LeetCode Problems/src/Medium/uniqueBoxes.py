class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid):
        m = len(obstacleGrid)
        n = len(obstacleGrid[0])

        dp = [[0 for _ in range(n)] for _ in range(m)]
        if obstacleGrid[0][0] == 1:
            return 0
        dp[0][0] = 1
        for i in range(1,n):
            if obstacleGrid[0][i] == 1:
                dp[0][i] = 0
            else:
                dp[0][i] = dp[0][i - 1]

        for row in range(1,m):
            for col in range(1):
                if obstacleGrid[row][col] == 1:
                    dp[row][col] = 0
                else:
                    dp[row][col] = dp[row-1][col]
        print(dp)
        for row in range(1, m):
            for col in range(1, n):
                if obstacleGrid[row][col] == 1:
                    continue
                if obstacleGrid[row - 1][col] == 1 and obstacleGrid[row][col - 1] != 1:
                    dp[row][col] = dp[row][col - 1]
                elif obstacleGrid[row][col - 1] == 1 and obstacleGrid[row - 1][col] != 1:
                    dp[row][col] = dp[row - 1][col]
                else:
                    dp[row][col] = dp[row - 1][col] + dp[row][col - 1]
        return dp[-1][-1]


def test_uniquePathsWithObstacles_63():
    sol = Solution()

    def validate(obstacleGrid, expected):
        result = sol.uniquePathsWithObstacles(obstacleGrid)
        assert result == expected, (
            f"❌ Failed for obstacleGrid={obstacleGrid}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    # validate([[0,0,0],[0,1,0],[0,0,0]], 2)
    # validate([[0,1],[0,0]], 1)
    #
    # # 🔬 Edge cases
    # validate([[0]], 1)                      # single empty cell
    # validate([[1]], 0)                      # single blocked cell
    # validate([[0,0]], 1)                    # single row
    # validate([[0],[0]], 1)                  # single column
    #
    # # 🔬 Blocked start/end
    # validate([[1,0],[0,0]], 0)              # start blocked
    # validate([[0,0],[0,1]], 0)              # end blocked

    # 🔬 Fully blocked paths
    validate([[0,1,0],[1,0,0],[0,0,0]], 0)
    validate([[0,0,0],[1,1,0],[0,0,1]], 0)

    # 🔬 Tricky obstacle placements
    validate([[0,0,0],[0,1,0],[0,0,1]], 0)
    validate([[0,0,0],[0,1,0],[0,0,0]], 2)
    validate([[0,0,0,0],[0,1,1,0],[0,0,0,0]], 2)

    # 🔬 Narrow valid path
    validate([[0,1,0],[0,1,0],[0,0,0]], 1)

    # 🔬 Larger cases
    validate(
        [
            [0,0,0,0],
            [0,1,0,0],
            [0,0,0,1],
            [0,0,0,0]
        ],
        4
    )

    # 🔬 Large grid stress test
    large_grid = [[0] * 20 for _ in range(20)]
    validate(large_grid, 35345263800)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_uniquePathsWithObstacles_63()