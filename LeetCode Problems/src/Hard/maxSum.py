from functools import total_ordering
from typing import List

class Solution:
    def maxSum(self, nums1: List[int], nums2: List[int]) -> int:
        # ❌ Implement your solution here
        arr1Index = 0
        arr2Index = 0
        arr1Sum = 0
        arr2Sum = 0
        while arr1Index < len(nums1) and arr2Index < len(nums2):

            if nums1[arr1Index] < nums2[arr2Index]:
               arr1Sum += nums1[arr1Index]
               arr1Index += 1
            elif nums2[arr2Index] < nums1[arr1Index]:
               arr2Sum += nums2[arr2Index]
               arr2Index += 1

            if arr1Index< len(nums1) and arr2Index< len(nums2) and  nums1[arr1Index] == nums2[arr2Index]:
               curSum = max(arr1Sum, arr2Sum) + nums1[arr1Index]
               arr1Sum, arr2Sum = curSum, curSum
               arr1Index += 1
               arr2Index += 1

        while arr1Index < len(nums1):
            arr1Sum += nums1[arr1Index]
            arr1Index += 1

        while arr2Index < len(nums2):
            arr2Sum += nums2[arr2Index]
            arr2Index += 1

        return max(arr1Sum, arr2Sum)


def test_maxSum_1537():
    sol = Solution()
    MOD = 10**9 + 7

    def validate(nums1, nums2, expected):
        result = sol.maxSum(nums1, nums2)
        assert result == expected % MOD, (
            f"❌ Failed for nums1={nums1}, nums2={nums2}. "
            f"Expected {expected % MOD}, got {result}"
        )

    # 🔬 Core test cases
    # validate([2,4,5,8,10], [4,6,8,9], 30)
    # validate([1,3,5,7,9], [3,5,100], 109)
    validate([1,2,3], [4,5,6], 15)

    # 🔬 Edge cases
    validate([], [], 0)                               # Both empty
    validate([1,2,3], [], 6)                          # One empty
    validate([], [4,5,6], 15)                         # One empty
    validate([5], [5], 5)                             # Single common
    validate([1], [2], 2)                             # No common

    # 🔬 Corner / tricky cases
    validate([1,4,5,6,8], [2,3,4,6,9], 29)
    validate([1,2,3,4], [1,2,3,4], 10)                # Fully identical
    validate([1,2,10], [3,4,10], 17)
    validate([1,3,5,7], [2,4,6,8], 20)
    validate([10,20,30], [5,10,15,20,25,30], 105)

    # 🔬 Large input case (performance + mod)
    large_nums1 = list(range(1, 100001))
    large_nums2 = list(range(50000, 150001))
    expected_large = sum(range(1, 100001)) + sum(range(100001, 150001))
    validate(large_nums1, large_nums2, expected_large)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maxSum_1537()
