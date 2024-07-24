package educative.linkedlist;

class LinkedListTraversal{
    static void traverseLinkedList(LinkedListNode head){
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data); // print node value
            temp = temp.next;
        }
    }
}