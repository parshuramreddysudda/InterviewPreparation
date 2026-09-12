
class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        # ❌ Implement your solution here

        def letter_to_num_lower(char):
            return ord(char.lower()) - 96

        if len(columnTitle) == 1:
            return letter_to_num_lower(columnTitle)

        num = 0
        for i in range(len(columnTitle)-1):
            num += letter_to_num_lower(columnTitle[i]) * pow(26, len(columnTitle)-i-1)


        return num + letter_to_num_lower(columnTitle[-1])


def test_titleToNumber_171():
    sol = Solution()

    def validate(columnTitle, expected):
        result = sol.titleToNumber(columnTitle)
        assert result == expected, (
            f"❌ Failed for columnTitle={columnTitle}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    validate("A", 1)
    validate("B", 2)
    validate("Z", 26)
    validate("AA", 27)
    validate("AB", 28)
    validate("ZY", 701)
    validate("FXSHRXW", 2147483647)

    # 🔬 Edge cases
    validate("A", 1)                       # Smallest valid column
    validate("Z", 26)                      # Last single-letter column
    validate("AA", 27)                     # First two-letter column
    validate("AZ", 52)                     # Two-letter boundary
    validate("BA", 53)                     # After AZ
    validate("ZZ", 702)                    # Last two-letter column

    # 🔬 Corner / tricky cases
    validate("AAA", 703)
    validate("AAB", 704)
    validate("ABA", 729)
    validate("ABC", 731)
    validate("AZZ", 728)
    validate("BAA", 729)
    validate("ZZZ", 18278)

    # 🔬 Repeated characters
    validate("AAAA", 18279)
    validate("BBBB", 36558)
    validate("CCCC", 54837)
    validate("ZZZZ", 475254)

    # 🔬 Longer column names
    validate("AAAAA", 12356631)
    validate("ZZZZZ", 12356630)

    # 🔬 Large input case
    validate("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 2072610466)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_titleToNumber_171()