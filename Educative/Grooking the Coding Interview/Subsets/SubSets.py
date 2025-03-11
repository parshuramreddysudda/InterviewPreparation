def get_bit(num, bit):
    # shifts the first operand the specified number of bits to the left
    temp = (1 << bit)

    # if a specific bit in the binary number is set, then return 1 else return 0
    temp = temp & num
    if temp == 0:
        return 0
    return 1


def find_all_subsets(nums):
    subsets = []

    if not nums:
        return [[]]
    else:
        # finds number of subsets by taking power of length of input array
        subsets_count = 2 ** len(nums)
        for i in range(0, subsets_count):
            # Set is created to store each subset
            subset = set()
            for j in range(0, len(nums)):
                if get_bit(i, j) == 1 and nums[j] not in subset:
                    subset.add(nums[j])
            # for first iteration subset list will always have an empty list
            if i == 0:
                subsets.append([])
            else:
                subsets.append(list(subset))
    return subsets


def main():
    nums = [[], [2, 5, 7], [1, 2], [1, 2, 3, 4], [7, 3, 1, 5]]

    for i in range(len(nums)):
        print(i + 1, ". Set: ", nums[i], sep='')
        subsets = find_all_subsets(nums[i])
        print("\n   Subsets:", subsets)
        print("-" * 100)


if __name__ == '__main__':
    main()