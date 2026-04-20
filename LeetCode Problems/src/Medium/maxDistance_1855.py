class Solution:
    def maxDistance(self, nums1, nums2):
        # ❌ Implement your solution here

        n1 = len(nums1)
        n2 = len(nums2)
        i = j = 0
        ans = 0
        while i < n1 and j < n2:

            if nums1[i] <= nums2[j]:
                j += 1
            else:
                i += 1
            ans = max(ans,j-i-1)

        return ans


def test_maxDistance_1855():
    sol = Solution()

    def validate(nums1, nums2, expected):
        result = sol.maxDistance(nums1, nums2)
        assert result == expected, (
            f"❌ Failed for nums1={nums1}, nums2={nums2}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (official style)
    validate([55,30,5,4,2], [100,20,10,10,5], 2)
    validate([2,2,2], [10,10,1], 1)
    validate([30,29,19,5], [25,25,25,25,25], 2)

    # 🔬 Edge cases
    validate([1], [1], 0)                         # single element equal
    validate([5], [4], 0)                         # no valid pair
    validate([10], [20], 0)                       # only (0,0)
    validate([5,4,3], [2,1,0], 0)                 # no valid pairs

    # 🔬 All valid pairs
    validate([1,1,1], [3,3,3], 2)
    validate([2,2,2], [2,2,2], 2)

    # 🔬 Strict decreasing tricky
    validate([9,8,7,6], [10,9,8,7,6], 1)
    validate([10,9,8], [8,7,6], 0)

    # 🔬 Mixed cases
    validate([8,7,6,5], [9,8,7,6,5,4], 1)
    validate([5,4,3], [6,5,4,3,2], 1)
    validate([7,7,7], [7,7,7,7], 3)

    # 🔬 Tricky pointer movement cases
    # validate([5,3,2], [4,4,4,4], 3)
    # validate([6,5,4], [5,5,5,5], 3)
    # validate([10,8,6,4], [9,7,5,3], 0)

    # 🔬 Large input case
    nums1 = list(range(10000, 0, -1))         # descending
    nums2 = list(range(20000, 0, -1))         # larger descending
    validate(nums1, nums2, len(nums1) - 1)    # max stretch

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_maxDistance_1855()