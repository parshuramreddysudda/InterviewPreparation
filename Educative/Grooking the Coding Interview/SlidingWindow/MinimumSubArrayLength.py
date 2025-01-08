def min_sub_array_len(target: int, nums: list[int]) -> int:
    """
    Finds the minimal length of a contiguous subarray of which the sum is greater than or equal to `target`.
    If no such subarray exists, returns 0.
    """
    start = 0
    end = 0
    sum = 0
    minLength = float('inf')
    while end < len(nums):
        sum += nums[end]
        if sum >= target:
            while start >= 0 and sum >= target:
                minLength = min(minLength, end - start + 1)
                sum -= nums[start]
                start += 1
        end += 1
    if minLength == float('inf'):
        return 0
    return minLength


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with a valid subarray
    # target1 = 7
    # nums1 = [2, 3, 1, 2, 4, 3]
    # print("Test case 1:", min_sub_array_len(target1, nums1))
    # # Expected output: 2 ([4, 3])

    # Test case 2: No subarray meets the condition
    target2 = 5
    nums2 = [1,2,1,3]
    print("Test case 2:", min_sub_array_len(target2, nums2))
    # Expected output: 0

    # Test case 3: Entire array is the only subarray
    target3 = 11
    nums3 = [1, 2, 3, 4, 5]
    print("Test case 3:", min_sub_array_len(target3, nums3))
    # Expected output: 3 ([3, 4, 5])

    # Test case 4: Single element meets the condition
    target4 = 4
    nums4 = [4, 1, 1, 1, 1]
    print("Test case 4:", min_sub_array_len(target4, nums4))
    # Expected output: 1 ([4])

    # Test case 5: Empty array
    target5 = 5
    nums5 = []
    print("Test case 5:", min_sub_array_len(target5, nums5))
    # Expected output: 0

    # Test case 6: Larger array with multiple subarray possibilities
    target6 = 15
    nums6 = [1, 2, 3, 4, 5, 6, 7, 8]
    print("Test case 6:", min_sub_array_len(target6, nums6))
    # Expected output: 2 ([7, 8])
