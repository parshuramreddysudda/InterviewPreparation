import heapq
from typing import List, Counter


def topKFrequent(words: List[str], key: int) -> List[str]:
    """
    Returns the k most frequent words in descending order of frequency.
    If two words have the same frequency, they are sorted alphabetically.

    :param words: List of input words
    :param k: Number of top frequent words to return
    :return: List of top k frequent words
    """
    # Replace this placeholder return statement with your code
    hashMap = {}
    words = sorted(words)
    for k in words:
        hashMap[k] = hashMap.get(k, 0) + 1

    print(hashMap)

    heap = []
    for k,t in hashMap.items():
        heapq.heappush(heap,[-t,k])

    result = []
    while key > 0 and len(heap) > 0:
        result.append(heapq.heappop(heap)[1])
        key -= 1
    return result

# Test Cases and Expected Outputs
if __name__ == "__main__":
    test_cases = [
        (["i", "love", "leetcode", "i", "love", "coding"], 2, ["i", "love"]),
        (["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], 4, ["the", "is", "sunny", "day"]),
        (["apple", "banana", "apple", "orange", "banana", "apple"], 2, ["apple", "banana"]),
        (["hello", "world", "hello", "hello"], 1, ["hello"]),
        (["coding", "coding", "fun", "fun", "fun", "love"], 2, ["fun", "coding"])
    ]

    for words, k, expected in test_cases:
        print(f"Input: {words}, k={k} -> Top {k} Frequent: {topKFrequent(words, k)} (Expected: {expected})")
