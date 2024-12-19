from typing import List


class Solution:
    def removeElement(nums: List[int], val: int) -> int:
        slow = 0
        fast = 0

        for i in range(len(nums)):
            if nums[i] != val:
                fast += 1
                nums[slow] = nums[i]
                slow += 1
            else:
                fast += 1
        return nums


if __name__ == '__main__':
    print(Solution.removeElement([3, 2, 2, 3], 3))
