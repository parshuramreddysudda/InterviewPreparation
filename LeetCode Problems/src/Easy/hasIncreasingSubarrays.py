from typing import List


def increasing(nums: List[int], k: int,start:int) -> bool:

    for i in range(start,start+k-1):
        if nums[i] >= nums[i+1]:
            return False


    return True

def hasIncreasingSubarrays(nums: List[int], k: int) -> bool:

    # TODO: Implement the check for two adjacent strictly-increasing subarrays of length k.
    n = len(nums)
    if k <= 0 or 2 * k > n:
        return False

    # cnt = number of consecutive increases ending at current index
    cnt = 0
    # good_start[s] == True when nums[s..s+k-1] is strictly increasing
    good_start = [False] * n

    for i in range(1, n):
        if nums[i] > nums[i - 1]:
            cnt += 1
        else:
            cnt = 0

        # when cnt >= k-1, the subarray that starts at start = i-(k-1) is strictly increasing
        if cnt >= k - 1:
            start = i - (k - 1)
            good_start[start] = True

    # check for two adjacent starts: start and start + k
    for s in range(0, n - 2 * k + 1):
        if good_start[s] and good_start[s + k]:
            return True
    return False

# ------------------ Test Harness ------------------

def test_hasIncreasingSubarrays():
    def validate(nums, k, expected):
        result = hasIncreasingSubarrays(nums, k)
        assert result == expected, (
            f"Failed for nums={nums}, k={k}: expected {expected}, got {result}"
        )

    # Basic true case: two adjacent length-2 strictly increasing subarrays [1,2] and [3,4]
    validate([2,5,8,5,8,9,3,4,3,1], 3, True)
    validate([-15,19], 1, True)

    # True: a=0 -> [1,3] and b=2 -> [2,4] both strictly increasing
    validate([1,3,2,4,5], 2, True)

    # False: n=3, k=2 -> only a=0 possible but no adjacent second subarray fits entirely in array
    validate([1,2,3], 2, False)

    # Edge case k = 1:
    # By usual interpretation a subarray of length 1 is trivially strictly increasing,
    # so any two adjacent singletons exist when n >= 2 -> True
    validate([5,4,3,2,1], 1, True)
    validate([1,1,1,1], 1, True)

    # Repeating pattern but valid adjacent increasing subarrays at a=0, b=2
    validate([1,2,1,2,1,2], 2, True)

    # # Larger k with clear true
    validate([1,2,3,4,5,6], 3, True)

    # No adjacent pair satisfies requirement
    validate([1,2,3,2,1], 2, False)

    # k greater than length -> impossible
    validate([1,2], 3, False)

    # empty input
    validate([], 1, False)
    validate([], 0, False)

    # case: exactly two adjacent subarrays possible but second is not strictly increasing
    validate([1,2,3,2,4,1], 2, True)

    print("All test cases passed!")

if __name__ == "__main__":
    test_hasIncreasingSubarrays()
