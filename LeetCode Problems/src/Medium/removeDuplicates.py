from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        Modify the input array in-place such that each element appears at most twice.
        Return the new length of the array.
        """
        # Implement your solution here
        pos = 0
        i = 0
        j = 1

        while i < len(nums):
            if j < len(nums) and nums[i] == nums[j]:
                tem = j + 1
                nums[pos] = nums[i]
                nums[pos + 1] = nums[i]
                pos += 2
                while tem < len(nums) and nums[tem] == nums[j]:
                    tem += 1
                i = tem
                j = tem + 1
            else:
                nums[pos] = nums[i]
                i += 1
                j += 1
                pos += 1

        return pos

        # while j < len(nums):
        #     if nums[i] == nums[j]:
        #         if nums[i] != nums[i - 1]:
        #             nums[pos] = nums[i]
        #     else:
        #         nums[pos] = nums[j]
        #
        #     pos +=1
        #     i += 1
        #     j += 1


# Test harness
def test_remove_duplicates():
    s = Solution()

    def validate(nums, expected_nums, expected_len):
        original = nums[:]
        k = s.removeDuplicates(nums)
        assert k == expected_len, f"Failed length check for input {original}. Expected {expected_len}, got {k}"
        assert nums[
               :k] == expected_nums, f"Failed content check for input {original}. Expected {expected_nums}, got {nums[:k]}"

    # Test case 1: Normal duplicate trimming
    validate([1, 1, 1, 2, 2, 3], [1, 1, 2, 2, 3], 5)

    # Test case 2: No duplicates
    validate([1, 2, 3], [1, 2, 3], 3)

    # Test case 3: All elements the same
    validate([0, 0, 0, 0, 0], [0, 0], 2)

    # Test case 4: Already valid with duplicates <= 2
    validate([1, 1, 2, 2, 3, 3], [1, 1, 2, 2, 3, 3], 6)

    # Test case 5: Mixed lengths
    validate([1, 1, 1, 1, 2, 2, 3, 3, 3, 4], [1, 1, 2, 2, 3, 3, 4], 7)

    print("All test cases passed!")


# Run test cases
if __name__ == "__main__":
    test_remove_duplicates()
