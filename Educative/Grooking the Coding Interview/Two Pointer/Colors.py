def sort_colors(colors: list) -> None:
    """
    Sorts the input list in-place so that objects of the same color are adjacent,
    with the order red (0), white (1), and blue (2).
    """
    red = 0
    blue = len(colors) - 1
    i = 0
    while i <= blue:
        if colors[i] == 0:
            colors[i] = colors[red]
            colors[red] = 0
            red += 1
            i += 1
        elif colors[i] == 2:
            colors[i] = colors[blue]
            colors[blue] = 2
            blue -= 1
        else:
            i += 1

    # Replace this placeholder return statement with your code
    pass

# Test cases
if __name__ == "__main__":
    # Test case 1: Mixed colors
    colors1 = [2,1,1,0,0]
    sort_colors(colors1)
    print("Test case 1:", colors1)  # Expected output: [0, 0, 1, 1, 2, 2]

    # Test case 2: Already sorted
    colors2 = [0, 0, 1, 1, 2, 2]
    sort_colors(colors2)
    print("Test case 2:", colors2)  # Expected output: [0, 0, 1, 1, 2, 2]

    # Test case 3: All elements the same
    colors3 = [1, 1, 1]
    sort_colors(colors3)
    print("Test case 3:", colors3)  # Expected output: [1, 1, 1]

    # Test case 4: Single element
    colors4 = [0]
    sort_colors(colors4)
    print("Test case 4:", colors4)  # Expected output: [0]

    # Test case 5: Random order
    colors5 = [2, 1, 0, 1, 2, 0]
    sort_colors(colors5)
    print("Test case 5:", colors5)  # Expected output: [0, 0, 1, 1, 2, 2]
