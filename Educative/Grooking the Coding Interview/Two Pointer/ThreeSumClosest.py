import sys
from typing import List


class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()  # Sorting is necessary for the two-pointer approach
        i, j = 0, 0
        length = len(nums) - 1
        prevMin = sys.maxsize
        for k in range(length + 1):
            i = k + 1
            j = length
            while i < j:
                val = nums[i] + nums[j] + nums[k]

                if abs(target - val) < abs(target - prevMin):
                    prevMin = val
                if prevMin == target: return target

                if  prevMin < target:
                    prevMin = val
                    i = i + 1
                else:
                    j = j - 1
        return prevMin

    def closest_to_target(self,num1, num2, target):
        # Calculate the absolute differences
        diff1 = abs(num1 - target)
        diff2 = abs(num2 - target)

        # Compare differences and return the closer number
        if diff1 < diff2:
            return num1
        elif diff2 < diff1:
            return num2
        else:
            return num1

        # Test cases


if __name__ == "__main__":
    sol = Solution()
    #
    # Test case 1
    nums1 = [-1, 2, 1, -4]
    target1 = 1
    print("Test case 1:", sol.threeSumClosest(nums1, target1))  # Expected output: 2

    # Test case 2
    nums2 = [0, 0, 0]
    target2 = 1
    print("Test case 2:", sol.threeSumClosest(nums2, target2))  # Expected output: 0

    # Test case 3
    nums3 = [1, 1, 1, 1]
    target3 = 4
    print("Test case 3:", sol.threeSumClosest(nums3, target3))  # Expected output: 3

    # Test case 4
    nums4 = [4,0,5,-5,3,3,0,-4,-5]
    target4 = -2
    print("Test case 4:", sol.threeSumClosest(nums4, target4))  # Expected output: -2

    # Test case 5
    nums5 = [-5, -4, -3, -2, -1]
    target5 = -10
    print("Test case 5:", sol.threeSumClosest(nums5, target5))  # Expected output: -9
