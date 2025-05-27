from typing import List

# Function to calculate minimum total operations to make all elements equal to each query
def min_operations(nums: List[int], queries: List[int]) -> List[int]:
    # Implement your solution here

    pass

# Test cases
def test_min_operations():
    def validate(nums, queries, expected_output):
        result = min_operations(nums, queries)
        assert result == expected_output, f"Failed for nums={nums}, queries={queries}: expected {expected_output}, got {result}"

    # Test case 1: Basic example
    validate([3, 1, 6, 8], [1, 5], [14, 10])

    # Test case 2: All elements the same
    validate([5, 5, 5], [5, 6], [0, 3])

    # Test case 3: Empty nums
    validate([], [1, 2, 3], [0, 0, 0])

    # Test case 4: Empty queries
    validate([1, 2, 3], [], [])

    # Test case 5: Decreasing input
    validate([10, 8, 6, 4, 2], [5], [9])

    # Test case 6: One query, many numbers
    validate([1, 2, 3, 4, 5], [3], [6])

    print("All test cases passed!")

# Run the tests
if __name__ == "__main__":
    test_min_operations()
