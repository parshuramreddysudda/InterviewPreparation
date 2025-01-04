def longest_repeating_character_replacement(s: str, k: int) -> int:
    start = 0
    length = len(s)
    end = 0
    maxLength = 0
    char = {}
    mostFreq = -1
    lenofMaxString = 0
    for i in range(length):
        if s[end] not in char:
            char[s[end]] = 1
        else:
            char[s[end]] += 1

        mostFreq = max(mostFreq, char[s[end]])

        if end - start + 1 - mostFreq > k:
            char[s[start]] -= 1
            start += 1

        lenofMaxString = max(end-start+1, lenofMaxString)
        end +=1

    return lenofMaxString


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with replacements
    s1 = "ABBB"
    k1 = 2
    print("Test case 1:", longest_repeating_character_replacement(s1, k1))
    # Expected output: 4

    # Test case 2: Larger string
    s2 = "AABABBA"
    k2 = 1
    print("Test case 2:", longest_repeating_character_replacement(s2, k2))
    # Expected output: 4

    # Test case 3: No replacements needed
    s3 = "AAAA"
    k3 = 2
    print("Test case 3:", longest_repeating_character_replacement(s3, k3))
    # Expected output: 4

    # Test case 4: Single character string
    s4 = "B"
    k4 = 1
    print("Test case 4:", longest_repeating_character_replacement(s4, k4))
    # Expected output: 1

    # Test case 5: String where k is 0
    s5 = "ABCDE"
    k5 = 0
    print("Test case 5:", longest_repeating_character_replacement(s5, k5))
    # Expected output: 1
