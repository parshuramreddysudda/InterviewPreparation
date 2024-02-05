

# The code in "linked_list.py" can be used to create a linked list out of a list.
# The code in "linked_list_traversal.py" can be used to traverse the linked list.
# The code in "linked_list_reversal.py" can be used to reverse the linked list.

def get_middle_node(head):
    # Replace this placeholder return statement with your code
    if head is None or head.next is None:
        return head
    curr = head
    fast = head.next

    while fast is not None and fast.next is not None:
        fast = fast.next.next
        curr = curr.next
    if fast is None:
        return curr
    return curr.next

