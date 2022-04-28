package udemy.Tree_BinaryTree;

public class BinaryTreeArr {
	int[] arr;
	public int lastUsedIndex;

	public BinaryTreeArr(int size) {

		arr = new int[size];
		lastUsedIndex = 0;
	}

	public boolean isFull() {
		return arr.length - 1 == lastUsedIndex ? true : false;
	}

	public void insertValue(int value) {
		if (!isFull()) {
			arr[lastUsedIndex + 1] = value;
			lastUsedIndex++;
		} else {
			System.out.println("full");
		}

	}

	public void preOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		} else {
			System.out.print(arr[index] + " ");
			preOrder(index * 2);
			preOrder(index * 2 + 1);
		}
	}

	public void inOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		} else {
			inOrder(index * 2);
			System.out.print(arr[index] + " ");
			inOrder(index * 2 + 1);
		}
	}

	public void postOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		} else {
			postOrder(index * 2);
			postOrder(index * 2 + 1);
			System.out.print(arr[index] + " ");
		}
	}

	public void levelOrder() {
		for (int i = 1; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void searchElement(int value) {

		for (int i = 1; i <= lastUsedIndex; i++) {
			if (arr[i] == value) {
				System.out.println("yes exist at" + i);
				return;
			}
		}
		System.out.println("not exist");

	}

	public int deleteNode(int value) {
		int delVal = 0;
		for (int i = 1; i <= lastUsedIndex; i++) {
			if (arr[i] == value) {
				delVal = arr[i];
				arr[i] = arr[lastUsedIndex];
				lastUsedIndex--;
				
				return delVal;
			}
		}
		System.out.println("Value i not exist");
		return -1;
	}
}
