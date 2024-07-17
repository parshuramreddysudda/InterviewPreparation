def jump_game(nums):
    # Replace this placeholder return statement with your code
    step = 1
    for i in range(len(nums) - 2, -1, -1):
        if nums[i] >= step:
            step = 1
        else:
            step = step + 1

    return step == 1


def main():
    nums = [
        [3, 2, 1, 0, 4],
        [0],
        [1],
        [4, 3, 2, 1, 0],
        [1, 1, 1, 1, 1],
        [4, 0, 0, 0, 1],
        [3, 3, 3, 3, 3],
        [1, 2, 3, 4, 5, 6, 7]
    ]

    for i in range(len(nums)):
        print(i + 1, ".\tInput array: ", nums[i], sep="")
        print("\tCan we reach the very last index? ",
              "Yes" if jump_game(nums[i]) else "No", sep="")
        print("-" * 100)


if __name__ == '__main__':
    main()
