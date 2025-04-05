from typing import List


def build_highest_number(digits: List[int], upper_bound: str) -> str:
    digits = sorted(digits, reverse=True)
    permuatations = []
    n = 10  # Example size
    length = len(digits)
    max_num = -1

    def getPermutation(permutation, used):
        nonlocal max_num
        if len(permutation) == length:
            num = int("".join(map(str, permutation)))
            if num <= int(upper_bound):
                max_num = max(max_num, num)
            return

        for i in range(length):
            if used[i]:
                continue
            used[i] = True
            permutation.append(digits[i])
            getPermutation(permutation, used)
            used[i] = False
            permutation.pop()

    getPermutation([], [False] * length)

    print(permuatations)
    return str(max_num) if max_num != -1 else ""


# ========== Test Cases ==========
def run_tests():
    test_cases = [
        ([8, 7, 1], "1000", "871"),
        ([8, 7, 1], "200", "187"),
        ([1, 2, 3, 5, 4, 6, 8, 7], "78654125", "78654123"),
    ]
    passed = 0
    for i, (digits, upper_bound, expected) in enumerate(test_cases, 1):
        result = build_highest_number(digits, upper_bound)
        if result == expected:
            print(f"✅ Test case {i} passed.")
            passed += 1
        else:
            print(f"❌ Test case {i} failed: expected '{expected}', got '{result}'.")

    print(f"\nPassed {passed} out of {len(test_cases)} tests.")


# ========== Entry Point ==========
if __name__ == "__main__":
    run_tests()
