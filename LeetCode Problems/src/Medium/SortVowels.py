def sortVowels(s: str) -> str:
    """
    Sorts only the vowels in the input string `s` while keeping the other characters in their original positions.
    """
    char = ["A", "E", "I", "O", "U", "a", "e", "i", "o", "u"]
    sList = list(s)
    vowels = list()
    for ch in range(len(sList)):
        if sList[ch] in char:
            vowels.append(sList[ch])
            sList[ch] = "@"
    vowels.sort()
    i = 0
    for ch in range(len(sList)):
        if sList[ch] == "@":
            sList[ch] = vowels[i]
            i += 1
    return "".join(sList)


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with vowels in the middle
    s1 = "lEetcOde"
    print("Test case 1:", sortVowels(s1))
    # Expected output: "lEOtcede" (vowels sorted as 'eo' -> 'oe')

    # Test case 2: String with only vowels
    s2 = "aeiou"
    print("Test case 2:", sortVowels(s2))
    # Expected output: "aeiou" (vowels are already sorted)

    # Test case 3: String with no vowels
    s3 = "bcdfg"
    print("Test case 3:", sortVowels(s3))
    # Expected output: "bcdfg"

    # Test case 4: Mixed case string
    s4 = "HeLLo"
    print("Test case 4:", sortVowels(s4))
    # Expected output: "HoLLe" (vowels sorted as 'eO' -> 'Oe')

    # Test case 5: Empty string
    s5 = ""
    print("Test case 5:", sortVowels(s5))
    # Expected output: ""

    # Test case 6: Single character string
    s6 = "a"
    print("Test case 6:", sortVowels(s6))
    # Expected output: "a"

    # Test case 7: String with vowels in reverse order
    s7 = "uoiea"
    print("Test case 7:", sortVowels(s7))
    # Expected output: "aeiou" (vowels sorted alphabetically)
