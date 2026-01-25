class Solution:
    def minimumAbsDifference(self, arr):
        # ❌ Implement your solution here

        arr.sort()
        if len(arr) < 2:
            return []

        minimum = abs(arr[0] - arr[1])
        hashMap = {}
        for i in range(len(arr)-1):
            diff = abs(arr[i] - arr[i+1])
            minimum = min(minimum, diff)
            if diff not in hashMap:
                hashMap[diff] = []

            hashMap[diff].append([arr[i], arr[i+1]])

        return hashMap[minimum]


def test_minimumAbsDifference():
    sol = Solution()

    def validate(arr, expected):
        result = sol.minimumAbsDifference(arr)
        assert result == expected, (
            f"❌ Failed for arr={arr}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([4,2,1,3], [[1,2],[2,3],[3,4]])
    validate([1,3,6,10,15], [[1,3]])
    validate([3,8,-10,23,19,-4,-14,27], [[-14,-10],[19,23],[23,27]])

    # 🔬 Edge cases
    validate([], [])                              # Empty input
    validate([5], [])                             # Single element
    validate([1,1], [[1,1]])                      # Two equal elements
    validate([1,2], [[1,2]])                      # Two elements
    validate([2,2,2], [[2,2],[2,2]])              # All elements same

    # 🔬 Corner / tricky cases
    validate([-1,-3,-6], [[-3,-1]])
    validate([10,0,-10,20], [[-10,0],[10,20]])
    validate([1,100,101,102], [[100,101],[101,102]])
    validate([1,3,3,4], [[3,3]])

    # 🔬 Large input case
    large_arr = list(range(0, 10000))
    expected_large = [[i, i+1] for i in range(0, 9999)]
    validate(large_arr, expected_large)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minimumAbsDifference()
