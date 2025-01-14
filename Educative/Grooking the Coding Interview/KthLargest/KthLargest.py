import heapq

class KthLargest:

    def __init__(self, k: int, nums: list[int]):
        """
        Initializes the object with the integer k and the stream of integers nums.
        """
        self.maxHeap = nums
        heapq.heapify(self.maxHeap)
        pass

    def add(self, val: int) -> int:
        """
        Adds the integer val to the stream and returns the kth largest element.
        """
        heapq.heappush( self.maxHeap,val)
        if len(self.maxHeap) > k:
            heapq.heappop(self.maxHeap)
        return self.maxHeap[0]
        pass

# Test cases
if __name__ == "__main__":
    # Example usage:
    k = 3
    nums = [4, 5, 8, 2]
    kthLargest = KthLargest(k, nums)
    print(kthLargest.add(3))  # Replace with your expected result
    print(kthLargest.add(5))  # Replace with your expected result
    print(kthLargest.add(10))  # Replace with your expected result
    print(kthLargest.add(9))  # Replace with your expected result
    print(kthLargest.add(4))  # Replace with your expected result
