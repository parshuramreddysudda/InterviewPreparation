from typing import List
import copy


class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        # Implement your solution here
        rows, cols = len(matrix), len(matrix[0])
        valid = [[False for _ in range(cols)] for _ in range(rows)]
        for i in range(rows):
            for j in range(cols):
                if matrix[i][j] == 0:
                    valid[i][j] = True

        for i in range(rows):
            for j in range(cols):
                if matrix[i][j] == 0 and valid[i][j]:
                    makeMatrixZeros(matrix, i, j)
        pass


def makeMatrixZeros(matrix, i, j):
    for k in range(len(matrix)):
        matrix[k][j] = 0

    for k in range(len(matrix[0])):
        matrix[i][k] = 0


# Test cases
def test_set_zeroes():
    s = Solution()

    def validate(input_matrix, expected_output):
        matrix = copy.deepcopy(input_matrix)  # Avoid modifying original input
        s.setZeroes(matrix)
        assert matrix == expected_output, f"Failed: expected {expected_output}, got {matrix}"

    # Test case 1: Basic matrix with zero
    validate(
        [[1, 1, 1], [1, 0, 1], [1, 1, 1]],
        [[1, 0, 1], [0, 0, 0], [1, 0, 1]]
    )

    # Test case 2: Multiple zeroes
    validate(
        [[0, 1, 2, 0], [3, 4, 5, 2], [1, 3, 1, 5]],
        [[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]
    )

    # Test case 3: No zeroes
    validate(
        [[1, 2], [3, 4]],
        [[1, 2], [3, 4]]
    )

    # Test case 4: All zeroes
    validate(
        [[0, 0], [0, 0]],
        [[0, 0], [0, 0]]
    )

    # Test case 5: Zero in single row
    validate(
        [[1, 0, 3]],
        [[0, 0, 0]]
    )

    print("All test cases passed!")


# Run test cases
if __name__ == "__main__":
    test_set_zeroes()
