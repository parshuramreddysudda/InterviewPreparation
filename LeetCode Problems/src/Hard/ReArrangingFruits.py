from typing import List

class Solution:
    def minCost(self, basket1: List[int], basket2: List[int]) -> int:
        """
        Given two baskets of fruits, rearrange them to make both baskets identical with minimal cost.
        Cost of swapping two fruits is min(fruit1, fruit2).
        Return the minimal cost or -1 if impossible.
        """
        # TODO: Implement your logic here

        return 0

# ------------------ Test Harness ------------------

def test_minCost():
    sol = Solution()

    def validate(b1, b2, expected):
        result = sol.minCost(b1, b2)
        assert result == expected, f"Failed for basket1={b1}, basket2={b2}. Expected {expected}, got {result}"

    # 🔬 Complex / Edge test cases
    validate([4,2,2,2], [1,4,1,2], 1)          # Basic swap
    validate([2,3,4], [3,2,5], -1)             # Impossible to match
    validate([1,1,1,1], [1,1,1,1], 0)          # Already identical
    validate([5,6,6], [6,5,5], 5)              # Minimal cost via smallest
    validate([10,20,30], [30,20,10], 0)        # Already balanced after rearrange
    validate([1], [2], -1)                     # Single element, impossible
    validate([2,2,3,3], [3,3,2,2], 0)          # Balanced already

    print("✅ All test cases passed!")

# Run the tests
if __name__ == "__main__":
    test_minCost()
