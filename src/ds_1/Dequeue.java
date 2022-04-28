package ds_1;

public class Dequeue {

	int arr[], size, front, rear, cap;

	public Dequeue(int size) {
		// TODO Auto-generated constructor stub

		arr = new int[size];
		front = rear = -1;
		this.cap = size - 1;
		this.size = size;
	}

	boolean isFull() {
		return front == 0 && rear == cap || front == rear + 1 ? true : false;

	}

	boolean isEmpty() {
		return rear == -1 && front == -1 ? true : false;
	}

	void insertFront(int val) {
		if (isFull()) {
			System.out.println("Queue is full");
		}
		if (front == -1) {
			rear = 0;
			front = 0;
		} else if (front == 0) {
			front = cap;
		} else {
			front = front - 1;
		}
		arr[front] = val;
		System.out.println("inserted-" + val);

	}

	void insertRear(int val) {
		if (isFull()) {
			System.out.println("Queue is full");
		}
		if (rear == cap) {
			rear = 0;
		} else if (rear == -1 && front == -1) {
			rear = front = 0;
		} else {
			rear++;
		}
		arr[rear] = val;
		System.out.println("inserted-" + val);

	}

	void deleteFront() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		if (front == rear) {
			front = rear = -1;
		} else if (front == cap) {
			front = 0;
		} else {
			front++;
		}

	}

	void deleteRear() {
		if (isEmpty()) {
			System.out.println("Queue is full");
		}
		if (rear == front) {
			front = rear = -1;
		} else if (rear == 0) {
			rear = cap;
		} else {
			rear--;
		}
	}

	void print() {
		int i = front;
		while (i != rear) {
			System.out.println("value-" + arr[i]);
			i = (i + 1) % size;
		}
		System.out.println("value-" + arr[i]);

	}

	public static void main(String[] args) {
		Dequeue dq = new Dequeue(5);
		dq.insertFront(1);
		dq.insertFront(2);
		dq.insertFront(3);
		dq.print();
		dq.deleteFront();
		dq.insertRear(4);
		dq.print();
		dq.deleteRear();
		System.out.println("----");
		dq.print();
	}

}
