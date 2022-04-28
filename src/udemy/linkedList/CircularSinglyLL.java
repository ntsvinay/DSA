package udemy.linkedList;

public class CircularSinglyLL {

	public Node head;
	public Node tail;
	public int size;

	public Node createCircularSinglyLL(int val) {
		// head=new Node();
		Node node = new Node();
		node.value = val;
		node.next = node;
		head = node;
		head.next = node;
		tail = node;
		size = 1;
		return head;

	}

	public void insertCircularSinglyLL(int val, int location) {

		Node node = new Node();
		node.value = val;
		if (head == null) {
			createCircularSinglyLL(val);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
			tail.next = head;
		} else if (location >= size) {
			tail.next = node;
			tail = node;
			tail.next = head;
		} else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			node.next = tempNode.next;
			tempNode.next = node;

		}
		size++;
	}

	public void traverseCSLL() {

		if (head == null) {
			return;
		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print("->");

				}
				tempNode = tempNode.next;

			}
		}
	}

	public boolean searchNodeInCSLL(int nodeValue) {
		if (head != null) {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				if (nodeValue == tempNode.value) {
					System.out.println(nodeValue + " is exist");
					return true;
				}
				tempNode = tempNode.next;

			}

		}
		System.out.println(nodeValue + " is not exist");
		return false;

	}

	public void deleteNodeFromCSLL(int location) {
		if (head == null) {
			return;
		} else if (location == 0) {
			Node tempNode = head.next;
			head = tempNode;
			tail = tempNode;
			size--;
			if (size == 0) {
				head = null;
				tail = null;
				head.next = null;
			}

		} else if (location > size) {
			Node tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.next;

			}
			if (tempNode == head) {
				head = null;
				head.next = null;
				tail = null;
				return;
			}
			tempNode.next = head;
			tail = tempNode;
			size--;

		} else {
			Node tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;

		}

	}

	public void deleteCSLL() {
		if (head == null) {

		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				tempNode = tempNode.next;

			}
			head = null;
			tempNode.next = null;
			tail = null;

		}
	}
}
