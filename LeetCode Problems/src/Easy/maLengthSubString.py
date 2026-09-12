class Solution:
    def maximumLengthSubstring(self, s):
        # ❌ Implement your solution here

        freq = {}
        start = 0
        maxLength = 0
        for index,i in enumerate(s):
            freq[i] = freq.get(i,0) + 1

            while freq[i] > 2:
                freq[s[start]] -=1
                start +=1

            maxLength = max(maxLength, index-start+1)
        return maxLength





        pass


def test_maximumLengthSubstring_3090():
    sol = Solution()

    def validate(s, expected):
        result = sol.maximumLengthSubstring(s)
        assert result == expected, (
            f"❌ Failed for s={s}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    validate("bcbb", 3)
    validate("aaaa", 2)
    validate("abcabc", 6)

    # 🔬 Edge cases
    validate("a", 1)                         # Single character
    validate("aa", 2)                        # Exactly two occurrences
    validate("aaa", 2)                       # Third occurrence not allowed
    validate("", 0)                          # Empty string
    validate("abcdef", 6)                    # All unique characters

    # 🔬 Corner / tricky cases
    validate("aabbcc", 6)                    # Every character appears twice
    validate("aabbccc", 6)                   # One character appears three times
    validate("aaabbb", 4)                    # Both characters exceed limit
    validate("ababab", 4)                    # Repeated alternating pattern
    validate("aabacbeb", 6)                  # Multiple possible windows
    validate("abaccc", 5)                    # Valid window before third occurrence
    validate("ccaabbb", 6)                   # Third occurrence near end
    validate("abcddcba", 8)                  # Every character appears at most twice
    validate("aabbccddeeff", 12)             # Twelve valid characters

    # 🔬 Repeated-character cases
    validate("bbbbbbbb", 2)
    validate("abababab", 4)
    validate("aabbbaa", 4)
    validate("zzzyyyxxx", 4)

    # 🔬 Large input cases
    validate("a" * 100000, 2)
    validate("abcdefghijklmnopqrstuvwxyz" * 10000, 52)
    validate("ab" * 50000, 4)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maximumLengthSubstring_3090()