from typing import Optional, List

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def insertionSortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Sorts a singly linked list using insertion sort algorithm.
        Returns the head of the sorted linked list.
        """
        # TODO: Implement insertion sort for linked list here

        if not head:
            return head
        dum = ListNode(0)
        dum.next = ListNode(head.val)
        head = head.next

        while head is not None:
                tmp = dum
                while tmp.next is not None and tmp.next.val <= head.val:
                    tmp = tmp.next

                curTemp = tmp.next
                tmp.next = ListNode(head.val)
                tmp.next.next = curTemp

                head = head.next
        return dum.next

# ------------------ Helper Functions ------------------

def build_linked_list(values: List[int]) -> Optional[ListNode]:
    if not values:
        return None
    dummy = ListNode(0)
    current = dummy
    for val in values:
        current.next = ListNode(val)
        current = current.next
    return dummy.next

def linked_list_to_list(head: Optional[ListNode]) -> List[int]:
    result = []
    current = head
    while current:
        result.append(current.val)
        current = current.next
    return result

# ------------------ Test Harness ------------------

def test_insertionSortList():
    sol = Solution()

    def validate(values, expected):
        head = build_linked_list(values)
        result = sol.insertionSortList(head)
        result_list = linked_list_to_list(result)
        assert result_list == expected, f"Failed for input={values}. Expected {expected}, got {result_list}"

    # 🔬 Complex / Edge test cases
    validate([4,2,1,3], [1,2,3,4])          # Standard unsorted list
    validate([-1,5,3,4,0], [-1,0,3,4,5])    # With negatives
    validate([1,2,3,4], [1,2,3,4])          # Already sorted
    validate([4,3,2,1], [1,2,3,4])          # Reverse sorted
    validate([1], [1])                      # Single node
    validate([], [])                        # Empty list

    print("✅ All test cases passed!")

# Run tests
if __name__ == "__main__":
    test_insertionSortList()
