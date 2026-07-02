class Solution:



    def findSafeWalk(self, grid, health):
        # ❌ Implement your solution here

        m = len(grid)
        n = len(grid[0])
        dp = [[-1 for _ in range(n)] for _ in range(m)]
        def traverseArr(i, j,healthRemaining):

            if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]) or grid[i][j] == -1 or healthRemaining < 1:
                return False

            if grid[i][j] == 1:
                healthRemaining -=1

            if healthRemaining < 1:
                return False

            if i == m - 1 and j == n - 1:
                return True

            if dp[i][j] >= healthRemaining:
                return False

            dp[i][j] = healthRemaining

            originalVal =grid[i][j]

            grid[i][j] = -1

            for ni, nj in [(i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1)]:
                if traverseArr(ni, nj,healthRemaining):
                    grid[i][j] = originalVal
                    return True

            grid[i][j] = originalVal
            return False


        return traverseArr( 0, 0,health)




def test_findSafeWalk_3286():
    sol = Solution()

    def validate(grid, health, expected):
        result = sol.findSafeWalk(grid, health)
        assert result == expected, (
            f"❌ Failed for grid={grid}, health={health}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    # validate([[0,1,0],[0,1,0],[0,0,0]], 1, True)
    validate([[0,1,1],[1,1,1],[1,0,0]], 2, False)
    validate([[0]], 1, True)

    # 🔬 Edge cases
    # validate([[0]], 100, True)                              # Single safe cell
    # validate([[1]], 2, True)                                # Single unsafe cell, enough health
    # validate([[1]], 1, False)                               # Single unsafe cell, not enough health
    validate([[0,0,0]], 1, True)                            # Single row
    validate([[0],[0],[0]], 1, True)                        # Single column
    validate([[1,1,1]], 4, True)                            # All unsafe, enough health
    validate([[1,1,1]], 3, False)                           # All unsafe, exact damage

    # 🔬 Corner / tricky cases
    validate([[0,1],[1,0]], 2, True)
    validate([[0,1],[1,0]], 1, False)
    validate([[0,0,1],[1,0,1],[1,0,0]], 1, True)
    validate([[0,1,1],[0,1,0],[0,0,0]], 1, True)
    validate([[0,1,1],[1,1,0],[0,0,0]], 1, False)
    validate([[0,1,0],[1,1,0],[0,0,0]], 2, True)
    validate([[0,0,0],[1,1,0],[0,1,0]], 1, True)
    validate([[0,1,0],[0,1,1],[0,0,0]], 1, True)
    validate([[0,1,0],[1,1,1],[0,1,0]], 3, True)

    # 🔬 Large input cases
    # validate([[0] * 100 for _ in range(100)], 1, True)          # All safe
    # validate([[1] * 50 for _ in range(50)], 100, False)         # All unsafe, insufficient health
    # validate([[1] * 50 for _ in range(50)], 1000, True)         # All unsafe, enough health

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_findSafeWalk_3286()