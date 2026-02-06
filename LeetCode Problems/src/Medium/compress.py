from typing import List


class Solution:
    def compress(self, chars: List[str]) -> int:
        # ❌ Implement your solution here

        n = len(chars)
        l = 0
        r = 0
        i = 0

        while r <n :
            l = r
            while r < n and chars[l] == chars[r]:
                r += 1

            count = r - l
            chars[i] = chars[l]
            i += 1
            if count > 1:
                for idx in str(count):
                    chars[i] = idx
                    i += 1

            l = r

        return i


def test_compress():
    sol = Solution()

    def validate(chars, expected_chars, expected_len):
        original = chars[:]
        length = sol.compress(chars)

        assert length == expected_len, (
            f"❌ Length failed for input={original}. "
            f"Expected length={expected_len}, got={length}"
        )

        assert chars[:length] == expected_chars, (
            f"❌ Content failed for input={original}. "
            f"Expected chars={expected_chars}, got={chars[:length]}"
        )

    # 🔬 Core test cases
    validate(["a","b","b","b","b","a","b","b","b","b","b","a","b","b","b","b","a","b","b","b","b","b","b","b","b","b","b","b"],["a","b","4","a","b","5","a","b","4","a","b","1","1"],13)

    validate(["a","a","b","b","c","c","c","d"], ["a","2","b","2","c","3","d"], 7)
    validate(["a"], ["a"], 1)
    validate(["a","b","c"], ["a","b","c"], 3)
    #
    # # 🔬 Edge cases
    # validate([], [], 0)                                  # Empty input
    validate(["a","a"], ["a","2"], 2)                    # Two same
    validate(["a","b"], ["a","b"], 2)                    # Two different

    # 🔬 Corner / tricky cases
    validate(["a"] * 10, ["a","1","0"], 3)               # Two-digit count
    validate(["a"] * 12, ["a","1","2"], 3)
    validate(["a","a","a","b","b","a","a"],
             ["a","3","b","2","a","2"], 6)

    validate(["x"] * 100,
             ["x","1","0","0"], 4)

    # 🔬 Large input case
    large_chars = ["z"] * 2000
    validate(large_chars, ["z","2","0","0","0"], 5)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_compress()