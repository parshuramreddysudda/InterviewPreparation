from typing import List

class Solution:
    def minimumPairRemoval(self, nums: List[int]) -> int:
        # ❌ Implement your solution here

        length = len(nums)
        index = 0
        count = 0
        while len(nums) >  1 :

            isAscending = True
            targetIndex = -1
            minSum = float('inf')
            for j in range( len(nums)-1):

                curSum = nums[j] + nums[j+1]
                if nums[j] > nums[j+1]:
                    isAscending = False

                if minSum > curSum:
                    targetIndex = j
                    minSum = curSum

            if isAscending:
                break
            count += 1
            nums[targetIndex] = minSum
            nums.pop(targetIndex+1)

        return count


def test_minimumPairRemoval_2899():
    sol = Solution()

    def validate(nums, expected):
        result = sol.minimumPairRemoval(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )
    # #
    # # # 🔬 Core test cases
    validate([5,2,3,1], 2)
    validate([1,2,3], 0)
    validate([3,1,2], 1)

    # 🔬 Edge cases
    validate([], 0)                         # Empty array
    validate([5], 0)                        # Single element
    validate([2,2], 0)                      # Already non-decreasing
    validate([3,2], 1)                      # One removal

    # 🔬 Corner / tricky cases
    validate([10,1,1,1], 3)
    validate([4,3,2,1], 2)
    validate([1,3,2,4], 3)
    validate([100,1,100,1], 2)
    validate([1,100,1,100,1], 3)

    # 🔬 Large input case (performance)
    large_nums = list(range(50, 0, -1))
    validate(large_nums, 47)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minimumPairRemoval_2899()
