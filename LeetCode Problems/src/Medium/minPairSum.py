from typing import List

class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        # ❌ Implement your solution here
        nums.sort()

        pair = 0
        start = 0
        end = len(nums)-1
        while start < end:
            pair = max(pair, nums[start] + nums[end])
            start += 1
            end -= 1

        return pair


def test_minPairSum_1877():
    sol = Solution()

    def validate(nums, expected):
        result = sol.minPairSum(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([3,5,2,3], 7)
    validate([3,5,4,2,4,6], 8)
    validate([1,2], 3)

    # 🔬 Edge cases
    validate([0,0], 0)                      # All zeros
    validate([1,1,1,1], 2)                  # All same
    validate([1,100000], 100001)            # Large gap
    validate([5,5], 10)

    # 🔬 Corner / tricky cases
    validate([1,3,5,7], 8)
    validate([7,5,3,1], 8)
    validate([1,2,100,101], 102)
    validate([10,20,30,40], 50)
    validate([1,100,2,99], 101)

    # 🔬 Large input case (performance)
    large_nums = list(range(1, 20001))
    validate(large_nums, 20001)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minPairSum_1877()

