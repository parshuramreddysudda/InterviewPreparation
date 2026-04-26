class Solution:
    def containsCycle(self, grid):
        # ❌ Implement your solution here

        m = len(grid)
        n = len(grid[0])

        visited = [[False for _ in range(n)] for _ in range(m)]
        def dfs(i, j,parent,target):
            curr  = [i,j]

            visited[i][j] = True

            directions = [(-1,0),(1,0),(0,-1),(0,1)]


            for dx,dy in directions:
                ni,nj = i+dx,j+dy

                if 0<= ni < m and 0<= nj < n:
                    if visited[ni][nj] and grid[ni][nj] == target and [ni,nj] != parent:
                        return True
                    if visited[ni][nj] == False and grid[ni][nj] == target:
                        dfs(ni,nj,curr,target)

            return False




        for i in range(m):
            for j in range(n):
                if visited[i][j] == False and  dfs(i,j,[i,j],grid[i][j]):
                    return True
        return False


def test_containsCycle_1559():
    sol = Solution()

    def validate(grid, expected):
        result = sol.containsCycle(grid)
        assert result == expected, (
            f"❌ Failed for grid={grid}. "
            f"Expected {expected}, got {result}"
        )

    # # 🔬 Core test cases (official-style)
    # validate(
    #     [["a","a","a","a"],
    #      ["a","b","b","a"],
    #      ["a","b","b","a"],
    #      ["a","a","a","a"]],
    #     True
    # )
    #
    # validate(
    #     [["c","c","c","a"],
    #      ["c","d","c","c"],
    #      ["c","c","e","c"],
    #      ["f","c","c","c"]],
    #     True
    # )

    # 🔬 No cycle
    validate(
        [["a","b","b"],
         ["b","z","b"],
         ["b","b","a"]],
        False
    )

    # 🔬 Edge cases
    validate([["a"]], False)                    # single cell
    validate([["a","a"]], False)                # 2 cells → no cycle
    validate([["a"],["a"]], False)              # vertical 2 cells

    # 🔬 Minimum cycle (size 2x2)
    validate(
        [["a","a"],
         ["a","a"]],
        True
    )

    # 🔬 Straight lines (no cycle)
    validate(
        [["a","a","a","a"]],
        False
    )

    validate(
        [["a"],
         ["a"],
         ["a"],
         ["a"]],
        False
    )

    # 🔬 Multiple components
    validate(
        [["a","b","a"],
         ["b","b","b"],
         ["a","b","a"]],
        False
    )

    # 🔬 Tricky cases (false positives trap)
    validate(
        [["a","b","a"],
         ["a","a","a"],
         ["a","b","a"]],
        False   # looks cyclic but not valid
    )

    validate(
        [["a","a","b"],
         ["b","a","b"],
         ["b","a","a"]],
        False
    )

    # 🔬 Complex cycle shapes
    validate(
        [["a","a","a","b"],
         ["a","b","a","b"],
         ["a","b","a","a"],
         ["a","a","a","a"]],
        True
    )

    # 🔬 Large input case
    grid = [["a"] * 100 for _ in range(100)]
    validate(grid, True)   # full grid same → cycle exists

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_containsCycle_1559()