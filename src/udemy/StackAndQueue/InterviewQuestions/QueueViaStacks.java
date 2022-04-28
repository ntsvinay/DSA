package udemy.StackAndQueue.InterviewQuestions;

import java.util.Stack;

import udemy.StackAndQueue.StackUsingArray;

public class QueueViaStacks {
	public StackUsingArray enQueueStack;
	public StackUsingArray dequeueStack;
	public Stack enQueueS;
	public Stack deQueueS;

	public QueueViaStacks(int size) {
		enQueueStack = new StackUsingArray(size);
		dequeueStack = new StackUsingArray(size);
	}

	public boolean isFull() {
		return enQueueStack.isFull();
	}

	public void enQueue(int val) {
		if (!enQueueStack.isFull()) {
			enQueueStack.push(val);
		} else {
			System.out.println("aaaaaaaaaa");
		}

	}

	public int deQueue() {
		if (dequeueStack.isEmpty()) {
			int topOfEnqueueStack = enQueueStack.topOfStack;
			while (topOfEnqueueStack >= 0) {
				dequeueStack.push(enQueueStack.pop());
				topOfEnqueueStack = enQueueStack.topOfStack;
			}
			return dequeueStack.pop();
		} else if (dequeueStack.isEmpty() && enQueueStack.isEmpty()) {
			return -1;

		} else {
			return dequeueStack.pop();
		}

	}
	public void enQueueS(int val)
	{
		
		
	}

}
