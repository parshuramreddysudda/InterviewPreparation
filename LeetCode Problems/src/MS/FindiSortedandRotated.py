class Solution:
    def check(self, nums):
        n = len(nums)
        start = 1

        while start < len(nums) and nums[start-1] <= nums[start]:
            start += 1

        # if start == len(nums) - 1:
        #     return True

        for i in range(start,len(nums)):
            if nums[i] > nums[ (i + 1) %n]:
                return False

        return True


def test_check_1752():
    sol = Solution()

    def validate(nums, expected):
        result = sol.check(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    # validate([3,4,5,1,2], True)
    # validate([2,1,3,4], False)
    validate([1,2,3], True)

    # 🔬 Edge cases
    validate([1], True)                          # single element
    validate([1,1], True)                        # all equal
    validate([2,1], True)                        # rotated sorted
    validate([1,2], True)                        # already sorted

    # # 🔬 Already sorted arrays
    validate([1,2,3,4,5], True)
    validate([1,1,2,2,3,3], True)

    # 🔬 Valid rotations
    validate([5,1,2,3,4], True)
    validate([2,3,4,5,1], True)
    validate([4,5,6,1,2,3], True)

    # 🔬 Invalid cases
    validate([3,4,5,1,0,2], False)
    validate([1,3,2], False)
    validate([2,1,4,3], False)

    # 🔬 Duplicate-heavy tricky cases
    validate([1,1,1,1], True)
    validate([2,2,3,4,1,2], True)
    validate([2,2,3,1,2,1], False)

    # 🔬 Rotation boundary cases
    validate([1,2,3,4,0], True)
    validate([2,3,4,5,1], True)
    validate([3,5,1,2,4], False)

    # 🔬 Large input stress test
    large_rotated = list(range(5000, 10000)) + list(range(5000))
    validate(large_rotated, True)

    large_invalid = list(range(10000))
    large_invalid[5000], large_invalid[5001] = large_invalid[5001], large_invalid[5000]
    validate(large_invalid, False)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_check_1752()