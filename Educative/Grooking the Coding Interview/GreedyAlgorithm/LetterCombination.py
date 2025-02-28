from itertools import count


def letter_combinations(digits):
    """
    Generates all possible letter combinations based on digit input.

    :param digits: Input string containing digits (2-9)
    :return: List of all letter combinations
    """
    # Replace this placeholder return statement with your code

    if len(digits) == 0:
        return []
    if len(digits) == 1:
        return [digits]
    dig_arr = {
        '2': ['a', 'b', 'c'],
        '3': ['d', 'e', 'f'],
        '4': ['g', 'h', 'i'],
        '5': ['j', 'k', 'l'],
        '6': ['m', 'n', 'o'],
        '7': ['p', 'q', 'r', 's'],
        '8': ['t', 'u', 'v'],
        '9': ['w', 'x', 'y', 'z']
    }

    combinations = dig_arr[(digits[-1])]
    for i in range(len(digits) - 2, -1, -1):
        combinations = AttachStrings(digits[i], combinations, dig_arr)

    return combinations


def AttachStrings(letter, combinations, dig_arr):
    new_combinations = []
    for i in range(len(dig_arr[letter])):
        for j in range(len(combinations)):
            new_combinations.append(dig_arr[letter][i] + combinations[j])
    return new_combinations


# Test Cases
if __name__ == "__main__":
    test_cases = [
        ("23", ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]),
        ("", []),  # Empty input
        ("2", ["a", "b", "c"]),  # Single digit
        ("92", ["wa", "wb", "wc", "xa", "xb", "xc", "ya", "yb", "yc", "za", "zb", "zc"]),
        ("79", ["pw", "px", "py", "pz", "qw", "qx", "qy", "qz", "rw", "rx", "ry", "rz", "sw", "sx", "sy", "sz"])
    ]

    for digits, expected in test_cases:
        result = letter_combinations(digits)
        print(f"Input: {digits} -> Combinations: {result} (Expected: {expected})")
