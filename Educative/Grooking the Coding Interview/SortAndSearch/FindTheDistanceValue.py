from typing import List

# Function to calculate the distance value between two arrays
def find_the_distance_value(arr1: List[int], arr2: List[int], d: int) -> int:
    # Implement your solution here

    arr1.sort()
    arr2.sort()
    count = 0
    for i in range(len(arr1)):
        isSatisfied = True
        for j in range(len(arr2)):
            if abs(arr1[i] - arr2[j]) <= d:
                isSatisfied = False
                break
        if isSatisfied:
            count += 1

    return count

# Test cases
def test_find_the_distance_value():
    def validate(arr1, arr2, d, expected_output):
        result = find_the_distance_value(arr1, arr2, d)
        assert result == expected_output, f"Failed for arr1={arr1}, arr2={arr2}, d={d}: expected {expected_output}, got {result}"

    # Test case 1: Basic example
    validate([4,5,8], [10,9,1,8], 2, 2)

    # Test case 2: All values meet condition
    validate([1,4,2,3], [-4,-3,6,10,20,30], 3, 2)

    # Test case 3: No values meet condition
    validate([2,1,100,3], [1,2,3,4], 0, 1)

    # Test case 4: Empty arr1
    validate([], [1, 2, 3], 1, 0)

    # Test case 5: Empty arr2
    validate([1, 2, 3], [], 1, 3)

    # Test case 6: Both arrays empty
    validate([], [], 5, 0)

    print("All test cases passed!")

# Run test cases
if __name__ == "__main__":
    test_find_the_distance_value()
