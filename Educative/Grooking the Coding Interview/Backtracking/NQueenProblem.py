def solve_n_queens(n):
    # Replace this placeholder return statement with your code

    ans = 0
    pos = 0
    index = 0
    matrix = [[0 for _ in range(n)] for _ in range(n)]
    return getPosition(n, pos, index, matrix, ans)


def getPosition(n, pos, index, matrix, ans):
    if index >= n:
        return ans

    if isValid(pos, index, matrix, n):
        matrix[pos][index] = 1
        if pos == n - 1:
            ans += 1
        ans = getPosition(n, pos + 1, 0, matrix, ans)
        matrix[pos][index] = 0

    ans = getPosition(n, pos, index + 1, matrix, ans)

    return ans


def isValid(pos, index, matrix, n):
    # Position is the row number
    # Index is the Column

    if pos > n or pos < 0 or index >= n or n < 0:
        return False

    temp = 0
    # check from positon's Enemy  Top to Bottom line
    while temp < n:
        if matrix[temp][index] == 1:
            return False
        temp += 1

    incr = pos
    decr = index

    # Top Left
    while incr >= 0 and decr < n:
        if matrix[incr][decr] == 1:
            return False
        incr -= 1
        decr += 1

    # Bottom Left
    incr = index
    decr = pos
    while incr >= 0 and decr < n:
        if matrix[incr][decr] == 1:
            return False
        incr -= 1
        decr += 1

    incr = pos
    decr = index
    while incr > n and decr > n:
        if matrix[incr][decr] == 1:
            return False
        incr += 1
        decr += 1

    incr = pos
    decr = index
    while incr >= 0 and decr >= 0:
        if matrix[incr][decr] == 1:
            return False
        incr -= 1
        decr -= 1

    return True


# Test cases
if __name__ == "__main__":
    def run_test_case(n, expected_count):
        result = solve_n_queens(n)
        print(
            f"Input: {n} | Expected Solution Count: {expected_count} | Got: {result} | {'PASSED' if result == expected_count else 'FAILED'}")


    # Test case 1: n = 1
    # run_test_case(1, 1)  # Expected output: 1 solution

    # Test case 2: n = 4
    run_test_case(4, 2)  # Expected output: 2 solutions

    # Test case 3: n = 5
    run_test_case(5, 10)  # Expected output: 10 solutions

    # Test case 4: n = 8
    run_test_case(8, 92)  # Expected output: 92 solutions

    # Test case 5: n = 3 (no valid solutions)
    run_test_case(3, 0)  # Expected output: 0 solutions
