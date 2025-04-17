from typing import List


# Function to check if a matrix is a Toeplitz matrix
def isToeplitzMatrix(matrix: List[List[int]]) -> bool:
    # Implement your solution here
    m, n = len(matrix), len(matrix[0])
    for i in range(m):
        if validateRow(matrix, i, 0, m, n) is False:
            return False
    for i in range(n):
        if validateRow(matrix, 0, i, m, n) is False:
            return False
    return True


def validateRow(matrix: List[List[int]], i: int, j: int, m: int, n: int) -> bool:
    val = matrix[i][j]
    while i < m and j < n:
        if matrix[i][j] != val:
            return False
        i += 1
        j += 1
    return True


# Test cases
def test_isToeplitzMatrix():
    def validate(matrix, expected):
        result = isToeplitzMatrix(matrix)
        assert result == expected, f"Failed: expected {expected}, got {result}"

    # Test case 1: Simple Toeplitz
    validate([
        [1, 2, 3, 4],
        [5, 1, 2, 3],
        [9, 5, 1, 2]
    ], True)

    # Test case 2: Not a Toeplitz matrix
    validate([
        [1, 2],
        [2, 2]
    ], False)

    # Test case 3: 1x1 matrix (always Toeplitz)
    validate([[7]], True)

    # Test case 4: Single row
    validate([[1, 2, 3, 4]], True)

    # Test case 5: Single column
    validate([[1], [2], [3]], True)

    # Test case 6: Large Toeplitz
    validate([
        [1, 2, 3, 4, 5],
        [6, 1, 2, 3, 4],
        [7, 6, 1, 2, 3],
        [8, 7, 6, 1, 2]
    ], True)

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_isToeplitzMatrix()
