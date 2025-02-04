import heapq
from typing import List


def k_smallest_number(lists: List[List[int]], k: int) -> int:
    """
    Finds the k-th smallest number among multiple sorted lists.

    :param lists: A list of sorted lists containing integers.
    :param k: The k-th smallest number to find.
    :return: The k-th smallest number.
    """
    # Replace this placeholder return statement with your code

    heap = []
    listNum = 0
    while listNum < len(lists):
        if len(lists[listNum]) > 0:
            if len(heap) == k:
                heapq.heappop(heap)
            heapq.heappush(heap, [-lists[listNum][0], listNum])

        listNum += 1
    if len(heap) == k:
        return -heap[0][0]
    count = 0
    while count < k:
        listheapq.heappop(heap)

    return -1


# Test cases
if __name__ == "__main__":
    # Test case 2: One list is empty
    lists2 = [[1,5,9], [2, 3, 4], [1, 5, 6],[3, 5, 6],[0, 5, 6]]
    k2 = 2
    print("Test case 2:", k_smallest_number(lists2, k2))
    # Expected output: 4

    # Test case 1: Merging multiple sorted lists
    lists1 = [[1, 5, 9], [2, 6, 10], [3, 7, 11], [4, 8, 12]]
    k1 = 5
    print("Test case 1:", k_smallest_number(lists1, k1))
    # Expected output: 5



    # Test case 3: Only one list
    lists3 = [[1, 2, 3, 4, 5]]
    k3 = 3
    print("Test case 3:", k_smallest_number(lists3, k3))
    # Expected output: 3

    # Test case 4: k is the first element
    lists4 = [[10, 20], [15, 25], [5, 30]]
    k4 = 1
    print("Test case 4:", k_smallest_number(lists4, k4))
    # Expected output: 5

    # Test case 5: k is the last element
    lists5 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    k5 = 9
    print("Test case 5:", k_smallest_number(lists5, k5))
    # Expected output: 9
