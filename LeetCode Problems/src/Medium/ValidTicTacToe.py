from typing import List


class Solution:
    def validTicTacToe(self, board: List[str]) -> bool:
        # Implement your solution here
        [xCount, oCount] = self.countTicTacToe(board)
        if oCount > xCount or xCount - oCount > 1:
            return False

        [wins, val] = self.checkIfWins(board)
        if wins:
            if val == 'X':
                return xCount > oCount and xCount - oCount == 1
            return xCount == oCount
        return True

    def checkIfWins(self, board):
        for i in range(3):
            val = board[i][0]
            if val != ' ' and board[i][0] == board[i][1] == board[i][2] == val:
                return [True, board[i][0]]
            if val != ' ' and board[0][i] == board[1][i] == board[2][i] == val:
                return [True, board[0][i]]

        if board[1][1] != ' ' and (board[0][0] == board[1][1] == board[2][2] or board[0][2] == board[1][1] == board[2][0]):
            return [True, board[1][1]]

        return [False, ' ']

    def countTicTacToe(self, board):
        X = 0
        O = 0
        for i in range(3):
            for j in range(3):
                if board[i][j] == 'X':
                    X += 1
                elif board[i][j] == 'O':
                    O += 1
        return [X, O]


# Test cases
def test_valid_tic_tac_toe():
    s = Solution()

    def validate(board, expected):
        result = s.validTicTacToe(board)
        assert result == expected, f"Failed for {board}: expected {expected}, got {result}"

    # Test case 1: Valid state, X starts first and wins
    validate(["XOX", " X ", "   "], False)

    # Test case 2: Invalid state, O cannot win when X has more moves
    validate(["XXX", "   ", "OOO"], False)

    # Test case 3: Valid end state
    validate(["XOX", "O O", "XOX"], True)

    # Test case 4: Invalid - too many O's
    validate(["OOO", "XX ", "   "], False)

    # Test case 5: Valid board with no winner
    validate(["X  ", "   ", "   "], True)

    # Test case 6: Invalid - more O's than X's
    validate(["O  ", "   ", "   "], False)

    validate(["O  ", "   ", "   "], False)
    validate(["XXX", "OOO", "   "], False)
    validate(["XXX", "OOO", "   "], False)
    validate(["XOX", " X ", "OOO"], False)
    validate(["XXX", "XOO", "OXO"], True)

    print("All test cases passed!")


# Run the tests
if __name__ == "__main__":
    test_valid_tic_tac_toe()
