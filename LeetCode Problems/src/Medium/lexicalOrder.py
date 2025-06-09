from typing import List


class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        """
        Return numbers from 1 to n in lexicographical (dictionary) order.
        """
        # Implement your solution here
        ans = []
        num = n+1 if n <= 10 else 10
        for i in range(1, num):
            ans.append(i)
            if i * 10 <= n:
                curr = i * 10
                index = 0
                while curr <= n and index < 10:
                    ans.append(curr)
                    index += 1
                    curr += 1
        return ans


# Test cases
def test_lexical_order():
    s = Solution()

    def validate(n, expected_output):
        result = s.lexicalOrder(n)
        assert result == expected_output, f"Failed for n={n}. Expected {expected_output}, got {result}"

    # Test case 1
    # validate(13, [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9])
    # #
    # # # Test case 2
    # validate(2, [1, 2])
    # #
    # # # Test case 3
    # validate(1, [1])

    # Test case 4
    validate(20, [1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 20, 3, 4, 5, 6, 7, 8, 9])

    print("All test cases passed!")


# Run test cases
if __name__ == "__main__":
    test_lexical_order()
