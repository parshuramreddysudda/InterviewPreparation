from typing import List


def merge_sorted(nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    """
    Merges two sorted arrays nums1 and nums2 into a single sorted array in-place.

    :param nums1: The first list containing `m` elements followed by `n` zeroes for space.
    :param m: The number of initialized elements in nums1.
    :param nums2: The second list containing `n` elements.
    :param n: The number of elements in nums2.
    """

    while m > 0 and n > 0:
        if nums1[m-1] > nums2[n-1]:
            nums1[m + n - 1] = nums1[m - 1]
            m -= 1
        else:
            nums1[m + n - 1] = nums2[n - 1]
            n -= 1
    if n > 0:
        nums1[:n] = nums2[:n]
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1: Basic merge
    nums1_1 = [1, 2, 3, 0, 0, 0]
    nums2_1 = [2, 5, 6]
    merge_sorted(nums1_1, 3, nums2_1, 3)
    print("Test case 1:", nums1_1)
    # Expected output: [1, 2, 2, 3, 5, 6]

    # Test case 2: Merging into an empty nums1 space
    nums1_2 = [0]
    nums2_2 = [1]
    merge_sorted(nums1_2, 0, nums2_2, 1)
    print("Test case 2:", nums1_2)
    # Expected output: [1]

    # Test case 3: nums2 is empty, nums1 remains unchanged
    nums1_3 = [1, 2, 3]
    nums2_3 = []
    merge_sorted(nums1_3, 3, nums2_3, 0)
    print("Test case 3:", nums1_3)
    # Expected output: [1, 2, 3]

    # Test case 4: nums1 is empty except for buffer, nums2 fills it
    nums1_4 = [0, 0, 0, 0, 0]
    nums2_4 = [1, 2, 3, 4, 5]
    merge_sorted(nums1_4, 0, nums2_4, 5)
    print("Test case 4:", nums1_4)
    # Expected output: [1, 2, 3, 4, 5]

    # Test case 5: All elements in nums2 are smaller than nums1
    nums1_5 = [4, 5, 6, 0, 0, 0]
    nums2_5 = [1, 2, 3]
    merge_sorted(nums1_5, 3, nums2_5, 3)
    print("Test case 5:", nums1_5)
    # Expected output: [1, 2, 3, 4, 5, 6]
