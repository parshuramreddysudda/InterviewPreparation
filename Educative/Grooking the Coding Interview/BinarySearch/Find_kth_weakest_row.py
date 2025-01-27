import heapq
from typing import List


def find_nowof_row(mat, i):
    left, right = 0, len(mat[i]) - 1
    while left <= right:
        mid = (left + right) // 2
        if mat[i][mid] == 1:
            left = mid + 1
        else:
            right = mid - 1

    return left


def find_k_weakest_rows(mat: List[List[int]], k: int) -> List[int]:
    """
    Finds the k weakest rows in the matrix, where weakness is determined by the number of soldiers (1s).
    If two rows have the same number of soldiers, the row with the smaller index is considered weaker.
    :param mat: 2D list of integers (1s and 0s), where 1 represents a soldier and 0 represents a civilian
    :param k: Number of weakest rows to find
    :return: List of indices of the k weakest rows in ascending order
    """
    # Replace this placeholder return statement with your code
    heap = []
    curr = len(mat) - 1
    while curr >= 0:
        sold = find_nowof_row(mat, curr)
        print("No of soldiers in row ", curr, " is : ", sold)
        heapq.heappush(heap, [sold, curr])
        curr -= 1
    ans = []
    while k > 0:
        key, value = heapq.heappop(heap)
        ans.append(value)
        k -= 1

    return ans


# Test cases
if __name__ == "__main__":
    # Test case 1: Basic test
    mat1 = [
        [1, 1, 0, 0, 0],
        [1, 1, 1, 1, 0],
        [1, 0, 0, 0, 0],
        [1, 1, 0, 0, 0],
        [1, 1, 1, 1, 1]
    ]
    k1 = 3
    print("Test case 1:", find_k_weakest_rows(mat1, k1))
    # Expected output: [2, 0, 3]

    # Test case 2: All rows have the same number of soldiers
    mat2 = [
        [1, 0, 0],
        [1, 0, 0],
        [1, 0, 0]
    ]
    k2 = 2
    print("Test case 2:", find_k_weakest_rows(mat2, k2))
    # Expected output: [0, 1]

    # Test case 3: Empty matrix
    mat3 = []
    k3 = 0
    print("Test case 3:", find_k_weakest_rows(mat3, k3))
    # Expected output: []

    # Test case 4: All rows are empty
    mat4 = [
        [],
        [],
        []
    ]
    k4 = 2
    print("Test case 4:", find_k_weakest_rows(mat4, k4))
    # Expected output: [0, 1]

    # Test case 5: k equals the number of rows
    mat5 = [
        [1, 1, 0],
        [1, 0, 0],
        [1, 1, 1]
    ]
    k5 = 3
    print("Test case 5:", find_k_weakest_rows(mat5, k5))
    # Expected output: [1, 0, 2]

    # Test case 6: Single row matrix
    mat6 = [[1, 1, 1, 0]]
    k6 = 1
    print("Test case 6:", find_k_weakest_rows(mat6, k6))
    # Expected output: [0]
