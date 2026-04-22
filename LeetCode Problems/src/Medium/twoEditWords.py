class Solution:
    def twoEditWords(self, queries, dictionary):
        # ❌ Implement your solution here

        result = []
        for que in queries:
            for word in dictionary:
                if que in dictionary:
                    result.append(que)
                    break
                count = 0
                for i in range(len(word)):
                    if que[i] != word[i]:
                        count += 1

                    if count > 2:
                        break

                if count <= 2:
                    result.append(que)
                    break


        return result


def test_twoEditWords_2452():
    sol = Solution()

    def validate(queries, dictionary, expected):
        result = sol.twoEditWords(queries, dictionary)
        assert result == expected, (
            f"❌ Failed for queries={queries}, dictionary={dictionary}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases (official-style)
    validate(["word","note","ants","wood"], ["wood","joke","moat"], ["word","note","wood"])
    validate(["yes","no"], ["yet","not"], ["yes","no"])

    # 🔬 Edge cases
    validate([], ["abc"], [])                         # empty queries
    validate(["abc"], [], [])                         # empty dictionary
    validate(["a"], ["a"], ["a"])                     # single char equal
    validate(["a"], ["b"], ["a"])                     # diff = 1 <= 2

    # 🔬 Exact match vs small diff
    validate(["abc","def"], ["abc","xyz"], ["abc"])
    validate(["abc","abd","abf"], ["abc"], ["abc","abd","abf"])

    # 🔬 Exactly 2 edits
    validate(["abc"], ["xyz"], [])                    # diff = 3 → exclude
    validate(["abc"], ["axz"], ["abc"])               # diff = 2 → include

    # 🔬 Multiple dictionary matches
    validate(["abcd"], ["abcf","abxy","zzzz"], ["abcd"])
    validate(["abcd","wxyz"], ["abcf","wxya"], ["abcd","wxyz"])

    # 🔬 Tricky cases
    validate(["aaaa","bbbb"], ["aaab","bbba"], ["aaaa","bbbb"])
    validate(["abcd"], ["abce","abde","acde"], ["abcd"])  # multiple near matches

    # 🔬 All included
    validate(["abc","def","ghi"], ["abx","dex","ghx"], ["abc","def","ghi"])

    # 🔬 None included
    validate(["abc","def"], ["xyz","uvw"], [])

    # 🔬 Large input case
    queries = ["a"*100]*1000
    dictionary = ["a"*98 + "bb"]
    validate(queries, dictionary, queries)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_twoEditWords_2452()