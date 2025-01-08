def swap(temp, slowPointer):
    pass


def swap_nodes(head, k):
    # Replace this placeholder return statement with your code
    slow = 1
    fast = 1
    temp = head

    while fast < k:
        fast += 1
        temp = temp.next
    fastPointer = temp
    slowPointer = head

    while fastPointer.next is not None:
        fastPointer = fastPointer.next
        slowPointer = slowPointer.next
    swap(temp, slowPointer)
    return head
