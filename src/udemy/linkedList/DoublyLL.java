package udemy.linkedList;

public class DoublyLL {

	public DoublyNode head;
	public DoublyNode tail;
	public int size;

	public DoublyNode createDoublyNodeLL(int nodeValue) {
		DoublyNode node = new DoublyNode();
		node.value = nodeValue;
		node.prev = null;
		node.next = null;
		head = tail = node;
		size++;
		return head;

	}

	public void insertDLL(int nodeVal, int location) {
		if (head == null) {
			createDoublyNodeLL(nodeVal);
			return;

		} else if (location == 0) {
			DoublyNode node = new DoublyNode();
			node.value = nodeVal;
			node.prev = null;
			node.next = head;
			head.prev = node;
			head = node;

		} else if (location >= size) {
			DoublyNode tempNode = new DoublyNode();
			tempNode.value = nodeVal;
			tempNode.next = null;
			tempNode.prev = tail;
			tail.next = tempNode;
			tail = tempNode;

		} else {
			DoublyNode currentNode = head;
			int index = 0;
			while (index < location - 1) {
				currentNode = currentNode.next;
				index++;

			}
			DoublyNode newNode = new DoublyNode();
			newNode.value = nodeVal;
			newNode.next = currentNode.next;
			currentNode.next.prev = newNode;
			newNode.prev = currentNode;
			currentNode.next = newNode;

		}
		size++;

	}

	public void traverseDLL() {

		if (head != null) {
			DoublyNode nodes = head;
			for (int i = 0; i < size; i++) {
				System.out.print(nodes.value);
				nodes = nodes.next;
				if (i < size - 1) {
					System.out.print("->");
				}
			}
			System.out.println();

		}
	}

	public void reverseTraverseDLL() {
		if (head != null) {
			DoublyNode nodes = tail;
			for (int i = size; i > 0; i--) {
				System.out.print(nodes.value);
				nodes = nodes.prev;
				if (i > 1) {
					System.out.print("<-");
				}

			}
			System.out.println();
		}
	}

	public boolean searchNodeInDLL(int nodeVal) {
		if (head != null) {
			DoublyNode node = head;
			for (int i = 0; i < size; i++) {
				if (node.value == nodeVal) {
					System.out.println(nodeVal + " is exist at location : " + i);
					return true;
				}
				node = node.next;

			}

		}
		return false;

	}

	public void deleteNodeFromDLL(int location) {

		if (head == null) {
			return;
		} else if (location == 0) {
			DoublyNode node = head.next;
			head.next.prev = null;
			head = node;
			size--;
			if (size == 0) {
				head = null;
				head.next = null;
				tail = null;
				tail.prev = null;

			}
		} else if (location >= size) {
			DoublyNode tempNode = tail.prev;
			tail.prev.next = null;
			tail = tempNode;
			size--;
			if (size == 0) {
				head = null;
				head.next = null;
				tail = null;
				tail.prev = null;
			}

		} else {
			DoublyNode currentNode = head;
			int index = 0;
			while (index <= location - 1) {
				currentNode = currentNode.next;
			}
			currentNode.next = currentNode.next.next;
			currentNode.next.prev = currentNode;
			size--;

		}

	}

	public void deleteDLL() {

		DoublyNode node = head;
		int index = 0;
		while (index < size) {
			node.prev = null;
			node = node.next;
			index++;

		}
		tail.next = null;
		tail = head = null;

	}

}
