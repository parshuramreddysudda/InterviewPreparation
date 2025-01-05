def find_longest_substring(input_str: str) -> int:
    """
    Finds the length of the longest substring without repeating characters.
    """
    if input_str == "":
        return 0
    start = 0
    end = 0
    length = len(input_str)
    charMap = {}
    maxLength = 0
    while end < length:
        if input_str[end] not in charMap.keys():
            charMap[input_str[end]] = end
        else:
            if charMap[input_str[end]] >= start:
                maxLength = max(maxLength, end - start)
                start = charMap[input_str[end]] + 1

            charMap[input_str[end]] = end
            # char.add(input_str[end])
        end += 1
    maxLength = max(maxLength, end - start)
    if maxLength == 0:
        return len(input_str)
    else:
        return maxLength


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with mixed characters
    input_str1 = "abcdbea"
    print("Test case 1:", find_longest_substring(input_str1))
    # Expected output: 5 ("abc")

    # Test case 2: All unique characters
    input_str2 = "abcdef"
    print("Test case 2:", find_longest_substring(input_str2))
    # Expected output: 6 ("abcdef")

    # Test case 3: Single character repeated
    input_str3 = "bbbb"
    print("Test case 3:", find_longest_substring(input_str3))
    # Expected output: 1 ("b")

    # Test case 4: Empty string
    input_str4 = ""
    print("Test case 4:", find_longest_substring(input_str4))
    # Expected output: 0

    # Test case 5: Alternating characters
    input_str5 = "abababab"
    print("Test case 5:", find_longest_substring(input_str5))
    # Expected output: 2 ("ab")

    # Test case 6: Case-sensitive string
    input_str6 = "AaBbCc"
    print("Test case 6:", find_longest_substring(input_str6))
    # Expected output: 6 ("AaBbCc")
