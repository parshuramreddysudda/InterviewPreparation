import heapq
from multiprocessing import heap
from typing import List


class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        # ❌ Implement your solution here

        heap = []
        for hap in happiness:
            heapq.heappush(heap, -hap)

        index = 0
        totalSum = 0
        while k > 0 and heap:
            curTop = -(heapq.heappop(heap)) - index
            if curTop >0:
                totalSum += curTop
            k -= 1
            index += 1

        return totalSum


def test_maximumHappinessSum_3075():
    sol = Solution()

    def validate(happiness, k, expected):
        result = sol.maximumHappinessSum(happiness, k)
        assert result == expected, (
            f"❌ Failed for happiness={happiness}, k={k}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([1, 9, 13, 15, 2, 3, 4, 5, 6, 7], 10, 40)
    validate([5, 3, 2], 2, 7)
    validate([10, 9, 8], 3, 24)

    # 🔬 Edge cases
    validate([], 0, 0)  # Empty input
    validate([5], 1, 5)  # Single element
    validate([5], 0, 0)  # k = 0
    validate([0, 0, 0], 2, 0)  # All zero happiness
    validate([1, 1, 1], 5, 1)  # k > n

    # 🔬 Corner / tricky cases
    validate([10, 1, 1], 3, 10)
    validate([1, 2, 3, 4], 3, 6)
    validate([7, 6, 5], 3, 15)
    validate([3, 3, 3], 3, 6)
    validate([100, 1, 1, 1], 4, 100)

    # 🔬 Large input case (performance)
    large_happiness = [100000] * 10000
    validate(large_happiness, 10000, 5000050000)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maximumHappinessSum_3075()
