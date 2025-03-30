# Function to maximize unique substring splits
def maxUniqueSplit(s):
    # Implement your solution here

    pass


# Test cases
def test_maxUniqueSplit():
    # Example test cases
    test_cases = [
        ("ababccc", 5),  # Possible unique splits: {"a", "b", "ab", "c", "cc"}
        ("aba", 2),  # Possible unique splits: {"a", "ba"} or {"ab", "a"}
        ("aa", 1),  # Only one unique substring: {"a", "a"}

        # Additional test cases
        ("abcdef", 6),  # Each character can be a unique substring
        ("aaaaaa", 1),  # Only one unique substring possible
        ("aabbab", 4),  # Possible unique splits: {"a", "ab", "ba", "b"}
        ("abcabc", 3),  # Possible unique splits: {"a", "bc", "abc"} or other combinations
    ]

    for idx, (s, expected_output) in enumerate(test_cases):
        result = maxUniqueSplit(s)
        assert result == expected_output, f"Test case {idx + 1} failed: expected {expected_output}, but got {result}"

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_maxUniqueSplit()
