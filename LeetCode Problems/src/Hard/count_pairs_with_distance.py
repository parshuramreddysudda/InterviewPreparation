from typing import List


# Function to count pairs with distance <= d
def count_pairs_with_distance(nums: List[int], d: int) -> int:
    # Implement your solution here
    nums.sort()

    low = 0
    high = nums[-1] - nums[0]
    while low < high:
        mid = (low + high) // 2
        count = numberOfPairs(nums, mid)
        if count < d:
            low = mid + 1
        else:
            high = mid

    return low
    pass


def numberOfPairs(nums: List[int], d: int) -> int:

    count = 0

    left = 0

    for right in range(len(nums)):
        while nums[right] - nums[left] > d:
            left += 1
        count += right - left

    return count


# Test cases
def test_count_pairs_with_distance():
    def validate(nums, d, expected):
        result = count_pairs_with_distance(nums, d)
        assert result == expected, f"Failed for nums={nums}, d={d}. Expected {expected}, got {result}"

    # Test case 1: Simple case
    validate([2,3,5,7,11], 8, 6)  # pairs: (1,1)

    # Test case 2: No pairs within distance
    validate([1, 6, 10], 2, 0)

    # Test case 3: Multiple pairs
    validate([1, 2, 3, 4], 2, 4)  # pairs: (1,2),(1,3),(2,3),(2,4)

    # Test case 4: All equal elements
    validate([2, 2, 2], 0, 3)

    # Test case 5: Empty list
    validate([], 1, 0)

    # Test case 6: Single element
    validate([1], 1, 0)

    print("All test cases passed!")


if __name__ == "__main__":
    test_count_pairs_with_distance()
