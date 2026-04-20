class Solution:
    def maxDistance(self, colors):
        # ❌ Implement your solution here

        ans = 0
        for i in range(len(colors)):
            if colors[0] != colors[-1-i] or colors[-1] != colors[i]:
                return max(ans, len(colors) - i -1)

        return 0

def test_maxDistance_2078():
    sol = Solution()

    def validate(colors, expected):
        result = sol.maxDistance(colors)
        assert result == expected, (
            f"❌ Failed for colors={colors}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (official style)
    validate([1,1,1,6,1,1,1], 3)
    validate([1,8,3,8,3], 4)

    # 🔬 Edge cases
    validate([1,2], 1)                     # minimal valid
    validate([1,1], 0)                     # all same
    validate([5], 0)                       # single element
    validate([], 0)                        # empty input

    # 🔬 All same colors
    validate([2,2,2,2], 0)

    # 🔬 Simple variations
    validate([1,2,3,4,5], 4)               # all different
    validate([5,4,3,2,1], 4)

    # 🔬 Tricky cases
    validate([1,1,2,2,1,1], 3)
    validate([1,2,1,2,1,2], 5)
    validate([1,3,1,3,1,3,1], 5)

    # 🔬 Ends matter (important)
    validate([1,1,1,1,2], 4)
    validate([2,1,1,1,1], 4)
    validate([1,2,2,2,2,3], 5)

    # 🔬 Mixed cases
    validate([4,4,4,5,4,4,6], 6)
    validate([7,7,8,7,7,9,7], 5)

    # 🔬 Large input case
    colors = [1]*5000 + [2] + [1]*5000
    validate(colors, 5000)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maxDistance_2078()