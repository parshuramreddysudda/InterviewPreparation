# Mock API to simulate the isBadVersion API
def isBadVersion(version: int) -> bool:
    """
    Mock API to simulate the behavior of isBadVersion.
    Replace this function with the actual API call when testing on LeetCode.
    """
    # Define the first bad version for testing purposes
    first_bad = 4  # Example: Change this as needed for testing
    return version >= first_bad

def first_bad_version(n: int) -> int:
    """
    Finds the first bad version among n versions.
    :param n: Total number of versions
    :return: The version number of the first bad version
    """
    # Replace this placeholder return statement with your code
    left ,right = 0, n -1
    calls = 0
    while left <= right:
        mid = (left + right) // 2
        if isBadVersion(mid):
            right = mid - 1
        else:
            left = mid + 1
    return [left,calls]

# Test cases
if __name__ == "__main__":
    # Test case 1: First bad version in the middle
    n1 = 5
    print("Test case 1:", first_bad_version(n1))
    # Expected output: 4 (or the first_bad value defined in isBadVersion)

    # Test case 2: All versions are good
    def isBadVersion(version: int) -> bool:
        return False

    n2 = 5
    print("Test case 2:", first_bad_version(n2))
    # Expected output: -1 or handle as no bad version exists

    # Test case 3: All versions are bad
    def isBadVersion(version: int) -> bool:
        return True

    n3 = 5
    print("Test case 3:", first_bad_version(n3))
    # Expected output: 1

    # Test case 4: Large number of versions
    def isBadVersion(version: int) -> bool:
        first_bad = 12345
        return version >= first_bad

    n4 = 20000
    print("Test case 4:", first_bad_version(n4))
    # Expected output: 12345

    # Test case 5: Single version, bad
    def isBadVersion(version: int) -> bool:
        return True

    n5 = 1
    print("Test case 5:", first_bad_version(n5))
    # Expected output: 1

    # Test case 6: Single version, good
    def isBadVersion(version: int) -> bool:
        return False

    n6 = 1
    print("Test case 6:", first_bad_version(n6))
    # Expected output: -1 or handle as no bad version exists
