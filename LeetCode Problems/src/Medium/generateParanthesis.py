from typing import List

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        """
        Generate all combinations of n pairs of well-formed parentheses.
        """
        # TODO: Implement backtracking / DFS here
        result = []
        def backtrack(openBrace, closed, output):

            if openBrace + closed == n*2:
                result.append(''.join(output))

            if len(output)<n*2 and openBrace < n:
                output.append('(')
                openBrace += 1
                backtrack(openBrace, closed, output)
                output.pop()
                openBrace -= 1

            if len(output) < n*2 and closed < n and openBrace > closed:
                output.append(')')
                closed += 1
                backtrack(openBrace, closed, output)
                output.pop()
                closed -= 1

        backtrack(0,0,[])
        return result

# ------------------ Test Harness ------------------

def test_generateParenthesis():
    sol = Solution()

    def validate(n, expected):
        result = sorted(sol.generateParenthesis(n))
        assert result == sorted(expected), f"Failed for n={n}. Expected {expected}, got {result}"

    # Basic cases
    validate(1, ["()"])
    validate(2, ["(())", "()()"])
    validate(3, ["((()))","(()())","(())()","()(())","()()()"])

    # Edge case: n = 0
    validate(0, [""])

    # Bigger / more complex case
    validate(4, [
        "(((())))","((()()))","((())())","((()))()",
        "(()(()))","(()()())","(()())()",
        "(())(())","(())()()",
        "()((()))","()(()())","()(())()","()()(())","()()()()"
    ])

    print("✅ All test cases passed!")

if __name__ == "__main__":
    test_generateParenthesis()
