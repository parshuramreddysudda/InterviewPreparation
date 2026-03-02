class Solution:
    def champagneTower(self, poured: int, query_row: int, query_glass: int) -> float:
        # ❌ Implement your solution here

        dp = [[0.000000] * (r + 1) for r in range(query_row + 1)]
        dp[0][0] = float(poured)


        for row in range(query_row):
            for col in range(len(dp[row])):
                overflow = max(0.00000,dp[row][col]-1)
                if overflow > 0:
                    dp[row+1][col] = overflow/2
                    dp[row+1][col+1] = overflow/2

        return min(1.00000,dp[query_row][query_glass])



        # while poured > 1:
        #     tempRow = 1
        #     curRow = n
        #     if poured > 1:
        #         dp[n][0] = (dp[n-1][0])/2
        #         poured -= 1
        #     minValue = dp[n][0]
        #     while tempRow < curRow and poured > 1:
        #         dp[curRow][tempRow] = (dp[curRow-1][tempRow-1] + dp[curRow-1][tempRow])/2 - 1
        #         poured -= 1
        #         minValue =min(minValue, dp[curRow][tempRow])
        #         tempRow+=1
        #
        #     dp[curRow][tempRow] = (dp[curRow-1][tempRow-1])/2 - 1
        #     poured -= 1
        #     n +=1
        #     if minValue < 0:
        #         break
        print(dp[query_row][query_glass])
        pass


def test_champagneTower():
    sol = Solution()

    def validate(poured, row, glass, expected, eps=1e-6):
        result = sol.champagneTower(poured, row, glass)
        assert abs(result - expected) < eps, (
            f"❌ Failed for poured={poured}, row={row}, glass={glass}. "
            f"Expected {expected}, got {result}"  
        )

    # 🔬 Core test cases
    # validate(1, 0, 0, 1.0)
    # validate(2, 1, 0, 0.5)
    # validate(2, 1, 1, 0.5)
    # validate(4, 2, 0, 0.25)
    # validate(4, 2, 1, 0.5)
    # validate(4, 2, 2, 0.25)

    # 🔬 Edge cases
    validate(0, 0, 0, 0.0)
    validate(0, 5, 2, 0.0)
    validate(100, 0, 0, 1.0)
    validate(1, 10, 5, 0.0)

    # 🔬 Corner / tricky cases
    validate(3, 1, 1, 0.5)
    validate(5, 2, 1, 1.0)
    validate(10, 3, 1, 1.0)
    validate(25, 4, 2, 1.0)
    validate(6, 3, 1, 0.5)

    # 🔬 Large input case
    validate(10**6, 99, 50, 1.0)
    validate(10**6, 99, 0, 1.0)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_champagneTower()
