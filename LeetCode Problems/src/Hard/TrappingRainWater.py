from typing import List


class Solution:
    def trap(self, height: List[int]) -> int:
        """
        Given n non-negative integers representing an elevation map
        where the width of each bar is 1, compute how much water it can trap after raining.
        """
        # TODO: Implement the logic here

        left = 0
        right = 1
        curr = 0
        totalTrap = 0
        while right < len(height):
            currLeft = height[left]
            curr = 0
            while right < len(height) and height[left] > height[right]:
                curr += currLeft - height[right]
                right += 1

            if right == len(height) and height[left] > height[right-1]:
                right = len(height) - 1
                currHigh = right
                curr = 0
                while right > left:
                    if height[right] > height[currHigh]:
                        currHigh = right
                    curr += height[currHigh] - height[right]
                    right -= 1

                return totalTrap+curr

            totalTrap += curr

            left = right
            right += 1

        return totalTrap


# ------------------ Test Harness ------------------

def test_trapping_rain_water():
    sol = Solution()

    def validate(height, expected):
        result = sol.trap(height)
        assert result == expected, f"Failed for {height}, expected {expected}, got {result}"

    # Test cases
    validate([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1], 6)
    validate([4, 2, 0, 3, 2, 5], 9)
    validate([1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1], 6)
    validate([], 0)
    validate([2, 0, 2], 2)
    validate([3, 0, 0, 2, 0, 4], 10)

    print("All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_trapping_rain_water()
