import math
from collections import defaultdict


class Solution:
    def minimumDistance(self, nums):
        # ❌ Implement your solution here


        dic = defaultdict(list)
        for i,num in enumerate(nums):
            dic[num].append(i)

        ans = math.inf
        for key,val in dic.items():
            if len(val)>=3:
                for i in range(len(val)-3):
                    ans = min(ans, val[i + 2] - val[i])

        return ans if ans != math.inf else -1

        pass


def test_minimumDistance_3740():
    sol = Solution()

    def validate(nums, expected):
        result = sol.minimumDistance(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([1,2,1,1], 3)                 # indices (0,2,3) → 3
    validate([1,2,3,1,2,1], 5)             # (0,3,5) → 5
    validate([5,5,5], 2)                   # (0,1,2) → 2

    # 🔬 Edge cases
    validate([], -1)                       # empty
    validate([1], -1)                      # single element
    validate([1,1], -1)                    # only 2 occurrences
    validate([1,2,3,4], -1)                # no repeats

    # 🔬 Multiple triplets
    validate([1,2,1,2,1,2,1], 4)           # best = (0,2,4) → 4
    validate([3,3,3,3], 2)                 # best = (0,1,2) → 2

    # 🔬 Tricky cases
    validate([1,2,1,3,1,4,1], 4)           # best (0,2,4)
    validate([1,2,3,1,2,3,1], 6)           # only valid for 1 → (0,3,6)
    validate([7,1,7,7,2,7], 3)             # (0,2,3) → 3

    # 🔬 Closely packed vs spread
    validate([9,9,1,9,9], 3)               # (0,1,3) → 3
    validate([1,9,1,9,1,9,1], 4)           # (0,2,4)

    # 🔬 Large input case
    nums = [1]*10000
    validate(nums, 2)                      # first 3 elements → distance 2

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minimumDistance_3740()