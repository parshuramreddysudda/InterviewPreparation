def binary_search(nums, target):
    # Replace this placeholder return statement with your code
    low = 0
    high = len(nums) - 1

    while low <= high:
        mid = low + (high - low) // 2
        if nums[mid] == target:
            return mid
        elif nums[mid] <= target:
            low = mid + 1
        else:
            high = mid - 1 

    return -1


print(binary_search([-30, -27, -8, -6, -1] , -1))
