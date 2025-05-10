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

        pass

# Test cases
def test_getMaximumGold():
    s = Solution()

    def validate(grid, expected_output):
        result = s.getMaximumGold(copy.deepcopy(grid))
        assert result == expected_output, f"Failed for {grid}: expected {expected_output}, got {result}"

    # Test case 1: Single path
    validate([[0,6,0],[5,8,7],[0,9,0]], 24)

    # Test case 2: Disconnected paths
    validate([[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]], 28)

    # Test case 3: All zeros
    validate([[0,0,0],[0,0,0]], 0)

    # Test case 4: Single cell with gold
    validate([[10]], 10)

    # Test case 5: Long vertical path
    validate([[1],[2],[3],[4]], 10)

    print("All test cases passed!")

# Run test cases
if __name__ == "__main__":
    test_getMaximumGold()
