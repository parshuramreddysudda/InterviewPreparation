class Solution:
    def rob(self, nums):
        # ❌ Implement your solution here

        if len(nums) <= 2:
            return max(nums)

        prev1 = 0
        prev2 = 0
        for num in nums:
            tmp = prev1
            prev1 = max(prev2 + num, prev1)
            prev2 = tmp

        return prev1


def test_rob_198():
    sol = Solution()

    def validate(nums, expected):
        result = sol.rob(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (official style)
    validate([1,2,3,1], 4)
    validate([2,7,9,3,1], 12)

    # 🔬 Edge cases
    validate([5], 5)                 # single house
    validate([2,1], 2)               # two houses

    # 🔬 Small variations
    validate([1,2,3], 4)
    validate([2,1,1,2], 4)

    # 🔬 All equal values
    validate([5,5,5,5], 10)
    validate([10,10,10], 20)

    # 🔬 Increasing / decreasing
    validate([1,2,3,4,5], 9)
    validate([5,4,3,2,1], 9)

    # 🔬 Tricky cases
    validate([2,1,4,9], 11)
    validate([4,1,2,7,5,3,1], 14)
    validate([2,7,9,3,1,5], 16)

    # 🔬 Zeros and gaps
    validate([0,0,0,0], 0)
    validate([0,5,0,10], 15)

    # 🔬 Large input case
    nums = [1]*10000
    validate(nums, 5000)  # pick every alternate

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_rob_198()