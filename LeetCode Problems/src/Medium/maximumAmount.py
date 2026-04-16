import math
from sys import flags


class Solution:
    def maxAmount(self, grid):
        # ❌ Implement your solution here

        m, n = len(grid), len(grid[0])

        dp = [[[None for _ in range(3)] for _ in range(n)] for _ in range(m)]

        def dfs(grid, i, j,k):

            if i < 0 or j < 0 or i >= m or j >= n:
                return float('-inf')

            if dp[i][j][k] is not None:
                return  dp[i][j][k]

            if i ==m-1 and j == n-1:
                return grid[i][j]
            # Best of Right and bottom

            maxWithoutK = max(dfs(grid, i+1, j,k),dfs(grid, i, j+1, k)) + grid[i][j]
            maxWithK = 0
            if grid[i][j] < 0 < k:
                maxWithK = max(dfs(grid, i+1, j, k-1) , dfs(grid, i, j+1, k-1))

            result = max(maxWithK, maxWithoutK)
            dp[i][j][k] = result
            return dp[i][j][k]

        return dfs(grid, 0, 0, 2)


def test_maxAmount_3418():
    sol = Solution()

    def validate(grid, expected):
        result = sol.maxAmount(grid)
        assert result == expected, (
            f"❌ Failed for grid={grid}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([[0,1,-1],[1,-2,3],[2,-3,4]], 8)
    validate([[0,1,-1],[1,-2,3],[2,3,4]], 10)
    validate([[1,2,3],[4,5,6],[7,8,9]], 29)
    validate([[5,-10,4],[3,2,-1],[1,1,20]], 29)

    # 🔬 Edge cases
    validate([[5]], 5)                          # Single cell positive
    validate([[-5]], 0)                         # Single cell negative (skip logic)
    validate([[0,0],[0,0]], 0)                  # All zeros
    validate([[-1,-2],[-3,-4]], 0)              # All negatives

    # 🔬 Corner / tricky cases
    validate([[1,-100,3],[2,5,10],[4,2,1]], 18)
    validate([[10,-5,-5],[10,-5,-5],[10,10,10]], 40)
    validate([[1,2,-100],[2,-100,2],[3,2,1]], 9)
    validate([[100,-1,100],[-1,-1,-1],[100,-1,100]], 299)

    # 🔬 Path decision tricky
    validate([[1,2,3],[0,-100,100],[1,1,1]], 106)
    validate([[1,-1,1],[1,-1,1],[1,1,1]], 5)
    validate([[0,-1,10],[1,1,-1],[10,-1,1]], 21)

    # 🔬 Large input case
    large_grid = [[1]*100 for _ in range(100)]
    validate(large_grid, 199)   # Max path sum in uniform grid

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maxAmount_3418()