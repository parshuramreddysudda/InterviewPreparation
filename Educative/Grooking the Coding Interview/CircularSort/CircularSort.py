from typing import List


# Function to perform cyclic sort
def cyclic_sort(nums: List[int]) -> List[int]:
    # Implement your solution here

    i = 0
    while i < len(nums):
        if nums[i] - 1 != i:
            newIndex = nums[i] - 1
            nums[i], nums[newIndex] = nums[newIndex], nums[i]
        else:
            i += 1
    return nums


# Test cases
def test_cyclic_sort():
    def validate(input_nums, expected_output):
        result = cyclic_sort(input_nums.copy())
        assert result == expected_output, f"Failed for {input_nums}: expected {expected_output}, got {result}"

    # Test case 1: Basic case with 1 to n
    validate([3, 1, 5, 4, 2], [1, 2, 3, 4, 5])

    # Test case 2: Already sorted
    validate([1, 2, 3, 4, 5], [1, 2, 3, 4, 5])

    # Test case 3: Reversed order
    validate([5, 4, 3, 2, 1], [1, 2, 3, 4, 5])

    # Test case 4: Minimum input
    validate([1], [1])

    # Test case 5: Two elements
    validate([2, 1], [1, 2])

    print("All test cases passed!")


# Run test cases
if __name__ == "__main__":
    test_cyclic_sort()
