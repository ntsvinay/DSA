package udemy.StackAndQueue;

import udemy.linkedList.Node;
import udemy.linkedList.SinglyLL;

public class QueueUsingLinkedList {
	public SinglyLL sLl;

	public QueueUsingLinkedList() {
		sLl = new SinglyLL();
	}

	public boolean isEmpty() {
		return sLl.head == null ? true : false;
	}

	public void enQueue(int value) {
		sLl.insertIntoSLL(value, sLl.size + 1);
	}

	public int deQueue() {
		int result = sLl.head.value;
		if (isEmpty()) {
			result = -1;
		} else {
			sLl.deleteFromSLL(0);
		}
		return result;
	}

	public int peek() {
		return sLl.head.value;
	}

	public void deleteQ() {
		sLl.head = null;
	}

	public void traverseQueue() {
		int index = 0;
		Node node = sLl.head;
		while (index < sLl.size) {
			System.out.print(node.value);
			if (index < sLl.size - 1) {
				System.out.print("<-");
			}
			node = node.next;
			index++;
		}
		System.out.println();
	}
}
