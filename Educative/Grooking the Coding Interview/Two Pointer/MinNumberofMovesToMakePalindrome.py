def min_moves_to_make_palindrome(s):
    s = list(s)

    i =0
    j = len(s)-1
    moves = 1
    while i < j:
        k = j
        while k > i:
            if s[i] == s[k]:
                for m in range(k,j):
                    s[m],s[m+1] = s[m+1],s[m]
                    moves+=1
                j -= 1
                break
            k -= 1
        if k == i:
            moves += len(s)//2-i
        i += 1
    return moves
def main():
    strings = ["ccxx", "arcacer", "w", "ooooooo", "eggeekgbbeg"]

    for index, string in enumerate(strings):
        print(f"{index + 1}.\ts: {string}")
        print(f"\tMoves: {min_moves_to_make_palindrome(string)}")
        print('-' * 100)


if __name__ == "__main__":
    main()