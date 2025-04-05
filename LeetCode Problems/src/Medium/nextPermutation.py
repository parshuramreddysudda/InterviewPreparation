from typing import List

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:


# Test cases
def test_next_permutation():
    s = Solution()

    # Test case 1: Increasing sequence
    nums1 = [1, 2, 3]
    expected1 = [1, 3, 2]
    s.nextPermutation(nums1)
    assert nums1 == expected1, f"Test case 1 failed: expected {expected1}, got {nums1}"

    # Test case 2: Last permutation
    nums2 = [3, 2, 1]
    expected2 = [1, 2, 3]
    s.nextPermutation(nums2)
    assert nums2 == expected2, f"Test case 2 failed: expected {expected2}, got {nums2}"

    # Test case 3: Middle case
    nums3 = [1, 1, 5]
    expected3 = [1, 5, 1]
    s.nextPermutation(nums3)
    assert nums3 == expected3, f"Test case 3 failed: expected {expected3}, got {nums3}"

    # Test case 4: Single element
    nums4 = [1]
    expected4 = [1]
    s.nextPermutation(nums4)
    assert nums4 == expected4, f"Test case 4 failed: expected {expected4}, got {nums4}"

    # Test case 5: Duplicates
    nums5 = [2, 2, 0, 1]
    expected5 = [2, 2, 1, 0]
    s.nextPermutation(nums5)
    assert nums5 == expected5, f"Test case 5 failed: expected {expected5}, got {nums5}"

    print("All test cases passed!")

# Run the test cases
if __name__ == "__main__":
    test_next_permutation()
