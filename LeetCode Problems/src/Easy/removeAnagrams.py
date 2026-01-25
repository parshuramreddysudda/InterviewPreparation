from typing import List

def removeAnagrams(words: List[str]) -> List[str]:
    """
    Given a list of words, remove any word that is an anagram of the previous kept word.
    Return the filtered list preserving original order.
    """
    # TODO: Implement your logic here

    result = []
    prev_sorted = None

    for word in words:
        sorted_word = ''.join(sorted(word))
        if sorted_word != prev_sorted:   # keep only if not anagram of previous kept
            result.append(word)
            prev_sorted = sorted_word

    return result

# ------------------ Test Harness ------------------

def test_removeAnagrams():
    def validate(input_words, expected):
        result = removeAnagrams(input_words.copy())
        assert result == expected, f"Failed for {input_words}: expected {expected}, got {result}"

    # Basic cases
    validate(["abba","baba","bbaa","cd","cd"], ["abba","cd"])
    validate(["a","b","c","d"], ["a","b","c","d"])                  # no anagrams
    validate(["listen","silent","enlist","inlets","google"], ["listen","google"])  # many anagrams in a row

    # Mixed case and duplicates
    validate(["abc","bca","ABC","cab"], ["abc","ABC"])              # case-sensitive example
    validate(["x","x","x"], ["x"])                                  # identical words are anagrams -> keep first

    # Non-consecutive anagrams
    validate(["rat","art","tar","star","tars","cheese"], ["rat","star","cheese"]) 

    # Single element / empty
    validate(["single"], ["single"])
    validate([], [])

    # Larger example with varying lengths
    validate(["ab","ba","abc","cab","bca","cba","ab"], ["ab","abc","ab"])

    print("All test cases passed!")

# Run tests
if __name__ == "__main__":
    test_removeAnagrams()
