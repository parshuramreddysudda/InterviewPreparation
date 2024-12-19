from typing import List


class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        # Your implementation here
        pass


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    nums1 = [-1, 2, 1, -4]
    target1 = 1
    print("Test case 1:", solution.threeSumClosest(nums1, target1))  # Expected output: Closest sum to 1

    # Test case 2
    nums2 = [0, 0, 0]
    target2 = 1
    print("Test case 2:", solution.threeSumClosest(nums2, target2))  # Expected output: Closest sum to 1

    # Test case 3
    nums3 = [1, 1, 1, 0]
    target3 = -100
    print("Test case 3:", solution.threeSumClosest(nums3, target3))  # Expected output: Closest sum to -100
