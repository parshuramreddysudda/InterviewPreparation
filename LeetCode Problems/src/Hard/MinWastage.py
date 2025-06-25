from typing import List

# Function to compute the minimum wasted space when packaging items
def min_wasted_space(packages: List[int], boxes: List[List[int]]) -> int:
    # Implement your solution here

    sorted(packages)
    minVal = 99999999999
    for box in boxes:
        sorted(box)
        if packages[-1] > box[-1]:
            continue
        currMin = 0
        for package in packages:
            currMin = getMinmumFrom(package, box)


    return -1

def getMinmumFrom(package,box):

    left = 0
    right = len(box)-1
    while left <= right:
        mid = (left + right) // 2
        if package[mid] < box[mid]:
            left = mid
        else:
            right = mid - 1

    return low

# Test cases
def test_min_wasted_space():
    def validate(packages, boxes, expected_output):
        result = min_wasted_space(packages, boxes)
        assert result == expected_output, f"Failed for packages={packages}, boxes={boxes}. Expected {expected_output}, got {result}"

    # Test case 1: Basic example
    # validate(
    #     [2, 3, 5],
    #     [[4, 8], [2, 8]],
    #     6
    # )

    # Test case 2: No box can fit all packages
    validate(
        [2, 3, 5],
        [[1, 4], [2, 3]],
        -1
    )

    # Test case 3: Single package
    validate(
        [5],
        [[6], [5]],
        0
    )

    # Test case 4: Large numbers
    validate(
        [10**5, 10**5],
        [[10**5 + 1], [10**5]],
        0
    )

    # Test case 5: Multiple suppliers with similar boxes
    validate(
        [1, 2, 3],
        [[3, 3, 3], [2, 3, 4], [1, 2, 2, 3]],
        0
    )

    print("All test cases passed!")

# Run tests
if __name__ == "__main__":
    test_min_wasted_space()
