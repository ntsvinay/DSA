package ds_1;

import java.util.Queue;

public class SampleQueue {

	int frant, rear, size;
	int arr[];

	public SampleQueue(int size) {
		// TODO Auto-generated constructor stub
		arr = new int[size];
		this.size = size;
		frant = -1;
		rear = -1;
	}

	boolean queueIsFull() {
		if (frant == 0 && rear == size - 1) {
			return true;
		}
		return false;
	}

	boolean QueueIsEmpty() {
		return frant == -1 ? true : false;
	}

	void enQueue(int val) {
		if (queueIsFull()) {
			System.out.println("queue is full");
		} else {
			if (frant == -1) {
				frant = 0;
				rear++;
				arr[rear] = val;

			} else {
				arr[++rear] = val;
			}

		}

	}

	void deQueue() {

		System.out.println("delete curr pos check---" + frant + "---" + rear);
		if (QueueIsEmpty()) {
			System.out.println("queue is empty");

		} else {
			if (frant >= rear) {
				rear = -1;
				frant = -1;
			} else {
				int flage = 0;
				for (int i = frant; i < rear; i++) {
					arr[i] = arr[i + 1];
					flage = i;
				}
				rear = flage;
				// frant++;
			}
		}

	}

	void printQueue() {
		System.out.println("curr pos--" + frant + "---" + rear);
		for (int i = frant; i <= rear; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		SampleQueue queue = new SampleQueue(5);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.printQueue();
		System.out.println("--after deque--");
		queue.deQueue();
		queue.printQueue();
		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.printQueue();
		queue.deQueue();
		System.out.println("--after deque--1");
		queue.printQueue();

	}

}
