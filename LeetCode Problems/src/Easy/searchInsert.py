from typing import List


class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        """
        Return the index if target is found in nums.
        If not found, return the index where it would be inserted to keep nums sorted.
        """
        # Implement your solution here

        if len(nums)==0:
            return 0
        left, right = 0, len(nums) - 1
        size = len(nums)
        while left <= right:
            mid = left + (right - left) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1

        return right+1


# Test cases
def test_search_insert():
    s = Solution()

    def validate(nums, target, expected):
        result = s.searchInsert(nums, target)
        assert result == expected, f"Failed for nums={nums}, target={target}. Expected {expected}, got {result}"

    # Test case 1: Target found
    validate([1, 3, 5, 6], 5, 2)

    # Test case 2: Target not found, insert position in middle
    validate([1, 3, 5, 6], 2, 1)

    # Test case 3: Target greater than all elements
    validate([1, 3, 5, 6], 7, 4)

    # Test case 4: Target less than all elements
    validate([1, 3, 5, 6], 0, 0)

    # Test case 5: Empty list
    validate([], 5, 0)

    print("All test cases passed!")


if __name__ == "__main__":
    test_search_insert()
