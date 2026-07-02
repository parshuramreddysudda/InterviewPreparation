class Solution:
    def maximumElementAfterDecrementingAndRearranging(self, arr):

        arr.sort()

        result = False
        arr[0] = 1
        for i in range(1, len(arr)):
            arr[i] = min(arr[i], arr[i-1] + 1)

        return arr[-1]


def test_maximumElementAfterDecrementingAndRearranging_1846():
    sol = Solution()

    def validate(arr, expected):
        result = sol.maximumElementAfterDecrementingAndRearranging(arr)
        assert result == expected, (
            f"❌ Failed for arr={arr}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    validate([2,2,1,2,1], 2)
    validate([100,1,1000], 3)
    validate([1,2,3,4,5], 5)

    # 🔬 Edge cases
    validate([1], 1)                         # Single element
    validate([100], 1)                       # Single large value
    validate([1,1,1,1], 1)                   # All ones
    validate([2,2,2,2], 2)                   # All same > 1
    validate([100,100,100], 3)               # All very large

    # 🔬 Corner / tricky cases
    validate([3,4,5], 3)
    validate([5,4,3,2,1], 5)
    validate([1,1000000000], 2)
    validate([4,1,4,4], 4)
    validate([10,1,2,3], 4)
    validate([7,6,5,4], 4)
    validate([8,8,8,1], 4)
    validate([2,3,100], 3)
    validate([5,5,5,5,5], 5)
    validate([1,3,3,3,10], 5)

    # 🔬 Large input cases
    validate(list(range(1, 10001)), 10000)          # Already optimal
    validate([10**9] * 10000, 10000)                # All huge values
    validate([1] * 10000, 1)                        # All ones

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maximumElementAfterDecrementingAndRearranging_1846()