from typing import List
from collections import defaultdict


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        """
        Return the total number of continuous subarrays whose sum equals to k.
        """
        # Implement your solution here

        left = 0
        right = 1
        totalArrays = 0
        curSum = 0
        nums.append(0)
        length = len(nums)
        hashMap = {0: 1}
        i = 1
        while i < length:
            curSum += nums[i-1]

            if curSum - k in hashMap:
                totalArrays += hashMap[curSum - k]

            if curSum in hashMap:
                hashMap[curSum] += 1
            else:
                hashMap[curSum] = 1

            i += 1
        return totalArrays


# 🔍 Test cases
def test_subarray_sum():
    s = Solution()

    def validate(nums, k, expected_output):
        result = s.subarraySum(nums, k)
        assert result == expected_output, f"Failed for nums={nums}, k={k}. Expected {expected_output}, got {result}"

    # ✅ Test case 1: Basic example
    validate([1, 1, 1], 2, 2)
    #
    # ✅ Test case 2: Negative numbers included
    validate([1, 2, 3], 3, 2)

    # ✅ Test case 3: Zero sum subarrays
    validate([1, -1, 0], 0, 3)

    # ✅ Test case 4: Single element equals k
    validate([3], 3, 1)

    # ✅ Test case 5: All zeros
    validate([0, 0, 0, 0], 0, 10)  # 4 elements → (n*(n+1))/2 subarrays

    # ✅ Test case 6: No matching subarray
    validate([1, 2, 3], 7, 0)

    # ✅ Test case 7: Long repeating pattern
    validate([1, 2, 1, 2, 1], 3, 4)

    print("All test cases passed!")


# 🚀 Run tests
if __name__ == "__main__":
    test_subarray_sum()
