
def swapChars(i,j,word)

    swapWords = list(word)
    swapWords[i],swapWords[j] = swapWords[j],swapWords[i]
    return ''.join(swapWords)


def permutations(word, index,result):




    return
def permute_word(word):
    # Replace this placeholder return statement with your code
    result = []

    permutations(word,0,result)
    return result

# Test cases
if __name__ == "__main__":
    def run_test_case(word, expected_permutation_count):
        result = permute_word(word)
        result_set = set(result)
        print(f"Input: {word} | Expected permutations: {expected_permutation_count} | Got: {len(result_set)} | {'PASSED' if len(result_set) == expected_permutation_count else 'FAILED'}")

    # Test case 1: word = "abc"
    run_test_case("abc", 6)  # 3! = 6 permutations

    # Test case 2: word = "aab" (duplicates handled)
    run_test_case("aab", 3)  # unique permutations: "aab", "aba", "baa"

    # Test case 3: single letter word
    run_test_case("a", 1)

    # Test case 4: empty string
    run_test_case("", 1)  # Only one permutation — empty string itself

    # Test case 5: four-letter word
    run_test_case("abcd", 24)  # 4! = 24 permutations
