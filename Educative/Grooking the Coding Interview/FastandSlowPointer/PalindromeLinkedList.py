
def palindrome(head):
    slow = fast = head

    while fast is not None and fast.next is not None:
        slow = slow.next
        fast = fast.next.next
    fast = reverse_linked_list(slow)
    while fast is not None:
        if fast.data is not head.data:
            return False

        fast = fast.next
        head = head.next
    return True

# Template for traversing a linked list

def reverse_linked_list(slow_ptr):
    prev = None
    next = None
    curr = slow_ptr
    while curr is not None:
        next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    return prev