import heapq


def sortArrayByParityII(nums: list[int]) -> list[int]:
    """
    Rearranges the array `nums` so that at every even index there's an even number,
    and at every odd index there's an odd number.
    """
    evenHeap = []
    oddHeap = []
    for n in nums:
        if n % 2 == 0 or n == 0:
            evenHeap.append(n)
        else:
            oddHeap.append(n)

    print(evenHeap)
    print(oddHeap)

    for i in range(len(nums)):
        if i % 2 == 0:
            nums[i] = evenHeap.pop()
        else:
            nums[i] = - heapq.heappop(oddHeap)

    return nums

# Test cases
if __name__ == "__main__":
    # Test case 1: Mixed even and odd numbers
    nums1 = [4, 2, 5, 7]
    print("Test case 1:", sortArrayByParityII(nums1))
    # Expected output: [4, 5, 2, 7] (or any other valid arrangement)

    # Test case 2: Alternating even and odd numbers
    nums2 = [2, 3, 6, 5, 8, 7]
    print("Test case 2:", sortArrayByParityII(nums2))
    # Expected output: [2, 3, 6, 5, 8, 7] (unchanged as it already satisfies the condition)

    # Test case 3: All even numbers followed by odd numbers
    nums3 = [2, 4, 6, 1, 3, 5]
    print("Test case 3:", sortArrayByParityII(nums3))
    # Expected output: [2, 1, 4, 3, 6, 5]

    # Test case 4: All odd numbers followed by even numbers
    nums4 = [1, 3, 5, 2, 4, 6]
    print("Test case 4:", sortArrayByParityII(nums4))
    # Expected output: [2, 1, 4, 3, 6, 5] (or similar)

    # Test case 5: Edge case with only two elements
    nums5 = [2, 3]
    print("Test case 5:", sortArrayByParityII(nums5))
    # Expected output: [2, 3] (already valid)

    # Test case 6: Large input with alternating pattern
    nums6 = [i if i % 2 == 0 else i + 1 for i in range(20)]  # Even numbers in the first half, odd in the second
    print("Test case 6:", sortArrayByParityII(nums6))
    # Expected output: Valid parity arrangement of the same numbers
