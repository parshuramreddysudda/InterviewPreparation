from typing import List


def find_content_children(cont: List[int], cook: List[int]) -> int:
    """
    Finds the maximum number of children that can be content with available cookies.

    :param g: List of greed factors of children.
    :param s: List of cookie sizes.
    :return: Maximum number of content children.
    """
    # Replace this placeholder return statement with your code
    cont.sort()
    cook.sort()
    contest = 0
    cookies = 0
    ans = 0
    while contest < len(cont) and cookies < len(s):
        while cookies < len(cook) and cont[contest] > cook[cookies]:
            cookies += 1

        if cookies < len(cook):
            ans += 1
            cookies += 1
            contest += 1
    return ans


# Test Cases
if __name__ == "__main__":
    test_cases = [
        ([1, 2, 3], [1, 1]),  # Expected output: 1
        ([1, 2], [1, 2, 3]),  # Expected output: 2
        ([2, 3, 4], [1, 2, 3]),  # Expected output: 2
        ([10, 9, 8, 7], [5, 6, 7, 8]),  # Expected output: 2
    ]

    for g, s in test_cases:
        print(f"Greed: {g}, Cookies: {s} -> Content Children: {find_content_children(g, s)}")
