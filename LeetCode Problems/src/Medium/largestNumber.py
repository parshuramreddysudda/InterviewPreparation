import heapq
from typing import List
from functools import cmp_to_key

class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        # ❌ Implement your solution here

        class LargerStrComparator(str):
            def __lt__(self, other):
                # Custom comparison: return True if self+other > other+self
                return self + other > other + self

        numstr = list(map(str, nums))
        heap= []

        for num in numstr:
            heapq.heappush(heap,LargerStrComparator(num))

        result = []
        while heap:
            result.append(heapq.heappop(heap))

        largestSum = "".join(result)

        return "0" if result[0]=="0" else largestSum


def test_largestNumber_179():
    sol = Solution()

    def validate(nums, expected):
        result = sol.largestNumber(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected '{expected}', got '{result}'"
        )

    # 🔬 Core test cases
    # validate([3,32,33,21,34,5,9,3403,3034], "9534330")
    validate([10,2], "210")
    #
    # validate([1], "1")
    #
    # 🔬 Edge cases
    validate([0], "0")                         # Single zero
    validate([0,0], "0")                       # All zeros
    validate([0,0,0,0], "0")
    validate([10,0], "100")

    # 🔬 Corner / tricky cases
    validate([121,12], "12121")                # Lexicographic trap
    validate([12,121], "12121")
    validate([8308,830], "8308830")
    validate([432,43243], "43243432")
    # validate([111311,1113], "111311131")

    # 🔬 Mixed sizes
    validate([9,98,990], "999098")
    validate([20,1], "201")
    validate([824,938,1399,5607,6973,5703,9609,4398,8247],
             "9609938824824769735703560743981399")

    # 🔬 Large input case (performance)
    large_nums = [9] * 10000
    validate(large_nums, "9" * 10000)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_largestNumber_179()
