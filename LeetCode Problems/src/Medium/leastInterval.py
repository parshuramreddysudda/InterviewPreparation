import heapq
from typing import List
from collections import Counter, deque


class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        """
        Given a list of CPU tasks represented by capital letters and a cooldown interval `n`,
        return the least number of units of time that the CPU will take to finish all the given tasks.
        """
        if n == 0:
            return len(tasks)

        tasks = Counter(tasks)
        heap = []
        for task, freq in tasks.items():
            heapq.heappush(heap, [-freq, task])

        cooldown = deque()
        globalTime = 0
        while heap or cooldown:

            if cooldown and cooldown[0][0] == globalTime:
                freq, task = cooldown.popleft()
                heapq.heappush(heap, task)

            if heap:
                [freq, task] = heapq.heappop(heap)
                if freq + 1 < 0:
                    cooldown.append([globalTime + n + 1, [freq + 1, task]])

            globalTime += 1
        # Implement your solution here
        return globalTime


# Test cases
def test_least_interval():
    s = Solution()

    def validate(tasks, n, expected_output):
        result = s.leastInterval(tasks, n)
        assert result == expected_output, f"Failed for tasks={tasks}, n={n}. Expected {expected_output}, got {result}"

    # Test case 1: Basic cooldown scenario
    validate(["A", "A", "A", "B", "B", "B"], 2, 8)

    # Test case 2: No cooldown
    validate(["A", "A", "A", "B", "B", "B"], 0, 6)

    # Test case 3: Single task repeated
    validate(["A", "A", "A", "A"], 3, 13)

    # Test case 4: Multiple tasks with no duplicates
    validate(["A", "B", "C", "D"], 2, 4)

    # Test case 5: All same tasks, large cooldown
    validate(["A"] * 6, 3, 21)

    # Test case 6: Empty input
    validate([], 2, 0)

    print("All test cases passed!")


if __name__ == "__main__":
    test_least_interval()
