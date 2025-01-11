import copy


def min_window(s: str, t: str) -> str:
    """
    Finds the minimum window in `s` that contains all the characters of `t`.
    """

    pointer_1 = 0
    pointer_2 = 0
    end = 0
    length = len(s)
    minLength = float('inf')
    secondChar = []
    result = ""
    for i in t:
        secondChar.append(i)

    while pointer_1 < length:

        sChar = copy.deepcopy(secondChar)

        if s[pointer_1] in sChar:
            start = pointer_1
            while start < length and len(sChar) > 0:
                if s[start] in sChar:
                    sChar.remove(s[start])
                start += 1
            if len(sChar) != 0:
                return result
            sChar = copy.deepcopy(secondChar)
            end = start

            while len(sChar) > 0:
                start -= 1
                if s[start] in sChar:
                    sChar.remove(s[start])

            curLength = end - start

            if curLength < minLength:
                minLength = curLength
                result = s[start:end]
            pointer_1 = start

        pointer_1 += 1

    return result


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with a valid window
    s1 = "a"
    t1 = "a"
    print("Test case 1:", min_window(s1, t1))
    # Expected output: "BANC"

    # Test case 2: No valid window
    s2 = "ADOBECODEBANC"
    t2 = "XYZ"
    print("Test case 2:", min_window(s2, t2))
    # Expected output: ""

    # Test case 3: Exact match
    s3 = "ABC"
    t3 = "ABC"
    print("Test case 3:", min_window(s3, t3))
    # Expected output: "ABC"

    # Test case 4: Characters in t are not contiguous in s
    s4 = "AAADOBECODEBAANC"
    t4 = "ABC"
    print("Test case 4:", min_window(s4, t4))
    # Expected output: "BANC"

    # Test case 5: t contains duplicate characters
    s5 = "AAABBBCCC"
    t5 = "ABC"
    print("Test case 5:", min_window(s5, t5))
    # Expected output: "ABBBC"

    # Test case 6: Empty string
    s6 = ""
    t6 = "ABC"
    print("Test case 6:", min_window(s6, t6))
    # Expected output: ""
