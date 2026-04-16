from operator import truediv
from typing import List


class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        # ❌ Implement your solution here

        rows = len(mat)
        cols = len(mat[0])

        rowCount = [0] * rows
        colCount = [0] * cols

        # Count 1s in rows and columns
        for r in range(rows):
            for c in range(cols):
                if mat[r][c] == 1:
                    rowCount[r] += 1
                    colCount[c] += 1

        result = 0

        # Check special positions
        for r in range(rows):
            if mat[r][r] == 1 and rowCount[r] == 1 and colCount[r] == 1:
                result += 1
                break

        return result


def test_numSpecial():
    sol = Solution()

    def validate(mat, expected):
        result = sol.numSpecial(mat)
        assert result == expected, (
            f"❌ Failed for mat={mat}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([[1,0,0],[0,0,1],[1,0,0]], 1)
    validate([[1,0,0],[0,1,0],[0,0,1]], 3)
    validate([[0,0,0],[0,0,0],[0,0,0]], 0)

    # 🔬 Edge cases
    validate([[1]], 1)                          # Single cell with 1
    validate([[0]], 0)                          # Single cell with 0
    validate([[1,0,0,0]], 1)                    # Single row
    validate([[1],[0],[0]], 1)                  # Single column
    validate([[1,1],[1,1]], 0)                  # No special position

    # 🔬 Corner / tricky cases
    validate([[0,1,0],[1,0,0],[0,0,1]], 3)
    validate([[0,0,1],[1,0,0],[0,1,0]], 3)
    validate([[1,0,0],[0,1,1],[0,0,0]], 1)
    validate([[0,0,0],[0,1,0],[0,0,0]], 1)
    validate([[1,0,0],[0,0,0],[0,0,1]], 2)

    # 🔬 Large input case
    size = 100
    large_mat = [[0]*size for _ in range(size)]
    for i in range(size):
        large_mat[i][i] = 1
    validate(large_mat, size)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_numSpecial()