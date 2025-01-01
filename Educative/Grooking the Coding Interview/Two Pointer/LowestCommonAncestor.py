def lowest_common_ancestor(p, q):
    fast = p
    slow = q
    while True:

        fast = fast.parent
        slow = slow.parent
        if fast == None:
            fast = p

        if slow == None:
            slow = q

        if fast == slow:
            return fast

    return p
