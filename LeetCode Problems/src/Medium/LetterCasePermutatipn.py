import string
from typing import List


class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        # Implement your solution here
        results = []

        def letterCasePermutation(s, index, strList, res):
            if index == len(s):
                results.append(res[:])
                return

            if s[index].isnumeric():
                res += (s[index])
            else:
                res += s[index].capitalize()
                letterCasePermutation(s, index + 1, strList, res)
                res = res[:-1]
                res += s[index].lower()
            letterCasePermutation(s, index + 1, strList, res)

        letterCasePermutation(s, 0, list(s), "")

        return results

    # Test cases


def test_letter_case_permutation():
    sol = Solution()

    # Test case 1: Basic mixed string
    input1 = "a1b2"
    expected1 = sorted(["a1b2", "a1B2", "A1b2", "A1B2"])
    result1 = sorted(sol.letterCasePermutation(input1))
    assert result1 == expected1, f"Test case 1 failed: expected {expected1}, got {result1}"

    # Test case 2: All letters
    input2 = "ab"
    expected2 = sorted(["ab", "aB", "Ab", "AB"])
    result2 = sorted(sol.letterCasePermutation(input2))
    assert result2 == expected2, f"Test case 2 failed: expected {expected2}, got {result2}"

    # Test case 3: All digits
    input3 = "12345"
    expected3 = ["12345"]
    result3 = sol.letterCasePermutation(input3)
    assert result3 == expected3, f"Test case 3 failed: expected {expected3}, got {result3}"

    # Test case 4: Single letter
    input4 = "z"
    expected4 = sorted(["z", "Z"])
    result4 = sorted(sol.letterCasePermutation(input4))
    assert result4 == expected4, f"Test case 4 failed: expected {expected4}, got {result4}"

    # Test case 5: Mixed digits and letters
    input5 = "3z4"
    expected5 = sorted(["3z4", "3Z4"])
    result5 = sorted(sol.letterCasePermutation(input5))
    assert result5 == expected5, f"Test case 5 failed: expected {expected5}, got {result5}"

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_letter_case_permutation()
