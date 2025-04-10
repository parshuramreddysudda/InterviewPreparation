from typing import List


# Function to return all permutations of a given word
def permute_word(word: str) -> List[str]:
    # Implement your solution here

    permutations = []

    def permuation(index, permutedWord):
        if index == len(word):
            permutations.append("".join(permutedWord[:]))

        for i in range(index, len(word)):
            permutedWord.append(word[i])
            print("I values are ",i," Index is ",index)
            permuation(i + 1, permutedWord)
            permutedWord.pop()

    permuation(0, [])
    return permutations


# Test cases
def test_permute_word():
    def validate(word, expected_output):
        result = permute_word(word)
        assert sorted(result) == sorted(
            expected_output), f"Failed for '{word}': expected {expected_output}, got {result}"

    # Test case 1: Three unique letters
    validate("abc", ["abc", "acb", "bac", "bca", "cab", "cba"])

    # Test case 2: Repeated characters
    validate("aab", ["aab", "aba", "baa"])

    # Test case 3: Single character
    validate("x", ["x"])

    # Test case 4: Empty string
    validate("", [""])

    # Test case 5: All identical characters
    validate("aaa", ["aaa"])

    print("All test cases passed!")


# Run test cases
if __name__ == "__main__":
    test_permute_word()
