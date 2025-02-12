import heapq
import math
from typing import List


def k_closest(points: List[List[int]], k: int) -> List[List[int]]:
    """
    Finds the k closest points to the origin (0, 0) using Euclidean distance.

    :param points: List of [x, y] coordinates.
    :param k: Number of closest points to return.
    :return: List of k closest points.
    """
    # Replace this placeholder return statement with your code

    heap = []

    for point in points:
        heapq.heappush(heap, [-math.sqrt(math.pow(point[0], 2) + math.pow(point[1], 2)), point])

        if len(heap) > k:
            heapq.heappop(heap)

    return [point for ans, point in heap]


# Test Cases
if __name__ == "__main__":
    test_cases = [
        ([[1, 3], [-2, 2]], 1),  # Expected output: [[-2,2]]
        ([[3, 3], [5, -1], [-2, 4]], 2),  # Expected output: [[3,3], [-2,4]]
        ([[0, 1], [1, 0], [2, 2], [-1, -1]], 2),  # Expected output: [[0,1], [1,0]] or similar
        ([[0, 0], [1, 1], [2, 2]], 2),  # Expected output: [[0,0], [1,1]]
    ]

    for points, k in test_cases:
        print(f"Input: {points}, k={k} -> Output: {k_closest(points, k)}")
