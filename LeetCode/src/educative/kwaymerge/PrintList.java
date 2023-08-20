package educative.kwaymerge;

import educative.linkedlist.LinkedListNode;

// Template for printing the linked list with forward arrows
class PrintList
{
    public static void printListWithForwardArrow(LinkedListNode head)
    {
        LinkedListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data); // print node value
            temp = temp.next;
            if (temp != null) {
                System.out.print(" → ");
            }
        }
        // if this is the last node, print null at the end
        System.out.print(" → null ");
    }
}