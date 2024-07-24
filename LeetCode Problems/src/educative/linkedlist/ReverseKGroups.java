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
//        node1=node1.next;
//        node1.next=new LinkedListNode(8);

//        head=reverseGroup(head,1,2);
        head=swapNodes(head,6);
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }


    }

    public static LinkedListNode swapNodes(LinkedListNode head, int k) {

        int count=1;
        LinkedListNode fast=head;
        while (fast!=null && count!=k){
            count+=1;
            fast=fast.next;
        }
        LinkedListNode tempFast=fast;
        LinkedListNode slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int temp=tempFast.data;
        tempFast.data= slow.data;;
        slow.data=temp;
//        System.out.println("Count is "+count);

        return head;
    }

    public static LinkedListNode reorderList(LinkedListNode head) {
        // Write your code here
        if(head==null || head.next==null)
            return head;

        LinkedListNode slow=head;
        LinkedListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        LinkedListNode current=slow;
        slow=head;
        LinkedListNode next=null;
        LinkedListNode prev=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        LinkedListNode cnext;
       current=prev;
        while (slow!=null) {
            next = slow.next;
            slow.next = current;
            slow=next;
            cnext = current.next;
            current.next = next;
            current = cnext;
        }
        return head;
    }

    public static LinkedListNode reverseGroup(LinkedListNode head,int left,int right){

        if(left-right==0)
                return head;

        LinkedListNode dummy=new LinkedListNode(0);
        dummy.next=head;
        LinkedListNode temp=dummy;
        LinkedListNode leftNode=head;
        int count=left;
        while(left-->1 && leftNode!=null) {
            dummy=dummy.next;
            leftNode = leftNode.next;
        }
        LinkedListNode[] reverse=reverseLinkedList(leftNode,right,count);
        LinkedListNode prev=reverse[0];
        LinkedListNode curr=reverse[1];
        leftNode.next=curr;
        dummy.next=prev;

        return temp.next;
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

    static LinkedListNode[] reverseLinkedList(LinkedListNode node, int k,int start){

        LinkedListNode previous = null;
        LinkedListNode current = node;
        LinkedListNode next = null;

        for (int i = start; i <=k; i++) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return new LinkedListNode[]{previous,current};
    }
    public static LinkedListNode reverseList(LinkedListNode head, LinkedListNode end){
        LinkedListNode current=head;
        LinkedListNode next=null;
        LinkedListNode prev=null;
        while(current!=end && current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return current;
    }
}