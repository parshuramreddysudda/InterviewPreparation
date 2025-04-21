from typing import List, Tuple


# Function to find the corrupt pair: one duplicate and one missing number
def find_corrupt_pair(nums: List[int]) -> Tuple[int, int]:
    # Implement your solution here
    i = 0
    while i < len(nums):
        val = nums[i] - 1
        if nums[i] != nums[val]:
            nums[val], nums[i] = nums[i], nums[val]
        else:
            i += 1

    for i in range(len(nums)):
        if nums[i] != i + 1:
            return i+1, nums[i]

    return 0, len(nums)


# Test cases
def test_find_corrupt_pair():
    def validate(input_nums, expected_output):
        result = find_corrupt_pair(input_nums)
        assert result == expected_output, f"Failed for {input_nums}: expected {expected_output}, got {result}"

    validate([3, 1, 2, 3, 6, 4], [5, 3])
    # Test case 1: One duplicate and one missing
    validate([3, 1, 2, 5, 3], (3, 4))

    # Test case 2: Missing 1, duplicate 2
    validate([2, 2], (2, 1))

    # Test case 3: Larger list
    validate([1, 2, 2, 4], (2, 3))

    # Test case 4: End of list corrupted
    validate([1, 5, 3, 4, 5], (5, 2))

    # Test case 5: Near beginning
    validate([2, 2, 3, 4, 5], (2, 1))

    # Test case 6: Long list
    validate([1, 2, 4, 4, 5, 6, 7, 8, 9], (4, 3))

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_find_corrupt_pair()
