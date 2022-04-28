package udemy.linkedList;

public class ExecutorClassForLL {

	public static void main(String[] args) {

		// **************Singal Linked List
		SinglyLL sLL = new SinglyLL();
		//sLL.createSLL(20);
		sLL.insertIntoSLL(10, 0);
		//sLL.insertIntoSLL(50, 4);
		//sLL.searchInSLL(50);
		sLL.traverseSLL();
		sLL.deleteFromSLL(0);
		sLL.traverseSLL();
		// *************Circular Singal Linked List

		/*
		 * CircularSinglyLL csll = new CircularSinglyLL();
		 * csll.createCircularSinglyLL(5); csll.insertCircularSinglyLL(4, 0);
		 * csll.insertCircularSinglyLL(10, 1); csll.insertCircularSinglyLL(30, 3);
		 * csll.insertCircularSinglyLL(200, 8); // System.out.println(csll.head.value);
		 * // System.out.println(csll.head.next.next.value); csll.traverseCSLL();
		 * csll.deleteNodeFromCSLL(10); csll.traverseCSLL(); //
		 * csll.searchNodeInCSLL(20);
		 */
		// *************Doubly Linked List

		/*
		 * DoublyLL dLL = new DoublyLL(); dLL.createDoublyNodeLL(10); dLL.insertDLL(20,
		 * 0); dLL.insertDLL(30, 3); // System.out.println(dLL.head.value); //
		 * System.out.println(dLL.tail.value); dLL.traverseDLL(); // //
		 * dLL.reverseTraverseDLL(); // dLL.searchNodeInDLL(10);
		 * dLL.deleteNodeFromDLL(8); dLL.insertDLL(100, 8); dLL.traverseDLL();
		 * dLL.deleteDLL(); dLL.traverseDLL();
		 */
		// *************Circular Doubly Linked List
		/*
		 * CircularDLL cDLL = new CircularDLL(); cDLL.createDCLL(10);
		 * cDLL.insertInCDLL(20, 0); cDLL.insertInCDLL(30, 5); cDLL.traverseCDLL(); //
		 * cDLL.reverseTraverseCDLL(); cDLL.searchInCDLL(10); cDLL.deleteFromCDLL(1);
		 * cDLL.traverseCDLL();
		 */}
}
