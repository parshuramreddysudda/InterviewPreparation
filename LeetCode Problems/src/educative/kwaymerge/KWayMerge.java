package educative.kwaymerge;

import educative.linkedlist.LinkedListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.List;
import java.util.HashMap;

public class KWayMerge {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4,0,0,0};
        int[] arr2=new int[]{4,6,7};
//        merge(arr1,4,arr2,3);

//        System.out.println(Arrays.toString(arr1));
        List<List<List<Integer>>> lists = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(2, 6, 8),
                        Arrays.asList(3, 6, 10),
                        Arrays.asList(5, 8, 11)
                ),
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5),
                        Arrays.asList(6, 7, 8, 15),
                        Arrays.asList(10, 11, 12, 13),
                        Arrays.asList(5, 10)
                ),
                Arrays.asList(
                        Arrays.asList(),
                        Arrays.asList(),
                        Arrays.asList()
                ),
                Arrays.asList(
                        Arrays.asList(1, 1, 3, 8),
                        Arrays.asList(5, 5, 7, 9),
                        Arrays.asList(3, 5, 8, 12)
                ),
                Arrays.asList(
                        Arrays.asList(5, 8, 9, 17),
                        Arrays.asList(),
                        Arrays.asList(8, 17, 23, 24)
                )
        );

        int[] k = {5, 50, 7, 4, 8};

        // loop to execute till the length of list k
//        for (int i = 0; i < k.length; i++) {
//            System.out.println(i + 1 + ".\t Input lists: " + lists.get(i) +
//                    "\n\t K = " + k[i] +
//                    "\n\t " + k[i] + "th smallest number from the given lists is: " +
//                    kSmallestNumber(lists.get(i), k[i]));
//            System.out.println(new String(new char[100]).replace('\0', '-'));
//        }

        int[][]list1 = {{2, 8, 9},
                {1, 2, 300},
                {1, 1, 2},
                {4, 6},
                {4, 7, 9},
                {1, 1, 2}
        };

        int[][]list2 = {
                {1, 3, 6},
                {1, 11, 20, 35, 300},
                {1, 2, 3},
                {2, 3},
                {4, 7, 9},
                {1}
        };
        k = new int[]{9, 30, 1, 2, 5, 4};
//        for(int i=0; i<k.length; i++){
//            List<List<Integer>> result = kSmallestPairs(list1[i], list2[i], k[i]);
//            System.out.print(i+1);
//            System.out.println(".\tInput lists: "+Arrays.toString(list1[i])+ ", "+ Arrays.toString(list2[i]));
//            System.out.println("\tK = "+k[i]);
//            System.out.print("\tPairs with smallest sum are: "+ result);
//            System.out.println("\n");
////            System.out.println(PrintHyphens.repeat("-", 100));
//        }
        List<List<List<Integer>>> inputLists = Arrays.asList(
                Arrays.asList(Arrays.asList(21, 23, 42), Arrays.asList(1, 2, 4)),
                Arrays.asList(Arrays.asList(11, 41, 51), Arrays.asList(21, 23, 42)),
                Arrays.asList(Arrays.asList(2), Arrays.asList(1, 2, 4), Arrays.asList(25, 56, 66, 72)),
                Arrays.asList(Arrays.asList(11, 41, 51), Arrays.asList(2), Arrays.asList(2), Arrays.asList(2), Arrays.asList(1, 2, 4)),
                Arrays.asList(Arrays.asList(10, 30), Arrays.asList(15, 25), Arrays.asList(1, 7), Arrays.asList(3, 9), Arrays.asList(100, 300), Arrays.asList(115, 125), Arrays.asList(10, 70), Arrays.asList(30, 90))
        );
        for (int i = 0; i<inputLists.size(); i++) {
            System.out.println("\n"+(i + 1) + ".\tInput lists:");
            List<LinkedList> llList = new ArrayList<>();
            for (List x: inputLists.get(i)) {
                LinkedList a = new LinkedList();
                a.createLinkedList(x);
                llList.add(a);
                System.out.print("\t");
                PrintList.printListWithForwardArrow(a.head);
                System.out.println();
            }
            System.out.print("\tMerged list: \n\t");
            PrintList.printListWithForwardArrow(mergeKLists(llList));
//            System.out.println("\n" + PrintHyphens.repeat("-", 100));
        }

    }

    private static List<List<Integer>> kSmallestPairs(int[] list2, int[] list1, int k) {

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<list2.length;i++)
            pq.add(new int[]{list1[0]+list2[i],0,i});

        int sum=0,index1=0,index2=0;
        while(!pq.isEmpty()){
            int[] arr=pq.poll();

            index1=arr[1];
            index2=arr[2];
            list.add(Arrays.asList(list1[index1],list2[index2]));
            if(index1+1<list1.length)
                for(int i=0;i<list2.length;i++)
                    pq.add(new int[]{list1[index1+1]+list2[i],index1+1,i});
        }
        return list;
    }
    public static LinkedListNode mergeKLists(List<LinkedList> lists) {

        LinkedListNode mainNode=new LinkedListNode(0);
        LinkedListNode head=lists.get(0).head;
        int index=1;
        while(index<lists.size()){
            LinkedListNode secondHead=lists.get(index++).head;
            mainNode=new LinkedListNode(0);
            LinkedListNode temp=mainNode;
            while(secondHead!=null && head!=null){
                if(secondHead.data<head.data) {
                    mainNode.next = secondHead;
                    mainNode=mainNode.next;
                    secondHead=secondHead.next;
                }else {
                    mainNode.next=head;
                    mainNode=mainNode.next;
                    head=head.next;
                }
            }
            if(head!=null)
                mainNode.next=head;
            else
                mainNode.next=secondHead;

            head=temp.next;
            mainNode=temp;
        }
        return mainNode.next;
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1=nums1.length-1;
        m--;n--;
        while(m>=0 && n>=0){
            if(nums1[m]>nums2[n]){
                nums1[p1--]=nums1[m--];
            }else{
                nums1[p1--]=nums2[n--];
            }
        }

        while(n>=0){
            nums1[p1--]=nums2[n--];
        }
    }
    public static int kSmallestNumber(List<List<Integer>> lists, int k){

        int num=0;
        int listIndex=0;
        int numIndex=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int i=0;i<lists.size();i++){
            //Number, ListIndex, NumIndex
            if(lists.get(i).size()>0)
                pq.add(new int[]{lists.get(i).get(0),i,0});
        }

        while(!pq.isEmpty()){
            int[] arr=pq.poll();
            num=arr[0];
            listIndex=arr[1];
            numIndex=arr[2];
            if(--k==0)
                return num;

            if(numIndex+1<lists.get(listIndex).size())
                pq.add(new int[]{lists.get(listIndex).get(numIndex+1),listIndex,numIndex+1});

        }
        return num;
    }

}
