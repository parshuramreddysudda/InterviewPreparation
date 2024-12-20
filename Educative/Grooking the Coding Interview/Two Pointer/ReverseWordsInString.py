def reverse_words(sentence: str) -> str:
    # Replace this placeholder return statement with your code
    if len(sentence) == 0:
        return sentence

    slow = 0
    sentence = sentence[::-1]
    sentence = " ".join(sentence.split())
    i = 0
    while i < len(sentence):
        while i < len(sentence) and sentence[i] != " ":
            i += 1
        sentence = sentence[:slow] + sentence[slow:i][::-1] + sentence[i:]
        i += 1
        slow = i


    return sentence


# Test cases
if __name__ == "__main__":
    # Test case 1
    sentence1 = "hello world"
    print("Test case 1:", reverse_words(sentence1))  # Expected output: "world hello"

    # Test case 2
    sentence2 = "  this is   a test  "
    print("Test case 2:", reverse_words(sentence2))  # Expected output: "test a is this"

    # Test case 3
    sentence3 = "singleword"
    print("Test case 3:", reverse_words(sentence3))  # Expected output: "singleword"

    # Test case 4
    sentence4 = ""
    print("Test case 4:", reverse_words(sentence4))  # Expected output: ""
