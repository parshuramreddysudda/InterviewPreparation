import math


class Solution:
    def closetTarget(self, words, target, startIndex):
        # ❌ Implement your solution here

        n = len(words)
        ans = math.inf
        for i,val in enumerate(words):
            if val == target:
                valIn = abs(startIndex - i)
                ans = min(ans, min(valIn ,n - valIn))

        return -1 if ans == math.inf else ans


def test_closetTarget_2515():
    sol = Solution()

    def validate(words, target, startIndex, expected):
        result = sol.closetTarget(words, target, startIndex)
        assert result == expected, (
            f"❌ Failed for words={words}, target={target}, startIndex={startIndex}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate(["hello","i","am","leetcode","hello"], "hello", 1, 1)
    validate(["a","b","c","d","e"], "c", 0, 2)
    validate(["a","b","c","d","e"], "a", 2, 2)

    # 🔬 Edge cases
    validate(["a"], "a", 0, 0)                     # single element match
    validate(["a"], "b", 0, -1)                    # single element no match
    validate([], "a", 0, -1)                       # empty array

    # 🔬 Circular behavior
    validate(["a","b","c","d","a"], "a", 3, 1)     # wrap around
    validate(["x","y","z","x"], "x", 2, 1)         # both sides equal
    validate(["a","b","a"], "a", 1, 1)

    # 🔬 Multiple occurrences
    validate(["a","b","c","a","b","c","a"], "a", 3, 1)
    validate(["a","x","x","x","a"], "a", 2, 2)
    validate(["a","x","x","x","a"], "a", 4, 0)

    # 🔬 Tricky cases
    validate(["a","b","c","d","e"], "f", 2, -1)    # target not present
    validate(["target","a","b","target"], "target", 1, 1)
    validate(["a","target","b","c","target"], "target", 2, 1)

    # 🔬 Large input case
    words = ["a"] * 10000
    words[5000] = "target"
    validate(words, "target", 0, 5000)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_closetTarget_2515()