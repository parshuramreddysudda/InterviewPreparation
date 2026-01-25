import heapq
from typing import List

class Solution:
    def maxNumber(self, nums1: List[int], nums2: List[int], k: int) -> List[int]:
        # ❌ Implement your solution here

        i = 0
        n1 = len(nums1)
        n2 = len(nums2)
        heapArr = []
        while i < len(nums1) and i < len(nums2):
            if nums1[i] < nums2[i]:
                heapq.heappush(,[nums2[i],nums1[i]])

        return []


def test_maxNumber_321():
    sol = Solution()

    def validate(nums1, nums2, k, expected):
        result = sol.maxNumber(nums1, nums2, k)
        assert result == expected, (
            f"❌ Failed for nums1={nums1}, nums2={nums2}, k={k}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([3,4,6,5], [9,1,2,5,8,3], 5, [9,8,6,5,3])
    validate([6,7], [6,0,4], 5, [6,7,6,0,4])
    validate([3,9], [8,9], 3, [9,8,9])

    # 🔬 Edge cases
    validate([], [1,2,3], 2, [2,3])
    validate([1,2,3], [], 2, [2,3])
    validate([], [], 0, [])
    validate([9,9], [9,9], 3, [9,9,9])

    # 🔬 Corner / tricky cases
    validate([1,1,1], [1,1,1], 4, [1,1,1,1])
    validate([5,6,7], [5,6,7], 4, [7,7,6,7])
    validate([8,9], [3,9], 3, [9,8,9])
    validate([2,5,6,4,4,0], [7,3,8,0,6,5,7,6,2], 15,
             [7,8,6,5,7,6,2,5,6,4,4,0,3,0,2])

    # 🔬 k = full length
    validate([1,2], [3,4], 4, [3,4,1,2])

    # 🔬 Large input case (performance)
    nums1_large = [9] * 1000
    nums2_large = [8] * 1000
    validate(nums1_large, nums2_large, 1500, [9]*1000 + [8]*500)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maxNumber_321()
