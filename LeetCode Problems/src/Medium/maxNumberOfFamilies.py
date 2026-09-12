class Solution:
    def maxNumberOfFamilies(self, n, reservedSeats):
        # ❌ Implement your solution here

        valid = [[2,3,4,5],[6,7,8,9]]
        reservedSeats.sort(key=lambda x: x[0])
        start = 0
        totalAns = 0
        while start < len(reservedSeats):
            arr =[]
            currentNum = reservedSeats[start][0]
            while start < len(reservedSeats) and reservedSeats[start][0] == currentNum:
                arr.append(reservedSeats[start][1])
                start += 1
            numOfSeats = {0:1,1:1,2:1}
            for i in range(len(arr)):
                for j in range(2):
                    if arr[i] in valid[j]:
                        numOfSeats[j] = 0
            if sum(numOfSeats.values()) == 3:
                totalAns += 2
            elif sum(numOfSeats.values()) == 0:
                continue
            else:
                totalAns += 1



        return totalAns


def test_maxNumberOfFamilies_1386():
    sol = Solution()

    def validate(n, reservedSeats, expected):
        result = sol.maxNumberOfFamilies(n, reservedSeats)
        assert result == expected, (
            f"❌ Failed for n={n}, reservedSeats={reservedSeats}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Official examples
    validate(3, [[1,2],[1,3],[1,8],[2,6],[3,1],[3,10]], 4)
    validate(2, [[2,1],[1,8],[2,6]], 2)
    validate(4, [[4,3],[1,4],[4,6],[1,7]], 4)

    # 🔬 Edge cases
    validate(1, [[1,1]], 2)                         # Reserved seat outside all blocks
    validate(1, [[1,10]], 2)                        # Reserved seat outside all blocks
    validate(1, [[1,5]], 1)                         # Blocks left and middle affected
    validate(1, [[1,4]], 1)                         # Left + middle affected
    validate(1, [[1,6]], 1)                         # Middle + right affected

    # 🔬 Corner / tricky cases
    validate(1, [[1,2]], 1)                         # Left block blocked
    validate(1, [[1,3]], 1)                         # Left block blocked
    validate(1, [[1,7]], 1)                         # Right block blocked
    validate(1, [[1,8]], 1)                         # Right block blocked
    validate(1, [[1,2],[1,3]], 1)                   # Left block blocked
    validate(1, [[1,6],[1,7]], 1)                   # Right block blocked
    validate(1, [[1,4],[1,5]], 1)                   # Left + middle blocked
    validate(1, [[1,2],[1,3],[1,6],[1,7]], 0)       # All three blocks unavailable
    validate(1, [[1,4],[1,5],[1,6],[1,7]], 0)       # All three blocks unavailable
    validate(1, [[1,2],[1,3],[1,8],[1,9]], 1)       # Only middle block available
    validate(1, [[1,1],[1,10]], 2)                  # Irrelevant reservations
    validate(3, [[1,2],[1,3]], 5)                   # Other rows completely free
    validate(3, [[1,4],[2,5],[3,6]], 3)             # Each row partially blocked

    # 🔬 Multiple rows
    validate(5, [[1,2],[1,3],[2,6],[3,4],[4,8]], 6)
    validate(4, [[1,2],[1,3],[2,4],[2,5],[3,6],[3,7],[4,8],[4,9]], 4)
    validate(4, [[1,1],[2,10],[3,1],[4,10]], 8)     # Reservations irrelevant

    # 🔬 Duplicate-like pattern across rows
    validate(6, [[1,5],[2,5],[3,5],[4,5],[5,5],[6,5]], 6)
    validate(6, [[1,4],[2,4],[3,4],[4,4],[5,4],[6,4]], 6)

    # 🔬 Large input cases
    validate(10**9, [[1,1]], 2 * 10**9)             # Huge n, irrelevant reservation
    validate(10**9, [[1,5]], 2 * 10**9 - 1)         # Huge n, one affected row
    validate(10**9, [[1,2],[1,3],[1,8],[1,9]], 2 * 10**9 - 1)

    # 🔬 Maximum reservedSeats-style stress case
    reserved = [[1, seat] for seat in range(1, 11)]
    validate(1, reserved, 0)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maxNumberOfFamilies_1386()