package udemy.StackAndQueue;

public class QueueUsingArray {

	public int[] arr;
	public int topOfQueue;
	public int beginningOfQueue;

	public QueueUsingArray(int size) {
		arr = new int[size];
		topOfQueue = -1;
		beginningOfQueue = -1;
	}

	public boolean isEmpty() {
		return beginningOfQueue == -1 || beginningOfQueue == arr.length - 1 ? true : false;
	}

	public boolean isFull() {
		return topOfQueue == arr.length - 1 ? true : false;
	}

	public void enQueue(int val) {
		if (isFull()) {
			System.out.println("No! space for enque new element in queue.");
			return;
		} else if (isEmpty()) {
			arr[topOfQueue + 1] = val;
			topOfQueue++;
			beginningOfQueue = 0;
		} else {
			arr[++topOfQueue] = val;
		}

	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("No...! queue is already emppty.");
			return -1;
		} else {
			int result = arr[beginningOfQueue];
			beginningOfQueue++;
			if (beginningOfQueue > topOfQueue) {
				beginningOfQueue = topOfQueue = -1;
			}
			return result;
		}

	}

	public int peek() {
		return isEmpty() ? -1 : arr[beginningOfQueue];
	}

	public void deleteQ() {
		arr = null;
	}

	public void traverseQueue() {
		if (arr != null && !isEmpty()) {
			int index = beginningOfQueue;
			while (index <= topOfQueue) {
				System.out.print(arr[index]);
				if (index < arr.length - 1) {
					System.out.print("<-");
				}
				index++;

			}
			System.out.println();

		} else {
			System.out.println("queue is empty");
		}
	}
}
