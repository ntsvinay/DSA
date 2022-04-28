package udemy.Tree_BinaryTree;

public class BHeap {
	int[] root;
	int sizeOfHeap;

	public BHeap(int size) {
		this.root = new int[size + 1];
		this.sizeOfHeap = 0;
	}

	public void levelOrder() {
		for (int i = 1; i < sizeOfHeap; i++) {
			System.out.print(root[i] + ", ");
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return root == null ? true : false;
	}

	public void bottamToTopHeapify(String heapType, int index) {
		int parent = index / 2;
		if (index <= 1) {
			return;
		}
		if (heapType == "Min") {
			if (root[parent] > root[index]) {
				int temp = root[index];
				root[index] = root[parent];
				root[parent] = temp;
			}
		} else if (heapType == "Max") {
			if (root[parent] < root[index]) {
				int temp = root[index];
				root[index] = root[parent];
				root[parent] = temp;
			}
		}
		bottamToTopHeapify(heapType, parent);
	}

	public void insert(int val) {
		root[sizeOfHeap + 1] = val;
		sizeOfHeap++;
		bottamToTopHeapify("Max", sizeOfHeap);

	}

	public void topToBottamHeapify(String heapType, int index) {
		int left = index * 2;
		int right = index * 2 + 1;
		int swapInd = 0;
		if (sizeOfHeap<left) {
			return;
		}
		if (heapType == "Max") {
			if (sizeOfHeap == left) {
				if (root[index] < root[left]) {
					int temp = root[index];
					root[index] = root[left];
					root[left] = temp;
				}
				return;
			} else {
				if (root[left] > root[right]) {
					swapInd = left;
				} else {
					swapInd = right;
				}
				if (root[index] < root[swapInd]) {
					int temp = root[index];
					root[index] = root[swapInd];
					root[swapInd] = temp;
				}
			}
		}
		if (heapType == "Min") {
			if (sizeOfHeap == left) {
				if (root[index] > root[left]) {
					int temp = root[index];
					root[index] = root[left];
					root[left] = temp;
				}
				return;
			} else {
				if (root[left] < root[right]) {
					swapInd = left;
				} else {
					swapInd = right;
				}
				if (root[index] > root[swapInd]) {
					int temp = root[index];
					root[index] = root[swapInd];
					root[swapInd] = temp;
				}
			}
		}

		topToBottamHeapify(heapType, swapInd);
	}

	public int headOfHeap(String typeOfHeap) {
		return typeOfHeap == "Min" ? root[1] : root[sizeOfHeap];
	}

	public int extractHeap(String typeOfHeap) {
		if (isEmpty()) {
			return -1;
		} else {
			int temp = root[1];
			root[1] = root[sizeOfHeap];
			sizeOfHeap--;
			topToBottamHeapify(typeOfHeap, 1);
			return temp;
		}

	}
}
