class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        # ❌ Implement your solution here
        return True if s in goal+goal else False
        pass


def test_rotateString_796():
    sol = Solution()

    def validate(s, goal, expected):
        result = sol.rotateString(s, goal)
        assert result == expected, (
            f"❌ Failed for s={s}, goal={goal}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate("abcde", "cdeab", True)
    validate("abcde", "abced", False)
    validate("aa", "aa", True)

    # 🔬 Edge cases
    validate("a", "a", True)                 # single char equal
    validate("a", "b", False)                # single char different
    validate("", "", True)                   # empty strings
    validate("abc", "", False)               # unequal lengths
    validate("", "abc", False)

    # 🔬 Same string (no rotation needed)
    validate("abc", "abc", True)

    # 🔬 Tricky cases
    validate("abab", "baba", True)
    validate("abab", "abba", False)
    validate("aaaa", "aaaa", True)
    validate("abcabc", "bcabca", True)
    validate("abcabc", "cababc", False)

    # 🔬 Rotation near boundary
    validate("abcdef", "fabcde", True)
    validate("abcdef", "efabcd", True)
    validate("abcdef", "defabc", True)

    # 🔬 Repeated patterns
    validate("zzzz", "zzzz", True)
    validate("zzzy", "yzzz", True)
    validate("zzzy", "zyzz", True)
    validate("zzzy", "zzzy", True)

    # 🔬 Large input case
    s = "a" * 5000 + "b"
    goal = "b" + "a" * 5000
    validate(s, goal, True)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_rotateString_796()