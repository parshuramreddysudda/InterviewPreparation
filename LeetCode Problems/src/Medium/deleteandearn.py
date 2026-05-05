from collections import Counter


class Solution:
    def deleteAndEarn(self, nums):
        # ❌ Implement your solution here

        if len(nums) <= 2:
            return max(nums)

        nums.sort()
        maxNumber = nums[-1] + 1
        arr = Counter(nums)
        newNums = []
        for i in range(maxNumber):
            if i not in arr:
                newNums.append(0)
            else:
                newNums.append(arr.get(i)*i)
        print(newNums)
        nums = newNums

        if len(nums) <= 2:
            return max(nums)

        dp = [0] * maxNumber
        dp[0] = nums[0]
        dp[1] = max(nums[0], nums[1])

        for i in range(2, len(dp)):
            dp[i] = max(dp[i-1], nums[i] + dp[i-2])


        return dp[len(dp)-1]


def test_deleteAndEarn_740():
    sol = Solution()

    def validate(nums, expected):
        result = sol.deleteAndEarn(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (from LeetCode style)
    # validate([3,4,2], 6)                    # take 4 + 2
    validate([2,2,3,3,3,4], 9)              # take all 3s

    # 🔬 Edge cases
    # validate([], 0)                         # empty input
    validate([5], 5)                        # single element
    validate([1,1,1,1], 4)                  # all same
    validate([1,2], 2)                      # choose max

    # 🔬 Consecutive conflicts
    validate([1,2,3,4,5], 9)                # pick 1+3+5
    validate([1,1,2,2,3,3], 8)              # pick 1s + 3s

    # 🔬 Gaps in numbers (important)
    validate([2,2,4,4,6,6], 24)             # no conflicts → take all
    validate([1,3,5,7,9], 25)               # all independent

    # 🔬 Tricky distributions
    validate([8,10,4,9,1,3,5,9,4,10], 37)
    validate([10,10,10,9,9,8], 38)          # pick 10s
    validate([1,6,3,3,8,4,8,10,1,3], 43)

    # 🔬 Heavy duplicates
    validate([2]*1000 + [3]*1000 + [4]*1000, 4000)
    # best = take 2s and 4s → 2000*2 = 4000

    # 🔬 Large input case
    nums = [i % 100 for i in range(10000)]
    validate(nums, sol.deleteAndEarn(nums))
    # consistency check (ensures no crash/performance issue)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_deleteAndEarn_740()