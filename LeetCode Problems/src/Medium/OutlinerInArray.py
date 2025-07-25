from collections import Counter
from typing import List


class Solution:
    def getLargestOutlier(self, nums: List[int]) -> int:
        """
        Returns the largest outlier number in the array.
        (Outlier: a number that is not equal to sum of any two numbers in the array)
        """
        if len(nums) < 2:
            return -1

        totalSum = sum(nums)
        hashMap = Counter(nums)
        solution = float('-inf')
        for num in nums:
            temp = (totalSum - num)
            if temp % 2 == 0:
                temp /= 2
                if temp in hashMap:
                    if temp == num and hashMap[num] == 1:
                        continue
                    solution = max(solution, num)

        return solution


                # TODO: Implement your logic here
        return 0


# ------------------ Test Harness ------------------

def test_getLargestOutlier():
    sol = Solution()

    def validate(nums, expected):
        result = sol.getLargestOutlier(nums)
        assert result == expected, f"Failed for nums={nums}, expected {expected}, got {result}"

    # 🔬 Complex / Edge test cases
    validate([2, 3, 5, 7, 12], 12)  # 12 is not sum of any two others
    validate([1, 2, 3, 6], 6)  # 6 is not sum of any two others
    validate([1, 1, 2, 3], 3)  # Check duplicates
    validate([10, 20, 30, 5], 30)  # Largest outlier
    validate([1, 2, 4, 8, 16], 16)  # Powers of two
    validate([0, 0, 0, 1], 1)  # Outlier with zeros
    validate([100], 100)  # Single element
    validate([-1, -2, -3, -6], -1)  # Negative numbers

    print("✅ All test cases passed!")


# Run the tests
if __name__ == "__main__":
    test_getLargestOutlier()
