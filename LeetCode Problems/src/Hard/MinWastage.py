from typing import List


# Function to compute the minimum wasted space when packaging items
def min_wasted_space(packages: List[int], boxes: List[List[int]]) -> int:
    # Implement your solution here

    packages.sort()
    minVal = 99999999999
    for box in boxes:
        total = 0
        box.sort()
        if packages[-1] > box[-1]:
            continue
        index = 0
        startIndex = 0
        for i in range(len(box)):
            index = getMaximumPackageIndexWithBox(box[i], packages) + 1
            total += box[i] * (index - startIndex) - sum(packages[startIndex:index])
            startIndex = index
        minVal = min(minVal, total)
    if minVal == 99999999999:
        return -1
    return minVal


def getMaximumPackageIndexWithBox(box, packages):

    if len(packages) == 0:
        return 0
    left, right = 0, len(packages) - 1
    while left <= right:
        mid = left + (right - left) // 2
        if packages[mid] == box:
            return mid
        elif packages[mid] < box:
            left = mid + 1
        else:
            right = mid - 1

    return right


# Test cases
def test_min_wasted_space():
    def validate(packages, boxes, expected_output):
        result = min_wasted_space(packages, boxes)
        assert result == expected_output, f"Failed for packages={packages}, boxes={boxes}. Expected {expected_output}, got {result}"

    validate(
        [623, 798, 37, 176, 58, 316],
        [[895],[25,538,409],[921,771,77,977,69,925,657,232,941],[599,77,832,712,516,302,437,534,996,822,185,257,621,633,663,408,511,126,344,8,739,410,152,769,946,747,14,25],[210,47,399,851,291,692,950,934,459,890,686],[737,106,67,762,242,255,941,301,151,136,686,48,793,380],[860,63,77,207,334,913,536,159,220,759,321,856,990],[964,289,331,17,247,152,835,98,124,249,167,37,442,921,499,738,102,919,104,495,513],[191,88,424,317,567,623,647,259,178,985,498,344,948,685,713,701,274,542,477,360,756,97,271,94,430,525,810,666,361,650],[26,699,664,193,293,477,674,491,836,849,31,306,115,217,651,901,938,59],[533,344,630,870,722,303,532,68,98,933,888,565,180,976,640,145,94,664,992],[495,717,215,815,198],[994,818,870,324,780,890,839,415,507,603,510,842,349,988,676,824,164,192,620,174,245,154,134,897,878,444,956,485],[69,50,319,129,339,286,777,443,474,612,113,148,433,160,629,311,271,205,851,283,380,966,280,13,786,171],[363,929,540,933,23,261,947,225,856,809,252,573,276,199,466,469,979,514,129,379,884,680,249,736,107,592,985,930],[18,61,510,970,207,581,346,525,915,465,564,432,805],[516,736,230,180,176,862,227,295,372,876,665,503,334,551,35,384,497,118,875,50],[817,82,476,819,38,993,757,200,280,707,298,859,719,358,647,667,803,808,799,323,438,747,679,70,377,447,14,229,588,191],[583,15,661,20,647,782,107,344,932,804,843,493,485,146,253,570,853,224,784,623,268],[1000,60,201,835,965,615,401,571],[491,330],[770]],
        60
    )

    validate(

        [90, 80, 70, 60],
        [[60, 70, 80, 90], [60, 70, 80, 90]],
        0
    )

    # Test case 1: Basic example
    validate(
        [2, 3, 5],
        [[4, 8], [2, 8]],
        6
    )

    # Test case 2: No box can fit all packages
    validate(
        [2, 3, 5],
        [[1, 4], [2, 3]],
        -1
    )

    # Test case 3: Single package
    validate(
        [5],
        [[6], [5]],
        0
    )

    # Test case 4: Large numbers
    validate(
        [10 ** 5, 10 ** 5],
        [[10 ** 5 + 1], [10 ** 5]],
        0
    )

    # Test case 5: Multiple suppliers with similar boxes
    validate(
        [1, 2, 3],
        [[3, 3, 3], [2, 3, 4], [1, 2, 2, 3]],
        0
    )

    print("All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_min_wasted_space()
