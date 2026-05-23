class Solution:
    def longestCommonPrefix(self, arr1, arr2):
        # ❌ Implement your solution here

        set1 = set()
        for num in arr1:
            while num > 0 and num not in set1:
                set1.add(num)
                num //= 10
        ans = 0
        for num in arr2:
            while num > 0 and len(str(num)) > ans:
                if num in set1:
                    ans = max(ans, len(str(num)))
                num //=10

        return ans


def test_longestCommonPrefix_3043():
    sol = Solution()

    def validate(arr1, arr2, expected):
        result = sol.longestCommonPrefix(arr1, arr2)
        assert result == expected, (
            f"❌ Failed for arr1={arr1}, arr2={arr2}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate([1,10,100], [1000], 3)
    validate([1,2,3], [4,4,4], 0)

    # 🔬 Edge cases
    validate([], [1,2,3], 0)                     # empty arr1
    validate([1,2,3], [], 0)                     # empty arr2
    validate([], [], 0)                          # both empty
    validate([5], [5], 1)                        # exact single digit
    validate([123], [456], 0)                    # no common prefix

    # 🔬 Different lengths
    validate([12345], [123], 3)
    validate([12], [123456], 2)
    validate([98765], [987], 3)

    # 🔬 Multiple candidates
    validate([123,456,789], [12,45,78], 2)
    validate([111,222,333], [11,22,3], 2)
    validate([565,56,5], [5678], 2)

    # 🔬 Tricky cases
    validate([100,10,1], [1000,10000], 3)
    validate([1234,5678], [1299,5611], 2)
    validate([9,98,987], [9876], 3)

    # 🔬 Duplicate-heavy cases
    validate([1111,111,11], [11111], 4)
    validate([222,222,222], [22], 2)

    # 🔬 Large input stress test
    large_arr1 = [123456789] * 5000
    large_arr2 = [123999999] * 5000
    validate(large_arr1, large_arr2, 3)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_longestCommonPrefix_3043()