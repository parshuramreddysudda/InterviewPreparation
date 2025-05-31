from typing import List


# Function to count number of valid triangles
def triangle_number(nums: List[int]) -> int:
    ans = 0
    nums.sort()
    # Implement your solution here

    # 3 5 7 9 11
    # 3 + 5 > 7 Valid
    # l = 5,  r = 11
    for k in range(len(nums)-1,1,-1):
        i = 0
        j = k-1
        while i < j:
            if nums[i]+nums[j] > nums[k]:
                ans += j - i
                j -= 1
            else:
                i += 1
    return ans


# Test cases
def test_triangle_number():
    def validate(input_nums, expected_output):
        result = triangle_number(input_nums)
        assert result == expected_output, f"Failed for nums={input_nums}: expected {expected_output}, got {result}"

    # Test case 1: Basic valid triangles
    validate([3,5,7,9,12], 5)

    # Test case 2: No valid triangles
    validate([1, 1, 1, 3], 1)

    # Test case 3: All elements same
    validate([2, 2, 2, 2], 4)

    # Test case 4: Only two elements
    validate([3, 4], 0)

    # Test case 5: Empty input
    validate([], 0)

    # Test case 6: Mixed small and large
    validate([1, 10, 12, 15], 1)

    # Test case 7: Increasing order
    validate([1, 2, 3, 4, 5], 3)

    print("All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_triangle_number()
