import math


class Solution:
    def minFallingPathSum(self, matrix):
        # ❌ Implement your solution here

        colLen = len(matrix[0])
        for row in range(1,len(matrix)):
            for col in range(len(matrix[0])):
                matrix[row][col] +=min(matrix[row-1][max(0,col-1):min(col+2,colLen)])

        return min(matrix[-1])


def test_minFallingPathSum_931():
    sol = Solution()

    def validate(matrix, expected):
        result = sol.minFallingPathSum(matrix)
        assert result == expected, (
            f"❌ Failed for matrix={matrix}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([[2,1,3],[6,5,4],[7,8,9]], 13)
    validate([[-19,57],[-40,-5]], -59)

    # 🔬 Edge cases
    validate([[5]], 5)                          # single cell
    validate([[-5]], -5)                        # single negative cell
    validate([[1,2]], 1)                        # single row
    validate([[1],[2],[3]], 6)                  # single column

    # 🔬 Negative-heavy grids
    validate([[-1,-2,-3],[-4,-5,-6],[-7,-8,-9]], -18)
    validate([[100,-42,-46,-41],[31,97,10,-10],[-58,-51,82,89],[51,81,69,-51]], -36)

    # 🔬 Tricky path decisions
    validate([[10,10,1],[1,10,10],[10,1,10]], 12)
    validate([[1,100,100],[100,1,100],[100,100,1]], 3)
    validate([[1,2,3],[4,5,6],[7,8,1]], 7)

    # 🔬 Equal values
    validate([[1,1,1],[1,1,1],[1,1,1]], 3)

    # 🔬 Boundary movement checks
    validate([[1,2,3],[4,5,6],[7,8,9]], 12)
    validate([[7,8,9],[6,5,4],[3,2,1]], 13)

    # 🔬 Large grid stress test
    large_matrix = [[1] * 100 for _ in range(100)]
    validate(large_matrix, 100)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minFallingPathSum_931()