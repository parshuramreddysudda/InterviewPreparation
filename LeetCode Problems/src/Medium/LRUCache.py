from collections import OrderedDict

class LRUCache:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.cache = OrderedDict()  # stores key-value pairs in access order

    def get(self, key: int) -> int:
        if key not in self.cache:
            return -1
        # Move accessed key to the end (most recently used)
        self.cache.move_to_end(key)
        return self.cache[key]

    def put(self, key: int, value: int) -> None:
        if key in self.cache:
            # Update and move to end
            self.cache.move_to_end(key)
        self.cache[key] = value
        # Evict least recently used if capacity exceeded
        if len(self.cache) > self.capacity:
            self.cache.popitem(last=False)

# Test cases
def test_lru_cache():
    print("Running LRU Cache test cases...")

    lru = LRUCache(2)
    lru.put(1, 1)
    lru.put(2, 2)
    assert lru.get(1) == 1     # returns 1
    lru.put(3, 3)              # evicts key 2
    assert lru.get(2) == -1    # returns -1 (not found)
    lru.put(4, 4)              # evicts key 1
    assert lru.get(1) == -1    # returns -1 (not found)
    assert lru.get(3) == 3     # returns 3
    assert lru.get(4) == 4     # returns 4

    print("All test cases passed!")

if __name__ == "__main__":
    test_lru_cache()
