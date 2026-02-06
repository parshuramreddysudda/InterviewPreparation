from typing import List

class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        # ❌ Implement your solution here
        if nums is None or len(nums) < k:
            return 0
        nums.sort()
        minValue = float('inf')
        k = k - 1
        start = k
        while start < len(nums):
            minValue = min(minValue, nums[start] - nums[start - k])
            start = start+1

        return minValue


def test_minimumDifference_1984():
    sol = Solution()

    def validate(nums, k, expected):
        result = sol.minimumDifference(nums, k)
        assert result == expected, (
            f"❌ Failed for nums={nums}, k={k}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([90], 1, 0)
    validate([9,4,1,7], 2, 2)
    validate([9,4,1,7], 3, 5)

    # 🔬 Edge cases
    validate([], 1, 0)                       # Empty array
    validate([5,5,5], 1, 0)                  # k = 1
    validate([1,2,3], 3, 2)                  # Use all elements
    validate([1,100], 2, 99)

    # 🔬 Corner / tricky cases
    validate([1,3,6,10,15], 3, 5)
    validate([1,5,9,14], 2, 4)
    validate([100,200,300,400], 2, 100)
    validate([1,1,1,1,100], 4, 0)

    # 🔬 k greater than length
    validate([1,2], 5, 0)

    # 🔬 Large input case (performance)
    large_nums = list(range(1, 100001))
    validate(large_nums, 50000, 49999)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minimumDifference_1984()