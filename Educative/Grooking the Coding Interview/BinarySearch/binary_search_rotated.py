def binary_search_rotated(nums: list[int], target: int) -> int:
    """
    Searches for the target in a rotated sorted array `nums`.
    Returns the index of the target if found, otherwise -1.
    """

    left, right = 0, len(nums) - 1

    while left <= right:
        mid = (left + right) // 2
        if nums[mid] == target:
            return mid
        elif nums[mid] < nums[right]:
            if nums[mid] < target <= nums[right]:
                left = mid + 1
            else:
                right = mid - 1
        else:
            if nums[mid] < target or target <= nums[right]:
                left = mid + 1
            else:
                right = mid - 1

    return -1


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular rotated array, target exists
    nums1 = [4, 5, 6, 1, 2, 3]
    target1 = 3
    print("Test case 1:", binary_search_rotated(nums1, target1))
    # Expected output:54

    # Test case 2: Regular rotated array, target does not exist
    nums2 = [4, 5, 6, 7, 0, 1, 2]
    target2 = 3
    print("Test case 2:", binary_search_rotated(nums2, target2))
    # Expected output: -1

    # Test case 3: Array not rotated, target exists
    nums3 = [1, 2, 3, 4, 5, 6, 7]
    target3 = 5
    print("Test case 3:", binary_search_rotated(nums3, target3))
    # Expected output: 4

    # Test case 4: Array not rotated, target does not exist
    nums4 = [1, 2, 3, 4, 5, 6, 7]
    target4 = 8
    print("Test case 4:", binary_search_rotated(nums4, target4))
    # Expected output: -1

    # Test case 5: Single element array, target exists
    nums5 = [1]
    target5 = 1
    print("Test case 5:", binary_search_rotated(nums5, target5))
    # Expected output: 0

    # Test case 6: Single element array, target does not exist
    nums6 = [1]
    target6 = 2
    print("Test case 6:", binary_search_rotated(nums6, target6))
    # Expected output: -1

    # Test case 7: Target at rotation point
    nums7 = [6, 7, 1, 2, 3, 4, 5]
    target7 = 1
    print("Test case 7:", binary_search_rotated(nums7, target7))
    # Expected output: 2

    # Test case 8: Empty array
    nums8 = []
    target8 = 1
    print("Test case 8:", binary_search_rotated(nums8, target8))
    # Expected output: -1

    # Test case 9: Rotated with duplicates
    nums9 = [2, 2, 2, 3, 4, 2, 2]
    target9 = 3
    print("Test case 9:", binary_search_rotated(nums9, target9))
    # Expected output: 3

    # Test case 10: Large rotated array
    nums10 = list(range(1000, 2000)) + list(range(1, 1000))  # Rotated at 1000
    target10 = 1500
    print("Test case 10:", binary_search_rotated(nums10, target10))
    # Expected output: 500
