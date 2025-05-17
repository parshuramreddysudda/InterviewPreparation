from typing import List


class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        # Implement your solution here

        nums.sort()
        ans = []
        for i in range(len(nums)):
            if nums[i] == target:
                ans.append(i)
        return ans


# Test cases
def test_target_indices():
    s = Solution()

    def validate(nums, target, expected_output):
        result = s.targetIndices(nums, target)
        assert result == expected_output, f"Failed for nums={nums}, target={target}: expected {expected_output}, got {result}"

    # Test case 1: Target appears multiple times
    validate([1, 2, 5,2, 3], 2, [1, 2])

    # Test case 2: Target appears once
    validate([1, 2, 5, 2, 3], 3, [3])

    # Test case 3: Target not in list
    validate([1, 2, 5, 2, 3], 4, [])

    # Test case 4: All elements are the target
    validate([2, 2, 2], 2, [0, 1, 2])

    # Test case 5: Empty list
    validate([], 1, [])

    # Test case 6: Sorted list with target
    validate([1, 2, 3, 4, 5], 4, [3])

    print("All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_target_indices()
