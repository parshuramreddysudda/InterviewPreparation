def binary_search(nums: list[int], target: int) -> int:
    """
    Performs binary search on a sorted list `nums` to find the target.
    Returns the index of the target if found, otherwise -1.
    """

    left = 0
    right = len(nums) - 1
    while left <= right:
        mid = (left + right) // 2
        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return -1


# Test cases
if __name__ == "__main__":
    # Test case 1: Target is in the middle
    nums1 = [1, 2, 3, 4, 5]
    target1 = 3
    print("Test case 1:", binary_search(nums1, target1))
    # Expected output: 2

    # Test case 2: Target is the first element
    nums2 = [10, 20, 30, 40, 50]
    target2 = 10
    print("Test case 2:", binary_search(nums2, target2))
    # Expected output: 0

    # Test case 3: Target is the last element
    nums3 = [5, 15, 25, 35, 45]
    target3 = 45
    print("Test case 3:", binary_search(nums3, target3))
    # Expected output: 4

    # Test case 4: Target is not in the list
    nums4 = [1, 3, 5, 7, 9]
    target4 = 6
    print("Test case 4:", binary_search(nums4, target4))
    # Expected output: -1

    # Test case 5: Single element array, target exists
    nums5 = [8]
    target5 = 8
    print("Test case 5:", binary_search(nums5, target5))
    # Expected output: 0

    # Test case 6: Single element array, target does not exist
    nums6 = [8]
    target6 = 10
    print("Test case 6:", binary_search(nums6, target6))
    # Expected output: -1

    # Test case 7: Large array
    nums7 = list(range(1, 10001))  # [1, 2, ..., 10000]
    target7 = 5678
    print("Test case 7:", binary_search(nums7, target7))
    # Expected output: 5677 (index in 0-based indexing)

    # Test case 8: Target at the boundary
    nums8 = [2, 4, 6, 8, 10]
    target8 = 10
    print("Test case 8:", binary_search(nums8, target8))
    # Expected output: 4
