def word_search(grid, word):
    # Replace this placeholder return statement with your code
    if len(word) == 0 or len(grid) == 0:
        return False
    num = len(grid) * len(grid[0])
    if num < len(word):
        return False
    for i in range(len(grid)):
        for j in range(len(grid[0])):
            letter = grid[i][j]
            if grid[i][j] == word[0] and find_word(grid, word, 1, i, j, i, j, False):
                return True
    return False


def find_word(grid, word, index, row, column, prevRow, prevCol, res):
    if index == len(word):
        return True

    letter = word[index]

    if row > 0 and row - 1 != prevRow and grid[row - 1][column] == letter:
        res = find_word(grid, word, index + 1, row - 1, column, row, column, res)

    if column > 0 and column - 1 != prevCol and grid[row][column - 1] == letter:
        res = find_word(grid, word, index + 1, row, column - 1, row, column, res)

    if row < len(grid) - 1 and row + 1 != prevRow and grid[row + 1][column] == letter:
        res = find_word(grid, word, index + 1, row + 1, column, row, column, res)

    if column < len(grid[0]) - 1 and grid[row][column + 1] == letter:
        res = find_word(grid, word, index + 1, row, column + 1, row, column, res)

    return res


# Test cases
if __name__ == "__main__":
    def run_test_case(grid, word, expected):
        result = word_search(grid, word)
        print(f"Input: {word} | Expected: {expected} | Got: {result} | {'PASSED' if result == expected else 'FAILED'}")


    # Test case 1: Word found horizontally
    # grid1 = [
    #     ['A', 'B', 'C', 'E'],
    #     ['S', 'F', 'C', 'S'],
    #     ['A', 'D', 'E', 'E']
    # ]
    # run_test_case(grid1, "ABCCED", True)  # Expected output: True

    # Test case 2: Word found vertically
    # grid2 = [
    #     ['A', 'B', 'C', 'E'],
    #     ['S', 'F', 'C', 'S'],
    #     ['A', 'D', 'E', 'E']
    # ]
    # run_test_case(grid2, "SEE", True)  # Expected output: True
    #
    # # Test case 3: Word not found
    # grid3 = [
    #     ['A', 'B', 'C', 'E'],
    #     ['S', 'F', 'C', 'S'],
    #     ['A', 'D', 'E', 'E']
    # ]
    # run_test_case(grid3, "ABCB", False)  # Expected output: False

    # Test case 4: Single character word found
    grid4 = [['A','A']]
    run_test_case(grid4, "AAA", False)  # Expected output: True

    # Test case 5: Single character word not found
    grid5 = [['A']]
    run_test_case(grid5, "B", False)  # Expected output: False
