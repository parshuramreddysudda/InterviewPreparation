def threeSumMulti(arr: list[int], target: int) -> int:
    """
    Counts the number of triplets in the array that sum up to the target value.
    The result should be returned modulo 10**9 + 7.
    """
    arr.sort()
    nums = set()
    count = 0
    for i in range(len(arr)):
        j = i + 1
        k = len(arr) - 1

        while j < k:
            triplet = arr[i] + arr[j] + arr[k]
            numsList = (i, j, k)
            if triplet == target:
                count+=1
                k-=1
            elif triplet < target:
                j += 1
            else:
                k -= 1

    return count


# Test cases
if __name__ == "__main__":
    # Test case 1: General case with multiple triplets
    arr1 = [1, 1, 2, 2, 2, 2]
    target1 = 5
    print("Test case 1:", threeSumMulti(arr1, target1))
    # Expected output: 12 (triplets: [1,2,2] repeated in different combinations)

    # Test case 2: Array with all elements the same
    arr2 = [1, 1, 1, 1]
    target2 = 3
    print("Test case 2:", threeSumMulti(arr2, target2))
    # Expected output: 4 (triplets: [1,1,1])

    # Test case 3: No triplet sums up to the target
    arr3 = [1, 2, 3]
    target3 = 10
    print("Test case 3:", threeSumMulti(arr3, target3))
    # Expected output: 0

    # Test case 4: Large array with duplicates
    arr4 = [2, 2, 2, 2, 2, 2]
    target4 = 6
    print("Test case 4:", threeSumMulti(arr4, target4))
    # Expected output: 20 (choose 3 out of 6 identical elements)

    # Test case 5: Edge case with empty array
    arr5 = []
    target5 = 0
    print("Test case 5:", threeSumMulti(arr5, target5))
    # Expected output: 0

    # Test case 6: Edge case with only one element
    arr6 = [1]
    target6 = 3
    print("Test case 6:", threeSumMulti(arr6, target6))
    # Expected output: 0
