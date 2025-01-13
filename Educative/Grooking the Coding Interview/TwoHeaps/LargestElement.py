import heapq


def largestInteger(num: int) -> int:
    """
    Rearranges the digits of the given number `num` such that the resulting number is the largest possible
    while keeping the parity of each digit in its original position.
    """
    evenHeap = []
    oddHeap = []
    digits = [int(d) for d in str(num)]
    for n in digits:
        if n % 2 == 0 or n == 0:
            heapq.heappush(evenHeap, -n)
        else:
            heapq.heappush(oddHeap, -n)

    print(evenHeap)
    print(oddHeap)

    for i in range(len(digits)):
        if digits[i] % 2 == 0:
            digits[i] = - heapq.heappop(evenHeap)
        else:
            digits[i] = - heapq.heappop(oddHeap)

    return int("".join(map(str, digits)))


# Test cases
if __name__ == "__main__":
    # Test case 1: Regular case with mixed even and odd digits
    num1 = 98123
    print("Test case 1:", largestInteger(num1))
    # Expected output: 3412

    # Test case 2: All digits are even
    num2 = 8642
    print("Test case 2:", largestInteger(num2))
    # Expected output: 8642 (no change as all digits are even)

    # Test case 3: All digits are odd
    num3 = 9753
    print("Test case 3:", largestInteger(num3))
    # Expected output: 9753 (no change as all digits are odd)

    # Test case 4: Single digit number
    num4 = 7
    print("Test case 4:", largestInteger(num4))
    # Expected output: 7 (single digit remains unchanged)

    # Test case 5: Zero in the number
    num5 = 1024
    print("Test case 5:", largestInteger(num5))
    # Expected output: 2014

    # Test case 6: Large number with mixed parity
    num6 = 987654321
    print("Test case 6:", largestInteger(num6))
    # Expected output: 987654321 (no rearrangement improves the order)

    # Test case 7: Edge case with repeated digits
    num7 = 2233
    print("Test case 7:", largestInteger(num7))
    # Expected output: 3322
