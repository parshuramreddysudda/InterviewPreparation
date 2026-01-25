from typing import List

class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        """
        Given a binary array nums (each element is 0 or 1),
        return a list result where result[i] is True if the binary number
        represented by nums[0..i] is divisible by 5.
        """
        # TODO: Implement prefix divisibility logic here
        result=[]
        remainder = 0
        for num in nums:
            remainder = ((remainder << 1) + num) % 5
            result.append(remainder == 0)
        return result

# ------------------ Test Harness ------------------

def test_prefixesDivBy5():
    sol = Solution()

    def validate(nums, expected):
        result = sol.prefixesDivBy5(nums)
        assert result == expected, f"Failed for nums={nums}. Expected {expected}, got {result}"

    # 🔬 Complex / key test cases
    validate([0,1,1], [True, False, False])          # 0, 1, 3
    validate([1,1,1], [False, False, False])         # 1, 3, 7
    validate([1,0,1,0,1], [False, False, False, False, True])  # ends with 21
    validate([1,0,1], [False, False, False])         # 1, 2, 5 => last True
    validate([0], [True])                             # 0 is divisible by 5
    validate([1], [False])                            # 1 mod 5 != 0
    validate([], [])                                  # empty case
    validate([1,1,0,1,1,0,0], [False, False, True, False, False, False, False])
    validate([1,0,0,1,0,1], [False, False, True, False, False, False])

    print("✅ All test cases passed!")

# Run test cases
if __name__ == "__main__":
    test_prefixesDivBy5()
