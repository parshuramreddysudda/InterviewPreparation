def remove_nth_last_node(head, n):
    # Replace this placeholder return statement with your code
    slow = head
    fast = head

    for _ in range(n + 1):
        if fast:
            fast = fast.next

    while fast:
        slow = slow.next
        fast = fast.next

    slow.next = slow.next.next

    return fast

