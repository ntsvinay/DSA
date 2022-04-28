package ds_2;

import ds_2.LinkedListCls.Node;

public class SinglyLinkedList {

	LinkedListCls list;

	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
		list = new LinkedListCls();
	}

	Node insertAtBeg(int val) {
		Node node = new Node(val);
		if (list.head == null) {
			list.head = node;
		} else {

			node.next = list.head;
			list.head = node;
		}
		return node;
	}

	Node insertAtEnd(int val) {

		Node new_node = new Node(val);
		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;

			}
			last.next = new_node;

		}
		return new_node;

	}

	Node insertAtMid(int val, Node pre) {

		Node node = new Node(val);
		node.next = pre.next;
		pre.next = node;
		return node;

	}

	void deleteAtBeg() {
		Node newHead = list.head.next;
		list.head = newHead;

	}

	void deleteAtEnd() {
		Node head = list.head;
		Node preNode = null;
		while (head.next != null) {
			preNode = head;
			head = head.next;
		}
		preNode.next = null;

	}

	void deleteAtMid(Node ind) {

		Node head = list.head;
		Node afterInd = ind.next;
		while (head.next != ind) {
			head = head.next;
		}
		head.next = afterInd;

	}

	void print() {
		Node head = list.head;
		while (head.next != null) {
			System.out.println("value-" + head.value);
			head = head.next;
		}
		System.out.println("value-" + head.value);
	}

	int findMid() {
		int result = 0;
		Node sP = list.head;
		Node fS = list.head;
		if (list.head != null) {
			while (fS != null && fS.next != null) {

				fS = fS.next.next;
				sP = sP.next;
			}
		}
		return (sP != null) ? sP.value : -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList simpleList = new SinglyLinkedList();
		Node f = simpleList.insertAtBeg(1);
		Node s = simpleList.insertAtBeg(2);
		simpleList.print();
		Node thr = simpleList.insertAtEnd(3);
		System.out.println("after End---");
		simpleList.print();
		simpleList.insertAtMid(4, s);
		System.out.println("after Mid---");
		simpleList.print();
		System.out.println("mid element first--" + new SinglyLinkedList().findMid());
		System.out.println("after dlt End---");
		simpleList.deleteAtEnd();
		simpleList.print();
		System.out.println("after dlt Big---");
		simpleList.deleteAtBeg();
		simpleList.print();
		Node fif = simpleList.insertAtEnd(5);
		Node six = simpleList.insertAtEnd(6);
		System.out.println("after insert other val---");
		simpleList.print();
		System.out.println("after dlt mid---");
		simpleList.deleteAtMid(fif);
		simpleList.print();
		System.out.println("mid element--" + new SinglyLinkedList().findMid());

	}

}
