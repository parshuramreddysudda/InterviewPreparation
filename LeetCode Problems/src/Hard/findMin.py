class Solution:
    def findMin(self, nums):
        # ❌ Implement your solution here

        while len(nums) > 1 and nums[-1] == nums[0]:
            nums.pop()
        left = 0
        right = len(nums)-1

        while left<right:

            mid = left + (right - left)//2

            if nums[mid] > nums[right]:
                left = mid + 1
            else:
                right = mid

        return nums[right]


def test_findMin_154():
    sol = Solution()

    def validate(nums, expected):
        result = sol.findMin(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([3,3,1,3], 1)

    validate([10,1,10,10,10], 1)

    validate([1,3,5], 1)
    validate([2,2,2,0,1], 0)

    # 🔬 Edge cases
    validate([1], 1)                             # single element
    validate([2,1], 1)                           # two elements rotated
    validate([1,2], 1)                           # two elements sorted
    validate([1,1,1,1], 1)                       # all duplicates

    # 🔬 No rotation
    validate([1,2,3,4,5], 1)
    validate([1,1,2,2,3,3], 1)

    # 🔬 Full / heavy rotation
    validate([4,5,6,7,0,1,2], 0)

    # 🔬 Tricky duplicate cases
    validate([2,2,2,2,0,2,2], 0)
    validate([1,1,1,0,1], 0)
    validate([1,0,1,1,1], 0)
    validate([2,2,2,3,4,2], 2)

    # 🔬 Minimum near boundaries
    validate([5,1,2,3,4], 1)
    validate([2,3,4,5,1], 1)

    # 🔬 Large input stress tests
    large_nums = [2] * 5000 + [0] + [2] * 5000
    validate(large_nums, 0)

    large_sorted = list(range(1, 10001))
    validate(large_sorted, 1)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_findMin_154()