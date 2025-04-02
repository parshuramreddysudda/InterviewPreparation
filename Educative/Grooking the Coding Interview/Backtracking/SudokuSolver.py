from typing import List


# Function to solve a Sudoku puzzle
def solve_sudoku(board: List[List[str]]) -> None:
    # Implement your solution here

    for i in range(0,len(board),3):
        for j in range(0,len(board),3):
            print("I value is ",i,"x",j,". ",board[i][j])

    pass

def checkSoduku(board,starti, startj,boardLength) -> None:

    end = start +2

    for i in range(boardLength):


    return

# Test cases
def test_solve_sudoku():
    # Test case 1: Standard solvable Sudoku
    board1 = [
        ["5", "3", ".", ".", "7", ".", ".", ".", "."],
        ["6", ".", ".", "1", "9", "5", ".", ".", "."],
        [".", "9", "8", ".", ".", ".", ".", "6", "."],
        ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
        ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
        ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
        [".", "6", ".", ".", ".", ".", "2", "8", "."],
        [".", ".", ".", "4", "1", "9", ".", ".", "5"],
        [".", ".", ".", ".", "8", ".", ".", "7", "9"]
    ]

    expected_output1 = [
        ["5", "3", "4", "6", "7", "8", "9", "1", "2"],
        ["6", "7", "2", "1", "9", "5", "3", "4", "8"],
        ["1", "9", "8", "3", "4", "2", "5", "6", "7"],
        ["8", "5", "9", "7", "6", "1", "4", "2", "3"],
        ["4", "2", "6", "8", "5", "3", "7", "9", "1"],
        ["7", "1", "3", "9", "2", "4", "8", "5", "6"],
        ["9", "6", "1", "5", "3", "7", "2", "8", "4"],
        ["2", "8", "7", "4", "1", "9", "6", "3", "5"],
        ["3", "4", "5", "2", "8", "6", "1", "7", "9"]
    ]

    test_cases = [
        (board1, expected_output1)
    ]

    for idx, (board, expected_output) in enumerate(test_cases):
        solve_sudoku(board)
        assert board == expected_output, f"Test case {idx + 1} failed"

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_solve_sudoku()
