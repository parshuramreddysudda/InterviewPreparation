from typing import List


def intervals_intersection(first_list: List[List[int]], second_list: List[List[int]]) -> List[List[int]]:
    """
    Finds the intersection of two lists of intervals.

    :param first_list: A list of sorted, non-overlapping intervals.
    :param second_list: Another list of sorted, non-overlapping intervals.
    :return: A list of intervals representing the intersections.
    """
    # Replace this placeholder return statement with your code
    firstStart, firstEnd = 0, 0
    secondStart, secondEnd = 0, 0
    first, second = 0, 0
    intersections = []
    if len(first_list) == 0 or len(second_list) == 0:
        return intersections

    while first < len(first_list) and second < len(second_list):
        firstStart, firstEnd = first_list[first]
        secondStart, secondEnd = second_list[second]

        if firstEnd >= secondStart and secondEnd >= firstStart:
            intersections.append([max(firstStart, secondStart), min(firstEnd, secondEnd)])
        else:
            if firstStart < secondStart:
                intersections.append(first_list[first])

        if firstEnd < secondEnd:
            first += 1
        else:
            second += 1

    return intersections


# Test cases
if __name__ == "__main__":
    # Test case 1: Basic intersection
    first1 = [[1, 3], [5, 9]]
    second1 = [[2, 5], [7, 10]]
    print("Test case 1:", intervals_intersection(first1, second1))
    # Expected output: [[2, 3], [5, 5], [7, 9]]

    # Test case 2: No intersection
    first2 = [[1, 2], [3, 4]]
    second2 = [[5, 6], [7, 8]]
    print("Test case 2:", intervals_intersection(first2, second2))
    # Expected output: []

    # Test case 3: One list is empty
    first3 = []
    second3 = [[2, 6], [8, 10]]
    print("Test case 3:", intervals_intersection(first3, second3))
    # Expected output: []

    # Test case 4: Exact overlap
    first4 = [[1, 5], [6, 10]]
    second4 = [[1, 5], [6, 10]]
    print("Test case 4:", intervals_intersection(first4, second4))
    # Expected output: [[1, 5], [6, 10]]

    # Test case 5: Partial overlap
    first5 = [[1, 7]]
    second5 = [[3, 5], [6, 8]]
    print("Test case 5:", intervals_intersection(first5, second5))
    # Expected output: [[3, 5], [6, 7]]
