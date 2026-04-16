from typing import List


class Solution:
    def canPartitionGrid(self, grid: List[List[int]]) -> bool:
        # ❌ Implement your solution here
        totalSum =sum(sum(r) for r in grid)

        running = 0
        rowSum  = totalSum
        for i in range(len(grid)):
            running += sum(grid[i])
            if running == totalSum - running:
                return True
            if running > totalSum - running :
                break

        running = 0

        for j in range(len(grid[0]) - 1):  # avoid empty partition
            col_sum = 0
            for i in range(len(grid)):
                col_sum += grid[i][j]

            running += col_sum

            if running == totalSum - running:
                return True

            if running > totalSum - running :
                break


        return False


def test_canPartitionGrid():
    sol = Solution()

    def validate(grid, expected):
        result = sol.canPartitionGrid(grid)
        assert result == expected, (
            f"❌ Failed for grid={grid}. "
            f"Expected {expected}, got {result}"
        )

    # # 🔬 Core test cases
    # validate([[1,2],[3,0]], True)
    # validate([[1,1],[1,1]], True)
    # validate([[1,2],[3,4]], False)
    #
    # # 🔬 Edge cases
    # validate([[5]], False)                        # Single cell
    validate([[1,1,1,1]], True)                  # Single row
    validate([[2],[2],[2],[2]], True)            # Single column
    validate([[1,2,3,4]], False)                # Cannot split equally

    # 🔬 Corner / tricky cases
    validate([[1,2,3],[3,2,1]], True)
    validate([[1,2,3],[4,5,6]], False)
    validate([[0,0,0],[0,0,0]], True)
    validate([[10,10],[10,10],[10,10]], True)
    validate([[1,3,2],[2,1,3],[3,2,1]], False)

    # 🔬 Horizontal vs Vertical split checks
    validate([[1,2],[1,2],[1,2]], True)
    validate([[1,1,1],[2,2,2]], True)
    validate([[1,2,3],[1,2,3],[1,2,3]], True)

    # 🔬 Large input case
    size = 100
    large_grid = [[1]*size for _ in range(size)]
    validate(large_grid, True)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_canPartitionGrid()