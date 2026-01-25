import collections
import queue
from idlelib.query import Query
from typing import List

class Solution:
    def pyramidTransition(self, bottom: str, allowed: List[str]) -> bool:
        # ❌ Implement your solution here


        pyLen = len(bottom)

        pyramid = collections.deque([bottom])

        allowedSet = {}
        for allowedRooms in allowed:
            key = allowedRooms[0:2]
            if key in allowedSet:
                allowedSet[key].append(allowedRooms[2:3])
            else:
                allowedSet[key] = [allowedRooms[2:3]]


        for i in range(pyLen):


        return False


    def can_build(self,bottom, allowed,currentString):


        for i in range(0,len(bottom)-1):
            values = allowed[bottom[i:i+2]]
            if values:





def test_pyramidTransition_756():
    sol = Solution()

    def validate(bottom, allowed, expected):
        result = sol.pyramidTransition(bottom, allowed)
        assert result == expected, (
            f"❌ Failed for bottom='{bottom}', allowed={allowed}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate("AABA", ["AAA","AAB","ABA","ABB","BAC"], False)
    validate("BCD", ["BCC","CDE","CEA","FFF"], True)
    validate("AABA", ["AAA","AAB","ABA","ABB","BAC"], False)
    validate("ABC", ["ABD","BCE","DEF"], True)

    # 🔬 Edge cases
    validate("A", [], True)                       # Already at top
    validate("AB", [], False)                     # No transitions
    validate("", [], True)                        # Empty bottom

    # 🔬 Corner / tricky cases
    validate("XYZ", ["XYA","YZB","ABZ"], True)
    validate("AAA", ["AAB","AAC","BCD"], False)
    validate("ABCD", ["ABE","BCF","CDG","EFH","FGI","HIJ"], True)
    validate("AB", ["ABC"], False)                # Invalid length rule
    validate("ABC", ["ABD","BCE"], False)          # Dead-end mid level

    # 🔬 Branching / backtracking-heavy cases
    validate(
        "AAAA",
        ["AAB","AAC","ABA","ABB","ABC","ACB","ACC"],
        True
    )

    validate(
        "ABCDE",
        ["ABF","BCG","CDH","DEI","FGJ","GHK","HIL","JKM"],
        True
    )

    # 🔬 Stress-like case (many possibilities)
    validate(
        "AAAAA",
        ["AAB","ABA","BAA","ABB","BBB","BBC","BCC","CCC"],
        True
    )

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_pyramidTransition_756()
