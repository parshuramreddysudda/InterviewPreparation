from typing import List


class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Modify the input array in-place:
        For every zero in the array, duplicate it and shift the remaining elements right.
        The array's original length must be maintained (truncate if needed).
        """
        n = len(arr)
        zeros = 0
        for i in range(n):
            if arr[i] == 0:
                if i + zeros >= n - 1:
                    if i + zeros == n - 1:
                        arr[i + zeros] = 0
                        n -= 1
                    break
                zeros += 1

        if zeros == n:
            return
        last = n - 1 - zeros
        for i in range(last, -1, -1):
            if arr[i] == 0:
                arr[i + zeros] = 0
                zeros -= 1
                arr[i + zeros] = 0
            else:
                arr[i + zeros] = arr[i]


# Test cases
def test_duplicate_zeros():
    s = Solution()

    def validate(input_arr, expected_output):
        arr = input_arr[:]  # Copy for mutation
        s.duplicateZeros(arr)
        assert arr == expected_output, f"Failed for input {input_arr}. Expected {expected_output}, got {arr}"

    # Test case 1: Simple duplicate
    # validate([1, 0, 2, 3, 0, 4, 5, 0], [1, 0, 0, 2, 3, 0, 0, 4])
    #
    # # Test case 2: One zero at end (no full duplication)
    # validate([1, 2, 3, 0], [1, 2, 3, 0])
    #
    # # Test case 3: All zeros
    # validate([0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0])
    #
    # # Test case 4: No zeros
    # validate([1, 2, 3], [1, 2, 3])
    #
    # # Test case 5: Multiple trailing zeros
    validate([8, 4, 5, 0, 0, 0, 0, 7], [8, 4, 5, 0, 0, 0, 0, 0])
    #
    # validate([1, 5, 2, 0, 6, 8, 0, 6, 0], [1, 5, 2, 0, 0, 6, 8, 0, 0])
    validate(
        [9, 0, 9, 0, 6, 0, 0, 0, 1, 1, 6, 5, 4, 4, 8, 3, 0, 0, 0, 1, 5, 3, 0, 0, 7, 2, 1, 0, 2, 0, 9, 1, 0, 2, 0, 0, 0,
         0, 0, 0, 0, 6, 0, 0, 7, 9, 0, 8, 7, 0, 9, 7, 1, 0, 2, 0, 0, 0, 0, 9, 0, 0, 0, 0],
        [9, 0, 0, 9, 0, 0, 6, 0, 0, 0, 0, 0, 0, 1, 1, 6, 5, 4, 4, 8, 3, 0, 0, 0, 0, 0, 0, 1, 5, 3, 0, 0, 0, 0, 7, 2, 1,
         0, 0, 2, 0, 0, 9, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0])

    validate([1, 0, 0, 0, 0, 0, 3, 3, 3, 3, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0],
             [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0])

    print("All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_duplicate_zeros()
