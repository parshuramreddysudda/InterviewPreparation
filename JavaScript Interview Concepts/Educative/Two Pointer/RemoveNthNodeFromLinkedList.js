import LinkedList from "./linked_list.js";
import LinkedListNode from "./linked_list_node.js";

function removeNthLastNode(head, n) {

    // Replace this placeholder return statement with your code
    let curr=head;
    let prev=null;
    while(n-->0)
        curr=curr.next;

    let nhead=head;
    while(curr!=null){
        prev=nhead;
        nhead=nhead.next;
        curr=curr.next;
    }

    if(prev==null)
        return head.next;

    prev.next=nhead.next;
    return head;
}

export { removeNthLastNode };