class Solution:
    def minOperations(self, grid, x):
        arr = [num for row in grid for num in row]

        target = arr[0] % x
        for num in arr:
            if num % x != target:
                return -1

        arr.sort()

        med = abs(arr[len(arr)//2])
        ans = 0
        for num in arr:
            ans += abs(num-med)//x

        return ans



def test_minOperations_2033():
    sol = Solution()

    def validate(grid, x, expected):
        result = sol.minOperations(grid, x)
        assert result == expected, (
            f"❌ Failed for grid={grid}, x={x}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (official style)
    validate([[2,4],[6,8]], 2, 4)
    validate([[1,5],[2,3]], 1, 5)
    validate([[1,2],[3,4]], 2, -1)

    # 🔬 Edge cases
    validate([[5]], 3, 0)                     # single cell
    validate([[0,0],[0,0]], 5, 0)             # already equal
    validate([[1]], 1, 0)

    # 🔬 Already uniform
    validate([[7,7,7],[7,7,7]], 3, 0)

    # 🔬 Simple transformations
    validate([[1,3,5]], 2, 2)
    validate([[1,3,5,7]], 2, 4)

    # 🔬 Impossible cases (mod mismatch)
    validate([[1,2,3]], 2, -1)
    validate([[2,4,6],[8,10,3]], 2, -1)

    # 🔬 Median-based tricky cases
    validate([[10,20,30],[40,50,60]], 10, 9)
    validate([[1,1,1000]], 1, 999)

    # 🔬 Negative-style behavior (difference heavy)
    validate([[100,200,300],[400,500,600]], 100, 9)

    # 🔬 Large input case
    grid = [[i for i in range(0,1000,2)] for _ in range(10)]
    validate(grid, 2, 12500)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minOperations_2033()