from typing import List
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        """
        Group the input strings into anagram groups.
        Return a list of grouped anagrams.
        """
        # Implement your solution here
        ans = {}
        for str in strs:
            key = "".join(sorted(str))
            if key in ans:
                ans[key].append(str)
            else:
                ans[key] = [str]
        values = [value for value in ans.values()]
        return values
# Test cases
def test_group_anagrams():
    s = Solution()

    def sort_groups(result):
        return sorted([sorted(group) for group in result])

    def validate(strs, expected_output):
        result = s.groupAnagrams(strs)
        assert sort_groups(result) == sort_groups(expected_output), \
            f"Failed for input={strs}. Expected {expected_output}, got {result}"

    # Test case 1
    validate(["eat", "tea", "tan", "ate", "nat", "bat"],
             [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]])

    # Test case 2: All identical
    validate(["abc", "abc", "abc"],
             [["abc", "abc", "abc"]])

    # Test case 3: No anagrams
    validate(["a", "b", "c"],
             [["a"], ["b"], ["c"]])

    # Test case 4: Empty input
    validate([], [])

    # Test case 5: Single word
    validate(["solo"], [["solo"]])

    print("All test cases passed!")

# Run tests
if __name__ == "__main__":
    test_group_anagrams()
