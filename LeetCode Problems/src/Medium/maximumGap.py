from typing import List

class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        # ❌ Implement your solution here
        
        return 0


def test_maximumGap_164():
    sol = Solution()

    def validate(nums, expected):
        result = sol.maximumGap(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([3,6,9,1], 3)
    validate([10], 0)
    validate([1,10000000], 9999999)

    # 🔬 Edge cases
    validate([], 0)                              # Empty array
    validate([5], 0)                             # Single element
    validate([1,1,1,1], 0)                       # All equal values
    validate([0,0], 0)                           # Two zeros

    # 🔬 Corner / tricky cases
    validate([1,3,100], 97)
    validate([100,3,1]
