package udemy.StackAndQueue.InterviewQuestions;

public class StackMinReturnOnPushPop {
	public int minElement;
	public int topOfStack;
	public int minElementFlag;
	public int[] arr;
	public int[] minArr;

	public StackMinReturnOnPushPop(int size) {
		// TODO Auto-generated constructor stub
		minElement = 0;
		arr = new int[size];
		minArr = new int[size];
		topOfStack = -1;
	}

	public boolean isFull() {
		return topOfStack == arr.length - 1 ? true : false;
	}

	public boolean isEmpty() {
		return topOfStack == -1 ? true : false;
	}

	public int min() {
		return arr[minArr[minElementFlag]];
	}

	public void push(int val) {
		if (isFull()) {
			System.out.println("Stack us already Full !");
		} else {
			arr[topOfStack + 1] = val;
			topOfStack++;
			if (arr[minArr[minElementFlag]] > val) {
				minArr[++minElementFlag] = topOfStack;
			}
		}
	}

	public int pop() {
		int tempElement = 0;
		if (isEmpty()) {
			tempElement = -1;
			System.out.println("Stack is empty !");
		} else {
			tempElement = arr[topOfStack];
			if (tempElement <= min()) {
				minElementFlag--;
			}
			topOfStack--;
		}
		return tempElement;
	}

	public void traverseStack() {
		if (!isEmpty()) {
			int ind = 0;
			while (ind <= topOfStack) {
				System.out.print(arr[ind]);
				if (ind < topOfStack) {
					System.out.print("->");
				}
				ind++;
			}
			System.out.println();
		}

	}

}
