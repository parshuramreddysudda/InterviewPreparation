import heapq


def top_k_frequent(nums: list[int], k: int) -> list[int]:
    """
    Returns the k most frequent elements from the input list `nums`.
    """
    hashMap = {}

    for num in nums:
        if num in hashMap:
            hashMap[num] += 1
        else:
            hashMap[num] = 1
    freqValues = []
    for value, count in hashMap.items():
        if len(freqValues) == k:
            popCount, popValue = freqValues[0]
            if count > popCount:
                heapq.heappop(freqValues)
                heapq.heappush(freqValues, (count, value))
        else:
            heapq.heappush(freqValues, (count, value))

    ans = []

    while k > 0 and len(freqValues) > 0:
        k -= 1
        ans.append(heapq.heappop(freqValues)[1])

    return ans


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with distinct frequencies
    nums1 = [1, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 4, 4]
    k1 = 2
    print("Test case 1:", top_k_frequent(nums1, k1))
    # Expected output: [1, 2]

    # Test case 2: All elements have the same frequency
    nums2 = [1, 2, 3, 4]
    k2 = 2
    print("Test case 2:", top_k_frequent(nums2, k2))
    # Expected output: Any two elements from [1, 2, 3, 4]

    # Test case 3: Single element in the input list
    nums3 = [1]
    k3 = 1
    print("Test case 3:", top_k_frequent(nums3, k3))
    # Expected output: [1]

    # Test case 4: Input list with duplicates
    nums4 = [4, 4, 4, 5, 5, 6]
    k4 = 2
    print("Test case 4:", top_k_frequent(nums4, k4))
    # Expected output: [4, 5]

    # Test case 5: Large k value (all elements in the input list)
    nums5 = [1, 2, 3, 4, 5, 6]
    k5 = 6
    print("Test case 5:", top_k_frequent(nums5, k5))
    # Expected output: [1, 2, 3, 4, 5, 6] (order may vary)

    # Test case 6: Edge case with an empty input list
    nums6 = []
    k6 = 0
    print("Test case 6:", top_k_frequent(nums6, k6))
    # Expected output: []

    # Test case 7: k is 1
    nums7 = [7, 7, 8, 8, 8, 9]
    k7 = 1
    print("Test case 7:", top_k_frequent(nums7, k7))
