from typing import List

# Function to sort the array so that even indices have even numbers and odd indices have odd numbers
def sort_array_by_parityII(nums: List[int]) -> List[int]:
    # Implement your solution here
    pass

# Test cases
def test_sort_array_by_parityII():
    def validate(input_nums):
        result = sort_array_by_parityII(input_nums)
        # Validate that result alternates correctly
        for i in range(len(result)):
            if i % 2 == 0:
                assert result[i] % 2 == 0, f"Even index {i} has odd number {result[i]}"
            else:
                assert result[i] % 2 == 1, f"Odd index {i} has even number {result[i]}"
        # Validate all elements are present
        assert sorted(result) == sorted(input_nums), f"Mismatch in elements: expected {sorted(input_nums)}, got {sorted(result)}"

    # Test case 1: Balanced input
    validate([4, 2, 5, 7])

    # Test case 2: More elements
    validate([2, 3, 4, 1, 6, 5])

    # Test case 3: Minimum valid input
    validate([2, 1])

    # Test case 4: Repeated elements
    validate([2, 3, 2, 3])

    # Test case 5: Large input
    validate([i for i in range(0, 1000, 2)] + [i for i in range(1, 1000, 2)])

    print("All test cases passed!")

# Run the test cases
if __name__ == "__main__":
    test_sort_array_by_parityII()
