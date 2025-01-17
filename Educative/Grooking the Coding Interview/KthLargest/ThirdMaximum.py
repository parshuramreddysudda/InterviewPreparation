import heapq


def third_max(nums: list[int]) -> int:
    """
    Finds the third maximum number in the input list `nums`.
    If the third maximum does not exist, return the maximum number.
    """
    maxHeap = []
    k = 3
    hashSet = set()
    for num in nums:
        if num not in hashSet:
            hashSet.add(num)
            heapq.heappush(maxHeap, num)
        if len(maxHeap) > k:
            heapq.heappop(maxHeap)
    return maxHeap[len(maxHeap)-1] if len(maxHeap) < k else maxHeap[0]


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with distinct numbers
    nums1 = [1, 2]
    print("Test case 1:", third_max(nums1))
    # Expected output: 1 (third maximum)

    # Test case 2: Less than 3 distinct numbers
    nums2 = [1, 2]
    print("Test case 2:", third_max(nums2))
    # Expected output: 2 (maximum number since third max doesn't exist)

    # Test case 3: Array with duplicates
    nums3 = [2, 2, 3, 1]
    print("Test case 3:", third_max(nums3))
    # Expected output: 1 (third maximum)

    # Test case 4: Array with all identical elements
    nums4 = [1, 1, 1]
    print("Test case 4:", third_max(nums4))
    # Expected output: 1 (only one distinct number)

    # Test case 5: Negative numbers
    nums5 = [-1, -2, -3, -4]
    print("Test case 5:", third_max(nums5))
    # Expected output: -3 (third maximum)

    # Test case 6: Mixed positive and negative numbers
    nums6 = [1, 2, -1, -2, 0]
    print("Test case 6:", third_max(nums6))
    # Expected output: 0 (third maximum)

    # Test case 7: Single element array
    nums7 = [5]
    print("Test case 7:", third_max(nums7))
    # Expected output: 5 (only one number exists)

    # Test case 8: Large array
    nums8 = [i for i in range(100, 1, -1)]
    print("Test case 8:", third_max(nums8))
    # Expected output: 98 (third maximum)
