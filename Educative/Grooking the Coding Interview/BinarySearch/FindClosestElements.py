import math
from typing import List


def find_closest_elements(nums: List[int], k: int, target: int) -> List[int]:
    """
    Finds the k closest elements to x in the sorted array arr.
    :param arr: List of integers sorted in ascending order
    :param k: Number of closest elements to find
    :param x: Target integer
    :return: List of k closest integers to x, sorted in ascending order
    """
    if k == len(nums):
        return nums

    if target < nums[0]:
        return nums[0:k]

    if target > nums[len(nums) - 1]:
        return nums[len(nums) - k:len(nums)]

    left, right = 0, len(nums) - 1
    mid = 0
    while left <= right:
        mid = (left + right) // 2
        if nums[mid] == target:
            break
        elif nums[mid] > target:
            right = mid - 1
        else:
            left = mid + 1

    print("Mid is ", nums[mid])

    left = mid - 1
    right = left + 1

    while k > 0 and left >= 0 and right < len(nums):

        if abs(target - nums[left]) <= abs(target - nums[right]):
            left -= 1
        else:
            right += 1

        k -= 1
    if k > 0 and left >= 0:
        left -= k

    if k > 0 and right <= len(nums):
        right += k
    return nums[left+1:right]


# Test cases
if __name__ == "__main__":
    # Test case 1: Basic test
    arr1 = [-3, -2, -1, 0, 1, 2, 3]
    k1 = 3
    x1 = 1
    print("Test case 1:", find_closest_elements(arr1, k1, x1))
    # Expected output: [0,1,2]

    # Test case 2: Target not in array
    arr2 =[-2073,-2067,-2049,-2047,-2024,-2021,-1964]
    k2 = 1
    x2 = -2025
    print("Test case 2:", find_closest_elements(arr2, k2, x2))
    # Expected output: [2024]

    # Test case 3: Array with a single element
    arr3 = [1]
    k3 = 1
    x3 = 1
    print("Test case 3:", find_closest_elements(arr3, k3, x3))
    # Expected output: [1]

    # Test case 4: Large array
    arr4 = list(range(1, 101))
    k4 = 5
    x4 = 50
    print("Test case 4:", find_closest_elements(arr4, k4, x4))
    # Expected output: [48, 49, 50, 51, 52]

    # Test case 5: All elements equally distant
    arr5 = [10, 20, 30, 40, 50]
    k5 = 2
    x5 = 25
    print("Test case 5:", find_closest_elements(arr5, k5, x5))
    # Expected output: [20, 30]

    # Test case 6: Edge case - k equals array length
    arr6 = [1, 2, 3, 4, 5]
    k6 = 5
    x6 = 3
    print("Test case 6:", find_closest_elements(arr6, k6, x6))
    # Expected output: [1, 2, 3, 4, 5]

    # Test case 7: Edge case - x much larger than array values
    arr7 = [1, 2, 3, 4, 5]
    k7 = 3
    x7 = 100
    print("Test case 7:", find_closest_elements(arr7, k7, x7))
    # Expected output: [3, 4, 5]
