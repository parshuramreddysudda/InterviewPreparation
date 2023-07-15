package educative.linkedlist;

import java.util.*;
public class ReverseKGroups{

    public static void main(String[] args) {
        LinkedListNode node1=new LinkedListNode(1);
        LinkedListNode head=node1;
        node1.next=new LinkedListNode(2);
        node1=node1.next;
        node1.next=new LinkedListNode(3);
        node1=node1.next;
        node1.next=new LinkedListNode(4);
        node1=node1.next;
        node1.next=new LinkedListNode(5);
        node1=node1.next;
        node1.next=new LinkedListNode(6);
        node1=node1.next;
        node1.next=new LinkedListNode(7);
        node1=node1.next;
        node1.next=new LinkedListNode(8);

        head=reverseKGroups(head,8);
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }


    }
    public static LinkedListNode reverseKGroups(LinkedListNode head, int k) {


        int count=0;
        LinkedListNode curr=head;
        LinkedListNode start=head;
        LinkedListNode last=null;
        LinkedListNode prev=new LinkedListNode(0);
        LinkedListNode finalNode=prev;
        while(curr!=null){
            if(count==k){
                count=0;
                System.out.println(" At execution start is"+start.data);
                reverseList(start,curr);
                prev.next=last;
                prev=start;
                start=curr;
            }
            last=curr;
            curr=curr.next;
            count++;
        }
        if(count==k) {
            reverseList(head, curr);
            return last;
        }
        if(count!=0)
        {
            prev.next=start;
        }

        return finalNode.next;
    }

    public static void reverseList(LinkedListNode head, LinkedListNode end){
        LinkedListNode current=head;
        LinkedListNode next=null;
        LinkedListNode prev=null;
        LinkedListNode temp=head;
        while(temp!=end &&temp!=null){
            System.out.println(" Before execution temp is"+temp.data);
            temp=temp.next;
        }
        while(current!=end && current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

    }
}