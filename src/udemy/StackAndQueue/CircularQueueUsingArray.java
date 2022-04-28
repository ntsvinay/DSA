package udemy.StackAndQueue;

public class CircularQueueUsingArray {
	public int size;
	public int[] arr;
	public int topOfQueue;
	public int beginningOfQueue;

	public CircularQueueUsingArray(int size) {
		this.size = size;
		arr = new int[size];
		topOfQueue = -1;
		beginningOfQueue = -1;
	}

	public boolean isFull() {
		return ((beginningOfQueue == 0 && topOfQueue == size - 1) || topOfQueue + 1 == beginningOfQueue) ? true : false;
	}

	public boolean isEmpty() {
		return topOfQueue == -1 ? true : false;
	}

	public void enQueue(int val) {
		if (isFull()) {
			System.out.println("No..! Queue is already full.");
		} else if (isEmpty()) {
			arr[topOfQueue + 1] = val;
			beginningOfQueue++;
			topOfQueue++;
		} else {
			if (topOfQueue + 1 == size) {
				topOfQueue = 0;
				arr[topOfQueue] = val;
			} else {
				topOfQueue++;
				arr[topOfQueue] = val;
			}

		}
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			int element = arr[beginningOfQueue];
			arr[beginningOfQueue] = 0;
			if (beginningOfQueue == size - 1) {
				beginningOfQueue = 0;
			} else if (beginningOfQueue == topOfQueue) {
				topOfQueue = beginningOfQueue = -1;
			} else {
				beginningOfQueue++;
			}
			return element;
		}
	}

	public int peek() {
		return isEmpty() ? -1 : arr[beginningOfQueue];
	}

	public void deleteCircularQ() {
		arr = null;
	}

	public void traverseQueue() {
		if (!isEmpty()) {
			int index = 0;
			while (index < size) {
				System.out.print(arr[index]);
				if (index < size - 1) {
					System.out.print("<-");

				}
				index++;
			}
			System.out.println();
		}

	}
}
