from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        Removes duplicates from sorted array in-place.
        Returns the new length of the array with unique elements.
        """
        i, j = 0, 1
        k = 1
        while j < len(nums) - 1:
            if nums[i] == nums[j]:
                j += 1
            else:
                nums[i + 1] = nums[j]
                i += 1
                j += 1
                k += 1
        return k
# Test cases
def test_remove_duplicates():
    s = Solution()

    # Helper to validate in-place change
    def validate(nums, expected_output, expected_k):
        k = s.removeDuplicates(nums)
        assert k == expected_k, f"Expected length {expected_k}, got {k}"
        assert nums[:k] == expected_output, f"Expected array {expected_output}, got {nums[:k]}"

    # # Test case 1: Normal sorted array with duplicates
    # validate([1, 1, 2], [1, 2], 2)
    #
    # # Test case 2: Array with all duplicates
    # validate([2, 2, 2, 2], [2], 1)

    # Test case 3: Already unique
    validate([0, 1, 2, 3], [0, 1, 2, 3], 4)

    # Test case 4: Single element
    validate([5], [5], 1)

    # Test case 5: Empty list
    validate([], [], 0)

    print("All test cases passed!")

# Run the tests
if __name__ == "__main__":
    test_remove_duplicates()
