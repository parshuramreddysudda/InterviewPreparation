class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        # ❌ Implement your solution here

        ans = []
        i = 1
        currentTarget = 0
        for i in range(1,n+1):
            if i == target[currentTarget]:
                ans.append("Push")
                currentTarget += 1
            else:
                ans.append("Push")
                ans.append("Pop")
            if currentTarget == len(target):
                break

        return ans


def test_buildArray_1441():
    sol = Solution()

    def validate(target, n, expected):
        result = sol.buildArray(target, n)
        assert result == expected, (
            f"❌ Failed for target={target}, n={n}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    validate([1,3], 3, ["Push","Push","Pop","Push"])
    validate([1,2,3], 3, ["Push","Push","Push"])
    validate([1,2], 4, ["Push","Push"])

    # 🔬 Edge cases
    validate([1], 1, ["Push"])                       # Smallest case
    validate([1], 5, ["Push"])                       # Stop immediately
    validate([2], 2, ["Push","Pop","Push"])          # Skip first number
    validate([3], 3, ["Push","Pop","Push","Pop","Push"])

    # 🔬 Corner / tricky cases
    validate([1,4], 4, ["Push","Push","Pop","Push","Pop","Push"])
    validate([2,3], 3, ["Push","Pop","Push","Push"])
    validate([2,4], 4, ["Push","Pop","Push","Push","Pop","Push"])
    validate([1,5], 5, ["Push","Push","Pop","Push","Pop","Push","Pop","Push"])
    validate([3,5], 5, ["Push","Pop","Push","Pop","Push","Push","Pop","Push"])
    validate([2,5], 5, ["Push","Pop","Push","Push","Pop","Push","Pop","Push"])

    # 🔬 Consecutive targets
    validate([1,2,3,4], 4, ["Push","Push","Push","Push"])
    validate([2,3,4,5], 5, ["Push","Pop","Push","Push","Push","Push"])
    validate([3,4,5], 5, ["Push","Pop","Push","Pop","Push","Push","Push"])

    # 🔬 Large input
    validate(
        list(range(1, 1001)),
        1000,
        ["Push"] * 1000
    )

    validate(
        [1, 1000],
        1000,
        ["Push"] + ["Push","Pop"] * 998 + ["Push"]
    )

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_buildArray_1441()