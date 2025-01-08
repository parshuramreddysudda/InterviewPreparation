def reverseVowels(s: str) -> str:
    """
    Reverses only the vowels in the input string `s`.
    """
    left = 0
    right = len(s) - 1
    char = ['a', 'e', 'i', 'o', 'u']
    s_list = list(s)
    while left < right:
        # print(s_list[left].lower())
        while left < right and s_list[left].lower() not in char:
            left += 1
        while left < right  and s_list[right].lower() not in char:
            right -= 1

        s_list[left], s_list[right] = s_list[right], s_list[left]
        left += 1
        right -= 1

    return ''.join(s_list)
def sortVowels(self, s: str) -> str:
    st = list(s)
    st.sort()
    return ''.join(st.sort())

# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with vowels in the middle
    s1 = "leetcode"
    print("Test case 1:", reverseVowels(s1))
    # Expected output: "leotcede"

    # Test case 2: String with only vowels
    s2 = "aeiou"
    print("Test case 2:", reverseVowels(s2))
    # Expected output: "uoiea"

    # Test case 3: String with no vowels
    s3 = "bcdfg"
    print("Test case 3:", reverseVowels(s3))
    # Expected output: "bcdfg"

    # Test case 4: Mixed case string
    s4 = "HeLLo"
    print("Test case 4:", reverseVowels(s4))
    # Expected output: "HoLLe"

    # Test case 5: Empty string
    s5 = ""
    print("Test case 5:", reverseVowels(s5))
    # Expected output: ""

    # Test case 6: Single character string
    s6 = "a"
    print("Test case 6:", reverseVowels(s6))
    # Expected output: "a"

    # Test case 7: Palindrome string with vowels
    s7 = "racecar"
    print("Test case 7:", reverseVowels(s7))
    # Expected output: "racecar"
