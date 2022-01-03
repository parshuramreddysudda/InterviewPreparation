package queues;

import java.util.Arrays;

public class ArrayQueue {

	int front = 0, rear = 0;
	int count = 0;
	int[] queue;

	public ArrayQueue(int n) {
		queue = new int[n];
	}

	public void enqueue(int element) {
		if (count == queue.length) {
			System.out.println("Queue is full");
			return;
		}
		queue[rear] = element;
		rear = (rear + 1) % queue.length;
		count++;
	}

	public void dequeue() {
		if (count == 0) {
			System.out.println("Queue is empty");
			return;
		}
		count--;
		queue[front]=0;
		front = (front + 1) % queue.length;
	}

	public void Print() {
		for (int i = 0; i < queue.length; i++)
			System.out.print(queue[i] + " ");
	}

	@Override
	public String toString() {
		return "ArrayQueue [front=" + front + ", last=" + rear + ", queue=" + Arrays.toString(queue) + "]";
	}

}
