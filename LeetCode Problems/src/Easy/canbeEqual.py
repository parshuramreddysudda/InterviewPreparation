class Solution:
    def canBeEqual(self, s1: str, s2: str) -> bool:
        # ❌ Implement your solution here
        if s1 == s2:
            return True


        i = 0
        while i < 3:
            ind= s2.index(s1[i])
            if abs(i - ind) % 2 == 1:
                return False
            i += 1

        return True


def test_canBeEqual_2839():
    sol = Solution()

    def validate(s1, s2, expected):
        result = sol.canBeEqual(s1, s2)
        assert result == expected, (
            f"❌ Failed for s1={s1}, s2={s2}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    # validate("abcd", "cdab", True)
    validate("abcd", "dacb", False)
    validate("abab", "baba", False)

    # 🔬 Corner / tricky cases
    validate("abcd", "badc", False)
    validate("abcd", "abdc", False)
    validate("zzxy", "xzyz", True)
    validate("xyxy", "yxyx", True)
    validate("abcd", "abcd", True)          # Already equal

    # 🔬 Repeated characters
    validate("aabb", "bbaa", True)
    validate("aabb", "abab", True)
    validate("aabb", "abba", True)

    # 🔬 Large input case
    s1 = "ab" * 5000
    s2 = "ba" * 5000
    validate(s1, s2, True)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_canBeEqual_2839()