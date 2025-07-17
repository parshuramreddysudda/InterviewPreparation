class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        # Implement your solution here

        result = ''
        first, second = 0, 0
        while first < len(word1) and second < len(word2):
            result += word1[first] + word2[second]
            first += 1
            second += 1

        return result + ''.join(word1[first:])+''.join(word2[second:])


# Test cases
def test_merge_alternately():
    s = Solution()

    def validate(word1, word2, expected):
        result = s.mergeAlternately(word1, word2)
        assert result == expected, f"Failed for input=('{word1}', '{word2}'). Expected '{expected}', got '{result}'"

    # Test case 1: Equal length words
    # validate("abc", "xyz", "axbycz")

    # Test case 2: First word longer
    validate("abcd", "xy", "axbycd")

    # Test case 3: Second word longer
    validate("hi", "wxyz", "hwixyz")

    # Test case 4: One empty string
    validate("", "hello", "hello")
    validate("world", "", "world")

    # Test case 5: Both empty
    validate("", "", "")

    print("All test cases passed!")


if __name__ == "__main__":
    test_merge_alternately()
