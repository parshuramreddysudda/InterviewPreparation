from typing import List, Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Given a list of integers 'nums' and the head of a linked list,
        remove all nodes from the linked list whose values are present in 'nums'.
        Return the modified linked list.
        """
        # TODO: Implement your logic here
        dummy = ListNode(0)
        dummy.next = head
        temp = head
        prev = dummy
        while temp is not None:
            if temp.val in nums:
                prev.next = temp.next
            else:
                prev = temp
            temp = temp.next

        return dummy.next

# ------------------ Helper Functions ------------------

def build_linked_list(values: List[int]) -> Optional[ListNode]:
    """Builds a linked list from a list of values."""
    dummy = ListNode()
    curr = dummy
    for v in values:
        curr.next = ListNode(v)
        curr = curr.next
    return dummy.next

def linked_list_to_list(head: Optional[ListNode]) -> List[int]:
    """Converts a linked list to a Python list."""
    result = []
    while head:
        result.append(head.val)
        head = head.next
    return result

# ------------------ Test Harness ------------------

def test_modifiedList():
    sol = Solution()

    def validate(nums, lst, expected):
        head = build_linked_list(lst)
        result_head = sol.modifiedList(nums, head)
        result = linked_list_to_list(result_head)
        assert result == expected, f"Failed for nums={nums}, list={lst}. Expected {expected}, got {result}"

    # 🔬 Complex / Edge test cases
    validate([1,2,3], [1,2,3,4,5], [4,5])           # Remove prefix
    validate([2,4], [1,2,3,4,5], [1,3,5])           # Remove middle nodes
    validate([5], [5], [])                          # Remove all nodes
    validate([], [1,2,3], [1,2,3])                  # No removals
    validate([1,2,3], [], [])                       # Empty list
    validate([10,20,30], [10,10,20,30,40,50], [40,50]) # Duplicates and partial removal

    print("✅ All test cases passed!")

# Run tests
if __name__ == "__main__":
    test_modifiedList()
