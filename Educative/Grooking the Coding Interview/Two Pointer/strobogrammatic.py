def is_strobogrammatic(num: str) -> bool:
    number = ['1', '6', '9', '0', '8']
    slow = 0
    fast = len(num) - 1
    while slow <= fast:
        if num[slow] in number and num[fast] in number:
            if (num[slow] == '6' and num[fast] == '9') or (num[slow] == '9' and num[fast] == '6') :
                slow += 1
                fast -= 1
                continue
            elif num[slow] == num[fast]:
                slow += 1
                fast -= 1
                continue
        return False
    return True


# Test cases
if __name__ == "__main__":
    # Test case 1
    num1 = "961196116996889696888896968888969688966911961196"
    print("Test case 1:", is_strobogrammatic(num1))  # Expected output: True

    # Test case 2
    num2 = "88"
    print("Test case 2:", is_strobogrammatic(num2))  # Expected output: True

    # Test case 3
    num3 = "962"
    print("Test case 3:", is_strobogrammatic(num3))  # Expected output: False

    # Test case 4
    num4 = "818"
    print("Test case 4:", is_strobogrammatic(num4))  # Expected output: True

    # Test case 5
    num5 = "123"
    print("Test case 5:", is_strobogrammatic(num5))  # Expected output: False
