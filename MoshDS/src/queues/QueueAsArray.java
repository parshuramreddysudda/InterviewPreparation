package queues;

public class QueueAsArray {

	public static void main(String[] args) {

		ArrayQueue queue = new ArrayQueue(3);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		System.out.println(queue.toString());
		queue.dequeue();
		queue.enqueue(6);
		System.out.println(queue.toString());
		queue.Print();
	}

}
