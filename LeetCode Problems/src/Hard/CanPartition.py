from typing import List


class Solution:

    def findIfTrue(self, grid) -> bool:
        totalSum = sum(sum(r) for r in grid)

        running = sum(grid[0])
        rows = len(grid)
        cols = len(grid[0])

        # First Row
        firstRowSum = totalSum - running
        if firstRowSum == 0:
            return True

        if firstRowSum < 0:
            index = grid[0].index(abs(firstRowSum))
            if index == 0 or index == rows - 1:
                return True

        if firstRowSum > 0:
            if any(firstRowSum in arr for arr in grid[1:]):
                return True

        for i in range(1, len(grid) - 1):
            running += sum(grid[i])
            curSum = totalSum - running
            if running == curSum:
                return True

            if curSum < 0:
                if any(abs(curSum) in arr for arr in grid[:i]):
                    return True

            if curSum > 0:
                if any(abs(curSum) in arr for arr in grid[i+1:len(grid)-2]):
                    return True

        lastRowSum = totalSum - sum(grid[-1])
        if lastRowSum == 0:
            return True

        if lastRowSum < 0:
            index = grid[-1].index(abs(lastRowSum))
            if index == 0 or index == cols - 1:
                return True

        if lastRowSum > 0:

            if any(lastRowSum in arr for arr in grid[:rows-1]):
                return True

        return False
    def canPartitionGrid(self, grid: List[List[int]]) -> bool:
        # ❌ Implement your solution here

        return self.findIfTrue(grid)




def test_canPartitionGrid_II():
    sol = Solution()

    def validate(grid, expected):
        result = sol.canPartitionGrid(grid)
        assert result == expected, (
            f"❌ Failed for grid={grid}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([[1,2],[3,0]], True)
    validate([[1,1],[1,1]], True)
    validate([[1,2],[3,4]], False)

    # 🔬 Edge cases
    validate([[5]], False)                        # Single cell
    validate([[1,1,1,1]], True)                  # Single row
    validate([[2],[2],[2],[2]], True)            # Single column
    validate([[1,2,3,4]], False)

    # 🔬 Corner / tricky cases
    validate([[1,2,3],[3,2,1]], True)
    validate([[1,2,3],[4,5,6]], False)
    validate([[0,0,0],[0,0,0]], True)
    validate([[10,10],[10,10],[10,10]], True)
    validate([[1,3,2],[2,1,3],[3,2,1]], False)

    # 🔬 Cases specific to Partition II (removal allowed)
    validate([[1,2,3],[3,2,2]], True)
    validate([[1,1,1],[1,1,10]], True)
    validate([[5,5,5],[5,5,1]], False)
    validate([[2,2,2],[2,3,2]], True)
    validate([[1,2,3],[4,5,7]], True)

    # 🔬 Horizontal vs Vertical splits
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
    test_canPartitionGrid_II()