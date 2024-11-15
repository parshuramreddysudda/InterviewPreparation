def twoSum(nums, target):
        hash = {}
        for item in nums:
            hash[item] = hash.get(item, 0) + 1

        for item in nums:
            if (target - item) in hash:
                return (target - item, item)

        return (0, 0)

nums = [2, 7, 11, 15]
target = 9
result = twoSum(nums, target)
print(result)