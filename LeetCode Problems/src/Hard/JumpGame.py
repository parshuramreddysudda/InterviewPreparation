from collections import Counter, defaultdict, deque


class Solution:
    def minJumps(self, arr):
        # ❌ Implement your solution here

        n = len(arr)

        if n == 1:
            return 0

        graph = defaultdict(list)

        for i, val in enumerate(arr):
            graph[val].append(i)

        queue = deque([(0, 0)])  # (index, jumps)

        visited = {0}

        while queue:

            i, jumps = queue.popleft()

            if i == n - 1:
                return jumps

            neighbors = graph[arr[i]] + [i - 1, i + 1]

            for nei in neighbors:

                if 0 <= nei < n and nei not in visited:
                    visited.add(nei)
                    queue.append((nei, jumps + 1))

            # IMPORTANT optimization
            graph[arr[i]].clear()

        return -1


def test_minJumps_1345():
    sol = Solution()

    def validate(arr, expected):
        result = sol.minJumps(arr)
        assert result == expected, (
            f"❌ Failed for arr={arr}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    validate([100,-23,-23,404,100,23,23,23,3,404], 3)
    validate([7], 0)
    validate([7,6,9,6,9,6,9,7], 1)

    # 🔬 Edge cases
    validate([1,1], 1)                           # same value jump
    validate([1,2], 1)                           # adjacent only
    validate([1,1,1,1], 1)                       # direct teleport
    validate([1,2,3,4,5], 4)                     # no duplicates

    # 🔬 Same-value heavy cases
    validate([6,1,9,6,6,6,3], 2)
    validate([1,2,1,2,1,2,1], 1)
    validate([7,7,7,7,7], 1)

    # 🔬 Tricky shortest-path cases
    validate([1,2,3,2,1,4,5], 3)
    validate([1,2,1,1,1,1], 1)
    validate([10,-1,-1,-1,-1,-1,10], 1)

    # 🔬 DFS / greedy failure cases
    validate([1,2,3,4,1,5,6,7,8,1], 1)
    validate([11,22,7,7,7,7,7,7,7,22,13], 3)

    # 🔬 Boundary movement checks
    validate([1,2,3,4,5,6], 5)
    validate([6,5,4,3,2,1], 5)

    # 🔬 TLE / performance stress cases
    validate([1] * 10000, 1)

    large_unique = list(range(5000))
    validate(large_unique, 4999)

    # 🔬 Mixed duplicates large case
    mixed = [i % 50 for i in range(10000)]
    result = sol.minJumps(mixed)
    assert isinstance(result, int), "❌ Result should be integer"

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minJumps_1345()