from typing import List


class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        results = []
        candidates.sort()

        def backtrack(lst, summ, index, n):

            if summ < 0:
                return

            if summ == 0:
                results.append(lst[:])

            for i in range(index, n):

                if i > index and candidates[i] == candidates[i - 1]:
                    continue
                if summ - candidates[i] > target:
                    break

                lst.append(candidates[i])
                backtrack(lst, summ - candidates[i], i + 1, n)
                lst.pop()

        backtrack([], target, 0, len(candidates))
        return results


# Test cases
def test_combinationSum2():
    sol = Solution()

    # Test case 1: Multiple combinations with duplicates
    candidates1 = [10, 1, 2, 7, 6, 1, 5]
    target1 = 8
    expected1 = [
        [1, 1, 6], [1, 2, 5], [1, 7], [2, 6]
    ]

    # Test case 2: Candidates with repeated values
    candidates2 = [2, 5, 2, 1, 2]
    target2 = 5
    expected2 = [
        [1, 2, 2], [5]
    ]

    # Test case 3: No possible combination
    candidates3 = [3, 4, 5]
    target3 = 2
    expected3 = []

    # Test case 4: All numbers needed to form the sum
    candidates4 = [1, 2, 3]
    target4 = 6
    expected4 = [
        [1, 2, 3]
    ]

    # Test case 5: Only one number matches the target
    candidates5 = [5, 5, 3]
    target5 = 3
    expected5 = [[3]]

    test_cases = [
        (candidates1, target1, expected1),
        (candidates2, target2, expected2),
        (candidates3, target3, expected3),
        (candidates4, target4, expected4),
        (candidates5, target5, expected5),
    ]

    for i, (candidates, target, expected) in enumerate(test_cases):
        result = sol.combinationSum2(candidates, target)
        assert sorted(result) == sorted(expected), f"Test case {i + 1} failed: expected {expected}, got {result}"

    print("All test cases passed!")


# Run the test function
if __name__ == "__main__":
    test_combinationSum2()
