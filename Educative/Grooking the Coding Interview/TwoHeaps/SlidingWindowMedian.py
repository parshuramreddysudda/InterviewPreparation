import heapq


def balanceHeap(maxHeap, minHeap):
    if len(maxHeap) == len(minHeap):
        return

    while len(minHeap) > len(maxHeap):
        heapq.heappush(maxHeap, -heapq.heappop(minHeap))

    while len(minHeap) + 1 < len(maxHeap):
        heapq.heappush(minHeap, -heapq.heappop(maxHeap))


def getMedian(maxHeap, minHeap):
    if len(maxHeap) == 0 and len(minHeap) == 0:
        return 0
    if len(maxHeap) == len(minHeap):
        return (maxHeap[0] - minHeap[0]) / 2.0

    return float(maxHeap[0])


def medianSlidingWindow(nums: list[int], k: int) -> list[float]:
    """
    Calculates the median of each sliding window of size `k` in the input list `nums`.
    """
    maxHeap = []
    minHeap = []
    ans = list()
    for i in range(k):
        heapq.heappush(maxHeap, nums[i])

    balanceHeap(maxHeap, minHeap)

    median = getMedian(maxHeap, minHeap)
    ans.append(median)
    print("Median is ", median)
    print("Max Heap is ", maxHeap)
    print("Min Heap is ", minHeap)
    for i in range(k, len(nums)):

        num = nums[i - k]
        curr = nums[i]
        print("Current Array element is ", curr)
        if num >= maxHeap[0]:
            poppedHeap = heapq.heappop(maxHeap)
            while poppedHeap != num:
                heapq.heappush(minHeap, -poppedHeap)
                poppedHeap = heapq.heappop(maxHeap)
            # heapq.heappush(maxHeap, curr)
        else:
            poppedHeap = heapq.heappop(minHeap)
            while poppedHeap != -num:
                heapq.heappush(maxHeap, -poppedHeap)
                poppedHeap = heapq.heappop(minHeap)
            # heapq.heappush(minHeap, -curr)

        if len(maxHeap) > 0 and curr >= maxHeap[0]:
            heapq.heappush(maxHeap, curr)
        else:
            heapq.heappush(minHeap, -curr)

        balanceHeap(maxHeap, minHeap)
        median = getMedian(maxHeap, minHeap)
        print("Median is ", getMedian(maxHeap, minHeap))
        ans.append(median)
        print("Max Heap is ", maxHeap)
        print("Min Heap is ", minHeap)
    return ans


# Test cases
if __name__ == "__main__":
    # # Test case 1: Regular case with odd window size
    nums1 = [1,2]
    k1 = 1
    print("Test case 1:", medianSlidingWindow(nums1, k1))
    # Expected output: [1,-1,-1,3,5,6]
    #
    # Test case 2: Window size is equal to the length of the array
    # nums2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    # k2 = 4
    # print("Test case 2:", medianSlidingWindow(nums2, k2))
    # Expected output: [2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5]
    #
    # # Test case 3: Window size is 1
    # nums3 = [1, 2, 3, 4, 5]
    # k3 = 1
    # print("Test case 3:", medianSlidingWindow(nums3, k3))
    # # Expected output: [1.0, 2.0, 3.0, 4.0, 5.0]
    #
    # # Test case 4: Array with all identical elements
    # nums4 = [2, 2, 2, 2, 2]
    # k4 = 2
    # print("Test case 4:", medianSlidingWindow(nums4, k4))
    # # Expected output: [2.0, 2.0, 2.0, 2.0]
    #
    # # Test case 5: Window size is greater than the array length
    # nums5 = [1, 2]
    # k5 = 3
    # print("Test case 5:", medianSlidingWindow(nums5, k5))
    # # Expected output: []
    #
    # # Test case 6: Array with negative numbers
    # nums6 = [-1, -3, -5, -7, -9]
    # k6 = 3
    # print("Test case 6:", medianSlidingWindow(nums6, k6))
    # # Expected output: [-3.0, -5.0, -7.0]
    #
    # # Test case 7: Large array with mixed numbers
    # nums7 = [1, 5, 2, 6, 3, 7, 4, 8, 9, 10]
    # k7 = 4
    # print("Test case 7:", medianSlidingWindow(nums7, k7))
    # # Expected output: [3.5, 4.0, 5.5, 6.0, 7.0, 8.0]
