from typing import List


# Function to return all combinations of k numbers out of 1 ... n
def combine(n: int, k: int) -> List[List[int]]:
    # Implement your solution here
    result = []

    def backtrack(start, lst, k):

        if k == 0:
            result.append(lst[:])
            return

        for i in range(start, n+1):
            lst.append(i)
            backtrack(i+1, lst, k - 1)
            lst.pop()

    backtrack(1, [], k)
    return result


# Test cases
def test_combine():
    # Test case 1: n = 4, k = 2
    n1, k1 = 4, 2
    expected_output1 = [
        [1, 2], [1, 3], [1, 4],
        [2, 3], [2, 4],
        [3, 4]
    ]

    # Test case 2: n = 1, k = 1
    n2, k2 = 1, 1
    expected_output2 = [[1]]

    # Test case 3: n = 5, k = 3
    n3, k3 = 5, 3
    expected_output3 = [
        [1, 2, 3], [1, 2, 4], [1, 2, 5],
        [1, 3, 4], [1, 3, 5], [1, 4, 5],
        [2, 3, 4], [2, 3, 5], [2, 4, 5],
        [3, 4, 5]
    ]

    # Test case 4: n = 3, k = 0 (edge case)
    n4, k4 = 3, 0
    expected_output4 = [[]]  # Only one way to choose 0 elements

    test_cases = [
        (n1, k1, expected_output1),
        (n2, k2, expected_output2),
        (n3, k3, expected_output3),
        (n4, k4, expected_output4),
    ]

    for idx, (n, k, expected_output) in enumerate(test_cases):
        result = combine(n, k)
        assert sorted(result) == sorted(
            expected_output), f"Test case {idx + 1} failed: expected {expected_output}, but got {result}"

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_combine()
