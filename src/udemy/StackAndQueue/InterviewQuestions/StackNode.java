package udemy.StackAndQueue.InterviewQuestions;

public class StackNode {

	int[] arr;
	int topOfStack;
	int capacity;
	int[] userArrList;
	int arraysFlag;

	public StackNode(int size) {
		this.arr = new int[size];
		this.capacity = size;
		this.topOfStack = -1;
	}

	public boolean isFull() {
		return topOfStack == capacity - 1 ? true : false;
	}

	public boolean isEmpty() {
		return topOfStack == -1 ? true : false;
	}

	public void push(int val) {
		if (!isFull()) {
			arr[topOfStack + 1] = val;
			topOfStack++;
		}
		else {
			
			
		}

	}

	public int pop() {
		if (!isEmpty()) {
			int result = arr[topOfStack];
			arr[topOfStack--] = 0;
			return result;
		} else {
			return -1;
		}
	}

}
