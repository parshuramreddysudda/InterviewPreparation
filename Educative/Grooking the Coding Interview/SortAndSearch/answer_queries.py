from typing import List

# Function to answer each query about the maximum size of subsequence with sum ≤ query
def answer_queries(nums: List[int], queries: List[int]) -> List[int]:
    # Implement your solution here

    nums.sort()
    queries.sort()

    ans = []
    for i in range(1,len(nums)):
        nums[i] = nums[i-1] + nums[i]

    for q in queries:
        ans.append(binarySearch(nums,q))

    return ans

def binarySearch(nums,target):

    left = 0
    right = len(nums) -1
    mid = 0

    while left <= right:
        mid = left + (right - left) // 2
        if nums[mid] == target:
            return mid+1
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return left
# Test cases
def test_answer_queries():
    def validate(nums, queries, expected_output):
        result = answer_queries(nums, queries)
        assert result == expected_output, f"Failed for nums={nums}, queries={queries}: expected {expected_output}, got {result}"

    # Test case 1: Basic example
    validate([4, 5, 2, 1], [3, 10, 21], [2, 3, 4])

    # Test case 2: No query can be satisfied
    validate([10, 20, 30], [5, 9], [0, 0])

    # Test case 3: All queries can use full list
    validate([1, 2, 3], [6, 10], [3, 3])

    # Test case 4: Empty nums
    validate([], [1, 2, 3], [0, 0, 0])

    # Test case 5: Empty queries
    validate([1, 2, 3], [], [])

    # Test case 6: Large values
    validate([100, 200, 300], [100, 500, 1000], [1, 2, 3])

    print("All test cases passed!")

# Run tests
if __name__ == "__main__":
    test_answer_queries()
