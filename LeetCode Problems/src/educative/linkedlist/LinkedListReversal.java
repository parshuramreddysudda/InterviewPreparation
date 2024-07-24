package educative.linkedlist;

class LinkedListReversal{
    static LinkedListNode reverseLinkedList(LinkedListNode node){
        LinkedListNode prev = null;
        LinkedListNode current = node;
        LinkedListNode next = null;

        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}


