class Solution:
    def resultArray(self, nums):
        # ❌ Implement your solution here

        leftArr= [nums[0]]
        rightArr = [nums[1]]
        left = nums[0]
        right = nums[1]
        for i in range(2,len(nums)):
            if left > right:
                left = nums[i]
                leftArr.append(nums[i])
            else:
                right = nums[i]
                rightArr.append(nums[i])


        return list(leftArr) + list(rightArr)


def test_resultArray_3069():
    sol = Solution()

    def validate(nums, expected):
        result = sol.resultArray(nums)
        assert result == expected, (
            f"❌ Failed for nums={nums}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Official examples
    # validate([2,1,3], [2,3,1])
    validate([5,4,3,8], [5,3,4,8])

    # 🔬 Edge cases
    validate([1,2,3], [1,2,3])                    # Minimum size
    validate([2,1,3,4], [2,3,1,4])
    validate([4,3,2,1], [4,2,3,1])

    # 🔬 Corner / tricky cases
    validate([10,1,2,3,4], [10,2,4,1,3])
    validate([1,10,9,8,7], [1,9,7,10,8])
    validate([5,1,4,2,3], [5,4,3,1,2])
    validate([8,3,7,2,6,1], [8,7,6,3,2,1])
    validate([3,9,1,8,2,7], [3,9,1,8,2,7])

    # 🔬 Cases where comparison repeatedly switches
    validate([6,2,5,1,4,3], [6,5,4,2,1,3])
    validate([9,1,8,2,7,3,6,4], [9,8,7,6,1,2,3,4])

    # 🔬 Increasing / decreasing patterns
    validate([1,2,3,4,5,6], [1,3,5,2,4,6])
    validate([6,5,4,3,2,1], [6,4,2,5,3,1])

    # 🔬 Larger valid inputs
    validate(
        [1,2,3,4,5,6,7,8,9,10],
        [1,3,5,7,9,2,4,6,8,10]
    )

    validate(
        [100,99,98,97,96,95,94,93,92,91],
        [100,98,96,94,92,99,97,95,93,91]
    )

    # 🔬 Maximum-size input (n = 50)
    validate(
        list(range(1, 51)),
        [1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,
         2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50]
    )

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_resultArray_3069()