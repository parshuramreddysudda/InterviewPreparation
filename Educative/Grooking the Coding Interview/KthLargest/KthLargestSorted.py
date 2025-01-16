import heapq


def find_kth_largest(nums: list[int], k: int) -> int:
    """
    Finds the kth largest element in the input list `nums`.
    """
    maxHeap = []
    for num in range(0, k): heapq.heappush(maxHeap, nums[num])

    for num in range(k, len(nums)):
        if len(maxHeap) == k and maxHeap[0] <= nums[num]:
            heapq.heappop(maxHeap)
            heapq.heappush(maxHeap, nums[num])

    return maxHeap[0]


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case
    nums1 = [3, 2, 1, 5, 6, 4]
    k1 = 2
    print("Test case 1:", find_kth_largest(nums1, k1))
    # Expected output: 5 (2nd largest)

    # Test case 2: Array with duplicates
    nums2 = [3, 2, 3, 1, 2, 4, 5, 5, 6]
    k2 = 4
    print("Test case 2:", find_kth_largest(nums2, k2))
    # Expected output: 4 (4th largest)

    # Test case 3: Single element array
    nums3 = [1]
    k3 = 1
    print("Test case 3:", find_kth_largest(nums3, k3))
    # Expected output: 1 (1st largest)

    # Test case 4: Array with negative numbers
    nums4 = [-1, -2, -3, -4, -5]
    k4 = 3
    print("Test case 4:", find_kth_largest(nums4, k4))
    # Expected output: -3 (3rd largest)

    # Test case 5: Array with all identical elements
    nums5 = [2, 2, 2, 2]
    k5 = 2
    print("Test case 5:", find_kth_largest(nums5, k5))
    # Expected output: 2 (all elements are the same)

    # Test case 6: Large array with random elements
    nums6 = [i for i in range(1, 1001)]
    k6 = 10
    print("Test case 6:", find_kth_largest(nums6, k6))
    # Expected output: 991 (10th largest)

    # Test case 7: k is 1 (largest element in the array)
    nums7 = [7, 10, 4, 3, 20, 15]
    k7 = 1
    print("Test case 7:", find_kth_largest(nums7, k7))
    # Expected output: 20
