from typing import List

class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        # ❌ Implement your solution here
        hashset = {}

        for num in nums:
            if num in hashset:
                return num
            hashset[num] = True
        return 0


def test_repeatedNTimes_961():
    sol = Solution()

    def validate(nums, expected):
        result = sol.repeatedNTimes(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([1,2,3,3], 3)
    validate([2,1,2,5,3,2], 2)
    validate([5,1,5,2,5,3,5,4], 5)

    # 🔬 Edge cases
    validate([9,9], 9)                           # N = 1
    validate([7,7,8,9], 7)                       # Minimal repeat
    validate([0,1,0,2], 0)                       # Zero included

    # 🔬 Corner / tricky cases
    validate([1,3,1,2], 1)                       # Repeated early
    validate([4,1,2,3,4,5,6,4], 4)               # Repeated scattered
    validate([8,6,8,7,8,9,8,10], 8)
    validate([100,1,100,2,100,3,100,4], 100)

    # 🔬 Large input case (performance)
    n = 10000
    repeated = 42
    large_nums = [repeated] * n + list(range(n))
    validate(large_nums, repeated)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_repeatedNTimes_961()
