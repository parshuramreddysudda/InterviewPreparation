from typing import List

class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        """
        Return the minimum number of columns that must be deleted so that
        the array of strings is lexicographically sorted.
        """
        if not strs:
            return 0
        ans = 0
        cols = len(strs[0])
        rows = len(strs)
        completed = [False] * (rows-1)
        for c in range(cols):
            deleteColm = False
            for r in range(rows-1):

                if completed[r]:
                    continue

                if strs[r][c] > strs[r+1][c]:
                    deleteColm = True
                    ans += 1
                    break

            if deleteColm:
                continue

            for r in range(rows-1):
                if not completed[r] and strs[r][c] < strs[r+1][c]:
                    completed[r] = True

            if all(completed):
                break

        return ans

# ------------------ Test Harness ------------------

def test_minDeletionSize_955():
    sol = Solution()

    def validate(strs, expected):
        result = sol.minDeletionSize(strs)
        assert result == expected, f"Failed for strs={strs}. Expected {expected}, got {result}"

    # 🔬 Core examples
    validate(["ca","bb","ac"], 1)
    validate(["xc","yb","za"], 0)
    validate(["zyx","wvu","tsr"], 3)

    # 🔬 Edge cases
    validate(["a"], 0)                          # Single string
    validate([], 0)                             # Empty input
    validate(["abc","abc","abc"], 0)            # Already sorted
    validate(["a","a","a"], 0)                  # Single column, all equal

    # # 🔬 Tricky / complex cases
    # validate(["abx","agz","bgc","bfc"], 1)
    validate(["rrjk","furt","guzm"], 2)
    validate(["xga","xfb","yfa"], 1)
    validate(["az","by","cx"], 0)
    validate(["aa","aa","aa","ab"], 0)
    validate(["ab","aa","aa"], 1)

    print("✅ All test cases passed!")

# Run tests
if __name__ == "__main__":
    test_minDeletionSize_955()
