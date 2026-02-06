from typing import List


class Solution:
    def maxTrionicSum(self, nums: List[int]) -> int:
        # ❌ Implement your solution here
        
        pass


def test_maxTrionicSum_3640():
    sol = Solution()

    def validate(nums, expected):
        result = sol.maxTrionicSum(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([1,3,5,4,2,6,8], 29)
    validate([2,4,6,5,3,7,9], 36)
    validate([1,2,3,2,1,2,3], 14)

    # 🔬 Edge cases
    validate([1,2,3], 0)                     # Too small to form trionic
    validate([3,2,1], 0)                     # No increasing part
    validate([1,2,1,2], 0)                   # Missing one phase
    validate([], 0)                          # Empty input
    validate([5], 0)                         # Single element

    # 🔬 Corner / tricky cases
    validate([1,4,7,6,5,8], 31)
    validate([5,10,15,14,13,20,25], 102)
    validate([1,3,2,1,2,3,4], 16)
    validate([10,9,8,7,8,9,10], 51)
    validate([1,2,5,4,3,4,5,6], 30)

    # 🔬 Multiple overlapping trionic subarrays
    validate([1,3,5,4,2,3,5,4,1,6], 27)

    # 🔬 Large input case
    large_nums = list(range(1, 5000)) + list(range(5000, 0, -1)) + list(range(1, 5000))
    validate(large_nums, sum(large_nums))

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maxTrionicSum_3640()
