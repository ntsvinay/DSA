package udemy.linkedList;

public class CircularDLL {

	public DoublyNode head;
	public DoublyNode tail;
	public int size;

	public DoublyNode createDCLL(int nodeVal) {
		DoublyNode node = new DoublyNode();
		node.value = nodeVal;
		node.next = node;
		node.prev = node;
		head = node;
		tail = node;
		size++;
		return head;

	}

	public void insertInCDLL(int val, int location) {
		if (head == null) {
			createDCLL(val);
			return;

		} else if (location == 0) {
			DoublyNode node = new DoublyNode();
			node.value = val;
			node.next = head;
			node.prev = tail;
			head.prev = node;
			head = node;
			tail.next = node;

		} else if (location >= size) {
			DoublyNode node = new DoublyNode();
			node.value = val;
			node.prev = tail;
			node.next = head;
			tail.next = node;
			head.prev = node;
			tail = node;

		} else {

			DoublyNode node = new DoublyNode();
			node.value = val;
			DoublyNode currentNode = head;
			int index = 0;
			while (index < location - 1) {
				currentNode = currentNode.next;
				index++;
			}
			node.next = currentNode.next;
			node.prev = currentNode;
			currentNode.next.prev = node;
			currentNode.next = node;

		}
		size++;
	}

	public void traverseCDLL() {
		if (head != null) {
			DoublyNode node = head;
			int index = 0;
			while (index < size) {
				System.out.print(node.value);
				if (index < size - 1) {
					System.out.print("->");
				}
				node = node.next;
				index++;

			}
			System.out.println();
		}

	}

	public void reverseTraverseCDLL() {
		if (head != null) {
			DoublyNode node = tail;
			int index = size;
			while (index > 0) {
				System.out.print(node.value);
				if (index > 1) {
					System.out.print("<-");
				}
				node = node.prev;
				index--;

			}
			System.out.println();
		}
	}

	public boolean searchInCDLL(int value) {
		if (head != null) {
			DoublyNode node = head;
			int index = 0;
			while (index < size) {
				if (node.value == value) {
					System.out.println(value + " is exist @ location " + index);
					return true;
				}
				index++;
				node = node.next;

			}
		}
		System.out.println(value + " is not exist");
		return false;

	}

	public void deleteFromCDLL(int location) {
		if (head == null) {
			return;
		} else if (location == 0) {
			DoublyNode node = head;
			head = head.next;
			head.prev = tail;
			tail.next = head;
			size--;
			if (size == 0) {
				head.next = null;
				tail.prev = null;
				head = tail = null;

			}

		} else if (location >= size) {
			tail = tail.prev;
			tail.next = head;
			head.prev = tail;
			size--;
			if (size == 0) {
				head.next = null;
				tail.prev = null;
				tail = head = null;

			}

		} else {
			DoublyNode currentNode = head;
			int index = 0;
			while (index <location - 1) {
				currentNode = currentNode.next;
				index++;

			}
			currentNode.next = currentNode.next.next;
			currentNode.next.prev = currentNode;
			size--;

		}

	}
}
