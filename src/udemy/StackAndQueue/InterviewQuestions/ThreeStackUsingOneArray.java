package udemy.StackAndQueue.InterviewQuestions;

public class ThreeStackUsingOneArray {
	int numberOfStack = 3;
	int capacityOfStack;
	int[] size;
	int[] values;

	public ThreeStackUsingOneArray(int size) {
		this.capacityOfStack = size;
		this.size = new int[numberOfStack];
		this.values = new int[numberOfStack * size];
	}

	public boolean isFull(int stackNum) {
		return size[stackNum] == capacityOfStack ? true : false;
	}

	public boolean isEmpty(int stackNum) {
		return size[stackNum] == 0 ? true : false;
	}

	public int topOfStack(int stackNum) {
		int offSet = stackNum * capacityOfStack;
		int sizePointer = size[stackNum];
		return offSet + sizePointer - 1;
	}

	public void push(int val, int stackNum) {
		if (isFull(stackNum)) {
			System.out.println("stack is full");
		} else {
			int topValue = topOfStack(stackNum);
			size[stackNum]++;
			values[++topValue] = val;
		}
	}

	public int pop(int stackNum) {
		int result = 1;
		if (isEmpty(stackNum)) {
			System.out.println("stack is empty");
		} else {
			int index = topOfStack(stackNum);
			result = values[index];
			values[index--] = 0;
			size[stackNum]--;
		}
		return result;
	}

	public int peek(int stackNum) {
		int result = 1;
		if (isEmpty(stackNum)) {
			System.out.println("Stack is empty");
		} else {
			int index = topOfStack(stackNum);
			result = values[index];
		}
		return result;
	}

	public void traverseStack(int stackNum) {
		int beginIndex = stackNum * values.length / capacityOfStack;
		int lastIndex = beginIndex + capacityOfStack - 1;
		for (int i = beginIndex; i <= lastIndex; i++) {
			System.out.print(values[i]);
			if (i < lastIndex) {
				System.out.print("->");
			}
		}
		System.out.println();

	}

}
