def binary_search(array, target):
    left = 0
    right = len(array) - 1
    while left <= right:
        mid = (left + right) // 2
        if array[mid] == target:
            return mid
        if array[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return left


# Driver code
def find_closest_elements(nums, k, target):
    # print("Mid Value is ", binary_search(nums,target), " For ", nums," Target is ", target)
    mid = binary_search(nums, target)
    left = mid - 1
    right = mid + 1
    ans = list()
    ans.append(nums[mid])
    while --k > 0:
        if (left >= 0) and (right < len(nums)):
            if abs(nums[left] - target) <= abs(nums[right] - target):
                ans.append(nums[left])
                left -= 1
            else:
                ans.append(nums[right])
                right += 1
        if left < 0:
            ans.extend(nums[right:right + k])
            break
        elif right > len(nums):
            ans.extend(nums[abs(left - k):left])
            break
    ans.sort()
    print(ans)

    pass


def main():
    nums = [
        [1, 2, 3, 5, 6, 7, 8],
        [1, 2, 3, 4, 5],
        [1, 2, 4, 5, 6],
        [1, 2, 3, 4, 5, 10]
    ]
    k = [4, 4, 2, 3]
    num = [4, 3, 10, -5]
    for i in range(len(nums)):
        print((i + 1), ".\tThe ", k[i],
              " Closest Elements for the number ", num[i], " in the array ",
              nums[i], " are:", sep="")
        print("\t", find_closest_elements(nums[i], k[i], num[i]))
        print("-" * 100)


if __name__ == '__main__':
    main()
