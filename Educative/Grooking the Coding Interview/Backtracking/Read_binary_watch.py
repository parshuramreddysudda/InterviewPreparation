# Function to read a binary watch and return all possible times
def read_binary_watch(turned_on):
    # Implement your solution here
    if turned_on == 0:
        return ["0:00"]
    result = []
    binary_watch(0, 0, 0, turned_on, result)
    return result


def binary_watch(hours, minutes, position, enabled, result):
    if enabled == 0:
        if hours <= 11 and minutes <= 59:
            time = f"{hours}:{"0" if minutes < 10 else ''}{minutes}"
            result.append(time)
        return

    for i in range(position, 10):
        h, m = hours, minutes
        if i < 4:
            hours += pow(2, i)
        else:
            minutes += pow(2, i - 4)

        # if enabled >= 0:
        binary_watch(hours, minutes, i + 1, enabled - 1, result)

        hours, minutes = h, m


# Test cases
def test_read_binary_watch():
    # Example test cases
    test_cases = [
        # (1, ["0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"]),
        # (0, ["0:00"]),  # No LEDs are on, so the only time is 0:00
        (2, ["0:03", "0:05", "0:09", "0:17", "0:33", "1:01", "1:02", "1:04", "1:08", "1:16",
             "1:32", "2:01", "2:02", "2:04", "2:08", "2:16", "2:32", "3:00", "4:01", "4:02",
             "4:04", "4:08", "4:16", "4:32", "5:00", "6:00", "8:01", "8:02", "8:04", "8:08",
             "8:16", "8:32", "9:00", "10:00"]),  # Sample expected output for 2 LEDs turned on

        # Edge cases
        (8, []),  # More than the number of LEDs on a watch, should return empty list
        (6, ["3:31", "3:47", "3:55", "3:59", "7:15", "7:23", "7:27", "7:29",
             "7:30", "7:39", "7:43", "7:45", "7:46", "7:51", "7:53", "7:54",
             "7:57", "7:58", "11:07", "11:11", "11:13", "11:14", "11:19",
             "11:21", "11:22", "11:25", "11:26", "11:28", "11:35", "11:37",
             "11:38", "11:41", "11:42", "11:44", "11:49", "11:50", "11:52",
             "11:56"]),  # More LEDs but still possible
    ]

    for idx, (turned_on, expected_output) in enumerate(test_cases):
        result = read_binary_watch(turned_on)
        assert sorted(result) == sorted(
            expected_output), f"Test case {idx + 1} failed: expected {expected_output}, but got {result}"

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_read_binary_watch()
