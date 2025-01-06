

def reverse_k_groups(head, k):
    temp = head
    start = head
    end = head
    finalHead = None
    while start is not None:
        while end is not None and k is not None:
            k -= 1
            end = end.next
        start = reverse(start, end)
        end = start
    if finalHead is None:
        head = start
    print_linked_list(start)

    return head


def reverse(head, last):
    prev = None
    cur = head

    while cur is not last:
        next = cur.next
        cur.next = prev
        prev = cur
        cur = next

    print_linked_list(cur)
    head.next = cur
    head = prev
    return head


def print_linked_list(head):
    current = head
    while current is not None:
        print(current.data, end=" -> ")
        current = current.next
    print("None")
