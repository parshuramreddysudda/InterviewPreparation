import itertools
from typing import List

class Solution:
    def largestMagicSquare(self, grid: List[List[int]]) -> int:
        # ❌ Implement your solution here
        row = len(grid)
        col = len(grid[0])
        zero = 0
        rowSum = [[ zero for _ in range(col)] for _ in range(row) ]
        colSum = [[ zero for _ in range(col)] for _ in range(row) ]

        def prefix_sum_accumulate(arr):
            return list(itertools.accumulate(arr))

        for i in range(len(grid)):
            rowSum[i] = prefix_sum_accumulate(grid[i])

        print(grid)
        for i in range(col):
            curSum = 0
            for j in range(row):
                curSum += grid[j][i]
                colSum[j][i] = curSum

        def getRowSum(start,end,row):
            if start == 0:
                return rowSum[row][end]
            else:
                return rowSum[row][end] - rowSum[row][start-1]

        def getColSum(start,end,col):
            if start == 0:
                return colSum[end][col]
            else:
                return colSum[end][col] - colSum[start-1][col]

        def calculateSqaureMatrix(stRow,stCol,endRow,endCol,curRow):

            if stRow == endRow and stCol == endCol:
                return 0

            # Row SUm
            ansSum =  getRowSum(stCol,endCol,curRow)
            while stRow <= endCol:
                curRowSum = getRowSum(stCol,endCol,stRow)
                if ansSum is not curRowSum:
                    print("Not an Answer")
                curColSum = getColSum(stCol,endCol,stRow)
                if ansSum is not curColSum:
                    print("Not an Answer")

                stRow += 1
            return 0



        maxSum = 0
        for i in range(0,col):
            for j in range(0,row):
                  if i <= row:
                    maxSum =max(maxSum, calculateSqaureMatrix(i,0,i,j,i))

        print(colSum)
        return grid




def test_largestMagicSquare_1895():
    sol = Solution()

    def validate(grid, expected):
        result = sol.largestMagicSquare(grid)
        assert result == expected, (
            f"❌ Failed for grid={grid}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases


    validate(
        [[5,1,3,1],
         [9,3,3,1],
         [1,3,3,8]],
        2
    )


    validate(
        [[7,1,4,5,6],
         [2,5,1,6,4],
         [1,5,4,3,2],
         [1,2,7,3,4]],
        3
    )

    validate(
        [[5,1,3,1],
         [9,3,3,1],
         [1,3,3,8]],
        2
    )

    # 🔬 Edge cases
    validate([[1]], 1)                       # Single cell
    validate([[1,2],[3,4]], 1)               # No magic >1
    validate([], 0)                          # Empty grid

    # 🔬 Corner / tricky cases
    validate(
        [[2,2,2],
         [2,2,2],
         [2,2,2]],
        3                                     # All equal
    )

    validate(
        [[1,2,3],
         [4,5,6],
         [7,8,9]],
        1
    )

    validate(
        [[10,3,5],
         [4,9,2],
         [3,5,7]],
        1
    )

    # 🔬 Multiple possible squares
    validate(
        [[8,1,6,8],
         [3,5,7,3],
         [4,9,2,4],
         [8,1,6,8]],
        3
    )

    # 🔬 Large grid case (performance)
    large_grid = [[1 for _ in range(20)] for _ in range(20)]
    validate(large_grid, 20)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_largestMagicSquare_1895()
