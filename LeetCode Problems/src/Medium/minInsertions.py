class Solution:
    def minInsertions(self, s: str) -> int:
        # ❌ Implement your solution here

        left = 0
        right = 0
        ans = 0
        for st in s:
            if st == '(':
                left += 1
            else:
                right += 1

            if right == 2:
                




def test_minInsertions_1541():
    sol = Solution()

    def validate(s, expected):
        result = sol.minInsertions(s)
        assert result == expected, (
            f"❌ Failed for s={s}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Official examples
    validate("(()))", 1)
    validate("())", 0)
    validate("))())(", 3)

    # 🔬 Edge cases
    validate("", 0)
    validate("(", 2)
    validate(")", 2)
    validate("()", 1)
    validate("((", 4)
    validate("))", 2)
    validate("(((", 6)

    # 🔬 Corner / tricky cases
    validate("())", 0)
    validate("()))", 1)
    validate("()))))", 2)
    validate("(()", 2)
    validate("((()))", 0)
    validate("(()))(()", 4)
    validate(")(", 4)
    validate("())())", 0)
    validate("(()))())", 1)
    validate("((())", 3)
    validate("())(()))", 1)
    validate("())(())", 2)
    validate("())())(", 2)
    validate("((())())", 2)
    validate("()()()", 3)
    validate("()())() ", 2)  # Contains a space: not a valid LeetCode input

    # 🔬 Large input cases
    validate("(" * 10000, 20000)
    validate(")" * 10000, 20000)
    validate("()" * 10000, 10000)
    validate("(" * 5000 + ")" * 5000, 5000)
    validate(")" * 5000 + "(" * 5000, 20000)
    validate("()" * 50000, 50000)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minInsertions_1541()