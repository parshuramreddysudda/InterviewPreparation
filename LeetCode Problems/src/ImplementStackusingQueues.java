import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {
    public static void main(String[] args) {

        MyStack stac = new MyStack();
        stac.push(1);
        stac.push(2);

        System.out.println(" TOp int is " + stac.top());
        System.out.println(" Last int is " + stac.pop());
        System.out.println(" Last int is " + stac.empty());
    }

}

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int top = 0;

    public MyStack() {

    }

    public void push(int x) {
        q1.offer(x);
        top = x;
    }

    public int pop() {
        if (q1.isEmpty())
            return -1;

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int pop = q1.poll();

        if (q2.isEmpty())
            return pop;

        while (q2.size() > 1) {
            q1.offer(q2.poll());
        }

        top = q2.peek();
        q1.offer(q2.poll());


        return pop;
    }

    public int top() {
        if (q1.isEmpty())
            return -1;

        return top;
    }

    public boolean empty() {

        return q1.isEmpty();
    }
}
