def valid_word_abbreviation(word: str, abbr: str) -> bool:
    wordPointer = 0
    abbrPointer = 0
    while wordPointer < len(word):
        number = ""
        if abbr[abbrPointer].isnumeric():
            while abbrPointer < len(abbr) and abbr[abbrPointer].isnumeric():
                number += abbr[abbrPointer]
                abbrPointer += 1
            wordPointer += int(number)

        if abbrPointer == len(abbr) and wordPointer == len(word):
            return True

        if wordPointer < len(word) - 1 and word[wordPointer] != abbr[abbrPointer]:
            return False
        wordPointer += 1
        abbrPointer += 1
    return abbrPointer == len(abbr) and wordPointer == len(word)


# Test cases
if __name__ == "__main__":
    # Test case 1
    word1 = "internationalization"
    abbr1 = "i12iz4n"
    print("Test case 1:", valid_word_abbreviation(word1, abbr1))  # Expected output: True

    # Test case 2
    word2 = "apple"
    abbr2 = "a2e"
    print("Test case 2:", valid_word_abbreviation(word2, abbr2))  # Expected output: False

    # Test case 3
    word3 = "substitution"
    abbr3 = "s10n"
    print("Test case 3:", valid_word_abbreviation(word3, abbr3))  # Expected output: True

    # Test case 4
    word4 = "hello"
    abbr4 = "h1o"
    print("Test case 4:", valid_word_abbreviation(word4, abbr4))  # Expected output: False

    # Test case 5
    word5 = "abc"
    abbr5 = "a2"
    print("Test case 5:", valid_word_abbreviation(word5, abbr5))  # Expected output: False
