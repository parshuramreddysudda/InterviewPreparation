import heapq


def kth_largest_integer(nums: list[str], k: int) -> str:
    """
    Finds the k-th largest integer from the list of string-represented integers.
    """
    heap = []
    for num in range(0, k):
        heapq.heappush(heap, int(nums[num]))

    for num in range(k,len(nums)):
        curr = int(nums[num])
        if k is len(heap) and curr > heap[0]:
            heapq.heappop(heap)
            heapq.heappush(heap, curr)
    return str(heap[0])


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with different lengths
    nums1 = ["3", "6", "7", "10"]
    k1 = 2
    print("Test case 1:", kth_largest_integer(nums1, k1))
    # Expected output: "7" (2nd largest)

    # Test case 2: Numbers with the same length
    nums2 = ["2", "21", "12", "1"]
    k2 = 3
    print("Test case 2:", kth_largest_integer(nums2, k2))
    # Expected output: "2" (3rd largest)

    # Test case 3: Numbers with leading zeros
    nums3 = ["0001", "100", "10", "01"]
    k3 = 4
    print("Test case 3:", kth_largest_integer(nums3, k3))
    # Expected output: "0001" (4th largest after removing leading zeros)

    # Test case 4: Large numbers
    nums4 = ["123456789", "987654321", "111111111", "222222222"]
    k4 = 1
    print("Test case 4:", kth_largest_integer(nums4, k4))
    # Expected output: "987654321" (largest number)

    # Test case 5: Single element array
    nums5 = ["42"]
    k5 = 1
    print("Test case 5:", kth_largest_integer(nums5, k5))
    # Expected output: "42" (only number)

    # Test case 6: All numbers are the same
    nums6 = ["5", "5", "5", "5"]
    k6 = 2
    print("Test case 6:", kth_largest_integer(nums6, k6))
    # Expected output: "5" (all numbers are identical)

    # Test case 7: Array with a mix of large and small numbers
    nums7 = ["100", "23", "9", "98", "0"]
    k7 = 3
    print("Test case 7:", kth_largest_integer(nums7, k7))
    # Expected output: "23" (3rd largest)

    # Test case 8: Negative numbers represented as strings
    nums8 = ["-1", "-2", "-3", "-4"]
    k8 = 2
    print("Test case 8:", kth_largest_integer(nums8, k8))
    # Expected output: "-2" (2nd largest in the sorted list)
