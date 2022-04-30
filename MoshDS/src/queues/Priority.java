package queues;

import static java.lang.System.out;

public class Priority {

    public static void main(String[] args) {

        PriorityQueue pq=new PriorityQueue(10);
        pq.enqueue(45);
        out.println(pq.toString());
        pq.enqueue(565);
        out.println(pq.toString());
        pq.enqueue(3);
        out.println(pq.toString());
        pq.enqueue(4556);
        out.println(pq.toString());
        pq.enqueue(6);
        out.println(pq.toString());
        pq.enqueue(3);
        out.println(pq.toString());

    }

}
