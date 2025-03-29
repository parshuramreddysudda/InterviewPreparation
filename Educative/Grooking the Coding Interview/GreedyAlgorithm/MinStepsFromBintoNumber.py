def num_steps(binary: str) -> int:
    """
    Finds the number of steps required to reduce a binary number to '1'.

    :param binary: The input binary string.
    :return: The number of steps to reduce it to '1'.
    """
    # Replace this placeholder return statement with your code
    decimal = int(binary, 2)

    steps = 0
    while decimal > 1:
        if decimal % 2 == 0:
            decimal //= 2
        else:
            decimal += 1
        steps += 1
    return steps


# Test Cases and Expected Outputs
if __name__ == "__main__":
    test_cases = [
        ("1101", 6),  # 1101 -> 1110 -> 111 -> 1000 -> 100 -> 10 -> 1
        ("10", 1),  # 10 -> 1
        ("1", 0),  # Already 1, no steps needed
        ("111", 4),  # 111 -> 1000 -> 100 -> 10 -> 1
        ("101", 5),  # 101 -> 110 -> 111 -> 1000 -> 100 -> 10 -> 1
    ]

    for binary, expected in test_cases:
        print(f"Input: {binary} -> Steps: {num_steps(binary)} (Expected: {expected})")
