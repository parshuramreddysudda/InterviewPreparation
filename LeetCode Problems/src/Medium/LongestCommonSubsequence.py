class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        """
        Returns the length of the longest common subsequence between text1 and text2.
        """
        # TODO: Implement dynamic programming logic here
        len1 = len(text1)
        len2 = len(text2)
        if len1 == 0 or len2 == 0:
            return 0

        dp = [[0 for _ in range(len(text1)+1)] for _ in range(len(text2)+1)]

        for i in range(1,len2+1):
            for j in range(1,len1+1):
                if text2[i-1] == text1[j-1]:
                    dp[i][j] = 1 + dp[i-1][j-1]
                else:
                    dp[i][j] = max(dp[i-1][j],dp[i][j-1])

        return dp[len2][len1]

# ------------------ Test Harness ------------------

def test_lcs():
    sol = Solution()

    def validate(text1, text2, expected):
        result = sol.longestCommonSubsequence(text1, text2)
        assert result == expected, f"Failed for text1='{text1}', text2='{text2}', expected={expected}, got={result}"

    # 🔬 Complex / Edge test cases
    validate("abcde", "ace", 3)           # Common subsequence: "ace"
    validate("abc", "abc", 3)            # Identical strings
    validate("abc", "def", 0)            # No common characters
    validate("AGGTAB", "GXTXAYB", 4)     # Common subsequence: "GTAB"
    validate("bl", "yby", 1)            # Single char match
    validate("", "abc", 0)              # One string empty
    validate("abcde", "", 0)            # One string empty
    validate("abcdgh", "aedfhr", 3)      # Common subsequence: "adh"
    validate("aaaaaa", "aaa", 3)        # Repeated characters
    validate("pmjghexybyrgzczy", "hafcdqbgncrcbihkd", 4)  # Large case

    print("✅ All test cases passed!")

# Run the tests
if __name__ == "__main__":
    test_lcs()
