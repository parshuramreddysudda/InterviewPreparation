def longestBeautifulSubstring(word: str) -> int:
    # Replace this placeholder return statement with your code

    left = 0
    right = 0
    end = len(word)
    ans = 0
    vowels = ['a', 'e', 'i', 'o', 'u']
    while right < end:
        wIndex = 0
        if word[right] == 'a':
            while right < end and wIndex < len(vowels):
                if word[right] == vowels[wIndex]:
                    right += 1
                elif wIndex < len(vowels) - 1 and word[right] == vowels[wIndex + 1]:
                    wIndex += 1
                    right += 1
                else:
                    break

            if wIndex == len(vowels) - 1:
                ans = max(ans, right - left)
        else:
            right += 1
        left = right
    return ans


# Test cases
if __name__ == "__main__":
    def run_test_case(word, expected):
        result = longestBeautifulSubstring(word)
        print(f"Input: {word} | Expected: {expected} | Got: {result} | {'PASSED' if result == expected else 'FAILED'}")


    # Test case 1
    run_test_case("auoeioueiaaioeuieuoaieuaoeuoaiaoueioiaeuiuaeouaoie", 0)  # Expected output: 13

    # Test case 2
    run_test_case("aeeeiiiioooauuuaeiou", 5)  # Expected output: 5

    # Test case 3
    run_test_case("a", 0)  # Expected output: 0

    # Test case 4
    run_test_case("aeiaeiouuuuuuuuuuuuou", 16)  # Expected output: 5

    # Test case 5
    run_test_case("aaeiiiouuuu", 11)  # Expected output: 0
