class Solution:
    def minimumBoxes(self, apples, capacity):
        # ❌ Implement your solution here

        total = sum(apples)
        totalCapacity = sum(capacity)
        if total >= totalCapacity:
            return len(capacity)

        capacity.sort(reverse=True)
        count = 0
        for i in range(len(capacity)):
            if total <= 0:
                return count
            total -= capacity[i]
            count += 1
        return len(capacity)


def test_minimumBoxes_3074():
    sol = Solution()

    def validate(apples, capacity, expected):
        result = sol.minimumBoxes(apples, capacity)
        assert result == expected, (
            f"❌ Failed for apples={apples}, capacity={capacity}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([1,2,3], [4,3,1], 2)
    validate([5,5,5], [5,5,5], 3)
    validate([10], [15], 1)

    # 🔬 Edge cases
    validate([], [], 0)                               # No apples, no boxes
    validate([0,0,0], [1,2,3], 0)                     # Apples are zero
    validate([5], [5], 1)                             # Exact fit
    validate([1], [1,1,1], 1)                         # Extra boxes available

    # 🔬 Corner / tricky cases
    validate([3,3,3], [2,2,2,2,2], 5)                 # Need many small boxes
    validate([8,1,1], [3,3,3,1], 4)
    validate([100,200], [50,50,50,50,50,50], 6)
    validate([1,2,3,4], [10], 1)                      # Single large box

    # 🔬 Large input case
    large_apples = [1] * 10000
    large_capacity = [10] * 1000
    validate(large_apples, large_capacity, 1000)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_minimumBoxes_3074()
