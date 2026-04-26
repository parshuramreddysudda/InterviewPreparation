from collections import defaultdict
from sys import prefix


class Solution:
    def distance(self, nums):
        # ❌ Implement your solution here

        hashmap = defaultdict(list)
        for i, num in enumerate(nums):
            hashmap[num].append(i)

        def prefixSum(arr):
            preSum = [0] * len(arr)
            preSum[0] = arr[0]  # Initialize with the first element
            for i in range(1, len(arr)):
                preSum[i] = preSum[i - 1] + arr[i]
            return preSum

        def suffSum(arr):
            suffix = [0] * len(arr)
            suffix[-1] = arr[-1]
            for i in range(len(arr) - 2, -1, -1):
                suffix[i] = suffix[i + 1] + arr[i]
            return suffix

        ans = [0] * len(nums)
        n = len(nums)
        for num, indices in hashmap.items():
            pre = prefixSum(indices)
            suf = suffSum(indices)
            k = len(indices)

            for pos, idx in enumerate(indices):
                left = idx * pos - (pre[pos - 1] if pos > 0 else 0)
                right = (suf[pos + 1] if pos < k - 1 else 0) - idx * (k - pos - 1)
                ans[idx] = left + right

        return ans
        pass





def test_distance_2615():
    sol = Solution()

    def validate(nums, expected):
        result = sol.distance(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (official-style)
    validate([1,3,1,1,2], [5,0,3,4,0])
    validate([0,5,3], [0,0,0])

    # 🔬 Edge cases
    validate([], [])                         # empty array
    validate([1], [0])                       # single element
    validate([2,2], [1,1])                   # two same elements

    # 🔬 All elements same
    validate([1,1,1,1], [6,4,4,6])

    # 🔬 No duplicates
    validate([1,2,3,4,5], [0,0,0,0,0])

    # 🔬 Mixed duplicates
    validate([1,2,1,2,1], [6,2,4,2,6])
    validate([4,4,4,5,5], [3,2,3,1,1])

    # 🔬 Increasing pattern duplicates
    validate([1,2,3,1,2,3,1], [9,4,4,5,2,2,9])

    # 🔬 Tricky cases
    validate([7,7,8,7], [4,3,0,5])
    validate([1,2,1,1,2], [5,3,3,4,3])

    # 🔬 Large input case
    nums = [1]*10000
    # For all same:
    # sum of distances for index i = i*(i+1)/2 + (n-i-1)*(n-i)/2
    n = len(nums)
    expected = []
    for i in range(n):
        left = i * (i + 1) // 2
        right = (n - i - 1) * (n - i) // 2
        expected.append(left + right)
    validate(nums, expected)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_distance_2615()