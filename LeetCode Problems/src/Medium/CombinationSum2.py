from itertools import combinations
from typing import List


# Function to find unique combinations that sum to the target
def combinationSum2(candidates: List[int], target: int) -> List[List[int]]:
    # Implement your solution here
    results = set()
    candidates.sort()
    def combinations2(index, result, curSum):

        if curSum == target:
            results.add(tuple(result[:]))
            return

        if index == len(candidates) or curSum > target:
            return

        result.append(candidates[index])
        combinations2(index + 1, result, curSum + candidates[index])

        result.remove(candidates[index])
        combinations2(index + 1, result, curSum)

    combinations2(0, [], 0)

    return [list(comb) for comb in results]

# Test cases
def test_combinationSum2():
    # Test case 1: Basic example
    candidates1 = [10, 1, 2, 7, 6, 1, 5]
    target1 = 8
    expected_output1 = [
        [1, 1, 6], [1, 2, 5], [1, 7], [2, 6]
    ]  # Unique combinations that sum to 8

    # Test case 2: Another set of candidates
    candidates2 = [2, 5, 2, 1, 2]
    target2 = 5
    expected_output2 = [
        [1, 2, 2], [5]
    ]  # Unique combinations that sum to 5

    # Test case 3: No valid combinations
    candidates3 = [3, 9, 7]
    target3 = 2
    expected_output3 = []  # No combination sums to 2

    # Test case 4: Only one number available
    candidates4 = [1]
    target4 = 1
    expected_output4 = [[1]]  # Single element meeting the target

    # Test case 5: Multiple identical numbers but only unique sets should be considered
    candidates5 = [1, 1, 1, 2, 2, 2, 5]
    target5 = 4
    expected_output5 = [[1, 1, 2]]  # Only one valid unique combination

    test_cases = [
        # (candidates1, target1, expected_output1),
        (candidates2, target2, expected_output2),
        (candidates3, target3, expected_output3),
        (candidates4, target4, expected_output4),
        (candidates5, target5, expected_output5),
    ]

    for idx, (candidates, target, expected_output) in enumerate(test_cases):
        result = combinationSum2(candidates, target)
        assert sorted(result) == sorted(
            expected_output), f"Test case {idx + 1} failed: expected {expected_output}, but got {result}"

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_combinationSum2()
