def find_sum_of_three(nums, target):
    nums.sort()  # Sorting is necessary for the two-pointer approach
    i, j = 0, 0
    length = len(nums) - 1
    for k in range(length + 1):
        i = k + 1
        j = length
        while i < j:
            val = nums[i] + nums[j] + nums[k]
            if val == target:
                return True
            if val < target:
                i = i + 1
            else:
                j = j - 1
    return False


if __name__ == '__main__':
    print(find_sum_of_three([-1, 2, 1, -4, 5, -3], 0))
