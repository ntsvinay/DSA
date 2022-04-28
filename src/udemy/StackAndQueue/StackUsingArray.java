package udemy.StackAndQueue;

public class StackUsingArray {

	public int[] arr;
	public int topOfStack;

	public StackUsingArray(int size) {
		arr = new int[size];
		topOfStack = -1;

	}

	public boolean isEmpty() {
		return (topOfStack == -1) ? true : false;

	}

	public boolean isFull() {

		return arr == null ? false : ((topOfStack == arr.length - 1) ? true : false);
	}

	public int push(int val) {
		if (isFull() == false) {
			arr[topOfStack + 1] = val;
			return topOfStack++;
		} else {
			System.out.println("Stack is full");
			return -1;
		}
	}

	public int pop() {
		if (isEmpty() == false) {
			int dltVal = arr[topOfStack];
			arr[topOfStack] = 0;
			topOfStack--;
			return dltVal;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}

	}

	public int peek() {
		if (isEmpty()) {
			return -1;

		} else {
			return arr[topOfStack];
		}
	}

	public void deleteStack() {
		arr = null;
		topOfStack = -1;

	}

	public void traverseStack() {
		int i = 0;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		} else {
			for (int val : arr) {
				System.out.print(val);
				if (i < arr.length - 1) {
					System.out.print("->");
				}
				i++;
			}
			System.out.println();
		}

	}
}
