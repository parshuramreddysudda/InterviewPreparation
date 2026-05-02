class Solution:
    def rotatedDigits(self, n: int) -> int:
        # ❌ Implement your solution here

        count = 0
        dp = [0 for _ in range(n + 1)]
        for i in range(n+1):

            if i < 10:
                if i in (2,5,6,9):
                    dp[i] = 2
                    count += 1
                elif i in (0,1,8):
                    dp[i] = 1
                else:
                    dp[i] = 0
            else:
                a = i//10
                b = i%10

                if dp[a] == 0 or dp[b] == 0:
                    dp[i] = 0
                elif dp[a] == 1 and dp[b] == 1:
                    dp[i] = 1
                else:
                    dp[i] = 2
                    count += 1


        return count


def test_rotatedDigits_788():
    sol = Solution()

    def validate(n, expected):
        result = sol.rotatedDigits(n)
        assert result == expected, (
            f"❌ Failed for n={n}. Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (official-style)
    # validate(10, 4)     # 2,5,6,9
    # validate(1, 0)
    validate(2, 1)
    validate(20, 9)

    # 🔬 Edge cases
    validate(0, 0)      # no numbers
    validate(8, 3)      # 2,5,6
    validate(9, 4)      # 2,5,6,9

    # 🔬 Small ranges
    validate(15, 6)
    validate(30, 15)

    # 🔬 Tricky cases (invalid digits involved)
    validate(3, 1)      # only 2
    validate(4, 1)
    validate(7, 3)
    validate(11, 4)     # 2,5,6,9

    # 🔬 Repeated digits
    validate(22, 10)
    validate(55, 18)

    # 🔬 Boundary patterns
    validate(100, 40)
    validate(256, 106)

    # 🔬 Large input case
    validate(10000, 2320)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_rotatedDigits_788()