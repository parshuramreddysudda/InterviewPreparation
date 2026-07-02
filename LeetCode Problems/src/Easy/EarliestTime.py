class Solution:
    def earliestFinishTime(
        self,
        landStartTime,
        landDuration,
        waterStartTime,
        waterDuration
    ):
        # ❌ Implement your solution here
        def solve(start1, duration1, start2, duration2):
            finish1 = inf
            for i in range(len(start1)):
                finish1 = min(finish1, start1[i] + duration1[i])
            finish2 = inf
            for i in range(len(start2)):
                finish2 = min(finish2, max(start2[i], finish1) + duration2[i])
            return finish2



        return min(solve(landStartTime, landDuration, waterStartTime, waterDuration), solve(waterStartTime, waterDuration, landStartTime, landDuration))


def test_earliestFinishTime_3633():
    sol = Solution()

    def validate(landStartTime, landDuration, waterStartTime, waterDuration, expected):
        result = sol.earliestFinishTime(
            landStartTime,
            landDuration,
            waterStartTime,
            waterDuration
        )
        assert result == expected, (
            f"❌ Failed\n"
            f"landStartTime={landStartTime}\n"
            f"landDuration={landDuration}\n"
            f"waterStartTime={waterStartTime}\n"
            f"waterDuration={waterDuration}\n"
            f"Expected={expected}, Got={result}"
        )

    # 🔬 Official examples
    validate([2,8], [4,1], [6], [3], 9)
    validate([5], [3], [1], [10], 14)

    # 🔬 Single ride each
    validate([1], [1], [1], [1], 2)
    validate([10], [5], [1], [1], 12)

    # 🔬 No waiting needed
    validate([1], [2], [3], [4], 7)

    # 🔬 Waiting required
    validate([1], [2], [10], [1], 11)

    # 🔬 Water first is optimal
    validate([10], [2], [1], [1], 12)

    # 🔬 Land first is optimal
    validate([1], [1], [10], [10], 20)

    # 🔬 Multiple choices
    validate([1,6], [3,2], [2,4], [5,1], 5)

    # 🔬 Earliest finishing first ride isn't necessarily earliest start ride
    validate([1,5], [10,1], [2], [1], 6)

    # 🔬 Equal finish times from both orders
    validate([1], [5], [2], [4], 10)

    # 🔬 Tricky combinations
    validate([3,7,12], [5,1,2], [1,9], [4,1], 8)
    validate([4,20], [2,1], [3,5], [10,1], 7)

    # 🔬 Large values
    validate([1000], [1000], [1000], [1000], 3000)

    # 🔬 Large input case
    n = 100
    landStart = list(range(1, 101))
    landDur = [1] * 100
    waterStart = list(range(1, 101))
    waterDur = [1] * 100
    validate(landStart, landDur, waterStart, waterDur, 3)

    print("✅ All test cases passed!")


if __name__ == "__main__":
    test_earliestFinishTime_3633()