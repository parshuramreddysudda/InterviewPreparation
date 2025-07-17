from typing import List
from collections import Counter


class Solution:
    def maximumLength(self, nums: List[int]) -> int:
        """
        Given an array of integers, return the maximum length of a special sequence
        such that for every element x in the sequence (except possibly the last),
        x^2 also exists in the sequence. Duplicates allowed per problem constraints.
        """
        # Implement your solution here
        res = 0
        ans = 0
        for par in [[0, 0], [1, 0], [1, 1], [0, 1]]:
            cnt = 0
            for num in nums:
                if num % 2 == par[cnt % 2]:
                    cnt += 1

            ans = max(ans, cnt)
        return ans


# 🔍 Test cases
def test_maximumLength():
    s = Solution()

    def validate(nums, expected_output):
        result = s.maximumLength(nums)
        assert result == expected_output, f"Failed for nums={nums}. Expected {expected_output}, got {result}"

    # ✅ Test case 1: Basic chain
    validate([1, 2, 4, 16], 3)  # 1 → 1^2=1 → 1^2=1... → okay for 1s, or 2→4→16

    # ✅ Test case 2: Multiple chains, return longest
    validate([1, 1, 1, 1, 2, 4, 16, 256], 4)  # 2 → 4 → 16 → 256

    # ✅ Test case 3: Only one valid square
    validate([3, 9], 2)

    # ✅ Test case 4: All identical values (like 1s)
    validate([1] * 10, 10)  # Can repeat 1^2 many times, but at most odd-length chain

    # ✅ Test case 5: No chain
    validate([2, 3, 5, 6], 1)

    # ✅ Test case 6: Edge case — empty list
    validate([], 0)

    print("All test cases passed!")


# 🚀 Run tests
if __name__ == "__main__":
    test_maximumLength()
