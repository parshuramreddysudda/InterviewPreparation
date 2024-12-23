def find_next_palindrome(num_str: str) -> str:
    # Replace the following return statement with your code
    if len(num_str) <= 1:
        return ""

    # left = num_str[:len(num_str) // 2]
    i = 0
    j = len(num_str) // 2

    last = j
    replaces = False
    while i < j:
        last = j
        while num_str[last] > num_str[last - 1]:
            replaces = True
            num_str[last - 1], num_str[last] = num_str[last], num_str[last - 1]
        if replaces:
            break
        j -= 1
    print(num_str)

    # while i <= j:
    #     if num_str[i] >= num_str[j]:
    #         i += 1
    #         j -= 1
    #     else:
    #         break
    # low = i
    # while i <= j:
    #     if num_str[i] < num_str[j]:
    #         i += 1
    #         j -= 1
    #     else:
    #         break
    # high = i

    return ""


# Test cases
if __name__ == "__main__":
    # Test case 1
    num_str1 = "123321"
    print("Test case 1:", find_next_palindrome(num_str1))  # Expected output: "21312"

    # Test case 2
    num_str2 = "23143034132"
    print("Test case 2:", find_next_palindrome(num_str2))  # Expected output: "23314041332"

    # Test case 3
    num_str3 = "1001"
    print("Test case 3:", find_next_palindrome(num_str3))  # Expected output: ""

    # Test case 4
    num_str4 = "5"
    print("Test case 4:", find_next_palindrome(num_str4))  # Expected output: ""

    # Test case 5
    num_str5 = "4567"
    print("Test case 5:", find_next_palindrome(num_str5))  # Expected output: "4664"
