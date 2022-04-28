package udemy.StackAndQueue.InterviewQuestions;

public class ExecutorClass {
	public static void main(String[] args) {
		/*
		 * ThreeStackUsingOneArray tOneArray = new ThreeStackUsingOneArray(3);
		 * System.out.println(tOneArray.isEmpty(0) + "-" +
		 * tOneArray.isFull(0)+"-"+tOneArray.topOfStack(1)); tOneArray.push(10, 1);
		 * tOneArray.push(20, 1); tOneArray.push(30, 1); tOneArray.push(30, 1);
		 * tOneArray.traverseStack(1); System.out.println(tOneArray.isEmpty(1) + "-" +
		 * tOneArray.isFull(1));
		 * System.out.println("peek performed : "+tOneArray.peek(1));
		 * System.out.println("pop performed : "+tOneArray.pop(1)); tOneArray.push(40,
		 * 1); System.out.println("Peek performed : "+tOneArray.peek(1));
		 * System.out.println("Peek performed : "+tOneArray.peek(1));
		 */

// @@@@@@@@@@@@@@@@@StackMinReturnOnPushPop@@@@@@@@@@@@@@@@@

		/*
		 * StackMinReturnOnPushPop minReturnOnPushPop = new StackMinReturnOnPushPop(4);
		 * minReturnOnPushPop.push(5); System.out.println("Min Element in the Stack : "
		 * + minReturnOnPushPop.min()); minReturnOnPushPop.push(2);
		 * System.out.println("Min Element in the Stack : " + minReturnOnPushPop.min());
		 * minReturnOnPushPop.push(1); System.out.println("Min Element in the Stack : "
		 * + minReturnOnPushPop.min()); minReturnOnPushPop.traverseStack();
		 * System.out.println("Deleted Element in the Stack : " +
		 * minReturnOnPushPop.pop()); System.out.println("Min Element in the Stack : " +
		 * minReturnOnPushPop.min()); minReturnOnPushPop.push(6);
		 * System.out.println("Min Element in the Stack : " + minReturnOnPushPop.min());
		 * minReturnOnPushPop.traverseStack();
		 * System.out.println("Min Element in the Stack : " + minReturnOnPushPop.min());
		 * System.out.println("Deleted Element in the Stack : " +
		 * minReturnOnPushPop.pop()); System.out.println("Min Element in the Stack : " +
		 * minReturnOnPushPop.min()); minReturnOnPushPop.traverseStack();
		 */

// @@@@@@@@@@@@@@StackNodeTrasholdFullUseNewstackPerformLikeSameStack@@@@@@@@@@@@@@@@@@@@
		/*
		 * StackNode st = new StackNode(3); st.push(1); st.push(3); st.push(4);
		 * System.out.println(st.pop()); System.out.println(st.pop());
		 */
//@@@@@@@@@@@@@@Queue Using Stacks@@@@@@@@@@@@@@@@@@@@

		/*
		 * QueueViaStacks queueViaStacks = new QueueViaStacks(3);
		 * queueViaStacks.enQueue(10); queueViaStacks.enQueue(9);
		 * queueViaStacks.enQueue(11); System.out.println(queueViaStacks.deQueue());
		 * System.out.println(queueViaStacks.deQueue()); queueViaStacks.enQueue(100);
		 * queueViaStacks.enQueue(90); System.out.println(queueViaStacks.deQueue());
		 * System.out.println(queueViaStacks.deQueue());
		 */
//@@@@@@@@@@@@@@Animal shelter example@@@@@@@@@@@@@@@@@@@@
		AnimalQueue aQueue = new AnimalQueue();
		aQueue.enQueue(new Dog("Dommy"));
		aQueue.enQueue(new Cat("Kitty"));
		aQueue.enQueue(new Dog("Dommy2"));
		aQueue.enQueue(new Cat("Pussy"));
		aQueue.enQueue(new Dog("Dommy3"));
		aQueue.enQueue(new Cat("Pussy1"));
		aQueue.enQueue(new Dog("Dommy2"));
		aQueue.enQueue(new Cat("Pussy3"));
		System.out.println(aQueue.dequeue().name);
		System.out.println(aQueue.deQueueDog().name);
		System.out.println(aQueue.deQueueCat().name);
		System.out.println(aQueue.dequeue().name);
	}

}
