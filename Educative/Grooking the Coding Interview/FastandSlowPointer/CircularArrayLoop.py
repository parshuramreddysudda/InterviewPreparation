def circular_array_loop(nums: list) -> bool:
    # Replace this placeholder return statement with your code

    slow = 0
    fast = 0
    # index = len(nums)-1
    length = len(nums)
    direction = None


    for index in range(length):
        slow = index
        fast = index
        prevSlow = slow
        prevFast = fast
        prevDirection = nums[index] > 0
        while True:
            slow = (nums[slow] + slow) % length
            if isNotCycle(nums,prevDirection,prevSlow,slow):
                break

            fast = (nums[fast] + fast) % length
            if isNotCycle(nums, prevDirection, prevFast, fast):
                break
            prevFast = fast
            fast = (nums[fast] + fast) % length
            if isNotCycle(nums, prevDirection, prevFast, fast):
                break

            if fast == slow:
                return True

            prevSlow = slow
            prevFast = fast
    return False


def isNotCycle(nums, prevDirection, prev, curr):
    current = nums[curr] >= 0
    if current != prevDirection or prev == curr:
        return True
    else:
        return False


# Test cases
if __name__ == "__main__":
    # Test case 1: Array with a loop
    nums1 = [2, -1, 1, 2, 2]
    print("Test case 1:", circular_array_loop(nums1))  # Expected output: True

    # Test case 2: Array without a loop
    nums2 = [-1, 2]
    print("Test case 2:", circular_array_loop(nums2))  # Expected output: False

    # Test case 3: Self-loop
    nums3 = [-2, 1, -1, -2, -2]
    print("Test case 3:", circular_array_loop(nums3))  # Expected output: False

    # Test case 4: Array with single element loop
    nums4 = [1]
    print("Test case 4:", circular_array_loop(nums4))  # Expected output: False

    # Test case 5: Larger array with a loop
    nums5 = [1, 2, 3, 4, 5, -2, 2, -1]
    print("Test case 5:", circular_array_loop(nums5))  # Expected output: True
