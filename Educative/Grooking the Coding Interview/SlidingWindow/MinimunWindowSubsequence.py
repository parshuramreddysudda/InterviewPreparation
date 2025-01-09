def min_window(str1: str, str2: str) -> str:
    """
    Finds the minimum window in `str1` which contains all characters of `str2`
    in the same order as they appear in `str2`.
    """

    len_1, len_2 = len(str1), len(str2)
    pointer_1, pointer_2 = 0, 0
    minLength = len_1+1
    result = ""
    while pointer_1 < len_1:

        if str1[pointer_1] == str2[pointer_2]:
            pointer_2 += 1

            if pointer_2 == len_2:
                end = pointer_1
                while  pointer_2 >0:
                    if str1[pointer_1] == str2[pointer_2-1]:
                        pointer_2 -= 1
                    pointer_1 -= 1

                curLength = end - pointer_1
                if curLength < minLength:
                    result = str1[pointer_1+1:end+1]
                    minLength = curLength

                pointer_1 += 1
                pointer_2 = 0

        pointer_1 += 1

    return result


# Test cases
def main():
    str1 = ["ADOBECODEBANC", "fgrqsqsnodwmxzkzxwqegkndaa", "zxcvnhss", "alpha", "beta"]
    str2 = ["ABC", "kzed", "css", "la", "ab"]

    # let's uncomment the following test case and verify the result
    str1.append("abcdedeaqdweq")
    str2.append("aqeq")

    for i in range(len(str1)):
        print(i+1, ". \tInput string: (" + str1[i]+", " + str2[i]+")", sep="")
        print("\tSubsequence string: ", min_window(str1[i], str2[i]))
        print("-"*100)

if __name__ == '__main__':
    main()