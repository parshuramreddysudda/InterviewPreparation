def flood_fill(grid, sr, sc, target):
    # Replace this placeholder return statement with your code

    if len(grid) == 0 or len(grid[0]) == 0 or target == grid[sr][sc]:
        return grid
    # temp = grid[sr][sc]
    # grid[sr][sc] = target

    fill(grid, sr, sc, target, grid[sr][sc] )
    return grid


def fill(grid, row, col, target, src):
    if row < 0 or col < 0 or row >= len(grid) or col >= len(grid[0]) or grid[row][col] != src:
        return

    # Top
    grid[row][col] = target

    # Top
    # if row - 1 >= 0 and grid[row - 1][col] == src:
    fill(grid, row - 1, col, target, src)
    # if row + 1 < len(grid) and grid[row + 1][col] == src:
    fill(grid, row + 1, col, target, src)
    # if col - 1 >= 0 and grid[row][col - 1] == src:
    fill(grid, row, col - 1, target, src)
    # if col + 1 < len(grid) and grid[row][col + 1] == src:
    fill(grid, row, col + 1, target, src)
    return


# Test cases
if __name__ == "__main__":
    def run_test_case(grid, sr, sc, target, expected):
        result = flood_fill([row[:] for row in grid], sr, sc, target)  # deep copy grid to avoid mutation between tests
        print(
            f"Input start=({sr},{sc}), target={target} | Expected: {expected} | Got: {result} | {'PASSED' if result == expected else 'FAILED'}")


    # Test case 1
    grid1 = [
        [1, 1, 1],
        [1, 1, 0],
        [1, 0, 1]
    ]
    expected1 = [
        [2, 2, 2],
        [2, 2, 0],
        [2, 0, 1]
    ]
    run_test_case(grid1, 1, 1, 2, expected1)

    # Test case 2
    grid2 = [
        [0, 0, 0],
        [0, 0, 0]
    ]
    expected2 = [
        [0, 0, 0],
        [0, 0, 0]
    ]
    run_test_case(grid2, 0, 0, 0, expected2)  # target color same as original color

    # Test case 3
    grid3 = [
        [0, 0, 0],
        [0, 1, 1]
    ]
    expected3 = [
        [0, 0, 0],
        [0, 2, 2]
    ]
    run_test_case(grid3, 1, 1, 2, expected3)

    # Test case 4
    grid4 = [
        [1, 1, 1],
        [1, 2, 2],
        [1, 2, 1]
    ]
    expected4 = [
        [1, 1, 1],
        [1, 3, 3],
        [1, 3, 1]
    ]
    run_test_case(grid4, 1, 2, 3, expected4)

    # Test case 5
    grid5 = [
        [1]
    ]
    expected5 = [
        [9]
    ]
    run_test_case(grid5, 0, 0, 9, expected5)
