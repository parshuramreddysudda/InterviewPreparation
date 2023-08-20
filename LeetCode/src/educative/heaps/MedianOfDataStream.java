package educative.heaps;

import java.util.PriorityQueue;

class MedianFinder {

    static PriorityQueue<Integer> pqSmall =new PriorityQueue<>((x, y) -> Integer.compare(y, x));
    static PriorityQueue<Integer>  pqLarge=new PriorityQueue<>();
    public MedianFinder() {

    }

    public static void addNum(int num) {
        if(pqSmall.size()==0){
            pqSmall.add(num);
            return;
        }
        if(num>pqSmall.peek())
            pqLarge.add(num);
        else
            pqSmall.add(num);

        //Balance trees

        if(pqLarge.size()>=pqSmall.size()+1)
            pqSmall.add(pqLarge.poll());
        else if (pqSmall.size()>pqLarge.size()+1)
            pqLarge.add(pqSmall.poll());


    }

    public static double findMedian() {
        if(pqLarge.size()==0)
            return pqSmall.peek();

        if(pqLarge.size()==pqSmall.size())
            return (double) (pqLarge.peek() + pqSmall.peek()) /2;
        else
            return pqSmall.peek();

    }

    public static void main(String[] args) {
        MedianFinder.addNum(1);
        MedianFinder.addNum(2);
        System.out.println(MedianFinder.findMedian());
        MedianFinder.addNum(3);
        System.out.println(MedianFinder.findMedian());
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */