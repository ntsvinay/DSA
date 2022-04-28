package ds_1;

public class CircularQueue {
	int rear, front, size, cap;
	int arr[];

	public CircularQueue(int size) {
		// TODO Auto-generated constructor stub
		arr = new int[size];
		rear = -1;
		front = -1;
		this.size = size;
		this.cap = size - 1;
	}

	boolean isFull() {
		if (rear + 1 == front) {
			return true;
		} else if (rear == cap && front == 0) {
			return true;
		} else {
			return false;
		}
		// return rear + 1 == front ? true : rear == size && front == 0 ? true : false;
	}

	boolean isEmpty() {
		return rear == -1 && front == -1 ? true : false;

	}

	void enQueue(int val) {
		if (isFull()) {
			System.out.println("queue is full");
		} else {
			if (front == -1) {
				front = 0;
				rear++;
				arr[rear] = val;
				System.out.println("enQueued-" + arr[rear]);
			} else {
				rear = (rear + 1) % size;
				arr[rear] = val;
				System.out.println("enQueued-" + arr[rear]);

			}
		}

	}

	void deQueue() {

		if (isEmpty()) {
			System.out.println("queue is empty");

		} else {
			int ind = arr[front];
			if (front == rear) {
				front = -1;
				rear = -1;
				System.out.println(ind);
			} else {
				front = (front + 1) % size;
				System.out.println("deQueued-" + ind);
			}

		}

	}

	void printQueue() {
		int i;
		for (i = front; i != rear; i = (i + 1) % size) {
			System.out.println("print Full Queue-" + arr[i]);

		}
		System.out.println("print Full Queue-" + arr[i]);
	}

	public static void main(String[] args) {
		CircularQueue cQueue = new CircularQueue(5);
		cQueue.enQueue(1);
		cQueue.printQueue();
		cQueue.enQueue(2);
		cQueue.enQueue(3);
		cQueue.enQueue(4);
		cQueue.enQueue(5);
		cQueue.enQueue(6);
		cQueue.printQueue();
		cQueue.deQueue();
		cQueue.printQueue();
		cQueue.enQueue(6);
		cQueue.printQueue();

	}

}
