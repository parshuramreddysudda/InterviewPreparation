from typing import List


class Solution:
    def maxProductPath(self, grid: List[List[int]]) -> int:
        # ❌ Implement your solution here

        rows = len(grid)
        cols = len(grid[0])

        if grid is None or len(grid) == 0:
            return 0

        if grid[0][0] == -1:
            return -1

        if grid[rows-1][cols-1] < 0:
            return 0




        def dfs(row, col,product):
            if row >= rows or col >= cols:
                return float('-inf')

            product *= grid[row][col]

            if row == rows-1 and col == cols-1:
                return product

            print("Product is" + str(product))
            print("Row is " + str(row),"Col is " + str(col))

            return max(dfs(row + 1, col, product),  dfs(row, col + 1, product) )



        return dfs( 0, 0, 1)



def test_maxProductPath():
    sol = Solution()

    def validate(grid, expected):
        result = sol.maxProductPath(grid)
        assert result == expected, (
            f"❌ Failed for grid={grid}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([[1,-2,1],[1,-2,1],[3,-4,1]], 8)
    # validate([[1,3],[0,-4]], 0)
    validate([[1,4,4,0],[-2,0,0,1],[1,-1,1,1]], 2)

    # 🔬 Edge cases
    validate([[1]], 1)                          # Single cell positive
    validate([[-1]], -1)                        # Single cell negative
    validate([[0]], 0)                          # Single cell zero
    validate([[1,2,3]], 6)                      # Single row
    validate([[1],[2],[3]], 6)                  # Single column

    # 🔬 Corner / tricky cases
    validate([[-1,-2,-3],[-2,-3,-3],[-3,-3,-2]], -1)
    validate([[1,-1,2],[1,-1,2],[3,-4,1]], 4)
    validate([[1,-2,1],[1,-2,1],[3,-4,0]], 0)
    validate([[1,0,-1],[2,-3,-4],[-5,-6,1]], 0)
    validate([[1,2,-1],[2,-3,-4],[-5,-6,1]], 24)

    # 🔬 Large input case
    size = 15
    large_grid = [[1]*size for _ in range(size)]
    validate(large_grid, 1)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maxProductPath()