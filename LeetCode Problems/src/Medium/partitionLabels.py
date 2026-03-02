from typing import List


class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        # ❌ Implement your solution here
        if not s:
            return []
        char = {letter: i for i, letter in enumerate(s)}

        curIndex = 0
        maxIndex = char[s[0]]
        result = []
        prevIndex = 0
        while curIndex < len(s):
            maxIndex = max(maxIndex,char[s[curIndex]])
            if curIndex == maxIndex:
                result.append(maxIndex-prevIndex+1)
                prevIndex = maxIndex + 1
                curIndex = maxIndex

            curIndex += 1

        return result


def test_partitionLabels():
    sol = Solution()

    def validate(s, expected):
        result = sol.partitionLabels(s)
        assert result == expected, (
            f"❌ Failed for s='{s}'. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate("ababcc", [4,2])

    # 🔬 Corner / tricky cases
    validate("abccaddbeffe", [8,4])
    validate("abcdedcba", [9])
    validate("abcabc", [6])
    validate("caedbdedda", [1,9])


    validate("ababcbacadefegdehijhklij", [9,7,8])
    # validate("eccbbbbdec", [10])
    validate("abc", [1,1,1])
    validate("aaaaa", [5])

    # 🔬 Edge cases
    validate("", [])
    validate("a", [1])
    validate("ab", [1,1])
    validate("aa", [2])

    # 🔬 Distinct character stress
    validate("abcdefghijklmnopqrstuvwxyz", [1]*26)

    # 🔬 Large input case
    large_s = "abcde" * 2000
    validate(large_s, [len(large_s)])

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_partitionLabels()
