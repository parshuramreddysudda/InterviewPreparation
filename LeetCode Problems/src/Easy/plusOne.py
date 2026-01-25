from typing import List

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        index = len(digits) - 1
        arr = [0] * len(digits)

        carry = 1
        while index >= 0:
            curNum = digits[index] + carry
            carry = 0
            if curNum > 9:
                carry  =  1
            digits[index] = curNum % 10
            index -= 1

        if carry == 1:
            digits.insert(0,carry)
        return digits

def test_plusOne_66():
    sol = Solution()

    def validate(digits, expected):
        result = sol.plusOne(digits)
        assert result == expected, (
            f"❌ Failed for digits={digits}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    # validate([1,2,3], [1,2,4])
    # validate([4,3,2,1], [4,3,2,2])
    validate([9], [1,0])

    # 🔬 Edge cases
    validate([0], [1])                         # Zero
    validate([1], [2])                         # Single digit
    validate([9,9], [1,0,0])                   # Carry overflow              # Leading zeros input

    # 🔬 Corner / tricky cases
    validate([9,9,9], [1,0,0,0])
    validate([1,9,9], [2,0,0])
    validate([8,9,9], [9,0,0])
    validate([9,8,9], [9,9,0])
    validate([9,0,9], [9,1,0])

    # 🔬 Large input case (performance)
    large_digits = [9] * 10000
    expected_large = [1] + [0] * 10000
    validate(large_digits, expected_large)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_plusOne_66()
