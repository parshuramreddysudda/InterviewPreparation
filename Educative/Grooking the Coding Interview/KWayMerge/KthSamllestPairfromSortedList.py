import heapq
from typing import List, Tuple


def k_smallest_pairs(list1: List[int], list2: List[int], k: int) -> List[Tuple[int, int]]:
    """
    Finds the k smallest sum pairs from two sorted lists.

    :param list1: A sorted list of integers.
    :param list2: A sorted list of integers.
    :param k: The number of smallest pairs to return.
    :return: A list of tuples representing the k smallest sum pairs.
    """

    if len(list1) <= 0 or len(list2) <= 0:
        return []

    listNumIndex = 0
    heap = []
    [heapq.heappush(heap, [list1[0] + list2[num], 0, num]) for num in range(len(list2))]
    num = 0
    ans = []
    while len(ans) < k and len(heap) > 0:
        num, firstIndex, secondIndex = heapq.heappop(heap)
        ans.append((list1[firstIndex], list2[secondIndex]))
        firstIndex += 1
        if firstIndex < len(list1):
            heapq.heappush(heap, [list1[firstIndex] + list2[secondIndex], firstIndex, secondIndex])

    return ans


# Test cases
if __name__ == "__main__":
    # Test case 1: Standard case with two sorted lists
    # list1_1 = [1, 7, 11]
    # list2_1 = [2, 4, 6]
    # k1 = 3
    # print("Test case 1:", k_smallest_pairs(list1_1, list2_1, k1))
    # # Expected output: [(1,2), (1,4), (1,6)]
    #
    # # Test case 2: One list is empty
    # list1_2 = []
    # list2_2 = [2, 4, 6]
    # k2 = 2
    # print("Test case 2:", k_smallest_pairs(list1_2, list2_2, k2))
    # Expected output: []

    # Test case 3: k is larger than total pairs
    list1_3 = [1, 2]
    list2_3 = [3]
    k3 = 5
    print("Test case 3:", k_smallest_pairs(list1_3, list2_3, k3))
    # Expected output: [(1,3), (2,3)]

    # Test case 4: Both lists contain only one element
    list1_4 = [1]
    list2_4 = [2]
    k4 = 1
    print("Test case 4:", k_smallest_pairs(list1_4, list2_4, k4))
    # Expected output: [(1,2)]

    # Test case 5: Larger lists
    list1_5 = [1, 2, 3, 4, 5]
    list2_5 = [6, 7, 8, 9, 10]
    k5 = 4
    print("Test case 5:", k_smallest_pairs(list1_5, list2_5, k5))
    # Expected output: [(1,6), (1,7), (2,6), (1,8)]
