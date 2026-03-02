from typing import List


class Solution:
    def nextPermutation(self, nums: List[int]) -> list[int]:
        # Write your code here
        n = len(nums)
        left = len(nums) - 1
        pivot = len(nums) - 1
        index = 0
        while pivot >0 and nums[pivot] < nums[pivot-1]:
                pivot -= 1

        if pivot <= 0:
            nums.reverse()
            return nums

        index = pivot
        minElem = index
        while index < n:
            if nums[minElem] >= nums[index] > nums[pivot - 1]:
                minElem = index
            index += 1

        nums[pivot-1], nums[minElem] = nums[minElem], nums[pivot-1]

        def swap(i, j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp

        def reverse(start):
            i, j = start, len(nums) - 1
            while i < j:
                swap(i, j)
                i += 1
                j -= 1

        reverse(pivot)
        return nums


def test_nextPermutation():
    sol = Solution()

    def validate(nums, expected):
        original = nums[:]
        sol.nextPermutation(nums)
        assert nums == expected, (
            f"❌ Failed for input={original}. "
            f"Expected {expected}, got {nums}"
        )

    # 🔬 Core test cases
    # validate([4,1,5,2],[4,2,1,5])
    # validate([1,2,3], [1,3,2])
    # validate([1,3,2], [2,1,3])
    # validate([2,3,1], [3,1,2])
    #
    # # 🔬 Descending case (max permutation)
    # validate([3,2,1], [1,2,3])
    #
    # # 🔬 Edge cases
    # validate([1], [1])
    # validate([1,1], [1,1])
    # validate([2,1], [1,2])
    #
    # # 🔬 Duplicates
    # validate([1,1,5], [1,5,1])
    validate([1,5,1], [5,1,1])
    validate([2,2,3,3], [2,3,2,3])
    validate([1,2,2], [2,1,2])

    # 🔬 Corner / tricky cases
    validate([1,4,3,2], [2,1,3,4])
    validate([1,5,8,4,7,6,5,3,1], [1,5,8,5,1,3,4,6,7])
    validate([5,4,7,5,3,2], [5,5,2,3,4,7])
    validate([1,3,2,4], [1,3,4,2])

    # 🔬 Large input case
    large_nums = list(range(1, 1001))
    expected_large = list(range(1, 999)) + [1000, 999]
    validate(large_nums, expected_large)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_nextPermutation()
