def is_palindrome(s):
    # Replace this placeholder return statement with your code
    a = s
    left = 0
    right = len(s) - 1
    while left <= right:
        if s[left] != s[right]:
            return False
        left += 1
        right -= 1
    return True


if __name__ == '__main__':
    print(is_palindrome("abba"))