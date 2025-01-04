def find_repeated_sequences(s: str, k: int) -> list:
    resSet = set()
    res = []
    for i in range(len(s) - k+1):
        a = s[i:i + k]
        if a not in resSet:
            resSet.add(a)
        elif a not in res:
            res.append(a)
    return res


# Test cases 
if __name__ == "__main__":
    # Test case 1: Repeated DNA sequences
    s1 = "CGG"
    k1 = 1
    print("Test case 1:", find_repeated_sequences(s1, k1))
    # Expected output: ['AAAAACCCCC', 'CCCCCAAAAA']

    # Test case 2: No repeated sequences
    s2 = "ABCDEFGHIJ"
    k2 = 3
    print("Test case 2:", find_repeated_sequences(s2, k2))
    # Expected output: []

    # Test case 3: Single repeated sequence
    s3 = "AAAAAA"
    k3 = 2
    print("Test case 3:", find_repeated_sequences(s3, k3))
    # Expected output: ['AA']

    # Test case 4: Overlapping repeated sequences
    s4 = "AAAAA"
    k4 = 3
    print("Test case 4:", find_repeated_sequences(s4, k4))
    # Expected output: ['AAA']

    # Test case 5: Larger string
    s5 = "AABCAAADAABCA"
    k5 = 3
    print("Test case 5:", find_repeated_sequences(s5, k5))
    # Expected output: ['AAB', 'ABC', 'BCA']
