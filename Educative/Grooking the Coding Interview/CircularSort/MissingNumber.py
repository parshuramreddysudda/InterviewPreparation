from typing import List


# Function to find the missing number in the range [0, n]
def find_missing_number(nums: List[int]) -> int:
    # Implement your solution here
    i = 0
    while i < len(nums):
        val = nums[i]
        if val < len(nums) and nums[i] != i:
            nums[val], nums[i] = nums[i], nums[val]
        else:
            i += 1

    if nums[0] != 0:
        return 0

    for i in range(len(nums)):
        if nums[i] != i:
            return nums[i-1] + 1

    return len(nums)


# Test cases
def test_find_missing_number():
    def validate(input_nums, expected_output):
        result = find_missing_number(input_nums)
        assert result == expected_output, f"Failed for {input_nums}: expected {expected_output}, got {result}"

    # Test case 1: Missing number in the middle
    validate([3, 0, 1,4], 2)

    # Test case 2: Missing number at the end
    validate([0, 1, 2, 3], 4)

    # Test case 3: Missing number at the beginning
    validate([1, 2, 3, 4], 0)

    # Test case 4: Single element, missing 0
    validate([1], 0)

    # Test case 5: Single element, missing 1
    validate([0], 1)

    # Test case 6: Large consecutive input
    validate(list(range(10000)) + [10001], 10000)

    print("All test cases passed!")


# Run test cases
if __name__ == "__main__":
    test_find_missing_number()
