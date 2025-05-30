from typing import List


# Function to calculate minimum total operations to make all elements equal to each query
def min_operations(nums: List[int], queries: List[int]) -> List[int]:
    # Implement your solution here

    if len(nums) == 0:
        return [0] * len(queries)
    nums.sort()
    n = len(nums)
    lSum = [0] * n
    lSum[0] = nums[0]
    for i in range(1, len(nums)):
        lSum[i] = lSum[i - 1] + nums[i]
    rSum = [0] * n
    rSum[n - 1] = nums[n - 1]
    for i in range(n - 2, -1, -1):
        rSum[i] = nums[i] + rSum[i + 1]

    ans = []
    for i in range(len(queries)):
        index = binarySearch(nums, queries[i]) - 1
        if index < 0:
            index = 0
        if index >= n:
            index = n - 1
        lsumval = lSum[index]
        leftans, rightans = 0, 0
        lVal = index + 1 * queries[i]
        if index >= 0:
            leftans = abs((index + 1) * queries[i] - lSum[index])
        if index + 1 < n:
            rightans = abs((n - index - 1) * queries[i] - rSum[index + 1])
        ans.append(leftans + rightans)
    return ans


def binarySearch(nums, target):
    left = 0
    right = len(nums) - 1
    mid = 0

    while left <= right:
        mid = left + (right - left) // 2
        if nums[mid] == target:
            return mid + 1
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return left


# Test cases
def test_min_operations():
    def validate(nums, queries, expected_output):
        result = min_operations(nums, queries)
        assert result == expected_output, f"Failed for nums={nums}, queries={queries}: expected {expected_output}, got {result}"

    # Test case 1: Basic example
    validate([3, 8, 12, 6], [10, 4], [15, 15])

    # Test case 2: All elements the same
    validate([5, 5, 5], [5, 6], [0, 3])

    # Test case 3: Empty nums
    validate([], [1, 2, 3], [0, 0, 0])

    # Test case 4: Empty queries
    validate([1, 2, 3], [], [])

    # Test case 5: Decreasing input
    validate([10, 8, 6, 4, 2], [5], [13])

    # Test case 6: One query, many numbers
    validate([1, 2, 3, 4, 5], [3], [6])

    print("All test cases passed!")


# Run the tests
if __name__ == "__main__":
    test_min_operations()
