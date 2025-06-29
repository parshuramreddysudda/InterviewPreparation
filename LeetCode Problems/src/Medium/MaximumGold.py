from typing import List
import copy


class Solution:

    def getMaximumGold(self, grid: List[List[int]]) -> int:
        """
        Given a grid of integers where each cell represents the amount of gold,
        return the maximum amount of gold you can collect by walking one step
        at a time in 4 directions and visiting each cell only once per path.
        """
        # Implement your solution here
        maxRow, maxCol = len(grid), len(grid[0])

        def dfs(row, col):
            if row < 0 or row >= maxRow or col < 0 or col >= maxCol or grid[row][col] == 0:
                return 0

            temp = grid[row][col]
            grid[row][col] = 0
            maxSum = 0
            for dr, dc in [(1, 0), (-1, 0), (0, 1), (0, -1)]:
                maxSum = max(maxSum, dfs(dr+row,dc+col))

            grid[row][col] = temp

            return temp+maxSum

        result = 0
        for r in range(len(grid)):
            for c in range(len(grid[0])):
                if grid[r][c] != 0:
                    result = max(result, dfs(r, c))

        return result

    # def getMaxGoldFromPoint(self, grid: List[List[int]], row: int, col: int,maxSum:int) -> int:
    #     r, c = len(grid), len(grid[0])
    #
    #     if row < 0 or row > r or col < 0 or col > c or grid[row][col] == 0:
    #         return 0
    #
    #     temp = grid[row][col]
    #     grid[row][col] = 0
    #
    #     for dr,dc in [(1, 0), (-1, 0), (0, 1), (0,-1)]:
    #         maxSum = max(maxSum, temp + self.getMaxGoldFromPoint(grid,))

    # Test cases


def test_getMaximumGold():
    s = Solution()

    def validate(grid, expected_output):
        result = s.getMaximumGold(copy.deepcopy(grid))
        assert result == expected_output, f"Failed for {grid}: expected {expected_output}, got {result}"

    # Test case 1: Single path
    validate([[0, 6, 0], [5, 8, 7], [0, 9, 0]], 24)

    # Test case 2: Disconnected paths
    validate([[1, 0, 7], [2, 0, 6], [3, 4, 5], [0, 3, 0], [9, 0, 20]], 28)

    # Test case 3: All zeros
    validate([[0, 0, 0], [0, 0, 0]], 0)

    # Test case 4: Single cell with gold
    validate([[10]], 10)

    # Test case 5: Long vertical path
    validate([[1], [2], [3], [4]], 10)

    print("All test cases passed!")


# Run test cases
if __name__ == "__main__":
    test_getMaximumGold()
