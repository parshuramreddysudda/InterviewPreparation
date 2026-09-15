class Solution:
    def totalNumbers(self, digits):
        # ❌ Implement your solution here
        if len(digits) == 1 or len(digits) == 2:
            return -1
        unique = set([])
        usedIndices = set()
        def dfs(index, nums):
            if len(nums) == 3:
                if nums[-1] % 2 == 0 and nums[0] != 0:
                    unique.add(tuple(nums))
                return
            for i in range(len(digits)):
                if i in usedIndices:
                    continue
                usedIndices.add(i)
                nums.append(digits[i])
                dfs(i+1, nums)
                usedIndices.remove(i)
                nums.pop()

        dfs(0,[])
        return len(unique)


def test_totalNumbers_3483():
    sol = Solution()

    def validate(digits, expected):
        result = sol.totalNumbers(digits)
        assert result == expected, (
            f"❌ Failed for digits={digits}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    # validate([1, 2, 3, 4], 6)
    validate([0, 2, 2, 8], 3)
    validate([3, 7, 5], 0)

    # 🔬 Edge cases
    validate([0, 1, 2], 2)                       # 102, 120
    validate([1, 2, 4], 2)                       # 124, 214
    validate([0, 0, 2], 1)                       # 200
    validate([0, 0, 0], 0)                       # Cannot form 3-digit number
    validate([2, 2, 2], 1)                       # Only 222
    validate([1, 1, 2], 2)                       # 112, 212
    validate([1, 2, 2], 2)                       # 122, 212

    # 🔬 Corner / tricky cases
    validate([1, 2, 3, 4, 5], 12)
    validate([0, 1, 2, 3], 4)
    validate([0, 2, 4, 6], 9)
    validate([1, 3, 5, 7], 0)                   # No even digit
    validate([2, 4, 6, 8], 12)
    validate([0, 2, 4, 5], 6)
    validate([0, 1, 1, 2], 3)
    validate([0, 1, 2, 2], 3)
    validate([1, 2, 3, 3], 5)
    validate([2, 2, 4, 4], 4)

    # 🔬 Repeated digits
    validate([1, 1, 1, 2], 1)                   # 112
    validate([2, 2, 3, 3], 2)                   # 232, 322
    validate([0, 2, 2, 2], 2)                   # 202, 220
    validate([1, 2, 2, 2], 3)                   # 122, 212, 222

    # 🔬 All distinct digits
    validate([1, 2, 3, 4, 5, 6, 7, 8, 9], 120)
    validate([0, 1, 2, 3, 4, 5], 36)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_totalNumbers_3483()