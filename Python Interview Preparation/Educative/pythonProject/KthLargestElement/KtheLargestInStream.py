import heapq


class KthLargest:
    # Constructor to initialize heap and add values in it
    def __init__(self, k, nums):
        self.arr = []
        self.k = k
        heapq.heapify(nums)
        self.arr = nums[-k:]
        heapq.heapify(self.arr)
        # print(arr)

    # Adds element in the heap and return the Kth largest
    def add(self, val):
        if len(self.arr) < self.k:
            heapq.heappush(self.arr, val)
        else:
            if val <= self.arr[0]:
                return self.arr[0]
            print("Before POP ",self.arr)
            heapq.heappop(self.arr)
            print("After POP ", self.arr)
            heapq.heappush(self.arr, val)
            print("After  PUSH ", self.arr)
            print(self.arr)

        return self.arr[0]


# Driver code
def main():
    nums = [3, 6, 9, 10]
    temp = [3, 6, 9, 10]
    print("Initial stream: ", nums, sep="")
    print("k: ", 3, sep="")
    k_largest = KthLargest(3, nums)
    val = [4, 7, 10, 8, 15]
    for i in range(len(val)):
        print("\tAdding a new number ", val[i], " to the stream", sep="")
        temp.append(val[i])
        print("\tNumber stream: ", temp, sep="")
        print("\tKth largest element in the stream: ", k_largest.add(val[i]))
        print("-" * 100)


if __name__ == "__main__":
    main()
