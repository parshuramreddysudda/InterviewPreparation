class Solution:
    def firstStableIndex(self, nums, k):
        # ❌ Implement your solution here

        minArr = [nums[-1]] * len(nums)
        maxElem = nums[0]
        for i in range(len(nums) - 2, -1, -1):
            minArr[i] = min(nums[i], minArr[i + 1])

        for i in range(len(nums)):
            maxElem = max(nums[i], maxElem)
            if maxElem - minArr[i] <= k:
                return i

        return -1


def test_firstStableIndex_3903():
    sol = Solution()

    def validate(nums, k, expected):
        result = sol.firstStableIndex(nums, k)
        assert result == expected, (
            f"❌ Failed for nums={nums}, k={k}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    validate([5, 0, 1, 4], 3, 3)
    validate([3, 2, 1], 1, -1)
    validate([0], 0, 0)

    # 🔬 Edge cases
    validate([1], 0, 0)  # Single element
    validate([1], 1, 0)  # k equals score
    validate([1000000000], 0, 0)  # Maximum nums[i]
    validate([5, 5, 5, 5], 0, 0)  # All equal
    validate([1, 1, 1, 1], 0, 0)  # All equal
    validate([1, 2], 0, 1)  # Stable at index 1
    validate([2, 1], 0, 1)  # Stable at index 1

    # 🔬 Corner / tricky cases
    validate([1, 2, 3, 4, 5], 0, 4)  # Strictly increasing
    validate([5, 4, 3, 2, 1], 0, -1)  # Strictly decreasing
    validate([1, 5, 2, 4, 3], 1, 4)
    validate([5, 0, 1, 4], 4, 2)  # Boundary changes answer
    validate([5, 0, 1, 4], 5, 0)  # Index 0 becomes stable
    validate([10, 1, 2, 3, 9], 7, 4)
    validate([8, 2, 7, 3, 6], 4, 4)
    validate([10, 9, 8, 1, 2, 3], 7, 5)
    validate([1, 100, 2, 99, 3], 2, 4)

    # 🔬 Duplicate / repeated values
    validate([5, 5, 1, 5, 5], 0, 4)
    validate([2, 2, 2, 1, 2], 1, 3)
    validate([1, 3, 3, 3, 1], 2, 0)
    validate([7, 7, 1, 7, 7], 6, 0)

    # 🔬 k boundary cases
    validate([5, 0, 1, 4], 1, 3)
    validate([5, 0, 1, 4], 0, 3)
    validate([5, 0, 1, 4], 2, 3)
    validate([5, 0, 1, 4], 3, 3)
    validate([5, 0, 1, 4], 4, 2)

    # 🔬 Large input cases — within LeetCode constraints
    validate([1] * 100, 0, 0)

    validate(list(range(1, 101)), 0, 99)

    validate(list(range(100, 0, -1)), 0, -1)

    validate([1000000000] * 100, 0, 0)

    validate([1000000000] + [1] * 99, 999999999, 0)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_firstStableIndex_3903()
