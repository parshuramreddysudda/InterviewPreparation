from typing import List

from src.Easy.ToeplizedMatric import validateRow


class Solution:
    def numMagicSquaresInside(self, grid: List[List[int]]) -> int:
        # ❌ Implement your solution here

        ans = 0
        for row in range(len(grid)-2):
            for col in range(len(grid[0])-2):
                if self.checkifValidMatrix(row, col, grid):
                    ans +=1

        return ans
    def checkifValidMatrix(self, row: int, col: int, grid: List[List[int]]) -> bool:

        if grid[1+row][1+col] !=5 or grid[1+row][1+col] >9:
            return False

        maxRow = row+3
        maxCol = col+3
        currSum = grid[row][col]+grid[row][col+1]+grid[row][col+2]
        for i in range(row,maxRow):
            rowSum = 0
            colSum = 0
            for j in range(col,maxCol):
                if grid[i][j] >9 or grid[j][i] >9 :
                    return False
                rowSum += grid[i][j]
                colSum += grid[j][i]

            if rowSum != currSum or colSum != currSum:
                return False

        diag1 = 0
        diag2 = 0
        for k in range(3):
            diag1 += grid[row + k][col + k]
            diag2 += grid[row + k][col + (2 - k)]
        if diag1 != currSum or diag2 != currSum:
            return False

        return True


def test_numMagicSquaresInside_840():
    sol = Solution()

    def validate(grid, expected):
        result = sol.numMagicSquaresInside(grid)
        assert result == expected, (
            f"❌ Failed for grid={grid}. "
            f"Expected {expected}, got {result}"
        )

    validate(
        [[2, 7, 6], [1, 5, 9], [4, 3, 8]],0
    )
    # 🔬 Multiple magic squares
    validate(
        [[8,1,6,8,1,6],
         [3,5,7,3,5,7],
         [4,9,2,4,9,2],
         [8,1,6,8,1,6],
         [3,5,7,3,5,7],
         [4,9,2,4,9,2]],
        4
    )


    # 🔬 Core test cases
    validate(
        [[4,3,8,4],
         [9,5,1,9],
         [2,7,6,2]],
        1
    )

    validate(
        [[8,1,6],
         [3,5,7],
         [4,9,2]],
        1
    )

    validate(
        [[1,2,3],
         [4,5,6],
         [7,8,9]],
        0
    )

    # 🔬 Edge cases
    validate([], 0)                               # Empty grid
    validate([[1,2],[3,4]], 0)                    # Smaller than 3x3
    validate([[5]], 0)                            # Single cell
    validate([[1,1,1],[1,1,1],[1,1,1]], 0)        # All same numbers

    # 🔬 Corner / tricky cases
    validate(
        [[10,3,5],
         [4,9,2],
         [3,5,7]],
        0                                          # Numbers outside 1–9
    )

    validate(
        [[2,7,6,2],
         [9,5,1,9],
         [4,3,8,4]],
        1                                          # Magic square not centered
    )

    validate(
        [[4,3,8,4],
         [9,5,1,9],
         [2,7,6,2],
         [1,6,5,4]],
        1
    )


    # 🔬 Large grid case (performance)
    large_grid = [[(i + j) % 9 + 1 for j in range(20)] for i in range(20)]
    validate(large_grid, 0)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_numMagicSquaresInside_840()
