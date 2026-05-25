class Solution:
    def canReach(self, s: str, minJump: int, maxJump: int) -> bool:
        n = len(s)

        if s[0]=='1' or s[-1]=='1':
            return False

        dp = [False] * (n+1)
        dp[0] = True
        reachable = 0
        for i in range(minJump,n):
            if dp[abs(i-minJump)]:
                reachable += 1

            if dp[i-1-maxJump]:
                reachable -= 1

            if s[i] == '0' and reachable > 0:
                dp[i] = True


        return dp[n-1]

def test_canReach_1871():
    sol = Solution()

    def validate(s, minJump, maxJump, expected):
        result = sol.canReach(s, minJump, maxJump)
        assert result == expected, (
            f"❌ Failed for s={s}, minJump={minJump}, maxJump={maxJump}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    # validate("011010", 2, 3, True)
    validate("01101110", 2, 3, False)

    # 🔬 Edge cases
    validate("0", 1, 1, True)                     # already at end
    validate("00", 1, 1, True)
    validate("01", 1, 1, False)
    validate("000", 2, 2, True)

    # 🔬 Small tricky cases
    validate("0000", 1, 2, True)
    validate("0100", 1, 2, True)
    validate("0101", 1, 2, False)

    # 🔬 Reachability window cases
    validate("0000000", 2, 3, True)
    validate("0000000", 4, 5, False)
    validate("0001000", 2, 3, True)

    # 🔬 Blocking patterns
    validate("0011100110", 3, 5, True)
    validate("000000100000", 2, 5, True)
    validate("000111000", 2, 3, False)

    # 🔬 Boundary jump checks
    validate("000000", 5, 5, True)
    validate("000000", 6, 6, False)

    # 🔬 Dense zero regions
    validate("0" * 50, 3, 7, True)
    validate("0" * 100, 99, 99, True)

    # 🔬 Large input stress tests
    large_s = "0" * 10000
    validate(large_s, 1, 100, True)

    large_blocked = "0" + "1" * 9998 + "0"
    validate(large_blocked, 1, 9999, True)

    # 🔬 Prefix-sum / BFS optimization traps
    validate("0000000000", 2, 2, False)
    validate("0000000000", 1, 1, True)
    validate("0000000000", 3, 4, True)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_canReach_1871()