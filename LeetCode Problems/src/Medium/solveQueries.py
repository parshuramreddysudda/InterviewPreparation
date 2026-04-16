from collections import defaultdict


class Solution:
    def solveQueries(self, nums, queries):
        # ❌ Implement your solution here

        lookup = defaultdict(list)
        n = len(nums)
        for idx, element in enumerate(nums):
            lookup[element].append(idx)
        ans = [0]*len(queries)

        def search(num,target):
            low = 0
            mid = 0
            high = len(lookup[num]) - 1
            newList = lookup[num]
            while low <= high:
                mid = (low + high) // 2

                if newList[mid] == target:
                    break
                elif newList[mid] < target:
                    low = mid + 1
                else:
                    high = mid - 1

            if mid == 0:
                left =  n - newList[-1] + newList[0]
            else:
                left = newList[mid] - newList[mid-1]

            if mid == len(newList) - 1:
                right = n - newList[mid] + newList[0]
            else:
                right = newList[mid+1] - newList[mid]

            return min(left, right)
        ans = []
        for i in queries:
            if nums[i] in lookup and len(lookup[nums[i]]) > 1:
                ans.append(search(nums[i],i))
            else:
                ans.append(-1)

        return ans





def test_solveQueries_3488():
    sol = Solution()

    def validate(nums, queries, expected):
        result = sol.solveQueries(nums, queries)
        assert result == expected, (
            f"❌ Failed for nums={nums}, queries={queries}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (from problem)
    validate([1,3,1,4,1,3,2], [0,3,5], [2,-1,3])
    validate([1,2,3,4], [0,1,2,3], [-1,-1,-1,-1])

    # 🔬 Basic cases
    validate([1,1,1], [0,1,2], [1,1,1])
    validate([1,2,1,2], [0,1,2,3], [2,2,2,2])

    # 🔬 Circular behavior
    validate([1,2,3,1], [3], [1])           # wrap: 3 -> 0
    validate([5,6,5], [2], [1])             # wrap backward
    validate([7,8,7,9,7], [4], [1])         # closest is 2 (not 4)

    # 🔬 Multiple occurrences
    validate([1,2,1,3,1,2,1], [0,2,4,6], [1,2,2,1])
    validate([4,4,4,4], [0,1,2,3], [1,1,1,1])

    # 🔬 Edge cases
    validate([1], [0], [-1])                # single element
    validate([2,3], [0,1], [-1,-1])         # no duplicates
    validate([], [], [])                   # empty input

    # 🔬 Tricky cases
    validate([1,2,3,1,2,3,1], [3], [3])     # equal both sides
    validate([1,2,1,1,2], [2], [1])         # immediate neighbor
    validate([1,2,3,2,1], [0], [1])         # wrap is shorter

    # 🔬 Large input case
    nums = [1]*10000
    queries = [0, 5000, 9999]
    validate(nums, queries, [1,1,1])

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_solveQueries_3488()