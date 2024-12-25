from LinkedList import LinkedList


def detect_cycle(head) -> bool:
    # Replace this placeholder return statement with your code
    return False

# Test cases
if __name__ == "__main__":
    # Helper function to create a cycle in the linked list
    def create_cycle(linked_list, pos):
        if pos == -1:
            return
        cycle_start_node = None
        current = linked_list.head
        idx = 0
        while current.next:
            if idx == pos:
                cycle_start_node = current
            current = current.next
            idx += 1
        current.next = cycle_start_node

    # Test case 1: List with no cycle
    ll1 = LinkedList()
    ll1.insert_node_at_head(1)
    ll1.insert_node_at_head(2)
    ll1.insert_node_at_head(3)
    print("Test case 1:", detect_cycle(ll1.head))  # Expected output: False

    # Test case 2: List with a cycle
    ll2 = LinkedList()
    ll2.insert_node_at_head(1)
    ll2.insert_node_at_head(2)
    ll2.insert_node_at_head(3)
    create_cycle(ll2, 1)
    print("Test case 2:", detect_cycle(ll2.head))  # Expected output: True

    # Test case 3: Empty list
    ll3 = LinkedList()
    print("Test case 3:", detect_cycle(ll3.head))  # Expected output: False

    # Test case 4: Single node, no cycle
    ll4 = LinkedList()
    ll4.append(1)
    print("Test case 4:", detect_cycle(ll4.head))  # Expected output: False

    # Test case 5: Single node with a cycle
    ll5 = LinkedList()
    ll5.append(1)
    create_cycle(ll5, 0)
    print("Test case 5:", detect_cycle(ll5.head))  # Expected output: True
