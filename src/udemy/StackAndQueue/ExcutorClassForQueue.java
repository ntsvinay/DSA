package udemy.StackAndQueue;

public class ExcutorClassForQueue {

	public static void main(String[] args) {
		// QueueUsingArray qUsingArray = new QueueUsingArray(4);
		 CircularQueueUsingArray qUsingArray=new CircularQueueUsingArray(4);
		//QueueUsingLinkedList qUsingArray = new QueueUsingLinkedList();
		// System.out.println(qUsingArray.isEmpty() + "-" + qUsingArray.isFull());
		qUsingArray.enQueue(10);
		qUsingArray.enQueue(20);
		qUsingArray.enQueue(30);
		qUsingArray.enQueue(40);
		qUsingArray.traverseQueue();
		qUsingArray.enQueue(50);
		qUsingArray.traverseQueue();
		// System.out.println("Pointers of the Array : "+qUsingArray.beginningOfQueue +
		// "-" + qUsingArray.topOfQueue);
		System.out.println("Dequeue is performed :"+qUsingArray.deQueue());
		System.out.println("Dequeue is performed :"+qUsingArray.deQueue());
		qUsingArray.enQueue(50);
		System.out.println(qUsingArray.isEmpty());
		qUsingArray.traverseQueue();
		// System.out.println(qUsingArray.peek());
	}

}
