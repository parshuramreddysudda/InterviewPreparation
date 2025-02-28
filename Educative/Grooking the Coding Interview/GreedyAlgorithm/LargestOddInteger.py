class Solution:
    def largestOddNumber(self, num: str) -> str:
        """
        Finds the largest odd number by trimming digits from the right side.

        :param num: Input numeric string
        :return: Largest odd number or empty string
        """
        # Replace this placeholder return statement with your code

        for index in range(len(num) -1 , -1,-1):
            if int(num[index]) % 2 != 0:
                return num[:index+1]

        return ""


# Test Cases and Expected Outputs
if __name__ == "__main__":
    test_cases = [
        ("3", "35427"),  # The entire number is odd
        ("4206", ""),  # No odd number possible
        ("35420", "354"),  # Trim right digits to get largest odd number
        ("101", "101"),  # Whole number is odd
        ("123456", "12345"),  # Largest odd number by trimming
    ]

    solution = Solution()
    for num, expected in test_cases:
        result = solution.largestOddNumber(num)
        print(f"Input: {num} -> Output: {result} (Expected: {expected})")
