import math


class Solution:
    def calculate(self, s: str) -> int:
        """
        Evaluate the arithmetic expression containing non-negative integers,
        '+', '-', '*', '/', and empty spaces. Integer division truncates toward zero.
        """
        # Implement your solution here

        s = s.replace(" ", "")
        operands = []
        stack = []
        tempNum = 0
        prevOp = '+'
        length = len(s)
        i = 0
        num = 0
        while i < len(s):
            char = s[i]

            if char.isdigit():
                num = num * 10 + int(char)

            if not char.isdigit() or i == length - 1:
                if prevOp == '+':
                    stack.append(num)
                elif prevOp == '-':
                    stack.append(-num)
                elif prevOp == '*':
                    stack.append(stack.pop() * num)
                elif prevOp == '/':
                    stack.append(int(stack.pop() / num))

                prevOp = char
                num = 0

            i += 1

        return sum(stack)

        pass


# Test cases
def test_calculate():
    s = Solution()

    def validate(expr, expected):
        result = s.calculate(expr)
        assert result == expected, f"Failed for input='{expr}'. Expected {expected}, got {result}"

    # Test case 1: Basic addition and subtraction
    # validate("3+2*2", 7)

    # Test case 2: With division and spaces
    # validate(" 3/2 ", 1)
    #
    # # Test case 3: Full expression
    # validate(" 3+5 / 2 ", 5)
    #
    # # Test case 4: Only one number
    # validate("42", 42)

    # Test case 5: Subtraction with space
    validate(" 100 - 50 * 2 + 30 / 2", 0)

    # Test case 6: Leading and trailing spaces
    validate("   14 - 3/2 ", 13)

    print("All test cases passed!")


if __name__ == "__main__":
    test_calculate()
