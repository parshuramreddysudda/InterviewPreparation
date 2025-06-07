from typing import List


# Function to find the value to replace elements greater than it to minimize difference with target
def find_best_value(arr: List[int], target: int) -> int:
    # Implement your solution here

    arr.sort()
    n = len(arr)
    ans = 0
    for i, num in enumerate(arr):
        if target <= num * (n - i):
            target = target / (n - i)
            if target - int(target) == 0.5:
                return int(target)
            return round(target)
        target -= num
    return arr[-1]
    #
    # for i, num in enumerate(arr):
    #     if remaining_target <= num * (n - i):
    #         replacement_value = remaining_target / (n - i)
    #         if replacement_value - int(replacement_value) == 0.5:
    #             return int(replacement_value)
    #         return round(replacement_value)
    #     remaining_target -= num
    # return arr[-1]


# Test cases
def test_find_best_value():
    def validate(arr, target, expected_output):
        result = find_best_value(arr, target)
        assert result == expected_output, f"Failed for arr={arr}, target={target}: expected {expected_output}, got {result}"

    # Test case 1: Basic example
    validate([4, 9, 3], 10, 3)

    # Test case 2: Exact match
    validate([2, 3, 5], 10, 5)

    # Test case 3: Rounding needed
    validate([60864, 25176, 27249, 21296, 20204], 56803, 11361)

    # Test case 4: All elements smaller than target
    validate([1, 2, 3], 100, 3)

    # Test case 5: All elements larger than target
    validate([10, 20, 30], 5, 1)

    # Test case 6: Single element array
    validate([10], 7, 7)

    print("All test cases passed!")


# Run test cases
if __name__ == "__main__":
    test_find_best_value()
