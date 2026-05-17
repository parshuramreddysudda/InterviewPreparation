class Solution:
    def rotateTheBox(self, box):
        # ❌ Implement your solution here

        m = len(box)
        n = len(box)
        ans = []
        for row in range(m):
            left = len(box[row]) - 1
            while left >=0:
                right = left
                while left >=0 and box[row][left] != '*':
                    if box[row][left] == '#':
                        box[row][left] = '.'
                        box[row][right] = '#'
                        right -= 1
                    left -=1
                left -= 1
                ans.append(box[row])

        return box


def test_rotateTheBox_1861():
    sol = Solution()

    def validate(box, expected):
        result = sol.rotateTheBox(box)
        assert result == expected, (
            f"❌ Failed for box={box}.\n"
            f"Expected={expected}\nGot={result}"
        )

    # 🔬 Core test cases (from problem style)
    validate(
        [["#",".","#"]],
        [["."],
         ["#"],
         ["#"]]
    )

    validate(
        [["#",".","*","."],
         ["#","#","*","."]],
        [["#","."],
         ["#","#"],
         ["*","*"],
         [".","."]]
    )

    validate(
        [["#","#","*",".","*","."],
         ["#","#","#","*",".","."],
         ["#","#","#",".","#","."]],
        [[".","#","#"],
         [".","#","#"],
         ["#","#","*"],
         ["#","*","."],
         ["#",".","*"],
         ["#",".","."]]
    )

    # 🔬 Edge cases
    validate([["."]], [["."]])                 # empty cell
    validate([["#"]], [["#"]])                 # single stone
    validate([["*"]], [["*"]])                 # obstacle only

    # 🔬 Single row
    validate(
        [["#","#","#",".","."]],
        [["."],
         ["."],
         ["#"],
         ["#"],
         ["#"]]
    )

    # 🔬 Single column
    validate(
        [["#"],["."],["#"]],
        [["#",".","#"]]
    )

    # 🔬 No stones
    validate(
        [[".",".","."],
         [".",".","."]],
        [[".","."],
         [".","."],
         [".","."]]
    )

    # 🔬 All obstacles
    validate(
        [["*","*"],
         ["*","*"]],
        [["*","*"],
         ["*","*"]]
    )

    # 🔬 Tricky gravity cases
    validate(
        [["#",".","#","."],
         [".","#",".","#"]],
        [[".","#"],
         ["#","."],
         [".","#"],
         ["#","."]]
    )

    validate(
        [["#","*","#","."],
         ["#",".","#","#"]],
        [["#","#"],
         [".","*"],
         ["#","#"],
         ["#","."]]
    )

    # 🔬 Large input case
    large_box = [["#",".","*","."] * 25 for _ in range(100)]
    result = sol.rotateTheBox(large_box)  # just ensure no crash / performance issue

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_rotateTheBox_1861()