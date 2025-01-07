from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> int:
        if m == 0:
            return n
        if n == 0:
            return m
        last = len(nums1) - 1
        sec = n - 1
        m = m - 1

        while last >= 0 and sec >= 0 and m >= 0:
            if nums1[m] >= nums2[sec]:
                nums1[last] = nums1[m]
                m -= 1
            else:
                nums1[last] = nums2[sec]
                sec -= 1
            last -= 1

        while m >=0:
            nums1[last] = nums1[m]
            last -=1
            m-=1

        while sec >=0:
            nums1[last] = nums2[sec]
            last -=1
            sec -=1



# Test cases
if __name__ == "__main__":
    sol = Solution()

    # Test case 1
    nums1_1 = [1, 2, 3, 0, 0, 0]
    nums2_1 = [2, 5, 6]
    sol.merge(nums1_1, 3, nums2_1, 3)
    print("Test case 1:", nums1_1)  # Expected output: [1, 2, 2, 3, 5, 6]

    nums1_1 = [4,0,0,0,0,0]
    nums2_1 = [1,2,3,5,6]

    sol.merge(nums1_1, 1, nums2_1, 5)
    print("Test case 1:", nums1_1)  # Expected output: [1, 2, 2, 3, 5, 6]

    # Test case 2
    nums1_2 = [1]
    nums2_2 = []
    sol.merge(nums1_2, 1, nums2_2, 0)
    print("Test case 2:", nums1_2)  # Expected output: [1]

    # Test case 3
    nums1_3 = [0]
    nums2_3 = [1]
    sol.merge(nums1_3, 0, nums2_3, 1)
    print("Test case 3:", nums1_3)  # Expected output: [1]

    # Test case 4
    nums1_4 = [4, 5, 6, 0, 0, 0]
    nums2_4 = [1, 2, 3]
    sol.merge(nums1_4, 3, nums2_4, 3)
    print("Test case 4:", nums1_4)  # Expected output: [1, 2, 3, 4, 5, 6]

    # Test case 5
    nums1_5 = [2, 0]
    nums2_5 = [1]
    sol.merge(nums1_5, 1, nums2_5, 1)
    print("Test case 5:", nums1_5)  # Expected output: [1, 2]
