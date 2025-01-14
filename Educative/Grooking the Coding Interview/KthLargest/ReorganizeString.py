import heapq


def reorganize_string(s: str) -> str:
    """
    Rearranges the characters in the input string `s` so that no two adjacent characters are the same.
    If such a rearrangement is not possible, return an empty string.
    """
    # Replace this placeholder return statement with your code
    hashMap = {}

    for char in s:
        if char in hashMap:
            hashMap[char] += 1
        else:
            hashMap[char] = 1
    freqValues = []
    for key, value in hashMap.items():
        freqValues.append([-value, key])

    heapq.heapify(freqValues)
    str = ""
    lastChar = None
    while len(freqValues) > 0 or lastChar:

        if lastChar and len(freqValues) == 0:
            return ""

        freq, char = heapq.heappop(freqValues)
        freq += 1
        str += char
        if lastChar:
            heapq.heappush(freqValues, lastChar)
            lastChar = None

        if freq != 0:
            lastChar = [freq, char]

    return str


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with valid reorganization
    s1 = "twuyhehudnuvuqqetignfnrlqdnjjznklgjoabzjhvzcjuamkizraobaqymuyfgjyracqoshmyluvvzwwaxbtrxvtgurldahrsxezhhihlnzlkjtkowfgicajqorbdfmbovuakksdztjcwhzqpaezflaggmiokuijhxewmbsihrooreijmbmzcvekaubcwxdedhmdpegsaesswvpugfwsfgandolxvawbzyphxfsbnnevkzbtmbopzitjllsymdenuxnxlgtgwlvzwunfmptpeswaqhwamolrgknhjcmzzoqjyyprkyrxpvvvudiduspbyqlgxfajdddhkxlkiqkudbjirycdisisyvpmhryfafzdkgwpjbkgkszsxbagtaqspetdwcdikojzlepwknbdxxhikvlhxrikzhxkqgxjlmtoaqssvfhvrgmywclpqlotnsyqonwefuexhnaiihfbvdwkhepdehrrnimmorckqbivorgbgjo"
    # print("Test case 1:", reorganize_string(s1))
    result = "hkhadhkadhkadghikzabdghijklorsvwzabdeghijklmorsvwxzabdeghijklmnorsuvwxzabdeghijklmnoqrsuvwxzabdeghijklmnopqrsuvwxyzabdefghijklmnopqrsuvwxyzabdefghijklmnopqrstuvwxyzabdefghijklmnopqrstuvwxyzabdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
    if result == reorganize_string(s1):
        print("Final Case passed")
    else:
        print("Final Case Failed")
    # Expected output: "cacabcabc" or another valid arrangement

    # Test case 2: Case where reorganization is not possible
    # s2 = "aaab"
    # print("Test case 2:", reorganize_string(s2))
    # Expected output: "" (not possible)

    # Test case 3: All characters are unique
    s3 = "abcdef"
    print("Test case 3:", reorganize_string(s3))
    # Expected output: "abcdef" (already valid)

    # Test case 4: Large input with many duplicates
    s4 = "aaabbcccc"
    print("Test case 4:", reorganize_string(s4))
    # Expected output: A valid arrangement, e.g., "cacabcabc"

    # Test case 5: Single character
    s5 = "a"
    print("Test case 5:", reorganize_string(s5))
    # Expected output: "a"

    # Test case 6: Edge case with two characters
    s6 = "aa"
    print("Test case 6:", reorganize_string(s6))
    # Expected output: "" (not possible)

    # Test case 7: Mixed case
    s7 = "AaBb"
    print("Test case 7:", reorganize_string(s7))
    # Expected output: A valid arrangement, e.g., "AaBb" or "ABab"
