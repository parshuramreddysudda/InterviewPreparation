class Solution:
    def checkStrings(self, s1: str, s2: str) -> bool:
        # ❌ Implement your solution here

        evenIndS1 = {}
        evenIndS2 = {}
        oddIndS1 = {}
        oddIndS2 = {}
        for i in range(len(s1)):
            if i % 2 == 0:
                evenIndS1[s1[i]] = evenIndS1.get(s1[i], 0) + 1
                evenIndS2[s2[i]] = evenIndS2.get(s2[i], 0) + 1
            else:
                oddIndS1[i] = oddIndS1.get(s1[i], 0) + 1
                oddIndS2[i] = oddIndS2.get(s2[i], 0) + 1

        return evenIndS1 == evenIndS2 and oddIndS1 == oddIndS2


def test_checkStrings_2840():
    sol = Solution()

    def validate(s1, s2, expected):
        result = sol.checkStrings(s1, s2)
        assert result == expected, (
            f"❌ Failed for s1={s1}, s2={s2}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate("abcdba", "cabdab", True)
    validate("abe", "bea", False)
    validate("abc", "cba", True)

    # 🔬 Edge cases
    validate("a", "a", True)                # Single char equal
    validate("a", "b", False)               # Single char different
    validate("", "", True)                  # Empty strings
    validate("aa", "aa", True)              # Same chars

    # 🔬 Corner / tricky cases
    validate("abcd", "cdab", True)
    validate("abcd", "dacb", False)
    validate("abab", "baba", True)
    validate("zzxy", "xzyz", True)
    validate("xyxy", "yxyx", True)
    validate("abcdabcd", "cdabcdab", True)

    # 🔬 Repeated characters
    validate("aabbcc", "ccbbaa", True)
    validate("aabbcc", "abcabc", True)
    validate("aabbcc", "acbbca", True)

    # 🔬 Mismatch tricky
    validate("abcd", "abdc", False)
    validate("abcd", "badc", False)

    # 🔬 Large input case
    s1 = "abcd" * 5000
    s2 = "cdab" * 5000
    validate(s1, s2, True)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_checkStrings_2840()