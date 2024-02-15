def binary_search_rotated(nums, target):
    # Replace this placeholder return statement with your code
    left = 0
    right = len(nums) - 1
    while left < right:
        mid = left + (right - left) // 2
        if nums[mid] == target:
            return mid
        elif nums[left] >= target:
            if nums[left] > nums[mid] && :
                right = mid - 1
            else:
                left = mid + 1
        else:
            if target <nums[left] < nums[mid]
    return -1


print(binary_search_rotated([7, 8, 9, 10, 1, 2, 3, 4, 5, 6], 9))
