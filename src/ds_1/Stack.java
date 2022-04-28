package ds_1;

import java.util.ArrayList;

public class Stack {

	private int arr[];
	private int top;
	private int cap;

	public Stack(int size) {
		// TODO Auto-generated constructor stub
		arr = new int[size];
		cap = size;
		top = -1;
	}

	private boolean checkOverFlow() {

		return top == cap - 1;
	}

	private boolean checkUnderFlow() {
		return top == -1;
	}

	private String pop() {

		if (checkUnderFlow()) {
			return "stack in empty";
		}
		int dltVal = arr[--top];
		return String.valueOf(dltVal);

	}

	private String push(int value) {
		if (checkOverFlow() != true) {
			arr[++top] = value;
			return value + "-inserted";
		}

		return "stack is full";

	}

	public void printStack() {
		/*
		 * for (int val : arr) { System.out.println(val); }
		 */
		
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String arg[]) {
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printStack();
		stack.pop();
		System.out.println("after pop");
		stack.printStack();

	}

}
