package udemy.StackAndQueue;

import udemy.linkedList.Node;
import udemy.linkedList.SinglyLL;

public class StackUsingLL {
	SinglyLL sLL;

	public StackUsingLL() {
		sLL = new SinglyLL();
	}

	public void push(int val) {
		if (sLL == null) {
			return;
		} else {
			sLL.insertIntoSLL(val, 0);
		}

	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			int val = sLL.head.value;
			sLL.deleteFromSLL(0);
			return val;

		}
	}

	public boolean isEmpty() {
		return sLL.head == null ? true : false;
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		} else {
			return sLL.head.value;

		}
	}

	public void traverseStack() {
		Node node = sLL.head;
		int index = 0;
		while (index < sLL.size) {
			System.out.print(node.value);
			if (index < sLL.size - 1) {
				System.out.print("->");
			}
			index++;
			node = node.next;

		}
		System.out.println();

	}

	public void deleteStack() {
		if (sLL != null) {
			sLL.head = null;
		}
	}

}
