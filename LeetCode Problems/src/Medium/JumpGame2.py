def jump(nums):
    """
    Finds the minimum number of jumps needed to reach the last index.

    :param nums: List of integers representing max jump length at each index.
    :return: Integer representing the minimum number of jumps.
    """

    if len(nums) == 1:
        return nums[0]
    cur = 0
    far = 0
    jumps = 0

    for i in range(len(nums)-1):

        far = max(far, i + nums[i])

        if cur == i:
            jumps += 1
            cur = far

    return jumps


# Test Cases
if __name__ == "__main__":
    test_cases = [
        ([2, 3, 1, 1, 4], 2),  # Jump from index 0 → 1 → 4
        ([2, 3, 0, 1, 4], 2),  # Jump from index 0 → 1 → 4
        ([1, 2, 3], 2),  # Jump from index 0 → 1 → 2
        ([3, 2, 1, 0, 4], 0),  # Impossible to reach last index
        ([1, 1, 1, 1], 3),  # Jump step-by-step
        ([0], 0)  # Already at last index, no jumps needed
    ]

    for nums, expected in test_cases:
        result = jump(nums)
        print(f"Input: {nums} -> Minimum Jumps: {result} (Expected: {expected})")
