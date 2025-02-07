from typing import List, Optional
import heapq


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def merge_k_lists(lists: List[Optional[ListNode]]) -> Optional[ListNode]:
    """
    Merges k sorted linked lists into one sorted linked list.

    :param lists: A list of sorted linked lists.
    :return: The head of the merged sorted linked list.
    """

    dummy = ListNode(0)

    heap = []
    listIndex = 0
    while listIndex < len(lists):
        if lists[listIndex] is not None:
            heapq.heappush(heap, (lists[listIndex].val, listIndex, lists[listIndex]))
        listIndex += 1
    count = 0
    num = 0
    head = dummy
    while len(heap) > 0:
        num, listIndex, linkedList  = heapq.heappop(heap)
        dummy.next = linkedList
        dummy = linkedList
        linkedList = linkedList.next
        if linkedList is not None:
            heapq.heappush(heap, (linkedList.val, listIndex, linkedList))

    # Replace this placeholder return statement with your code
    return head.next


# Helper function to create a linked list from a list
def create_linked_list(arr):
    if not arr:
        return None
    head = ListNode(arr[0])
    current = head
    for val in arr[1:]:
        current.next = ListNode(val)
        current = current.next
    return head


# Helper function to print a linked list
def print_linked_list(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    print(result)


# Test cases
if __name__ == "__main__":
    # Test case 1: Three sorted linked lists
    lists1 = [create_linked_list([1, 4, 5]), create_linked_list([1, 3, 4]), create_linked_list([2, 6])]
    print("Test case 1:")
    print_linked_list(merge_k_lists(lists1))
    # Expected output: [1, 1, 2, 3, 4, 4, 5, 6]

    # Test case 2: One empty list
    lists2 = [create_linked_list([]), create_linked_list([2, 3, 4]), create_linked_list([1, 5, 6])]
    print("Test case 2:")
    print_linked_list(merge_k_lists(lists2))
    # Expected output: [1, 2, 3, 4, 5, 6]

    # Test case 3: Only one linked list
    lists3 = [create_linked_list([1, 2, 3])]
    print("Test case 3:")
    print_linked_list(merge_k_lists(lists3))
    # Expected output: [1, 2, 3]

    # Test case 4: No lists provided
    lists4 = []
    print("Test case 4:")
    print_linked_list(merge_k_lists(lists4))
    # Expected output: []

    # Test case 5: Lists with one element each
    lists5 = [create_linked_list([1]), create_linked_list([3]), create_linked_list([2])]
    print("Test case 5:")
    print_linked_list(merge_k_lists(lists5))
    # Expected output: [1, 2, 3]
