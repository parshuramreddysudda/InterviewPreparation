class Solution:
    def checkValidString(self, s: str) -> bool:
        # ❌ Implement your solution here
        dp = [[False] * (len(s) + 1) for _ in range(len(s) + 1)]
        def dfs(index,balance):

            if balance < 0:
                return False

            if dp[index][balance]:
                return False

            dp[index][balance] = True

            if index >= len(s):
                return balance == 0

            if s[index] == '*':
                if dfs(index + 1,balance + 1):
                    return True

                if dfs(index + 1,balance - 1):
                    return True

                if dfs(index + 1,balance):
                    return True
            else:
                if s[index] == '(':
                    balance += 1
                else:
                    balance -= 1

                if dfs(index + 1,balance):
                    return True
            return False
        return dfs(0,0)

def test_checkValidString_678():
    sol = Solution()

    def validate(s, expected):
        result = sol.checkValidString(s)
        assert result == expected, (
            f"❌ Failed for s={s}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Official examples
    validate("()", True)
    validate("(*)", True)
    validate("(*))", True)

    # 🔬 Edge cases
    validate("", True)
    validate("(", False)
    validate(")", False)
    validate("*", True)
    validate("(*)", True)
    validate("(**)", True)
    validate("((()))", True)

    # 🔬 Corner / tricky cases
    validate("(*", True)
    validate("(*))", True)
    validate("(((*)", False)
    validate("((*", False)
    validate(")*(", False)
    validate("**)", True)
    validate("(**", True)
    validate("****", True)
    validate("(((******))", True)
    validate("((*)", True)
    validate("(()*", True)
    validate("(*()(", False)
    validate("((**)", True)
    validate("())*", False)
    validate("(*)))", False)
    validate("((*)*)", True)

    # 🔬 Consecutive parentheses and wildcards
    validate("(((((*****)))))", True)
    validate("(((((*)))", False)
    validate("(()))", False)
    validate("(()*)", True)
    validate("(*(*)*)", True)
    validate("((((****))))", True)

    # 🔬 Large input cases
    # validate("(" * 10000 + ")" * 10000, True)
    # validate("*" * 100000, True)
    # validate("(" * 50000 + "*" * 50000, False)
    # validate("(" * 50000 + "*" * 50000 + ")" * 50000, True)
    # validate(")" * 10000 + "*" * 10000, False)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_checkValidString_678()