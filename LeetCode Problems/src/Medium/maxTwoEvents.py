# Function to find the maximum sum of values from at most two non-overlapping events
# events[i] = [startTime, endTime, value]
import heapq


def maxTwoEvents(events):
    # Implement your solution here

    events.sort(key = lambda e: e[0])

    print(events)

    pq = []

    ans = 0
    for event in events:
        curVal = 0
        while pq and pq[0][0] < event[0]:
            curVal = max(curVal,pq[0][1])
            heapq.heappop(pq)

        ans = max(ans, curVal+event[2])
        heapq.heappush(pq, (event[1],event[2]))

    return ans


# -------------------- Test Cases --------------------

def test_maxTwoEvents():
    test_cases = [
        # Basic examples

        (
            [[1, 2, 4],
            [3, 4, 3],
            [2, 5, 7],
            [6, 8, 6],
            [5, 7, 5],
            [9, 10, 4]],11
        ),
        (
            [[1, 3, 2], [4, 5, 2], [2, 4, 3]],
            4
        ),
        (
            [[1, 3, 2], [4, 5, 2], [1, 5, 5]],
            5
        ),
        (
            [[1, 5, 3], [1, 5, 1], [6, 6, 5]],
            8
        ),

        # Edge cases
        (
            [[1, 2, 4]],
            4
        ),
        (
            [],
            0
        ),

        # Overlapping events only (can take only one)
        (
            [[1, 4, 5], [2, 5, 6], [3, 6, 7]],
            7
        ),

        # Non-overlapping chain
        (
            [[1, 2, 3], [3, 4, 4], [5, 6, 5]],
            9
        ),

        # Same start or end times
        (
            [[1, 3, 4], [1, 3, 5], [4, 6, 6]],
            11
        ),

        # Large values
        (
            [[1, 10, 100], [11, 20, 200], [5, 15, 150]],
            300
        ),
    ]

    for idx, (events, expected) in enumerate(test_cases, 1):
        result = maxTwoEvents(events)
        assert result == expected, (
            f"Test case {idx} failed: expected {expected}, got {result}"
        )

    print("All test cases passed!")


if __name__ == "__main__":
    test_maxTwoEvents()
