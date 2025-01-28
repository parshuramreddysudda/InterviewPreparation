from typing import List


def count_pairs(nums: List[int], target: int) -> int:
    """
    Counts the number of pairs (i, j) where i < j and nums[i] + nums[j] < target.
    :param nums: List of integers
    :param target: The target sum
    :return: The number of pairs where the sum of the pair is less than the target
    """
    # Replace this placeholder return statement with your code

    nums = sorted(nums)
    left, right = 0, len(nums) - 1
    while left < right:
        mid = left + (right - left) // 2
        if nums[0] + nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    print("Right is ", right)

    left = 0
    count = 0
    while left < right:
        currLeft = left
        while currLeft < right:
            if nums[currLeft] + nums[right] < target:
                count += 1
                currLeft += 1
            else:
                break
        right -= 1

    return count


# Test cases
if __name__ == "__main__":
    # Test case 1: Basic test
    nums1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    target1 = 7
    print("Test case 1:", count_pairs(nums1, target1))
    # Expected output: 6

    # Test case 2: No pairs satisfy the condition
    nums2 = [5, 5, 5, 5]
    target2 = 5
    print("Test case 2:", count_pairs(nums2, target2))
    # Expected output: 0

    # Test case 3: All pairs satisfy the condition
    nums3 = [-2, -1, 0, 1]
    target3 = 2
    print("Test case 3:", count_pairs(nums3, target3))
    # Expected output: 6

    # Test case 4: Mixed positive and negative numbers
    nums4 = [-3, -2, 0, 1, 4]
    target4 = 3
    print("Test case 4:", count_pairs(nums4, target4))
    # Expected output: 7

    # Test case 5: Array with one element
    nums5 = [1]
    target5 = 10
    print("Test case 5:", count_pairs(nums5, target5))
    # Expected output: 0

    # Test case 6: Array with duplicate elements
    nums6 = [1, 1, 1, 1]
    target6 = 3
    print("Test case 6:", count_pairs(nums6, target6))
    # Expected output: 6
