from typing import List


def insert_interval(intervals: List[List[int]], new_interval: List[int]) -> List[List[int]]:
    """
    Inserts a new interval into a sorted list of non-overlapping intervals and merges if necessary.
    :param intervals: A list of sorted, non-overlapping intervals.
    :param new_interval: The interval to insert.
    :return: A new list of merged intervals.
    """
    # Replace this placeholder return statement with your code
    if len(intervals) == 0:
        return [new_interval]

    # output = []
    # output.append(intervals[0])
    pointer = 0
    output = []
    i = 0
    n = len(intervals)
    new_start, new_end = new_interval[0], new_interval[1]
    while i < n and intervals[i][0] < new_interval[0]:
        output.append(intervals[i])
        i += 1

    if not output or output[-1][1] < new_interval[0]:
        output.append(new_interval)
    else:
        output[-1][1] = max(output[-1][1], new_interval[1])

    while i < n:
        ei = intervals[i]
        start, end = ei[0], ei[1]
        if output[-1][1] < start:
            output.append(ei)
        else:
            output[-1][1] = max(output[-1][1], end)
        i += 1
    return output


# Test cases
if __name__ == "__main__":
    # Test case 1: Insert into an empty list
    intervals1 = [[2, 3], [4, 5], [6, 7]]
    new_interval1 = [0, 1]
    print("Test case 1:", insert_interval(intervals1, new_interval1))
    # Expected output: [[5, 7]]

    # Test case 3: Insert and merge with multiple intervals
    intervals3 = [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]]
    new_interval3 = [4, 8]
    print("Test case 3:", insert_interval(intervals3, new_interval3))
    # Expected output: [[1, 2], [3, 10], [12, 16]]

    intervals10 = [[152, 7739]]
    new_interval10 = [5582, 7267]
    print("Test case 10:", insert_interval(intervals10, new_interval10))
    # Expected output:
    # [[152,7739]]

    # Test case 2: Insert without merging
    intervals2 = [[1, 3], [6, 9]]
    new_interval2 = [2, 5]
    print("Test case 2:", insert_interval(intervals2, new_interval2))
    # Expected output: [[1, 5], [6, 9]]

    # Test case 4: Insert at the beginning
    intervals4 = [[3, 5], [7, 9]]
    new_interval4 = [1, 2]
    print("Test case 4:", insert_interval(intervals4, new_interval4))
    # Expected output: [[1, 2], [3, 5], [7, 9]]

    # Test case 5: Insert at the end
    intervals5 = [[1, 3], [6, 9]]
    new_interval5 = [10, 12]
    print("Test case 5:", insert_interval(intervals5, new_interval5))
    # Expected output: [[1, 3], [6, 9], [10, 12]]

    # Test case 6: Insert completely overlapping all intervals
    intervals6 = [[2, 3], [5, 7]]
    new_interval6 = [1, 10]
    print("Test case 6:", insert_interval(intervals6, new_interval6))
    # Expected output: [[1, 10]]
