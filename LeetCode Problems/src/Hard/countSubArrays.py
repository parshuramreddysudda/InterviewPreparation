from typing import List

class Solution:
    def countSubarrays(self, nums: List[int], minK: int, maxK: int) -> int:
        # ❌ Implement your solution here

        index = 0
        count = 0
        minkIndex = -1
        startIndex = -1
        maxkIndex = -1
        while index < len(nums):
            if nums[index] < minK or nums[index] > maxK:
                startIndex = index
                minkIndex = -1
                maxkIndex = -1

            if nums[index] == minK:
                minkIndex = index

            if nums[index] == maxK:
                maxkIndex = index

            if minkIndex != -1 and maxkIndex != -1:
                count += max(0,min(minkIndex, maxkIndex)  - startIndex)
            index += 1

        return count


def test_countSubarrays_2444():
    sol = Solution()

    def validate(nums, minK, maxK, expected):
        result = sol.countSubarrays(nums, minK, maxK)
        assert result == expected, (
            f"❌ Failed for nums={nums}, minK={minK}, maxK={maxK}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    validate([1,3,5,2,7,5], 1, 5, 2)
    validate([1,1,1,1], 1, 1, 10)
    validate([2,1,3], 1, 3, 2)

    # 🔬 Edge cases
    validate([], 1, 5, 0)                       # Empty array
    validate([1], 1, 1, 1)                      # Single element valid
    validate([2], 1, 3, 0)                      # Single element invalid
    validate([1,5], 1, 5, 1)                    # Exact bounds
    validate([5,1], 1, 5, 1)                    # Order reversed

    # 🔬 Corner / tricky cases
    validate([1,5,1,5], 1, 5, 6)
    validate([1,2,3,4,5], 1, 5, 1)
    validate([5,4,3,2,1], 1, 5, 1)
    validate([1,5,2,1,5], 1, 5, 8)
    validate([1,3,1,3,1], 1, 3, 10)

    # 🔬 Invalid range breakers
    validate([1,6,5], 1, 5, 0)                  # 6 breaks window
    validate([1,5,0,1,5], 1, 5, 2)              # 0 breaks window

    # 🔬 Large input case (performance)
    large_nums = [1, 5] * 10000
    validate(large_nums, 1, 5, 199990000)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_countSubarrays_2444()
