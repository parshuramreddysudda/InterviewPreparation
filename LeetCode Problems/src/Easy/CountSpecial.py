import string


class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        # ❌ Implement your solution here
        word = set(word)
        return sum(s.isupper() and s.lower() in word for s in word)


def test_numberOfSpecialChars_3120():
    sol = Solution()

    def validate(word, expected):
        result = sol.numberOfSpecialChars(word)
        assert result == expected, (
            f"❌ Failed for word='{word}'. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate("aaAbcBC", 3)          # a, b, c
    validate("abc", 0)              # no uppercase
    validate("abBCab", 1)           # only b/B

    # 🔬 Edge cases
    validate("", 0)                 # empty string
    validate("a", 0)                # only lowercase
    validate("A", 0)                # only uppercase
    validate("aA", 1)               # simple valid pair
    validate("Aa", 1)               # order does NOT matter in part I

    # 🔬 Corner / tricky cases
    validate("aAbBcC", 3)
    validate("xXyYzZ", 3)
    validate("aabbcc", 0)
    validate("AABBCC", 0)
    validate("aAaAaA", 1)

    # 🔬 Mixed duplicates
    validate("abcABC", 3)
    validate("leetcode", 0)
    validate("AbBCcDdeE", 3)        # c, d, e

    # 🔬 Non-overlapping special chars
    validate("mMxyzX", 2)           # m, x
    validate("qQwWeErR", 4)

    # 🔬 Large input case
    large_word = ("abcdefghijklmnopqrstuvwxyz" * 1000) + \
                 ("ABCDEFGHIJKLMNOPQRSTUVWXYZ" * 1000)

    validate(large_word, 26)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_numberOfSpecialChars_3120()