from sys import prefix
from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # ❌ Implement your solution here

        preArr = [1] * (len(nums) + 1)
        sufArr= [1] * (len(nums) + 1)

        curr = 1
        preArr[0] = 1
        for i in range(0,len(preArr)-1):
            preArr[i+1] = nums[i] * preArr[i]

        sufArr[-1] = 1
        for i in range(len(sufArr)-1,0,-1):
            sufArr[i-1] = nums[i-1] * sufArr[i]

        ans = [0] * len(nums)
        for i in range(len(preArr)-1):
            ans[i] = preArr[i] * sufArr[i+1]
        return ans


def test_productExceptSelf():
    sol = Solution()

    def validate(nums, expected):
        result = sol.productExceptSelf(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    # validate([1,2,3,4], [24,12,8,6])
    validate([2,3,4,5], [60,40,30,24])

    # 🔬 Edge cases
    validate([1], [1])                      # Single element
    validate([0], [1])                      # Single zero (by convention)
    validate([1,0], [0,1])                  # One zero
    validate([0,0], [0,0])                  # Two zeros

    # 🔬 Corner / tricky cases
    validate([0,1,2,3], [6,0,0,0])          # One zero inside
    validate([1,2,0,4], [0,0,8,0])
    validate([-1,1,0,-3,3], [0,0,9,0,0])    # Mix negative + zero
    validate([-1,2,-3,4], [-24,12,-8,6])    # All negatives/positives mix
    validate([5,0,2,0], [0,0,0,0])          # Multiple zeros

    # 🔬 Large input case
    large_nums = [1] * 10000
    expected_large = [1] * 10000
    validate(large_nums, expected_large)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_productExceptSelf()