from typing import List


def merge_sorted(arr1: List[int], arr2: List[int]) -> List[int]:
    """
    Merges two sorted arrays into one sorted array.

    :param arr1: First sorted array.
    :param arr2: Second sorted array.
    :return: A merged sorted array.
    """

    
    return []


# Test cases
if __name__ == "__main__":
    # Test case 1: Merging two non-empty sorted arrays
    arr1_1 = [1, 3, 5]
    arr2_1 = [2, 4, 6]
    print("Test case 1:", merge_sorted(arr1_1, arr2_1))
    # Expected output: [1, 2, 3, 4, 5, 6]

    # Test case 2: Merging when one array is empty
    arr1_2 = []
    arr2_2 = [2, 4, 6]
    print("Test case 2:", merge_sorted(arr1_2, arr2_2))
    # Expected output: [2, 4, 6]

    # Test case 3: Merging when both arrays are empty
    arr1_3 = []
    arr2_3 = []
    print("Test case 3:", merge_sorted(arr1_3, arr2_3))
    # Expected output: []

    # Test case 4: Merging arrays with duplicates
    arr1_4 = [1, 3, 5, 7]
    arr2_4 = [2, 3, 6, 7]
    print("Test case 4:", merge_sorted(arr1_4, arr2_4))
    # Expected output: [1, 2, 3, 3, 5, 6, 7, 7]

    # Test case 5: Merging when one array is completely smaller than the other
    arr1_5 = [1, 2, 3]
    arr2_5 = [4, 5, 6]
    print("Test case 5:", merge_sorted(arr1_5, arr2_5))
    # Expected output: [1, 2, 3, 4, 5, 6]
