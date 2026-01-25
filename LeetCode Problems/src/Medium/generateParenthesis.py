from collections import Counter

def max_equal_cost_packages(itemCosts):
    freq = Counter(itemCosts)
    max_cost = max(itemCosts)
    max_packages = 0

    # Try every possible target cost
    for target in range(1, 2 * max_cost + 1):
        temp = freq.copy()
        packages = 0

        for cost in list(temp.keys()):
            other = target - cost
            if other not in temp:
                continue

            if cost == other:
                # Only pairs of identical items
                packages += temp[cost] // 2
                temp[cost] = 0
            elif cost < other:
                # Pair different items
                pairs = min(temp[cost], temp[other])
                packages += pairs
                temp[cost] -= pairs
                temp[other] -= pairs

        # Finally, add single items that directly equal target
        if target in temp:
            packages += temp[target]

        max_packages = max(max_packages, packages)

    return max_packages


# -------------------
# ✅ Test Cases
# -------------------
if __name__ == "__main__":
    tests = [
        ([1, 1, 2, 2, 1, 4], 3),   # Example 1
        ([10, 2, 1], 1),           # Example 2
        ([5, 5, 5, 5], 2),         # Two packages of [5,5]
        ([3, 3, 6], 2),            # [6], [3,3]
        ([1], 1),                  # Only one item
        ([2, 2, 2, 2, 2], 2),      # Two packages of [2,2]
    ]

    for arr, expected in tests:
        result = max_equal_cost_packages(arr)
        print(f"itemCosts={arr} → result={result}, expected={expected}, pass={result == expected}")
