package queues;

import java.util.Arrays;

import static java.lang.System.out;

public class PriorityQueue {
    int front = 0, rear = 0;
    int count = 0;
    int[] queue;

    public PriorityQueue(int n) {
        queue = new int[n];
    }

    public void enqueue(int element) {
        if (count == queue.length) {
            out.println("Queue is full");
            return;
        }
        for (int position = rear; position >= 0; position--) {

            if (position == 0) {
                queue[position] = element;
                break;
            }
//            out.println("Queue Position value is  " + queue[position] + " Postion is " + position + " Elemetn is  " + element);
            if (element < queue[position - 1]) {
                out.println("Executed");
                queue[position + 1] = queue[position];
            } else {
                queue[position] = element;
                break;
            }


        }
        rear++;

//            queue[rear] = element;
//            rear = (rear + 1) % queue.length;
//            count++;
    }

    public void dequeue() {
        if (count == 0) {
            out.println("Queue is empty");
            return;
        }
        count--;
        queue[front] = 0;
        front = (front + 1) % queue.length;
    }

    public void Print() {
        for (int i = 0; i < queue.length; i++)
            out.print(queue[i] + " ");
    }

    @Override
    public String toString() {
        return "ArrayQueue [front=" + front + ", last=" + rear + ", queue=" + Arrays.toString(queue) + "]";
    }
}
