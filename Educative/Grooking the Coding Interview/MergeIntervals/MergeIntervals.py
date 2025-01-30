from typing import List


def merge_intervals(intervals: List[List[int]]) -> List[List[int]]:
    """
    Merges overlapping intervals in a given list of intervals.
    :param intervals: A list of intervals where each interval is represented as [start, end].
    :return: A list of merged intervals in ascending order of their start times.
    """
    pointer = 0
    for i in range(0, len(intervals) - 1):
        print(intervals[i][1])
        if intervals[pointer][1] > intervals[i + 1][0]:
            intervals[pointer][1] = max(intervals[pointer][1], intervals[i + 1][0])
            intervals[pointer][1] = max(intervals[pointer][1], intervals[i + 1][1])
        else:
            pointer += 1
            intervals[pointer][0], intervals[pointer][1] = intervals[i+1][0], intervals[i+1][1]

    # for interval in intervals:
    # print(interval)
    return intervals[:pointer+1]


# Test cases
if __name__ == "__main__":
    # Test case 1: Basic test
    intervals1 = [[1, 3], [2, 6], [8, 10], [15, 18]]
    print("Test case 1:", merge_intervals(intervals1))
    # Expected output: [[1, 6], [8, 10], [15, 18]]

    # Test case 2: Fully overlapping intervals
    intervals2 = [[1, 4], [2, 3]]
    print("Test case 2:", merge_intervals(intervals2))
    # Expected output: [[1, 4]]

    # Test case 3: Non-overlapping intervals
    intervals3 = [[1, 2], [3, 4], [5, 6]]
    print("Test case 3:", merge_intervals(intervals3))
    # Expected output: [[1, 2], [3, 4], [5, 6]]

    # Test case 4: Single interval
    intervals4 = [[1, 5]]
    print("Test case 4:", merge_intervals(intervals4))
    # Expected output: [[1, 5]]

    # Test case 5: Empty list of intervals
    intervals5 = []
    print("Test case 5:", merge_intervals(intervals5))
    # Expected output: []

    # Test case 6: Intervals with the same start times
    intervals6 = [[1, 4], [1, 5], [1, 3]]
    print("Test case 6:", merge_intervals(intervals6))
    # Expected output: [[1, 5]]

    # Test case 7: Complex overlapping intervals
    intervals7 = [[1, 4], [4, 5], [6, 8], [7, 9]]
    print("Test case 7:", merge_intervals(intervals7))
    # Expected output: [[1, 5], [6, 9]]
