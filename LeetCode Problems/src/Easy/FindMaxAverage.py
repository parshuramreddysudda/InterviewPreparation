def findMaxAverage(nums: list[int], k: int) -> float:
    """
    Finds the maximum average of any subarray of length `k`.
    """
    average = sum(nums[:k])
    maximum = max(0.00000, float("{0:.4f}".format(average / k)))
    pointer = 0
    for i in range(k, len(nums)):
        average -= nums[pointer]
        average += nums[i]
        maximum = max(maximum, float("{0:.4f}".format(average / k)))
    return maximum


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with positive integers
    nums1 = [1, 12, -5, -6, 50, 3]
    k1 = 4
    print("Test case 1:", findMaxAverage(nums1, k1))
    # Expected output: 12.75 (subarray [12, -5, -6, 50])

    # Test case 2: All positive numbers
    nums2 = [5, 5, 5, 5, 5]
    k2 = 2
    print("Test case 2:", findMaxAverage(nums2, k2))
    # Expected output: 5.0 (subarray [5, 5])

    # Test case 3: Single element
    nums3 = [100]
    k3 = 1
    print("Test case 3:", findMaxAverage(nums3, k3))
    # Expected output: 100.0 (subarray [100])

    # Test case 4: Mixed positive and negative numbers
    nums4 = [-1, -2, 3, 4, -5, -6, 7, 8]
    k4 = 3
    print("Test case 4:", findMaxAverage(nums4, k4))
    # Expected output: 6.33 (subarray [7, 8, -1])

    # Test case 5: Large array
    nums5 = [1] * 10000
    k5 = 100
    print("Test case 5:", findMaxAverage(nums5, k5))
    # Expected output: 1.0 (subarray of all 1s)

    # Test case 6: Edge case with small k
    nums6 = [1, 2, 3, 4, 5]
    k6 = 1
    print("Test case 6:", findMaxAverage(nums6, k6))
    # Expected output: 5.0 (subarray [5])
