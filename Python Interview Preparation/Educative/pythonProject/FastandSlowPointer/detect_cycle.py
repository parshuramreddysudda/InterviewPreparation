import linkedlist

def detect_cycle(head):
    # Replace this placeholder return statement with your code
    if head is None or head.next is None:
        return False
    fast = head.next
    curr = head
    while fast is not None and fast.next is not None:
        if fast == curr:
            return True
        fast = fast.next.next
        curr = curr.next

    return False

print(new := detect_cycle())
