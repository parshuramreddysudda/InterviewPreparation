import copy


class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        secondCopy = copy.deepcopy(nums)
        secondCopy.sort()
        n = len(nums)

        def bst(target):
            left = 0
            right = n - 1

            while left < right:
                mid = left + ((right - left) // 2)
                if secondCopy[mid] < target:
                    left = mid + 1
                else:
                    right = mid

            return left

        print(bst(8))
        return [x for x in map(bst, nums)]


def test_smallerNumbersThanCurrent_1365():
    sol = Solution()

    def validate(nums, expected):
        result = sol.smallerNumbersThanCurrent(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    # validate([8,1,2,2,3], [4,0,1,1,3])
    validate([6,5,4,8], [2,1,0,3])
    validate([7,7,7,7], [0,0,0,0])

    # 🔬 Edge cases
    validate([1], [0])
    validate([1,2], [0,1])
    validate([2,1], [1,0])
    validate([5,5], [0,0])
    validate([0], [0])

    # 🔬 Corner / tricky cases
    validate([1,1,1,2], [0,0,0,3])
    validate([4,3,2,1], [3,2,1,0])
    validate([1,3,2,3,1], [0,3,1,3,0])
    validate([5,0,10,0,5], [2,0,4,0,2])
    validate([10,1,10,1,5], [2,0,2,0,2])
    validate([2,2,1,1,3], [2,2,0,0,4])
    validate([100,1,50,25], [3,0,2,1])

    # 🔬 Negative numbers
    validate([-1,-2,-3], [2,1,0])
    validate([-5,0,5,-5], [0,2,3,0])
    validate([-10,-10,-5,0], [0,0,2,3])

    # 🔬 Large input cases
    validate(list(range(500)), list(range(500)))
    validate([1] * 10000, [0] * 10000)
    validate(list(range(10000, 0, -1)), list(range(9999, -1, -1)))

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_smallerNumbersThanCurrent_1365()