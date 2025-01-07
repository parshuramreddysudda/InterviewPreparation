def numRescueBoats(people: list[int], limit: int) -> int:
    """
    Returns the minimum number of boats required to rescue all people.
    Each boat can carry at most two people at a time provided their weight sum does not exceed `limit`.
    """
    people.sort()
    start = 0
    boats = 0
    end = len(people) - 1
    while start <= end:
        if people[start] + people[end] <= limit:
            start += 1
        boats += 1
        end -= 1
    return boats


# Test cases
if __name__ == "__main__":
    # Test case 1: General case
    people1 = [1, 2]
    limit1 = 3
    print("Test case 1:", numRescueBoats(people1, limit1))
    # Expected output: 1

    # Test case 2: More people requiring multiple boats
    people2 = [3, 2, 2, 1]
    limit2 = 3
    print("Test case 2:", numRescueBoats(people2, limit2))
    # Expected output: 3

    # Test case 3: Single person per boat
    people3 = [3, 5, 3, 4]
    limit3 = 5
    print("Test case 3:", numRescueBoats(people3, limit3))
    # Expected output: 4

    # Test case 4: All people fit in one boat
    people4 = [1, 1]
    limit4 = 3
    print("Test case 4:", numRescueBoats(people4, limit4))
    # Expected output: 1

    # Test case 5: Edge case with one person
    people5 = [2]
    limit5 = 3
    print("Test case 5:", numRescueBoats(people5, limit5))
    # Expected output: 1

    # Test case 6: Edge case with large limit
    people6 = [5, 1, 4, 2, 1, 1, 1, 2, 2, 2, 4, 3, 3, 3, 4]
    limit6 = 5
    print("Test case 6:", numRescueBoats(people6, limit6))
    # Expected output: 19
