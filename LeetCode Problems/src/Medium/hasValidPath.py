class Solution:
    def hasValidPath(self, grid):
        # ❌ Implement your solution here
        visited = set()
        directions = {
            1: [(0, -1), (0, 1)],  # left, right
            2: [(-1, 0), (1, 0)],  # up, down
            3: [(0, -1), (1, 0)],  # left, down
            4: [(0, 1), (1, 0)],  # right, down
            5: [(0, -1), (-1, 0)],  # left, up
            6: [(0, 1), (-1, 0)]  # right, up
        }
        m = len(grid)
        n = len(grid[0])
        def dfs(i, j):
            if (i, j) == (m - 1, n - 1):
                return True

            visited.add((i,j))
            for dx,dy in directions[grid[i][j]]:
                nx,ny = i+dx,j+dy
                if 0<= nx< m and 0<= ny < n and (nx,ny) not in visited:
                    if (-dx,-dy) in directions[grid[nx][ny]]:
                        if dfs(nx,ny):
                            return True

            return False

        return dfs(0,0)


def test_hasValidPath_1391():
    sol = Solution()

    def validate(grid, expected):
        result = sol.hasValidPath(grid)
        assert result == expected, (
            f"❌ Failed for grid={grid}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (official-style)
    validate([[2,4,3],[6,5,2]], True)
    validate([[1,2,1],[1,2,1]], False)
    validate([[1,1,2]], False)

    # 🔬 Edge cases
    validate([[1]], True)                      # single cell
    validate([[2]], True)
    validate([[3]], True)

    # 🔬 Simple valid paths
    validate([[1,1,1,1]], True)
    validate([[2],[2],[2]], True)

    # 🔬 Simple invalid paths
    validate([[1,1,1,2]], False)
    validate([[2],[2],[1]], False)

    # 🔬 Corner turning cases
    validate([[2,3],[6,5]], True)
    validate([[2,3],[4,5]], False)

    # 🔬 Backward connection check (very important)
    validate([[1,4],[3,2]], True)
    validate([[1,4],[2,5]], False)

    # 🔬 Tricky path cases
    validate([[2,4,3],[6,5,2],[1,1,1]], False)
    validate([[2,6,3],[6,5,2]], True)
    validate([[4,3,1],[6,5,2]], True)

    # 🔬 Dead-end traps
    validate([[2,4,3],[6,1,2]], False)
    validate([[1,3,2],[2,6,5]], False)

    # 🔬 Large grid case (valid straight path)
    grid = [[1]*100 for _ in range(1)]
    validate(grid, True)

    # 🔬 Large grid case (blocked path)
    grid = [[1]*50 + [2] for _ in range(1)]
    validate(grid, False)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_hasValidPath_1391()