from typing import List


def single_non_duplicate(nums: List[int]) -> int:
    """
    Finds the single element in a sorted array where every other element appears twice.
    :param nums: List of integers sorted in ascending order
    :return: The single element that appears only once
    """
    left, right = 0, len(nums) - 1

    while left < right:
        mid = (left + right) // 2

        if mid % 2 != 0:
            mid -= 1
        if nums[mid] == nums[mid + 1]:
            left = mid + 2
        else:
            right = mid - 1
    return nums[left]


# Test cases
if __name__ == "__main__":
    # Test case 1: Basic test
    nums1 = [1, 1, 2, 3, 3, 4, 4, 8, 8]
    print("Test case 1:", single_non_duplicate(nums1))
    # Expected output: 2

    # Test case 2: Single element array
    nums2 = [1]
    print("Test case 2:", single_non_duplicate(nums2))
    # Expected output: 1

    # Test case 3: Single non-duplicate at the end
    nums3 = [3, 3, 7, 7, 10, 11, 11]
    print("Test case 3:", single_non_duplicate(nums3))
    # Expected output: 10

    # Test case 4: Single non-duplicate at the beginning
    nums4 = [2, 3, 3, 4, 4, 8, 8]
    print("Test case 4:", single_non_duplicate(nums4))
    # Expected output: 2

    # Test case 5: Single non-duplicate in the middle
    nums5 = [1, 1, 2, 2, 5, 6, 6]
    print("Test case 5:", single_non_duplicate(nums5))
    # Expected output: 5

    # Test case 6: Array with large values
    nums6 = [100000, 100000, 200000]
    print("Test case 6:", single_non_duplicate(nums6))
    # Expected output: 200000
