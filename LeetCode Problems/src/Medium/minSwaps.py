from typing import List
import copy


class Solution:
    def minSwaps(self, grid: List[List[int]]) -> int:
        # ❌ Implement your solution here
        n = len(grid)

        zeros = []

        for row in grid:
            count = 0
            for j in range(n - 1, -1, -1):
                if row[j] == 0:
                    count += 1
                else:
                    break
            zeros.append(count)

        curIndex  = 0
        ans = 0
        for i in range(n):

            needed = n - i - 1
            j = i
            while j < n and needed > zeros[j]:
                j += 1
            if j == n:
                return -1

            while j > i:
                zeros[j],zeros[j-1] = zeros[j-1],zeros[j]
                j-=1
                ans += 1

        return ans


        pass


def test_minSwaps_1536():
    sol = Solution()

    def validate(grid, expected):
        original = copy.deepcopy(grid)
        result = sol.minSwaps(grid)
        assert result == expected, (
            f"❌ Failed for grid={original}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([[0,0,1],[1,1,0],[1,0,0]], 3)
    validate([[0,1,1],[1,0,1],[1,1,0]], -1)
    validate([[1,0,0],[1,1,0],[1,1,1]], 0)

    # 🔬 Edge cases
    validate([[0]], 0)
    validate([[1]], 0)
    validate([[0,0],[0,0]], 0)
    validate([[1,1],[1,1]], -1)

    # 🔬 Corner / tricky cases
    validate([[0,0,0],[0,0,1],[0,1,1]], 0)
    validate([[0,1,0],[1,0,0],[1,1,0]], 2)
    validate([[0,0,1,0],[1,1,0,0],[1,0,0,0],[1,1,1,0]], 4)
    validate([[1,0,0,0],[1,1,0,0],[1,1,1,0],[1,1,1,1]], 0)

    # 🔬 Impossible scenarios
    validate([[1,1,1],[1,1,1],[1,1,1]], -1)
    validate([[1,0,1],[1,1,0],[1,1,1]], -1)

    # 🔬 Large input case (structured)
    n = 50
    large_grid = []
    for i in range(n):
        row = [1]*n
        for j in range(n-i-1):
            row[j] = 0
        large_grid.append(row)
    validate(large_grid, 0)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minSwaps_1536()