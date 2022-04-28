package udemy.StackAndQueue;

public class ExecutorClassForStack {
	public static void main(String[] args) {
		// StackUsingArray stack = new StackUsingArray(4);
		StackUsingLL stack = new StackUsingLL();
		stack.pop();
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.traverseStack();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.push(60);
		stack.push(70);
		stack.traverseStack();
		// stack.deleteStack();
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		stack.traverseStack();

		// System.out.println(stack.isEmpty() + "---" + stack.isFull());
	}

}
