import heapq

if __name__ == '__main__':
    # Create a max-heap (using negation)
    max_heap = []

    # Add elements to the heap
    heapq.heappush(max_heap, 10)
    heapq.heappush(max_heap, -1)
    heapq.heappush(max_heap, 14)
    heapq.heappush(max_heap, -5)

    # Print the heap (negated values)
    print("Max-Heap (Negated):", max_heap)  # Output: [-14, -5, -10, -1]

    # Remove the largest element (negated back)
    largest = -heapq.heappop(max_heap)
    print("Removed Largest:", largest)  # Output: 14

    # Get the largest element without removing (negated back)
    largest_peek = -max_heap[0]
    print("Peek Largest:", largest_peek)  # Output: 10
