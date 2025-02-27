def can_place_flowers(flowerbed, n):
    """
    Determines if 'n' new flowers can be planted without violating the no-adjacent rule.

    :param flowerbed: List[int] - A list representing the flowerbed (0 = empty, 1 = occupied).
    :param n: int - The number of flowers to plant.
    :return: bool - True if possible, False otherwise.
    """
    # Replace this placeholder return statement with your code
    index = 0
    while index < len(flowerbed) and n > 0:
        if flowerbed[index] == 0 and can_place_flowers_v2(index, flowerbed) == True:
            n -= 1
            index += 1
        index += 1
    return n == 0


def can_place_flowers_v2(index, flowerbed):
    left = False
    right = False

    # Left side check
    if index - 1 < 0 or flowerbed[index - 1] == 0:
        left = True

    if index + 2 > len(flowerbed) or flowerbed[index + 1] == 0:
        right = True

    return left and right


# Test Cases and Expected Outputs
if __name__ == "__main__":
    test_cases = [
        # ✅ Basic Cases
        # ([1, 0, 0, 0, 1], 1, True),  # Can plant 1 flower
        # ([1, 0, 0, 0, 1], 2, False),  # Cannot plant 2 flowers
        ([0, 0, 1, 0, 0], 2, True),  # Can plant at index 0 and 4

        # 🔥 Edge Cases
        ([0], 1, True),  # Single empty spot
        ([1], 1, False),  # Single occupied spot
        ([0, 0], 1, True),  # Two empty spots
        ([1, 0, 1], 1, False),  # Middle empty spot but can't plant

        # 🚨 Boundary Cases
        ([], 0, True),  # Empty flowerbed → Always True for 0 flowers
        ([0, 0, 0, 0, 0], 3, True),  # Maximum possible flowers
        ([0, 1, 0], 1, False),  # One flower already blocking

        # 🌶️ Stress Cases
        ([0] * 1000, 500, True),  # Large input where all spaces are empty
        ([1] * 1000, 1, False),  # Large input where all spaces are occupied
    ]

    for flowerbed, n, expected in test_cases:
        print(f"Input: {flowerbed}, n={n} -> Can Place: {can_place_flowers(flowerbed, n)} (Expected: {expected})")
