class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def deleteMiddle(self, head):
        # ❌ Implement your solution here
        var head = null
        pass


def build_linked_list(arr):
    dummy = ListNode(0)
    curr = dummy

    for num in arr:
        curr.next = ListNode(num)
        curr = curr.next

    return dummy.next


def linked_list_to_list(head):
    result = []

    while head:
        result.append(head.val)
        head = head.next

    return result


def test_deleteMiddle_2095():
    sol = Solution()

    def validate(arr, expected):
        head = build_linked_list(arr)

        result_head = sol.deleteMiddle(head)
        result = linked_list_to_list(result_head)

        assert result == expected, (
            f"❌ Failed for input={arr}. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core examples
    validate([1,3,4,7,1,2,6], [1,3,4,1,2,6])
    validate([1,2,3,4], [1,2,4])
    validate([2,1], [2])

    # 🔬 Edge cases
    validate([1], [])
    validate([1,2], [1])
    validate([1,2,3], [1,3])

    # 🔬 Odd length lists
    validate([1,2,3,4,5], [1,2,4,5])
    validate([10,20,30,40,50,60,70], [10,20,30,50,60,70])

    # 🔬 Even length lists
    validate([1,2,3,4,5,6], [1,2,3,5,6])
    validate([10,20,30,40,50,60], [10,20,30,50,60])

    # 🔬 Repeated values
    validate([5,5,5,5,5], [5,5,5,5])
    validate([1,1,1,1], [1,1,1])

    # 🔬 Negative values
    validate([-1,-2,-3,-4,-5], [-1,-2,-4,-5])

    # 🔬 Large input case
    large = list(range(10001))
    expected = large[:5000] + large[5001:]
    validate(large, expected)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_deleteMiddle_2095()