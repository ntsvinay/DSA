package udemy.StackAndQueue.InterviewQuestions;

import java.util.LinkedList;

public class AnimalQueue {
	LinkedList<Dog> dLL = new LinkedList<Dog>();
	LinkedList<Cat> cLL = new LinkedList<Cat>();
	private int order = 0;

	public void enQueue(Animals animals) {
		animals.setOrder(order);
		order++;
		if (animals instanceof Dog) {
			dLL.addLast((Dog) animals);
		} else if (animals instanceof Cat) {
			cLL.addLast((Cat) animals);
		}
	}

	public Dog deQueueDog() {
		return dLL.poll();
	}

	public Dog peekDog() {
		return dLL.peek();
	}

	public Cat deQueueCat() {
		return cLL.poll();
	}

	public Cat peekCat() {
		return cLL.peek();
	}

	public Animals dequeue() {
		if (dLL.size() == 0) {
			return deQueueCat();
		} else if (cLL.size() == 0) {
			return deQueueDog();
		} else {
			Dog dog = dLL.peek();
			Cat cat = cLL.peek();
			if (dog.isOlderThan(cat)) {
				return dLL.pop();
			} else {
				return cLL.pop();
			}
		}
	}

	public Animals peek() {
		if (dLL.size() == 0) {
			return deQueueCat();
		} else if (cLL.size() == 0) {
			return deQueueDog();
		} else {
			Dog dog = dLL.peek();
			Cat cat = cLL.peek();
			if (dog.isOlderThan(cat)) {
				return dLL.peek();
			} else {
				return cLL.peek();
			}
		}
	}

}
