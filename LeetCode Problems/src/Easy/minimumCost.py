import heapq
from typing import List


class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        # ❌ Implement your solution here
        if len(nums) == 3 :
            return sum(nums)

        ans = nums[0]
        nums.pop(0)
        nums.sort()

        return ans +sum(nums[0:2])


def test_minimumCost_3010():
    sol = Solution()

    def validate(nums, expected):
        result = sol.minimumCost(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    # validate([1,2,3,12], 6)
    # validate([5,4,3,2,1], 8)
    # validate([10,3,1,1], 12)

    # 🔬 Edge cases
    validate([1,1,1], 3)                 # Minimum valid size
    validate([5,5,5], 15)                # All same
    validate([100,1,1], 102)             # Large + small
    validate([1,100,100], 201)

    # 🔬 Corner / tricky cases
    validate([1,2,100,100], 103)
    validate([10,1,2,3], 13)
    validate([7,3,5,1], 11)
    validate([2,9,1,8], 11)

    # 🔬 Large input case
    large_nums = [1] + list(range(2, 10002))
    validate(large_nums, 6)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minimumCost_3010()
