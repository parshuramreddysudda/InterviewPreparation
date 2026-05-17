class Solution:
    def canReach(self, arr, start):
        n = len(arr)

        # if n==0 or arr[0]==0:
        #     return False

        visited = [False] * (n+1)

        def bfs(i):

            if i < 0 or i >= n:
                return False

            if visited[i]:
                return False

            visited[i] = True

            if arr[i] == 0:
                return True

            return bfs(i + arr[i]) or bfs(i - arr[i])

        return bfs(start)


def test_canReach_1306():
    sol = Solution()

    def validate(arr, start, expected):
        result = sol.canReach(arr, start)
        assert result == expected, (
            f"❌ Failed for arr={arr}, start={start}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([4,2,3,0,3,1,2], 5, True)
    validate([4,2,3,0,3,1,2], 0, True)
    validate([3,0,2,1,2], 2, False)

    # 🔬 Edge cases
    validate([0], 0, True)                       # already at zero
    validate([1], 0, False)                     # cannot move
    validate([0,0,0], 1, True)                  # multiple zeroes

    # 🔬 Small arrays
    validate([1,0], 0, True)
    validate([2,0], 0, False)
    validate([1,2,0], 0, False)

    # 🔬 Cycle detection cases
    validate([1,1,1,1,1], 0, False)             # infinite loop if no visited
    validate([2,4,2,0,3,1], 5, False)

    # 🔬 Tricky reachable paths
    validate([5,3,0,2,1,2], 3, False)
    validate([2,3,1,1,4,0], 0, False)
    validate([6,4,2,0,2,1,3], 1, True)

    # 🔬 Boundary jump checks
    validate([2,0,1], 2, True)
    validate([1,2,3], 1, False)

    # 🔬 Large input stress test
    large_arr = [1] * 9999 + [0]
    validate(large_arr, 0, True)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_canReach_1306()