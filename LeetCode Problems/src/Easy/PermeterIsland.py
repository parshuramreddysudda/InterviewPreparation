from typing import List


def islandPerimeter(grid: List[List[int]]) -> int:
    # Replace this placeholder return statement with your code
    if len(grid) == 0 or len(grid[0]) == 0:
        return 0
        # temp = grid[sr][sc]
        # grid[sr][sc] = target
    row = 0
    col = 0
    for i in range(len(grid)):
        for j in range(len(grid[0])):
            if grid[i][j] == 1:
                return fill(grid, i, j)

    return 0


def fill(grid, row, col):
    if row < 0 or col < 0 or row >= len(grid) or col >= len(grid[0]) or grid[row][col] == 0:
        return 1

    if grid[row][col] == -1:
        return 0
    grid[row][col] = -1

    return fill(grid, row - 1, col) + fill(grid, row, col + 1) + fill(grid, row, col - 1) + fill(
        grid, row + 1, col)


# Test cases
if __name__ == "__main__":
    def run_test_case(grid, expected):
        result = islandPerimeter(grid)
        print(
            f"Input Grid: {grid} | Expected: {expected} | Got: {result} | {'PASSED' if result == expected else 'FAILED'}")


    # Test case 1: Simple square island
    # grid1 = [
    #     [0, 1, 0, 0],
    #     [1, 1, 1, 0],
    #     [0, 1, 0, 0],
    #     [1, 1, 0, 0]
    # ]
    # run_test_case(grid1, 16)  # Expected output: 16
    #
    # # Test case 2: Single cell island
    # grid2 = [
    #     [1]
    # ]
    # run_test_case(grid2, 4)  # Expected output: 4

    # Test case 3: Single row island
    grid3 = [
        [1, 1, 1]
        # [1, 1]
    ]
    run_test_case(grid3, 8)  # Expected output: 10

    # Test case 4: Single column island
    grid4 = [
        [1],
        [1],
        [1]
    ]
    run_test_case(grid4, 8)  # Expected output: 8

    # Test case 5: No island
    grid5 = [
        [0, 0],
        [0, 0]
    ]
    run_test_case(grid5, 0)  # Expected output: 0
