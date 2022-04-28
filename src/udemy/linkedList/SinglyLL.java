package udemy.linkedList;

public class SinglyLL {

	public Node head;
	public Node tail;
	public int size;

	public Node createSLL(int value) {
		Node node = new Node();
		node.value = value;
		node.next = null;
		head = node;
		head.next = node;
		tail = node;
		size = 1;
		return head;

	}

	public void insertIntoSLL(int val, int location) {
		if (head == null) {
			createSLL(val);
			return;
		} else if (location == 0) {
			Node node = new Node();
			node.value = val;
			node.next = head;
			head = node;

		} else if (location >= size) {
			Node node = new Node();
			node.value = val;
			node.next = null;
			tail.next = node;
			tail = node;

		} else {
			Node node = new Node();
			node.value = val;
			Node crtNode = head;
			int index = 0;
			while (index < location - 1) {
				crtNode = crtNode.next;
				index++;

			}
			node.next = crtNode.next;
			crtNode.next = node;

		}
		size++;

	}

	public void traverseSLL() {
		Node tempNode = head;
		int index = 0;
		while (index < size) {
			System.out.print(tempNode.value);
			if (index < size - 1) {
				System.out.print("->");
			}
			tempNode = tempNode.next;
			index++;

		}
		System.out.println();
	}

	public boolean searchInSLL(int val) {
		if (head != null) {
			int index = 0;
			Node tempNode = head;
			while (index < size) {
				if (tempNode.value == val) {
					System.out.println(val + " is exist at index " + index);
					return true;

				}
				index++;
				tempNode = tempNode.next;

			}
		}
		System.out.println(val + " is not  exist in LL");
		return false;

	}

	public void deleteFromSLL(int location) {
		if (head == null) {
			return;
		} else if (location == 0) {
			head = head.next;
			size--;
			if (size == 0) {
				head = null;
				tail = null;

			}

		} else if (location > size) {

			int index = 0;
			Node node = head;
			while (index < size - 1) {
				node = node.next;
				index++;
			}
			node.next = null;
			tail = node;
			size--;
			if (size == 0) {
				tail = head = null;

			}
		} else {
			int index = 0;
			Node node = head;
			while (index < location - 1) {
				node = node.next;
				index++;
			}
			node.next = node.next.next;
			size--;

		}
	}

}
