def maximum_swap(num: int) -> int:
    """
    Finds the maximum number that can be obtained by swapping two digits once.

    :param num: The input integer.
    :return: The maximum number after one swap.
    """
    # Replace this placeholder return statement with your code
    nums = [int(d) for d in str(num)]
    i = 0
    while i < len(nums) - 1:
        greatest = i
        for j in range(len(nums)-1, i , -1):
            if nums[j] > nums[greatest]:
                greatest = j
        if greatest != i:
            nums[i], nums[greatest] = nums[greatest], nums[i]
            return int("".join(map(str, nums)))
        i += 1
    return num


# Test Cases and Expected Outputs
if __name__ == "__main__":
    test_cases = [
        (2736, 7236),  # Swap 2 and 7
        (9973, 9973),  # Already the largest
        (98368, 98863),  # Swap 3 and 8
        (12345, 52341),  # Swap 1 and 5
        (109090, 909010),  # Swap 1 and 9
    ]

    for num, expected in test_cases:
        print(f"Input: {num} -> Maximum Swap: {maximum_swap(num)} (Expected: {expected})")
