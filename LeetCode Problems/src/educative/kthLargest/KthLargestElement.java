package educative.kthLargest;

import java.net.Inet4Address;
import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {
//        KthLargest kthLargest=new KthLargest(3,new int[]{4, 5, 8, 2});
//        System.out.println(kthLargest.add(3));
//        System.out.println(kthLargest.add(5));
//        System.out.println(kthLargest.add(10));
//        System.out.println(kthLargest.add(9));
//        System.out.println(kthLargest.add(4));
//        System.out.println(kthLargest.returnKthLargest());
//        System.out.println(reorganizeString("abbb"));
        Point[] pointsOne = new Point[] {
                new Point(1, 3), new Point(3, 4), new Point(2, -1)
        };
        Point[] pointsTwo = new Point[] {
                new Point(1, 3), new Point(2, 4), new Point(2, -1), new Point(-2, 2), new Point(5, 3), new Point(3, -2)
        };
        Point[] pointsThree = new Point[] {
                new Point(1, 3), new Point(5, 3), new Point(3, -2), new Point(-2, 2)
        };
        Point[] pointsFour = new Point[] {
                new Point(2, -1), new Point(-2, 2), new Point(1, 3), new Point(2, 4)
        };
        Point[] pointsFive = new Point[] {
                new Point(1, 3), new Point(2, 4), new Point(2, -1), new Point(-2, 2), new Point(5, 3), new Point(3, -2), new Point(5, 3), new Point(3, -2)
        };
        Point[][] points = {pointsOne, pointsTwo, pointsThree, pointsFour, pointsFive};
        int[] kList = {2, 3, 1, 4, 5};
//        for (int i = 0; i < points.length; i++) {
//
//            System.out.print((i + 1) + ".\tSet of points: ");
//            for (Point p: points[i])
//                System.out.print("[" + p.x + " , " + p.y + "] ");
//            System.out.println("\n\tK: " + kList[i]);
//            List<Point> result = kClosest(points[i], kList[i]);
//            System.out.print("\tHere are the k = " + kList[i] + " points closest to the origin(0, 0): ");
//            for (Point p: result)
//                System.out.print("[" + p.x + " , " + p.y + "] ");
//            System.out.println("\n");
////            System.out.println(PrintHyphens.repeat("-", 100));
//        }

        System.out.println(topKFrequent(new int[]{1,3,5,14,18,14,5},2));
    }
    public static List<Integer> topKFrequent(int[] arr, int k) {

        Map<Integer,Integer> map=new HashMap<>();
        for (int ele:arr)
            map.put(ele,map.getOrDefault(ele,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<Map.Entry<Integer,Integer>>((item1,item2)-> item1.getValue()-item2.getValue());

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(pq.size()>k)
                pq.poll();
            pq.add(entry);
        }

        List<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:pq) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        return list;
    }
    public static String reorganizeHeap(String str){
        Map<Character,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<Map.Entry<Character,Integer>>((item1,item2)->item1.getValue()-item1.getValue());
        return str;
    }
    public static List<Point> kClosest(Point[] points, int k) {

        PriorityQueue<Point> pq=new PriorityQueue<>((a,b)->a.distFromOrigin()-b.distFromOrigin());

        for (int i = 0; i < k; i++)
            pq.add(points[i]);
        for(int i=k;i<points.length;i++){
            if(pq.peek().distFromOrigin()>=points[i].distFromOrigin()){
                pq.poll();
                pq.add(points[i]);
            }
        }

        return new ArrayList<>(pq);
    }
    public static double calculateDistanceBetweenPoints(
            double x1,
            double y1,
            double x2,
            double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
    public static String reorganizeString(String string1) {

        // Replace this placeholder return statement with your code
        int[] ch=new int[26];
        for(Character c:string1.toCharArray())
            ch[c-97]+=1;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<ch.length;i++)
            if(ch[i]>0)
                pq.add(new int[]{i,ch[i]});

        int[] curr=new int[]{};
        int[] prev=pq.poll();
        char[] charArray=new char[string1.length()];
        int index=0;
        while(!pq.isEmpty()){
            curr=pq.poll();
            if(curr==prev)
                return "";
            charArray[index++]=(char)(prev[0]+97);
            prev[1]-=1;
            if(prev[1]>0)
                pq.add(prev);
            prev=curr;
        }
        if(index<charArray.length-1)
            return "";
        charArray[index]=(char)(prev[0]+97);


        return String.valueOf(charArray);
    }
}


class KthLargest {

    // constructor to initialize topKHeap and add values in it
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->a-b);
    int size=0;
    public KthLargest(int k, int[] nums) {
        size=k;
        for(int i=0;i<nums.length;i++)
            add(nums[i]);

        while(pq.size()>k)
            pq.poll();
    }
    // adds element in the topKHeap
    public int add(int val) {
        // Replace this placeholder return statement with your code
        if(pq.size()==size){
            pq.poll();
            pq.add(val);
        }
        else
            pq.add(val);

        return returnKthLargest();

    }
    // returns kth largest element from topKHeap
    public int returnKthLargest() {

        return pq.peek();
    }

}
