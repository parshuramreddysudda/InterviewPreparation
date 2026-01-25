from typing import List

class Solution:

    def minDeletionSize(self, strs: List[str]) -> int:
        """
        Given an array of equal-length strings, return the number of columns
        that must be deleted so that each remaining column is non-decreasing.
        """
        # TODO: Implement your logic here
        if not strs:
            return 0
        ans = 0
        for i in range(len(strs[0])):
            curMax = strs[0][i]
            for j in range(1, len(strs)):
                presentElement = strs[j][i]
                if presentElement < curMax:
                    ans += 1
                    break
                else:
                    curMax = presentElement

        return ans

# ------------------ Test Harness ------------------

def test_minDeletionSize():
    sol = Solution()

    def validate(strs, expected):
        result = sol.minDeletionSize(strs)
        assert result == expected, f"Failed for strs={strs}. Expected {expected}, got {result}"

    # 🔬 Core test cases
    validate(["cba", "daf", "ghi"], 1)
    validate(["a", "b"], 0)
    validate(["zyx", "wvu", "tsr"], 3)

    # 🔬 Edge cases
    validate(["abc", "abc", "abc"], 0)          # Already sorted
    validate(["x"], 0)                          # Single string
    validate([], 0)                             # Empty input
    validate(["a", "a", "a"], 0)                # Single column, all same

    # 🔬 More complex cases
    validate(["rrjk", "furt", "guzm"], 2)
    validate(["abcdef", "uvwxyz"], 0)
    validate(["ab", "aa"], 1)
    validate(["az", "by", "cx"], 1)

    print("✅ All test cases passed!")

# Run tests
if __name__ == "__main__":
    test_minDeletionSize()
