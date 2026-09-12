class Solution:
    def removeCoveredIntervals(self, intervals):
        # ❌ Implement your solution here


        intervals = sorted(intervals, key=lambda x: (x[0],-x[1]))

        cur= 1
        prev = 0
        result = 0
        while cur < len(intervals):
            if intervals[prev][0] <=intervals[cur][0] and  intervals[prev][1] >= intervals[cur][1]:
                result += 1
            else:
                prev= cur
            cur += 1

        return len(intervals)-result

def test_removeCoveredIntervals_1288():
    sol = Solution()

    def validate(intervals, expected):
        result = sol.removeCoveredIntervals(intervals)
        assert result == expected, (
            f"❌ Failed for intervals={intervals}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Official examples
    validate([[1,4],[3,6],[2,8]], 2)
    validate([[1,4],[2,3]], 1)

    # 🔬 Edge cases
    validate([[1,2]], 1)                              # Single interval
    validate([[1,2],[3,4]], 2)                        # No overlap
    validate([[1,10],[2,9]], 1)                       # Completely covered
    validate([[2,9],[1,10]], 1)                       # Reverse order
    validate([[1,4],[1,4]], 1)                        # Identical intervals

    # 🔬 Corner / tricky cases
    validate([[1,4],[2,3],[3,4]], 1)
    validate([[1,5],[2,6]], 2)                        # Partial overlap
    validate([[1,5],[1,4]], 1)                        # Same start
    validate([[1,4],[1,5]], 1)                        # Same start, larger end
    validate([[1,5],[2,5]], 1)                        # Same end
    validate([[1,5],[2,4],[3,4]], 1)                  # Nested intervals
    validate([[1,10],[2,3],[4,5],[6,7]], 1)           # One covers all
    validate([[1,2],[2,3],[3,4]], 3)                  # Touching endpoints
    validate([[0,10],[5,10],[5,9]], 1)
    validate([[1,100],[20,30],[40,50],[60,70]], 1)

    # 🔬 Duplicate intervals
    validate([[1,2],[1,2],[1,2]], 1)
    validate([[1,3],[1,3],[2,3]], 1)

    # 🔬 Large input cases
    validate([[1,1000000]] + [[i,i+1] for i in range(2,1002)], 1)
    validate([[i,i+1] for i in range(10000)], 10000)      # No interval covered
    validate([[1,100000]] + [[i,i] for i in range(2,10001)], 1)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_removeCoveredIntervals_1288()