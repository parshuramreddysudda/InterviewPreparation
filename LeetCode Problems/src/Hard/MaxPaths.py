class Solution:
    def pathsWithMaxScore(self, board):
        # ❌ Implement your solution here
        dp = [[0]*len(board[0]) for _ in range(len(board))]
        dpPath = [[None] * len(board[0]) for _ in range(len(board))]
        grid = [list(row) for row in board]
        n = len(board)
        def dfs(i,j):


            if i < 0 or i >= n or j < 0 or j >= n:
                return 0, 0

            # 2. Obstacle
            if board[i][j] == 'X':
                return 0, 0

            if board[i][j] == 'S':
                return 0,1

            if dpPath[i][j] is not None:
                return dp[i][j],dpPath[i][j]

            ans1,path1 = dfs(i+1,j)
            ans2,path2 = dfs(i,j+1)
            ans3,path3 = dfs(i+1,j+1)

            best = max(ans1,ans2,ans3)

            if best == -1:
                dp[i][j] = 0
                dpPath[i][j] = 0
                return 0, 0

            path = 0
            if ans1 == best:
                path += path1

            if ans2 == best:
                path += path2

            if ans3 == best:
                path += path3


            path %= 1000000007
            curr = 0

            if grid[i][j].isdigit():
                curr = int(grid[i][j])


            dp[i][j] = best + curr
            dpPath[i][j] = path

            if path == 0:
                return [0, 0]

            return [dp[i][j],dpPath[i][j]]

        return dfs(0,0)


def test_pathsWithMaxScore_1301():
    sol = Solution()

    def validate(board, expected):
        result = sol.pathsWithMaxScore(board)
        assert result == expected, (
            f"❌ Failed for board={board}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Official examples
    validate(["E23","2X2","12S"], [7,1])
    validate(["E12","1X1","21S"], [4,2])
    validate(["E11","XXX","11S"], [0,0])

    # 🔬 Edge cases
    # validate(["ES"], [0,1])                         # Smallest possible board
    validate(["E1","1S"], [1,2])                    # Two valid paths
    validate(["EX","XS"], [0,1])                    # Completely blocked
    validate(["E9","9S"], [9,2])                    # Max digit

    # 🔬 Corner / tricky cases
    validate(["E11","111","11S"], [4,6])            # Many optimal paths
    validate(["E99","999","99S"], [27,6])           # Large score with many paths
    validate(["E12","111","21S"], [4,4])            # Multiple max-score paths
    validate(["E01","010","10S"], [1,2])            # Zeros in path
    validate(["E90","909","09S"], [18,2])           # Prefer higher-score route
    validate(["E10","1X1","01S"], [2,2])            # Obstacle but still reachable
    validate(["E00","000","00S"], [0,6])            # Score zero, many paths
    validate(["E99","9X9","99S"], [36,2])           # Must route around obstacle

    # 🔬 Larger boards
    validate([
        "E1111",
        "11111",
        "11111",
        "11111",
        "1111S"
    ], [7,20])

    validate([
        "E9999",
        "99999",
        "99999",
        "99999",
        "9999S"
    ], [63,20])

    # 🔬 No possible path
    validate([
        "E1X",
        "XXX",
        "X1S"
    ], [0,0])

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_pathsWithMaxScore_1301()