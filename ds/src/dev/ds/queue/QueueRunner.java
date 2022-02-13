package dev.ds.queue;

public class QueueRunner {

	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		queue.size();
		queue.show();

		queue.dequeue();
		queue.dequeue();

		queue.size();
		queue.show();

		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);

		queue.size();
		queue.show();
	}

}

class Queue {

	int capacity = 5;
	int queue[] = new int[capacity];
	int size;
	int front;
	int rear;

	public void enqueue(int data) {

		if (capacity == size) {
			System.out.println("Queue is full");
		} else {
			queue[rear] = data;
			rear = (rear + 1) % capacity;
			size++;
			System.out.println("enqueued " + data);
		}

	}

	public void dequeue() {

		if (size == 0) {
			System.out.println("Queue is empty");
		} else {
			int data = queue[front];
			front = (front + 1) % capacity;
			size--;
			System.out.println("dequeued " + data);
		}
	}

	public void size() {

		System.out.println("size : " + size);
	}

	public void show() {

		//System.out.println("front : " + front);
		//System.out.println("rear : " + rear);
		System.out.println("Elements in queue : ");

		for (int i = 0; i < size; i++) {

			System.out.print(queue[(front + i) % capacity] + " ");

		}
		System.out.println("\n");
	}

}
